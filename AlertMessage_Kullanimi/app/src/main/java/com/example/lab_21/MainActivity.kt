package com.example.lab_21


import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.Toast


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        var alertbutton = findViewById<Button>(R.id.Alertbutton)

        alertbutton.setOnClickListener {
            val ad = android.app.AlertDialog.Builder(this)

            ad.setMessage("Veri silinsin mi ?")
            ad.setTitle("UYARI")
            ad.setIcon(R.drawable.ic_launcher_background)
            ad.show()

            ad.setPositiveButton("Evet") { dialogInterface, it ->

            Toast.makeText(applicationContext,"Veri silindi",Toast.LENGTH_LONG).show()

            }

            ad.setNegativeButton("Hayır"){ dialogInterface, it->
                Toast.makeText(applicationContext,"Veri silinmedi",Toast.LENGTH_LONG).show()

            }
                .show()

        }

    }

}