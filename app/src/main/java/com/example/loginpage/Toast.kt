package com.example.loginpage

import android.content.Context
import android.widget.Toast

// 토스트 중복으로 뜨는 것 방지
// 사용법 ToastUtil.makeToast(this,"토스트 메세지 입력")
object ToastUtil{
    var toast: Toast? = null
    fun makeToast(context: Context,message: String) {
        toast?.cancel()
        toast = Toast.makeText(context, message, Toast.LENGTH_SHORT)
        toast?.show()
    }
}