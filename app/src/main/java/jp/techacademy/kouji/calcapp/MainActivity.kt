package jp.techacademy.kouji.calcapp

import android.content.Intent
import android.os.Bundle
import android.support.design.widget.Snackbar
import android.support.v7.app.AppCompatActivity
import android.view.View
import com.google.android.material.snackbar.SnackBar
import kotlinx.android.synthetic.main.activity_main.*


class MainActivity : AppCompatActivity(), View.OnClickListener {



    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        add.setOnClickListener(this)

        subtract.setOnClickListener(this)

        multiply.setOnClickListener(this)

        divide.setOnClickListener(this)

    }

    override fun onClick(v: View) {

        val num1 = number1.getText().toString()
        val num2 = number2.getText().toString()

        if (num1 == null || num2 == null) {
            val message = "数字を入力してください"
            val intent = Intent(this, Result::class.java)
            intent.putExtra("ANSWER", message)
            startActivity(intent)

            //Snackbar.make(View, "Replace with your own action", Snackbar.LENGTH_INDEFINITE).show()


        } else {
            if (v.id == R.id.add) {
                var answer = num1.toDouble() + num2.toDouble()
                val intent = Intent(this, Result::class.java)
                intent.putExtra("ANSWER", answer)
                startActivity(intent)

            } else if (v.id == R.id.subtract) {
                var answer = num1.toDouble() - num2.toDouble()
                val intent = Intent(this, Result::class.java)
                intent.putExtra("ANSWER", answer)
                startActivity(intent)

            } else if (v.id == R.id.multiply) {
                var answer = num1.toDouble() * num2.toDouble()
                val intent = Intent(this, Result::class.java)
                intent.putExtra("ANSWER", answer)
                startActivity(intent)

            } else {
                if (num2 == "0") {
                var answer = "0で割ることはできません。"
                val intent = Intent(this, Result::class.java)
                intent.putExtra("ANSWER", answer)
                startActivity(intent)
                }

            //}
            //else {
                //var answer = num1.toInt() / num2.toInt()
                //val intent = Intent(this, Result::class.java)
                //intent.putExtra("ANSWER", answer)
                //startActivity(intent)

                //if (v.id == R.id.divide) {
                    //answer = num1.toInt() / num2.toInt()
                    //val intent = Intent(this, Result::class.java)
                    //intent.putExtra("ANSWER", answer)
                    //startActivity(intent)

                }
            }

    }


}
