package lat.pam.utsfikri

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity

class HomeActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_home)
        findViewById<Button>(R.id.navShipping).setOnClickListener {
            startActivity(Intent(this, AddressActivity::class.java))
        }
        findViewById<Button>(R.id.navProfile).setOnClickListener {
            startActivity(Intent(this, ProfileActivity::class.java))
        }
        findViewById<Button>(R.id.btnOrder).setOnClickListener {
            startActivity(Intent(this, AddressActivity::class.java))
        }
    }
}
