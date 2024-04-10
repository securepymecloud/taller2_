package com.example.taller2

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.example.taller2.ui.theme.Taller2Theme
import android.content.Intent
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        // Establece el contenido de la vista a tu archivo XML
        setContentView(R.layout.activity_main)

        // Encuentra el botón de la cámara por su ID y establece un OnClickListener
        val buttonCamera = findViewById<Button>(R.id.button_camera)
        buttonCamera.setOnClickListener {
            // Inicia una nueva actividad cuando se hace clic en el botón de la cámara
            val cameraIntent = Intent(this, CameraActivity::class.java)
            startActivity(cameraIntent)
        }

        // Encuentra el botón del mapa por su ID y establece un OnClickListener
        val buttonMap = findViewById<Button>(R.id.button_map)
        buttonMap.setOnClickListener {
            // Inicia una nueva actividad cuando se hace clic en el botón del mapa
            //val mapIntent = Intent(this, MapActivity::class.java)
           // startActivity(mapIntent)
        }
    }
}
