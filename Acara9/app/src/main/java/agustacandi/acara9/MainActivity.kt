package agustacandi.acara9

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val toEditText: EditText = findViewById(R.id.to)
        val subjectEditText: EditText = findViewById(R.id.subject)
        val messageEditText: EditText = findViewById(R.id.message)
        val sendBtn: Button = findViewById(R.id.sendBtn)

        sendBtn.setOnClickListener {
            println("Hello")
        }
    }
}