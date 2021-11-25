package com.example.splashscreen

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.fragment.app.Fragment
import com.example.splashscreen.fragment.*
import com.google.android.material.bottomnavigation.BottomNavigationView

class ActivityBeranda : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_beranda)

        val dashboardFragment = DashboardFragment()
        val userFragment = UserFragment()
        val riwayatFragment = RiwayatFragment()

        makeCurrentFragment (dashboardFragment)

        val bottom_navigation = findViewById<BottomNavigationView>(R.id.bottom_navigation)

        bottom_navigation.setOnNavigationItemReselectedListener {
            when(it.itemId) {
                R.id.menu_dashboard -> makeCurrentFragment(dashboardFragment)
                R.id.menu_riwayat -> makeCurrentFragment(userFragment)
                R.id.menu_user -> makeCurrentFragment(riwayatFragment)
            }
        }
    }

    private fun makeCurrentFragment( fragment : Fragment) {
        supportFragmentManager.beginTransaction().apply {
            replace(R.id.fram_beranda, fragment)
            commit()
        }

    }
}