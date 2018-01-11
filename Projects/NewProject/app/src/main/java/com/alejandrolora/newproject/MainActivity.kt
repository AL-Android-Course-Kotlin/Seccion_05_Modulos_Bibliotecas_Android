package com.alejandrolora.newproject

import android.os.Bundle
import com.alejandrolora.mylibrary.ToolbarActivity

class MainActivity : ToolbarActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        welcome()
    }


}
