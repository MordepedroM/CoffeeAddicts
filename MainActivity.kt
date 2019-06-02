package pt.antro.coffeeaddicts

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val curiosidades = findViewById<Button>(R.id.curiosidades)
        val pedirCafe = findViewById<Button>(R.id.pedirCafe)
        val quantosCafes = findViewById<Button>(R.id.quantosCafes)
        val about = findViewById<Button>(R.id.about)


        curiosidades.setOnClickListener {
            val intent = Intent(this, CuriosidadesActivity::class.java)
            startActivity(intent)}

        pedirCafe.setOnClickListener {
            val intent = Intent(this, PedirCafeActivity::class.java)
            startActivity(intent)}

        about.setOnClickListener {
            val intent = Intent(this, AboutActivity::class.java)
            startActivity(intent)}

        quantosCafes.setOnClickListener {
            val intent = Intent(this, QuantosCafesActivity::class.java)
            startActivity(intent)}
    }
}
