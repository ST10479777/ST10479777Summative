package za.co.varsitycollege.st19479777.st10479777summative

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
// ST10479777
class MainActivity : AppCompatActivity() {
    // List to store arrays
    companion object {
        val song = ArrayList<String>()
        val artist = ArrayList<String>()
        val rating = ArrayList<String>()
        val comment = ArrayList<String>()
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)
        // declaring variables
        val titleTxt = findViewById<EditText>(R.id.SongTitle)
        val nameTxt = findViewById<EditText>(R.id.ArtistName)
        val rateTxt = findViewById<EditText>(R.id.RatingTxt)
        val commentsTxt = findViewById<EditText>(R.id.CommentTxt)

        val add = findViewById<Button>(R.id.AddBtn)
        val view = findViewById<Button>(R.id.ViewListBtn)
        val exit = findViewById<Button>(R.id.ExitBtn)

        // Allows the add button to work
        add.setOnClickListener {
            //gets values from the declared variables (inputs)
            val title = titleTxt.text.toString()
            val name = nameTxt.text.toString()
            val rate = rateTxt.text.toString()
            val comments = commentsTxt.text.toString()
            // checks that all fields have been answered
            if (title.isEmpty() || name.isEmpty() || rate.isEmpty()) {
                Toast.makeText(this, "Please enter all fields", Toast.LENGTH_SHORT).show() // message displayed if the instructions have not been followed
            } else {
                val commentTxt = rate.toIntOrNull() // makes sure that the app does not crash when a user inputs an invalid answer
                if (commentTxt == null || commentTxt < 0 || commentTxt > 5) {
                    Toast.makeText(this, "Please enter valid rating", Toast.LENGTH_SHORT).show()

                } else {
                    // adds to the list of arrays and store answer
                    song.add(title)
                    artist.add(name)
                    rating.add(rate)
                    comment.add(comments)
                    Toast.makeText(this, "Options have been added to playlist", Toast.LENGTH_SHORT).show()

                    // clears the fields when the user is done with one song at a time
                    titleTxt.text.clear()
                    nameTxt.text.clear()
                    rateTxt.text.clear()
                    commentsTxt.text.clear()

                }
            }
        }
        // allows user to go from main page to detail page
        view.setOnClickListener {
            val intent = Intent(this, MainActivity2::class.java)
            startActivity(intent)
        }
        // terminates the application completely when clicked
        exit.setOnClickListener {
            finishAffinity()
        }
    }
}