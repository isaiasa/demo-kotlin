package demokotlin.wswork.com.br.demo_kotlin

import android.graphics.Color
import android.os.Bundle
import android.support.design.widget.BottomNavigationView
import android.support.v7.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_kotlin.*

class KotlinActivity : AppCompatActivity() {

    private val mOnNavigationItemSelectedListener = BottomNavigationView.OnNavigationItemSelectedListener { item ->
        when (item.itemId) {
            R.id.navigation_home -> {

                message.setText(R.string.title_home)

                buttonExample.setText("Navigation Button")
                buttonExample.setBackgroundColor(Color.parseColor("#FFFF00"))

                return@OnNavigationItemSelectedListener true
            }
            R.id.navigation_dashboard -> {

                message.setText(R.string.title_dashboard)

                buttonExample.setText("Dashboard Button")
                buttonExample.setBackgroundColor(Color.parseColor("#00FF00"))

                return@OnNavigationItemSelectedListener true
            }
            R.id.navigation_notifications -> {

                message.setText(R.string.title_notifications)

                buttonExample.setText("Notification Button")
                buttonExample.setBackgroundColor(Color.parseColor("#FF0000"))

                return@OnNavigationItemSelectedListener true
            }
        }
        false
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_kotlin)

        navigation.setOnNavigationItemSelectedListener(mOnNavigationItemSelectedListener)
    }
}
