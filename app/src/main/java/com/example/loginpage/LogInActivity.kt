package com.example.loginpage

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.ImageView
import android.widget.Toast


class LogInActivity : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)

        // UI와 연결하기
        val logInPageLogo = findViewById<ImageView>(R.id.login_page_imageview)
        val inputId = findViewById<EditText>(R.id.log_in_input_id)
        val inputPw = findViewById<EditText>(R.id.log_in_input_pw)
        val btnLogIn = findViewById<Button>(R.id.log_in_btn_login)
        val btnSignIn = findViewById<Button>(R.id.log_in_btn_sign_in)

        // 로그인 페이지 로고 이미지 설정
        logInPageLogo.setImageResource(R.drawable.log_in_page_logo)

        // SignInActivity로 화면 이동
        btnSignIn.setOnClickListener {
            val intent = Intent(this, SignInActivity::class.java)
            startActivity(intent)
        }

        // 버튼 클릭 이벤트
        btnLogIn.setOnClickListener {
            val inputIdText: String = inputId.text.toString()
            val inputPwText: String = inputPw.text.toString()
            if (inputIdText.isEmpty() || inputPwText.isEmpty())
            //todo 시간 되면 아이디, 비밀번호 sharedpreferences로 지정된 아이디,비밀번호가 아닐 시 반환하는 것 연습.
            {
                ToastUtil.makeToast(this, "아이디 또는 비밀번호가 올바르지 않습니다.")
            } else {
                val intent = Intent(this, HomeActivity::class.java)
                intent.putExtra("loginInformId", inputIdText)
                intent.putExtra("loginInformPw", inputPwText)
                startActivity(intent)
                ToastUtil.makeToast(this, "로그인성공")
            }
        }

    }
}


