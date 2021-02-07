package com.example.assign62

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        bok.setOnClickListener() {
            var sub1 = sub1.text.toString()
            var sub2 = sub2.text.toString()
            var sub3 = sub3.text.toString()
            var sub4 = sub4.text.toString()
            var sub5 = sub5.text.toString()
            var cre1 = cre1.text.toString()
            var cre2 = cre2.text.toString()
            var cre3 = cre3.text.toString()
            var cre4 = cre4.text.toString()
            var cre5 = cre5.text.toString()
            var point1 = point1.text.toString()
            var point2 = point2.text.toString()
            var point3 = point3.text.toString()
            var point4 = point4.text.toString()
            var point5 = point5.text.toString()
            if (sub1 == "" || sub2 == "" || sub3 == "" || sub4 == "" || sub5 == "" ||
                cre1 == "" || cre2 == "" || cre3 == "" || cre4 == "" && cre5 == "" ||
                point1 == "" || point2 == "" || point3 == "" || point4 == "" || point5 == "" ) {

                    Toast.makeText(applicationContext, "กรุณากรอกข้อมูลให้ครบ", Toast.LENGTH_LONG).show()
            }
            else{
                var total1 = 0.00
                var total2 = 0.00
                var total3 = 0.00
                var total4 = 0.00
                var total5 = 0.00
                var total = 0.000
                var totalcre = 0.00
                total1=cre1.toDouble()*point1.toDouble()
                total2=cre2.toDouble()*point2.toDouble()
                total3=cre3.toDouble()*point3.toDouble()
                total4=cre4.toDouble()*point4.toDouble()
                total5=cre5.toDouble()*point5.toDouble()
                totalcre =cre1.toDouble()+cre2.toDouble()+cre3.toDouble()+cre4.toDouble()+cre5.toDouble()
                total = (total1+total2+total3+total4+total5)/totalcre
                totalc.setText(totalcre.toString())
                gpa.setText(total.toString())
            }
        }
        bclear.setOnClickListener(){
            totalc.setText("")
            gpa.setText("")
            sub1.setText("")
            sub2.setText("")
            sub3.setText("")
            sub4.setText("")
            sub5.setText("")
            cre1.setText("")
            cre2.setText("")
            cre3.setText("")
            cre4.setText("")
            cre5.setText("")
            point1.setText("")
            point2.setText("")
            point3.setText("")
            point4.setText("")
            point5.setText("")
        }

    }
}
