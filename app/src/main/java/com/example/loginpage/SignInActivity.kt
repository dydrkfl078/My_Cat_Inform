package com.example.loginpage

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.ImageView
import android.widget.Toast

class SignInActivity : AppCompatActivity() {



    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_sign_in)

        // 이미지뷰 UI연결
        val signInLogo = findViewById<ImageView>(R.id.sign_page_imageview)

        // 텍스트뷰 UI 연결
        val inputName = findViewById<EditText>(R.id.sign_in_input_name)
        val inputId = findViewById<EditText>(R.id.sign_in_input_id)
        val inputPw = findViewById<EditText>(R.id.sign_in_input_pw)

        // 버튼 UI 연결
        val btnSignIn = findViewById<Button>(R.id.sign_in_btn_sign_in)

        // signinpage로고 이미지 지정
        signInLogo.setImageResource(R.drawable.sign_in_page_logo)


        // name edittext에 입력하는 값 String으로 변환.
        val inputNameText: String = inputId.text.toString()
        val inputIdText: String = inputId.text.toString()
        val inputPwText: String = inputId.text.toString()

        // 회원가입 버튼
        btnSignIn.setOnClickListener {
            if (inputId.text.isEmpty()||inputPw.text.isEmpty() || inputName.text.isEmpty()){
                ToastUtil.makeToast(this,"이름,아이디,비밀번호는 필수입력 사항입니다.")
            }else{
                finish()
                // String으로 변환해둔 name 입력 값을 extras에 저장.
                intent.putExtra("singinInformName",inputNameText)
                intent.putExtra("singinInformName",inputIdText)
                intent.putExtra("singinInformName",inputPwText)
            }
        }


    }
}

//