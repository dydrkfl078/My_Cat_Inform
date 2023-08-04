package com.example.loginpage

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView

class HomeActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_home)

        // extra 값 받아오기, loginInformId값을 받아옴
        val idData = intent.getStringExtra("loginInformId")
//        val nameData = intent.getStringExtra("signinInformName")


        // UI와 연결하기
        val btnFinish = findViewById<Button>(R.id.home_page_btn_finish)
        val tvId = findViewById<TextView>(R.id.home_page_textview_id)
        val homePageLogo = findViewById<ImageView>(R.id.home_page_imageView)
//        val tvName = findViewById<TextView>(R.id.home_page_textview_name)

        // textview에 extras에서 받아온 자료 넣어주기.
        tvId.setText("아이디 : "+idData)

        // Homepage로고 지정하기
        homePageLogo.setImageResource(R.drawable.home_iv_cat)

        // 로그인화면으로 돌아가기.
        btnFinish.setOnClickListener {
            finish()
        }

    }
}
