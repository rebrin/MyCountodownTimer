package mx.edu.itsp.curso.mycountodowntimer

import android.content.Context
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.CountDownTimer

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val countDownTimer= object:CountDownTimer(2000,1000){
            override fun onFinish() {
                val intent=Intent(this@MainActivity,Main2Activity::class.java)
                startActivity(intent)
                this@MainActivity.finish()
            }

            override fun onTick(millisUntilFinished: Long) { }
        }
        countDownTimer.start()
    }

}