package lat.pam.utsfikri

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity

class SignupActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_signup)
        findViewById<Button>(R.id.btnRegister).setOnClickListener { open(RegisterActivity::class.java) }
        findViewById<Button>(R.id.btnLogin).setOnClickListener { open(LoginActivity::class.java) }
    }

    private fun open(target: Class<*>) {
        startActivity(Intent(this, target))
    }
}
