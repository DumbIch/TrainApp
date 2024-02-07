package ru.dumdumbich.trainapp.ui

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import ru.dumdumbich.trainapp.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var ui: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        ui = ActivityMainBinding.inflate(layoutInflater)
        setContentView(ui.root)

    }
}