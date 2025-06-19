package za.co.varsitycollege.st19479777.st10479777summative

import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {
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

        val titleTxt = findViewById<EditText>(R.id.SongTitle)
        val nameTxt = findViewById<EditText>(R.id.ArtistName)
        val rateTxt = findViewById<EditText>(R.id.RatingTxt)
        val commentsTxt = findViewById<EditText>(R.id.CommentTxt)

        val add = findViewById<Button>(R.id.AddBtn)
        val view = findViewById<Button>(R.id.ViewListBtn)
        val exit = findViewById<Button>(R.id.ExitBtn)

        add.setOnClickListener {
            val title = titleTxt.text.toString()
            val name = nameTxt.text.toString()
            val rate = rateTxt.text.toString()
            val comments = commentsTxt.text.toString()

            if (title.isEmpty() || name.isEmpty() || rate.isEmpty ()) {
                Toast.makeText(this, "Please enter all fields", Toast.LENGTH_SHORT).show()
                } else {
                    val commentTxt = comments.toIntOrNull()
                if (commentTxt == null  || commentTxt < 0 || commentTxt > 5) {
                    Toast.makeText(this, "Please enter valid rating", Toast.LENGTH_SHORT).show()

            } else {
                song.add(title)
                artist.add(name)
                rating.add(rate)
                comment.add(comments)
                    Toast.makeText(this, "Options have been added to playlist", Toast.LENGTH_SHORT).show()


                }

        }


    }
}