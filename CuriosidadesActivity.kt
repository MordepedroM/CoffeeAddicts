package pt.antro.coffeeaddicts

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class CuriosidadesActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_curiosidades)

        var didYouKnow = findViewById<TextView>(R.id.didYouKnow)

        didYouKnow.text = "* One of the most consumed beverages in the world is coffee..\n\n" +
                "* Brazil, Vietnam, Colombia, Indonesia and Ethiopia - This are the Top 5 coffee producers.\n\n"+
                "* 90% of the coffee is consumed at breakfast.\n\n"+
                "* A cup of coffee contains as many antioxidants as 3 oranges.\n\n"
    }
}
