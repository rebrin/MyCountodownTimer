package mx.edu.itsp.curso.mycountodowntimer

import android.os.CountDownTimer
import android.util.Log

class MiCuentaReg : CountDownTimer(10000,1000){
    override fun onFinish() {
        Log.d("timer","ejecuta cuando la función termina")
    }

    override fun onTick(millisUntilFinished: Long) {
        Log.d("timer","tiempo restante:${millisUntilFinished/1000}")
    }

}