package edu.unikom.bottomnavigationhamid

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.navigation.findNavController
import androidx.navigation.ui.setupWithNavController
import com.google.android.material.bottomnavigation.BottomNavigationView
import edu.unikom.bottomnavigationhamid.R

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main) // Mengatur layout utama activity

        // 1. Mendapatkan referensi ke BottomNavigationView dari layout
        val navView: BottomNavigationView = findViewById(R.id.bottom_navigation)

        // 2. Mendapatkan referensi ke NavController dari NavHostFragment
        //    R.id.nav_host_fragment adalah ID dari fragment di activity_main.xml
        val navController = findNavController(R.id.nav_host_fragment)

        // 3. Menghubungkan BottomNavigationView dengan NavController
        //    Ini secara otomatis akan menangani pergantian fragmen saat item di BottomNavigationView diklik
        navView.setupWithNavController(navController)
    }
}