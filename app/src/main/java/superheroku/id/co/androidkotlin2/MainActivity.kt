package superheroku.id.co.androidkotlin2

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.support.design.widget.Snackbar
import android.widget.Button
import android.widget.EditText

import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var username = findViewById(R.id.txtUsername) as EditText
        var pass = findViewById(R.id.txtPassword) as EditText
        var btnLogin = findViewById(R.id.btnLogin) as Button
        btnLogin.setOnClickListener {
            if (isValidCredential(username.text.toString(), pass.text.toString())) {
                Snackbar.make(btnLogin, "Success Login", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show()
            } else {
                Snackbar.make(btnLogin, "Invalid Credential", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show()
            }
        }
    }

    fun isValidCredential(email: String, password: String): Boolean {
        return (email == "rizki" && password == "1234567")
    }

}
