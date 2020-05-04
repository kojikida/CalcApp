package jp.techacademy.kouji.calcapp

import android.content.Intent
import android.os.Bundle
import android.support.design.widget.Snackbar
import android.support.v7.app.AppCompatActivity
import android.util.Log
import android.view.View
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



        //if (num1.isEmpty()) {
        //Snackbar.make(v, "数字を入力してください。", Snackbar.LENGTH_INDEFINITE).show()
            //var answer = "数字を入力してください。"
            //intent.putExtra("ANSWER", answer)
            //startActivity(intent)
        //}

        if (v.id == R.id.add) {
            if (num1.isEmpty() || num2.isEmpty()) {
                Snackbar.make(v, "数字を正しく入力してください。", Snackbar.LENGTH_LONG).show()
            } else {
                var answer = num1.toDouble() + num2.toDouble()
                val intent = Intent(this, Result::class.java)
                intent.putExtra("ANSWER", answer)
                startActivity(intent)
            }
        }

        if (v.id == R.id.subtract) {
            if (num1.isEmpty() || num2.isEmpty()) {
                Snackbar.make(v, "数字を正しく入力してください。", Snackbar.LENGTH_LONG).show()
            } else {
                var answer = num1.toDouble() - num2.toDouble()
                val intent = Intent(this, Result::class.java)
                intent.putExtra("ANSWER", answer)
                startActivity(intent)
            }
        }

        if (v.id == R.id.multiply) {
            if (num1.isEmpty() || num2.isEmpty()) {
                Snackbar.make(v, "数字を正しく入力してください。", Snackbar.LENGTH_LONG).show()
            } else {
                var answer = num1.toDouble() * num2.toDouble()
                val intent = Intent(this, Result::class.java)
                intent.putExtra("ANSWER", answer)
                startActivity(intent)
            }
        }

        if (v.id == R.id.divide) {
            if (num1.isEmpty() || num2.isEmpty()) {
                Snackbar.make(v, "数字を正しく入力してください。", Snackbar.LENGTH_LONG).show()
            } else if (num1 == "0") {
                Snackbar.make(v, "「一つ目の数字」は０以外を入力してください", Snackbar.LENGTH_LONG).show()
            } else {
                var answer = num1.toDouble() / num2.toDouble()
                val intent = Intent(this, Result::class.java)
                intent.putExtra("ANSWER", answer)
                startActivity(intent)
            }
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


