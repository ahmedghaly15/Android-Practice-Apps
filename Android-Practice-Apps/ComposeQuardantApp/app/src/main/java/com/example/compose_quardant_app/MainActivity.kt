package com.example.compose_quardant_app

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import com.example.compose_quardant_app.ui.theme.ComposeQuardantAppTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            ComposeQuardantAppTheme {
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background,
                ) {
                    ComposeQuardantApp()
                }
            }
        }
    }
}

@Composable
fun ComposeQuardantApp(modifier: Modifier = Modifier) {
    Column(modifier.fillMaxWidth()) {
        Row(modifier.weight(1f)) {
            ComposableCard(
                title = stringResource(R.string.text_composable),
                body = stringResource(R.string.text_composable_description),
                backgroundColor = colorResource(R.color.quadrant_1),
                modifier = modifier.weight(1f),
            )
            ComposableCard(
                title = stringResource(R.string.image_composable),
                body = stringResource(R.string.image_composable_description),
                backgroundColor = colorResource(R.color.quadrant_2),
                modifier = modifier.weight(1f),
            )
        }
        Row(modifier.weight(1f)){
            ComposableCard(
                title = stringResource(R.string.row_composable),
                body = stringResource(R.string.row_composable_description),
                backgroundColor = colorResource(R.color.quadrant_3),
                modifier = modifier.weight(1f),
            )
            ComposableCard(
                title = stringResource(R.string.column_composable),
                body = stringResource(R.string.column_composable_description),
                backgroundColor = colorResource(R.color.quadrant_4),
                modifier = modifier.weight(1f),
            )
        }
    }
}

@Composable
private fun ComposableCard(
    title: String,
    body: String,
    backgroundColor: Color,
    modifier: Modifier = Modifier
) {
    Column(
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally,
        modifier= modifier.fillMaxSize().background(color = backgroundColor).padding(
            start = 16.dp,
            bottom = 16.dp,
            top = 16.dp,
        )
    ) {
        Text(
            text = title,
            fontWeight = FontWeight.Bold,
            modifier= Modifier.padding(
                bottom= 16.dp,
            )
        )
        Text(
            text = body,
        )
    }
}
