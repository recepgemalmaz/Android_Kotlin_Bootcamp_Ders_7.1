package com.recepgemalmaz.navigationcomponentkullanimi

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.navigation.fragment.NavHostFragment
import androidx.navigation.ui.NavigationUI
import com.recepgemalmaz.navigationcomponentkullanimi.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding= ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)


        val navHostFragment = supportFragmentManager.findFragmentById(R.id.navHostFragment) as NavHostFragment //navHostFragment i bul
        NavigationUI.setupWithNavController(binding.bottomNavigationView, navHostFragment.navController) //bottomNavigationView ile navController i bagla
    }
}