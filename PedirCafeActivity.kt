package pt.antro.coffeeaddicts

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class PedirCafeActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_pedir_cafe)

        var portugal = findViewById<Button>(R.id.portugal)
        var espanha = findViewById<Button>(R.id.espanha)
        var franca = findViewById<Button>(R.id.franca)
        var inglaterra = findViewById<Button>(R.id.inglaterra)
        var russia = findViewById<Button>(R.id.russia)
        var alemanha = findViewById<Button>(R.id.alemanha)

        var country = findViewById<TextView>(R.id.country)
        var brand = findViewById<TextView>(R.id.brand)
        var price = findViewById<TextView>(R.id.price)
        var askCoffee = findViewById<TextView>(R.id.askCoffee)


        portugal.setOnClickListener {
            country.text = "Portugal"
            brand.text = "Delta"
            price.text = "0.65 euros"
            askCoffee.text = "Dê-me um café, por favor."
        }

        espanha.setOnClickListener {
            country.text = "Spain"
            brand.text = "----"
            price.text = "1.65 euros"
            askCoffee.text = "Un café solo"
        }

        franca.setOnClickListener {
            country.text = "France"
            brand.text = "----"
            price.text = "2.50 euros"
            askCoffee.text = "Donne-moi du café. S'il vous plait."
        }

        inglaterra.setOnClickListener {
            country.text = "United Kingdom"
            brand.text = "----"
            price.text = "4.27 pounds"
            askCoffee.text = "One espresso, please."
        }

        russia.setOnClickListener {
            country.text = "Russia"
            brand.text = "---"
            price.text = "120 rubles"
            askCoffee.text = "Дай мне кофе."
        }

        alemanha.setOnClickListener {
            country.text = "Germany"
            brand.text = "----"
            price.text = "2.65 euros"
            askCoffee.text = "Ein Kaffee."
        }
    }
}
