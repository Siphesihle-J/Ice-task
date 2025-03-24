package vcmsa.ci.mathapp

import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)

        // Find the TextView by ID
        val editText = findViewById<EditText>(R.id.txtNumber1)
        val editText2 = findViewById<EditText>(R.id.txtNumber2)
        val button = findViewById<Button>(R.id.btn_Answer)
        val textView = findViewById<TextView>(R.id.txtAnswer)




        button.setOnClickListener {
            val  edtT1=editText2.text.toString().toInt()
            val edtT2 = editText.text.toString().toInt()
            val ans = edtT1+edtT2

            textView.text = """$ans""".trimIndent()
            // Update text dynamically to display different data types
        }
    }

}