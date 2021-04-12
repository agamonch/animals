package kg.unicapp.animals

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val textClick = findViewById<TextView>(R.id.textView3)
        val imgCat =findViewById<ImageView>(R.id.imgCat)
        val imgHorse = findViewById<ImageView>(R.id.imgHorse)
        val imgChick = findViewById<ImageView>(R.id.imgChick)
        imgCat.setOnClickListener {
            textClick.text = "Cat"  }
        imgHorse.setOnClickListener {
            textClick.text = "Horse"  }
        imgChick.setOnClickListener {
            textClick.text = "Chicken"  }






    }
}