package com.example.myfirstapplication

import android.os.Bundle
import android.widget.Button
import android.widget.SeekBar
import android.widget.SeekBar.OnSeekBarChangeListener
import android.widget.TextView
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import java.util.*


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val res1 = findViewById<TextView>(R.id.firstResultText)
        val res2 = findViewById<TextView>(R.id.secondResultText)
        val but1 = findViewById<Button>(R.id.randomButton)
        val but2 = findViewById<Button>(R.id.mul2Button)
        val but3 = findViewById<Button>(R.id.zeroButton)
        val skbr = findViewById<SeekBar>(R.id.seekBar)

        var result = 0

        res1.text = result.toString()
        res2.text = result.toString()

        but1.setOnClickListener {
            var rand = Random().nextInt(10) + 1
            result = rand
            res1.text = result.toString()
            res2.text = (result * skbr.progress).toString()
        }

        but2.setOnClickListener {
            result = result * 2
            res1.text = result.toString()
            res2.text = (result * skbr.progress).toString()
        }

        but3.setOnClickListener {
            result = 0
            res1.text = result.toString()
            res2.text = (result * skbr.progress).toString()
        }

        skbr.setOnSeekBarChangeListener(object : OnSeekBarChangeListener {
            override fun onStopTrackingTouch(seekBar: SeekBar) {
                // TODO Auto-generated method stub
            }

            override fun onStartTrackingTouch(seekBar: SeekBar) {
                // TODO Auto-generated method stub
            }

            override fun onProgressChanged(
                seekBar: SeekBar,
                progress: Int,
                fromUser: Boolean
            ) {
                // TODO Auto-generated method stub
//                t1.setTextSize(progress)
//                Toast.makeText(applicationContext, progress.toString(), Toast.LENGTH_LONG)
//                    .show()
                res2.text = (result * progress).toString()
            }
        })
    }
}
