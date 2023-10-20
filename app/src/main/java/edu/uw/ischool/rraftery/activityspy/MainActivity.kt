package edu.uw.ischool.rraftery.activityspy

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log

class MainActivity : AppCompatActivity() {
    val TAG : String = "MainActivity"
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        Log.i(TAG, "onCreate event fired")
        Log.i(TAG, "onCreate passed param: " + savedInstanceState.toString())
    }

    //For each of the Activity lifecycle methods (onCreate, onDestroy, onStart, onStop, onPause,
    // onResume) write a message to the INFO diagnostic log that says "on{eventname} event fired".
    // If there are any parameters passed to those methods, write them to the log as well.
    //In the onDestroy() method, you must also write a message to the ERROR diagnostic log that says
    // "We're going down, Captain!". (You may, if you wish, use a different message, so long as it
    // is a dramatic movie quote. You must identify the movie, e.g., "'Woah.' --Neo, The Matrix")
    override fun onDestroy() {
        super.onDestroy()
        Log.i(TAG, "onDestroy event fired")
        Log.e(TAG, "We're going down, Captain!")
    }

    override fun onStart() {
        super.onStart()
        Log.i(TAG, "onStart event fired")
    }

    override fun onStop() {
        super.onStop()
        Log.i(TAG, "onStop event fired")
    }

    override fun onPause() {
        super.onPause()
        Log.i(TAG, "onPause event fired")
    }

    override fun onResume() {
        super.onResume()
        Log.i(TAG, "onResume event fired")
    }
}