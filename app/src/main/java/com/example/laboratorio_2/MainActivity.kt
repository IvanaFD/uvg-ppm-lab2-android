package com.example.laboratorio_2

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.example.laboratorio_2.ui.theme.Laboratorio_2Theme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent{
            MyTexts()
            //Esta funcion composable se encarga de mostrar en pantalla el texto
        }

    }
}

//Esta funcion contruye la interfaz de usuario
@Composable
fun MyTexts(){
    //Dentro usa otra funcion que permite mostrar el texto
    MyText("Hola Mundo")
    MyText("Prueba de Compose")
}
//Esta funci[on permite que sea reutilizable para mostrar texto
@Composable
fun MyText(text: String){
    Text(text)

}

//Permite vizualizar el texto de la funcion My texts sin tener que emularlo
@Preview
@Composable
fun PreviewText(){
    MyTexts()
}
