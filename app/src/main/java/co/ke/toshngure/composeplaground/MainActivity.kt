package co.ke.toshngure.composeplaground

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.compose.Composable
import androidx.ui.core.Text
import androidx.ui.core.dp
import androidx.ui.core.setContent
import androidx.ui.layout.Column
import androidx.ui.layout.HeightSpacer
import androidx.ui.material.Button
import androidx.ui.material.MaterialTheme
import androidx.ui.material.OutlinedButtonStyle
import androidx.ui.tooling.preview.Preview

class MainActivity : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            MaterialTheme {
                Test()
            }
        }
    }
}

@Composable
fun Greeting(name: String) {
    Text(text = "Hello $name!")
}

@Composable
fun Test() {
    Column {
        ColumnExample()
        HeightSpacer(height = 16.dp)
        CounterExample(CounterState())
    }
}

@Composable
fun ColumnExample() {
    Column {
        Text("Text 1")
        Text("Text 2")
        HeightSpacer(height = 16.dp)
        Text("Text 3")
        Text("Text 4")
    }
}

@Composable
fun CounterExample(state: CounterState) {
    Button(
        text = "I have been clicked ${state.count} times",
        onClick = {
            state.count++
        },
        style = OutlinedButtonStyle()
    )
}

@Preview
@Composable
fun DefaultPreview() {
    MaterialTheme {
        Test()
    }
}