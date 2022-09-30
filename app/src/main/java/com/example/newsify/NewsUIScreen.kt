package com.example.newsify

import android.view.animation.OvershootInterpolator
import androidx.compose.animation.core.tween
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.*
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.lifecycle.viewmodel.compose.viewModel
import androidx.navigation.NavController
import androidx.navigation.NavType
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import androidx.navigation.navArgument
import coil.compose.rememberAsyncImagePainter
import com.example.newsify.ui.theme.NewsiFyTheme
import kotlinx.coroutines.delay

@Composable
fun NewsCall(navigationCallback : (String) -> Unit) {
    val viewModel : NewsViewModel = viewModel()
    val news = viewModel.NewsState.value
    LazyColumn(contentPadding = PaddingValues(16.dp)){
        items(news){ News ->
           NewsCard(News, navigationCallback)
        }
    }
}
@Composable
fun NewsCard(News: News, navigationCallback: (String) -> Unit)
{
    val context = LocalContext.current
    Card(
        shape = RoundedCornerShape(15.dp) ,
        elevation = 5.dp ,
        modifier = Modifier
            .fillMaxWidth()
            .padding(top = 15.dp)
            .clickable {
                navigationCallback(News.source.name)
            }
    ) {
        Box(modifier = Modifier.height(200.dp)){
            Image(
                painter = rememberAsyncImagePainter(model = News.urlToImage),
                contentDescription = null ,
                modifier = Modifier
                    .fillMaxSize()
                    .padding(4.dp)
                    .clip(shape = RoundedCornerShape(15.dp)),
                contentScale = ContentScale.Crop
            )
            Box(modifier = Modifier
                .fillMaxSize()
                .background(
                    brush = Brush.verticalGradient(
                        colors = listOf(
                            Color.Transparent,
                            Color.Black
                        ),
                        startY = 300f
                    )
                )
            )
            Box(modifier = Modifier
                .padding(12.dp)
                .fillMaxSize() ,
               contentAlignment = Alignment.BottomStart
            ) {
                Text(text = News.title ,
                    style = MaterialTheme.typography.h6 ,
                    fontSize = 16.sp ,
                    color = Color.White
                )
            }
        }
    }
}
@Composable
fun Navigation(){
    val navController = rememberNavController()
   NavHost(navController = navController, startDestination = "Splash_screen"){
       composable("Splash_screen")
       {
           SplashScreen(navController = navController)
       }
        composable("NewsList"){
            NewsCall(){ navigationNewsID ->
                    navController.navigate("NewsDetails/$navigationNewsID")
            }
        }
       composable("NewsDetails/news_details_id" , arguments = listOf(navArgument("news_details_id"){
           type = NavType.StringType
       }))
       { val newsdetailsModel : NewsDetailsViewModel = viewModel()
            NewsDetails(newsdetailsModel.newsState.value)
       }
   }
}

@Composable
fun SplashScreen(navController: NavController)
{
    val scale = remember {
        androidx.compose.animation.core.Animatable(0f)
    }
    LaunchedEffect(key1 = true ){
        scale.animateTo(
            targetValue = 0.3f ,
            animationSpec = tween(
                durationMillis = 500,
                easing = {
                    OvershootInterpolator(2f).getInterpolation(it)
                }
            )
        )
        delay(300L)
        navController.navigate("NewsList")
    }
    Box(
        contentAlignment = Alignment.Center ,
        modifier = Modifier
            .fillMaxSize()
            .background(Color.Black)
        )
    {
        Image(painter = painterResource(id = R.drawable.logo)
            , contentDescription = "Logo" )
    }
}
@Preview(showBackground = true)
@Composable
fun DefaultPreview() {
    NewsiFyTheme {
    }
}