import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material3.Button
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.text.input.PasswordVisualTransformation
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.sp
import com.example.husty.R
import com.example.husty.ui.theme.HustyTheme

/**
 * Main Login Composable
 */
@Composable
fun LoginPage(){
    Column (
        modifier = Modifier
            .fillMaxWidth()
            .fillMaxHeight(),

    ){
        LoginPageImage()
        LoginInPut()
        Spacer(modifier = Modifier.weight(3f))
        LoginPageCotentButtons(content = stringResource(id = R.string.content))
    }

}
/**
 * Husty Top Page to come at later adjustments.
 *
 */

/**
 * Login Image
 */
@Composable
fun LoginPageImage(modifier: Modifier = Modifier){
    Image(
        modifier = Modifier
            .fillMaxWidth(),
        painter = painterResource(id = R.drawable.teamhusty),
        contentDescription = null)
}
/**
 * Input your Details area Here
 */
@Composable
fun LoginInPut(modifier: Modifier = Modifier){
    var userName by remember{ mutableStateOf("")}
    var password by remember { mutableStateOf("")}
    Column (
        modifier = Modifier
            .fillMaxWidth(),
        horizontalAlignment =   Alignment.CenterHorizontally
    ){
        //User Name
        OutlinedTextField(
            value = userName ,
            onValueChange ={userName = it},
            label = { Text(text = stringResource(id = R.string.user_name))},
            singleLine = true,
            modifier = Modifier
                .clip(MaterialTheme.shapes.small)
        )
        //Password
        OutlinedTextField(
            value = password,
            onValueChange = {password = it},
            label = { Text(text = stringResource(id = R.string.password))},
            singleLine = true,
            visualTransformation = PasswordVisualTransformation(),
            keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Password),
            modifier = Modifier
                .clip(MaterialTheme.shapes.small)

        )
    }
}
/**
 * Login Text and Content With Buttons
 *
 */
@Composable
fun LoginPageCotentButtons(content: String, modifier: Modifier = Modifier){

    Column (
        modifier = Modifier
            .fillMaxWidth(),
        horizontalAlignment = Alignment.CenterHorizontally

    ){
        Text(
            text = content,
            fontSize = 16.sp,
            modifier = Modifier
                .fillMaxWidth(),
        )
        /**
         * Login Button
         */
        Button(onClick = { /*TODO*/ },
            modifier = Modifier.fillMaxWidth()) {
            Text(text = stringResource(id = R.string.Login))
        }
        /**
         * Sign Up Button
         */
        Button(onClick = { /*TODO*/ },
            modifier = Modifier.fillMaxWidth()) {
            Text(text = stringResource(id = R.string.SignUp))
        }
    }
}

/**
 * Login page Previews
 */
@Preview(showBackground = true)
@Composable
fun LoginPagePreview(){
    HustyTheme {
        LoginPage()
    }
}