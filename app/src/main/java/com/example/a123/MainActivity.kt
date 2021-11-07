package com.example.a123

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.CheckBox
import android.widget.EditText
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    private lateinit var AB: EditText
    private lateinit var Ab: EditText
    private lateinit var ციფრი: EditText
    private lateinit var პირადი: EditText
    private lateinit var შემოწმება: Button


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        AB = findViewById(R.id.editTextTextPersonName3)
        Ab = findViewById(R.id.editTextTextPersonName4)
        ციფრი = findViewById(R.id.editTextTextPassword1)
        პირადი = findViewById(R.id.editTextTextEmailAddress2)
        შემოწმება = findViewById(R.id.button2)

        შემოწმება.setOnClickListener {
            val firstName = AB.text.toString().trim()
            val lastname = Ab.text.toString().trim()
            val eMail = ციფრი.text.toString().trim()
            val passWord = პირადი.text.toString().trim()

            if (firstName.isEmpty()) {
                AB.error = "შეავსეთ ველი ასოებით"
                return@setOnClickListener}
            else if (lastname.isEmpty()) {
                Ab.error = "შეავსეთ ველი ასოებით"
                return@setOnClickListener }
            else if (eMail.isEmpty()) {
                ციფრი.error = "შეავსეთ ველი ციფრებით" }
            else if (eMail.length <= 3) {
                ციფრი.error = "ეს ველი უნდა შედგებოდეს სამი ციფრისგან"
                return@setOnClickListener }
            else if (passWord.length <= 11) {
                პირადი.error = "პირადი ნომერი უნდა შედგებოდეს 11 ციფრისგან"
                return@setOnClickListener
            } else {
                Toast.makeText(this, "თქვენ არ გაქვთ ჯარიმები", Toast.LENGTH_SHORT).show()

            }

        }
    }
}