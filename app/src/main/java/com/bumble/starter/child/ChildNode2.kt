package com.bumble.starter.child

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material.Button
import androidx.compose.material.ButtonDefaults
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import com.bumble.appyx.core.modality.BuildContext
import com.bumble.appyx.core.node.Node
import com.bumble.starter.ui.theme.md_blue_grey_500
import com.bumble.starter.ui.theme.md_deep_purple_50
import com.bumble.starter.ui.theme.md_grey_500

class ChildNode2(
    buildContext: BuildContext,
    private val callback: () -> Unit
) : Node(buildContext) {

    @Composable
    override fun View(modifier: Modifier) {
        Column(
            horizontalAlignment = Alignment.CenterHorizontally,
            verticalArrangement = Arrangement.Center,
            modifier = Modifier
                .background(color = md_grey_500)
                .fillMaxSize()
        ) {
            Text(
                text = "This is Child 2",
                modifier = Modifier
                    .padding(vertical = 8.dp)
            )

            Button(
                onClick = callback,
                colors = ButtonDefaults.buttonColors(
                    backgroundColor = md_deep_purple_50
                ),
                modifier = Modifier
                    .padding(bottom = 8.dp)
            ) {
                Text("Swap now")
            }
        }
    }
}
