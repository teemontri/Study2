package com.example.study2

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var editUser: EditText = findViewById(R.id.User)
        var editPass: EditText = findViewById(R.id.Password)
        var editCPass: EditText = findViewById(R.id.Confirm)
        var ok: Button = findViewById(R.id.buttonOK)
        var clear: Button = findViewById(R.id.buttonCLEAR)

        clear.setOnClickListener() {
            editUser.setText("")
            editPass.setText("")
            editCPass.setText("")
            val toast = Toast.makeText(applicationContext, "ลบเรียบร้อย", Toast.LENGTH_LONG)
            toast.show()
        }
        ok.setOnClickListener() {
            var user = editUser.text.toString()
            var passw = editPass.text.toString()
            var cpass = editCPass.text.toString()
            if(user == "" || passw == "" || cpass == ""){
                Toast.makeText(applicationContext, "กรุณากรอกข้อมูลให้ครบ", Toast.LENGTH_LONG).show()
            }
            else if(user == passw && user == cpass) {
                Toast.makeText(applicationContext, "อย่ากรอก Username ตรงกับ Password", Toast.LENGTH_LONG).show()
            }
            else if(passw != cpass){
                Toast.makeText(applicationContext, "กรุณากรอกพาสเวิร์ดให้ตรงกัน", Toast.LENGTH_LONG).show()

            }
            else{
                Toast.makeText(applicationContext, "OK", Toast.LENGTH_LONG).show()
            }
        }


    }
}