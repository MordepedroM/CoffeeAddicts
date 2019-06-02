package pt.antro.coffeeaddicts

import android.content.SharedPreferences
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class QuantosCafesActivity : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_quantos_cafes)

        val drink = findViewById<Button>(R.id.drink)
        val reset = findViewById<Button>(R.id.reset)

        var numberCoffees = findViewById<TextView>(R.id.numberCoffees)
        var info = findViewById<TextView>(R.id.info)


        val myPreference = MyPreference(this)
        var coffeeCount = myPreference.getCoffeeCount()

        numberCoffees.text = coffeeCount.toString()

        reset.setOnClickListener {
            coffeeCount = 0
            myPreference.setCoffeeCount(coffeeCount)
            info.text = "Looks like you need some caffeine!!"
            numberCoffees.text = coffeeCount.toString()

        }

        drink.setOnClickListener {
            coffeeCount++
            info.text = ""
            myPreference.setCoffeeCount(coffeeCount)
            numberCoffees.text = coffeeCount.toString()
            if (coffeeCount in 1..3){
                info.text = "The first cups of coffee. #FeelsGood"
            }else if (coffeeCount in 3..7){
                info.text = "Working hard. Drinking hard!!"
            }else{
                info.text = "Be carefull. You are inside the RED ZONE!!"
            }
        }
    }
}
