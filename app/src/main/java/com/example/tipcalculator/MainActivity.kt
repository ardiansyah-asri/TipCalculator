package com.example.tipcalculator

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.SeekBar

import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // My code
        // Get Bill amount
        seekBarTipPercent.setOnSeekBarChangeListener(object : SeekBar.OnSeekBarChangeListener{
            override fun onProgressChanged(seekBar: SeekBar?, progress: Int, fromUser: Boolean) {
                textViewTipPercent.text = progress.toString() + "%"


            }

            override fun onStartTrackingTouch(seekBar: SeekBar?) {

            }

            override fun onStopTrackingTouch(seekBar: SeekBar?) {

            }

        })

        seekBarPeople.setOnSeekBarChangeListener(object : SeekBar.OnSeekBarChangeListener{
            override fun onProgressChanged(seekBar: SeekBar?, progress: Int, fromUser: Boolean) {
                txtOrg.text = progress.toString()
            }

            override fun onStartTrackingTouch(seekBar: SeekBar?) {

            }

            override fun onStopTrackingTouch(seekBar: SeekBar?) {

            }

        })




        buttonCalculate.setOnClickListener{
            val billAmount = editTextBill.text.toString().toInt()

            //Get Tip Percent
            val tipPercent = seekBarTipPercent.progress

            val tipPeople = seekBarPeople.progress

            // Calculate the tip Amount
            val tipAmount = (billAmount * tipPercent) / 100

            // Calculate total payment
            val totalPayment = billAmount + tipAmount

            val totalPeople = totalPayment / tipPeople

            //Total $115 (tip $15)
            textViewTotalPayment.text = "Total $${totalPayment} (tip $${tipAmount}) (Each Person: ${totalPeople})"

            //"Total $" + totalPayment + " ( tip $"+ tipAmount +")"
        }


    }
}
