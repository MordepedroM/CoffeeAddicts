package pt.antro.coffeeaddicts

import android.content.Context

class MyPreference(context : Context){

    val PREFERENCE_NAME ="SharedPreferenceExample"
    val PREFERENCE_COFFEE_COUNT = "CoffeeCount"

    val preference = context.getSharedPreferences(PREFERENCE_NAME,Context.MODE_PRIVATE)

    fun getCoffeeCount() : Int{
        return preference.getInt(PREFERENCE_COFFEE_COUNT,0)
    }

    fun setCoffeeCount(count:Int){
        val editor = preference.edit()
        editor.putInt(PREFERENCE_COFFEE_COUNT,count)
        editor.apply()
    }
}
