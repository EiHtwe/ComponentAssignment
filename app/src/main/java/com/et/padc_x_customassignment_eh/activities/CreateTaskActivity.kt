package com.et.padc_x_customassignment_eh.activities

import android.content.Context
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.et.padc_x_customassignment_eh.R

class CreateTaskActivity : AppCompatActivity() {

    companion object {


        fun newIntent(context: Context): Intent {
            val intent =  Intent(context, ProfileActivity::class.java)
            return intent
        }
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_create_task)
    }
}
