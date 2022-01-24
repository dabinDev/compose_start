package cn.dabindev.compose_start

import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.TextUnit
import androidx.compose.ui.unit.dp

/**
 * Project :  compose_start.
 * Package name: cn.dabindev.compose_start
 * Created by :  dabin.
 * Created time: 1/23/2022 3:04 PM
 * Changed by :  dabin.
 * Changed time: 1/23/2022 3:04 PM
 * Class description:
 */
class ComposeWiget {

    @Composable
    @Preview
    fun GetSurface(height: Double = 30.0, width: Double = 30.0) {
        return Surface(
            modifier = Modifier.height(height.dp).width(height.dp),
            shape = RoundedCornerShape(height.dp),
            color = Color.Red,
            contentColor = Color.Red,
            elevation = 10.dp,
            content = { GetText("标题", height,  height) }
        )
    }


    @Composable
    fun GetSpacer() {
        return Spacer(modifier = Modifier.height(4.dp).width(1.dp))
    }


    @Composable
    fun GetText(text: String, height: Double, width: Double) {
        return Text(
            text,
            fontSize= TextUnit(11),
            color = Color.White,
            textAlign = TextAlign.Center,
            modifier = Modifier.height(height.dp).width(width.dp)
        )
    }

}