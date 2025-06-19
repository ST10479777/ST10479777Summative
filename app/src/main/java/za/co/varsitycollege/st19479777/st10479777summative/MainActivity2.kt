package za.co.varsitycollege.st19479777.st10479777summative

import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main2)

        //declaring variables
        val display = findViewById<TextView>(R.id.DisplayTxt)
        val back = findViewById<Button>(R.id.BackBtn)
        val ratings = findViewById<Button>(R.id.RatingBtn)


        // allows the ratings button to work when clicked
        ratings.setOnClickListener {
            val output = StringBuilder()
            // loops through the inputs from previous page and displays the results
            for (i in MainActivity.song.indices) {
                output.append("Song Title: ${MainActivity.song[i]} \n")
                output.append("Name of Artist: ${MainActivity.artist[i]} \n")
                output.append("Rating: ${MainActivity.rating[i]} \n")
                output.append("Comment: ${MainActivity.comment[i]} \n")
                output.append("------------------------ \n")


            }
            display.text = output.toString()
            back.setOnClickListener {
                finish()
            }


        }
    }
}