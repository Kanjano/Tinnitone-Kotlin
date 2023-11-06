import androidx.compose.material3.*
import androidx.compose.runtime.*
import androidx.compose.ui.res.painterResource

@Composable
fun OnBoardingMainView() {
    val navController = rememberNavController()

    var currentTab by remember { mutableStateOf(0) }

    Scaffold(
        bottomBar = {
            BottomNavigation(
                modifier = Modifier.fillMaxWidth(),
                selectedIndex = currentTab,
                onTabSelected = {
                    currentTab = it
                    navController.navigate("screen$it")
                }
            ) {
                BottomNavigationItem(
                    icon = {
                        Icon(painter = painterResource(id = R.drawable.ic_screen1), contentDescription = null)
                    },
                    label = { Text(text = "Screen 1") },
                    selected = currentTab == 0,
                    onClick = { currentTab = 0 }
                )
                BottomNavigationItem(
                    icon = {
                        Icon(painter = painterResource(id = R.drawable.ic_screen2), contentDescription = null)
                    },
                    label = { Text(text = "Screen 2") },
                    selected = currentTab == 1,
                    onClick = { currentTab = 1 }
                )
                BottomNavigationItem(
                    icon = {
                        Icon(painter = painterResource(id = R.drawable.ic_screen3), contentDescription = null)
                    },
                    label = { Text(text = "Screen 3") },
                    selected = currentTab == 2,
                    onClick = { currentTab = 2 }
                )
            }
        }
    ) { innerPadding ->
        NavHost(
            navController = navController,
            startDestination = "screen0",
            modifier = Modifier.padding(innerPadding)
        ) {
            composable("screen0") {
                OnBoardingFirstView()
            }
            composable("screen1") {
                OnBoardingSecondView()
            }
            composable("screen2") {
                OnBoardingThirdView()
            }
        }
    }
}
