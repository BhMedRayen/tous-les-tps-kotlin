package com.mohamedrayen.tp1kotlin

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.CheckBox
import android.widget.RadioButton
import android.widget.RadioGroup
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        lateinit var chkAndro:CheckBox
        lateinit var chkMicro: CheckBox
        lateinit var btnAffich:Button
        lateinit var radSpecialityType: RadioGroup
        lateinit var radDSI:RadioButton
        lateinit var radRSI:RadioButton
        lateinit var radSEM:RadioButton

        chkAndro = findViewById(R.id.checkBox)
        chkMicro = findViewById(R.id.checkBox2)
        btnAffich = findViewById(R.id.button)
        radSpecialityType = findViewById(R.id.radioGroup)
        radDSI = findViewById(R.id.radioButton1)
        radSEM = findViewById(R.id.radioButton2)
        radRSI = findViewById(R.id.radioButton3)

        btnAffich.setOnClickListener {
            var club = "votre club est"
            var specialité = "votre specialité est"
            if(chkAndro.isChecked)
            {
                club+=" Android "
            }
            if(chkMicro.isChecked){
                club+=" Microsoft "
            }
            if (radSpecialityType.checkedRadioButtonId == radDSI.id) {
                specialité+=" DSI "
            }
            else if(radSpecialityType.checkedRadioButtonId == radSEM.id) {
                specialité+=" SEM "
            }
            else {
                specialité+=" RSI "
            }
            var msg = club + specialité
            Toast.makeText(this, msg, Toast.LENGTH_SHORT).show()
        }







    }
}