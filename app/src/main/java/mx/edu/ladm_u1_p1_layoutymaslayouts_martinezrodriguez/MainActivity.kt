package mx.edu.ladm_u1_p1_layoutymaslayouts_martinezrodriguez

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val bDescripcion = findViewById<Button>(R.id.descripcion)

        bDescripcion.setOnClickListener {
            val intent = Intent(this, Descripcion::class.java)
            startActivity(intent)
        }
        val  bImagenes = findViewById<Button>(R.id.imagenes)
        bImagenes.setOnClickListener {
            val intent2 = Intent(this, SettingsActivity::class.java)
            startActivity(intent2)
        }
    }
}