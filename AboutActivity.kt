package pt.antro.coffeeaddicts

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class AboutActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_about)

        var aboutText = findViewById<TextView>(R.id.aboutText)

        aboutText.text ="I decided to create this app because I love coffee.\n\n"+
                "It is really useful for me to have a coffee counter to track, \nand control, the coffees I drink daily.\n\n"+
                "If you are a coffee addict like me, you got your app!\n\n"+
                "Expect more updates soon, such as sharing your location with your friends, as we \"coffee junkies\" sometimes like to experience coffee in group.\n\n"+
                "Thank you for downloading!\n\n"+
                "Pedro Loureiro"
    }
}
