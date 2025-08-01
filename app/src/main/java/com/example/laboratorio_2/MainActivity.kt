package com.example.laboratorio_2

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import com.example.laboratorio_2.ui.theme.Laboratorio_2Theme
import androidx.compose.ui.text.style.TextAlign

import androidx.compose.ui.unit.dp
import com.example.laboratorio_2.R




import androidx.compose.ui.unit.dp

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent{
            MyComponent()
            //Esta funcion composable se encarga de mostrar en pantalla todos los elementos estruxturados en MyComponent()
        }

    }
}
//Funcion que permite construir la interfaz de usuario
@Composable
fun MyComponent(){
    Row(){

        MyImage()
        MyTexts()
    }

}

//Funcion que permite mostrar la imagen
@Composable
 fun MyImage(){
    Image(
        //Muestra imagen de icono de android que se encuentra en la carpeta de recursos drawable
        painterResource(R.drawable.ic_launcher_foreground),"Imagen de prueba")

}

//Esta funcion permite establecer que textos mostrar
@Composable
fun MyTexts(){
    Column() {
        //Dentro usa otra funcion que permite mostrar el texto
        MyText("Hola Mundo")
        MyText("Prueba de Compose")
    }
}
//Esta funcion permite que sea reutilizable para mostrar texto
@Composable
fun MyText(text: String){
    // Crea un elemento de texto en la interfaz de usuario con las modificaciones de centrar y tamaño de fuente
    Text(text, textAlign = TextAlign.Center, modifier = Modifier.padding(16.dp))

}

//Permite vizualizar todos los componentes de la interfaz sin emular los cambios
@Preview
@Composable
fun PreviewText(){
    MyComponent()
}
