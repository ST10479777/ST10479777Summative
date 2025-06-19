package za.co.varsitycollege.st19479777.st10479777summative

import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {
    companion object {
        val song = ArrayList<String>()
        val artist = ArrayList<String>()
        val rating = ArrayList<Int>()
        val comment = ArrayList<String>()
    }
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)

        val title = findViewById<EditText>(R.id.SongTitle)
        val name = findViewById<EditText>(R.id.ArtistName)
        val rateTxt = findViewById<EditText>(R.id.RatingTxt)
        val comments = findViewById<EditText>(R.id.CommentTxt)

        val add = findViewById<Button>(R.id.AddBtn)
        val view = findViewById<Button>(R.id.ViewListBtn)
        val exit = findViewById<Button>(R.id.ExitBtn)


    }
}