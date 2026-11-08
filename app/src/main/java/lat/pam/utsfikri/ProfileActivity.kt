package lat.pam.utsfikri

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

class ProfileActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_profile)
        findViewById<Button>(R.id.btnSave).setOnClickListener {
            Toast.makeText(this, "Profil tersimpan", Toast.LENGTH_SHORT).show()
        }
        findViewById<Button>(R.id.navHome).setOnClickListener { finish() }
        findViewById<Button>(R.id.navShipping).setOnClickListener {
            startActivity(Intent(this, AddressActivity::class.java))
        }
        findViewById<Button>(R.id.btnAddress).setOnClickListener {
            startActivity(Intent(this, AddressActivity::class.java))
        }
    }
}