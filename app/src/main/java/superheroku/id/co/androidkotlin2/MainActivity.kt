package superheroku.id.co.androidkotlin2

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var username = findViewById(R.id.txtUsername) as EditText
        var pass = findViewById(R.id.txtPassword) as EditText
        var btnLogin = findViewById(R.id.btnLogin) as Button
        btnLogin.setOnClickListener{
            if(isValidCredential(username.text.toString(),pass.text.toString())){
                Snackbar.make(btn_login,"Success Login",Snackbar.LENGTH_LONG)
                        .setAction("Action",null).show()
            }else{
                Snackbar.make(btn_login,"Invalid Credential",Snackbar.LENGTH_LONG)
                        .setAction("Action",null).show()
            }
        }
        }

    fun isValidCredential(email: String, password:String): Boolean{
        return (email == "developer@coniolabs.com" && password == "Android")
    }
    }
}
