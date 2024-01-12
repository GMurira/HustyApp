package com.example.husty.ui.screens

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material3.Button
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.dimensionResource
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.text.input.PasswordVisualTransformation
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.husty.ui.theme.HustyTheme
import com.example.husty.R
/**
 * Create an Account
 */
@Composable
fun SignUpPage(modifier: Modifier = Modifier){
    Column(modifier = Modifier
        .fillMaxWidth()
        .fillMaxHeight(),
    ) {
        TextInputArea()
        Spacer(modifier = Modifier.weight(1f))
        SignUpButtonandLogos()
    }
}

/**
 *Oulined Text Input
 */
@Composable
fun TextInputArea(modifier: Modifier = Modifier){
    var userName by remember { mutableStateOf("")}
    var emailAddress by remember { mutableStateOf("")}
    var password by remember { mutableStateOf("")}

    Column(
        modifier = Modifier
            .fillMaxWidth()
            .padding(35.dp),
        horizontalAlignment =   Alignment.CenterHorizontally,
    ) {
        Text(
            text = stringResource(id = R.string.app_name)
        )
        OutlinedTextField(
            value = userName ,
            onValueChange ={userName = it},
            label = { Text(text = stringResource(id = R.string.user_name))},
            singleLine = true,
        )
        OutlinedTextField(
            value = emailAddress,
            onValueChange = {emailAddress = it},
            singleLine = true,
            label = { Text(text = stringResource(id = R.string.Email))}
            )
        OutlinedTextField(
            value = password,
            onValueChange = {password = it},
            singleLine = true,
            label = { Text(text = stringResource(id = R.string.password))},
            visualTransformation = PasswordVisualTransformation(),
            keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Password)

        )
    }

}
/**
 * SignUp Buttons and logos(Socials)
 *
 */
@Composable
fun SignUpButtonandLogos(modifier: Modifier = Modifier){
    Column (
        modifier = Modifier
            .fillMaxWidth(),
        horizontalAlignment = Alignment.CenterHorizontally
    ){

        Button(onClick = { /*TODO*/ },
            modifier = Modifier.fillMaxWidth()
        ) {
            Text(text = stringResource(id = R.string.SignUp))
        }
        Text(text = stringResource(id = R.string.or))
        Row (
            verticalAlignment = Alignment.CenterVertically
        ){
            Image(
                modifier = Modifier
                    .size(dimensionResource(id = R.dimen.image_size)),
                painter = painterResource(id = R.drawable.instagram_threads),
                contentDescription = null
            )
            Image(
                modifier = Modifier
                    .size(dimensionResource(id = R.dimen.image_size)),
                painter = painterResource(id = R.drawable.instagram_threads)
                , contentDescription = null )

        }
    }
}

/**
 * Sign Up preview
 */
@Preview(showBackground = true)
@Composable
fun SignUpPreview(){
    HustyTheme {
        SignUpPage()
    }
}