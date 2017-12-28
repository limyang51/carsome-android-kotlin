package com.example.louis.carsomeandroidkotlin.util

import java.util.regex.Pattern

/**
 * Created by Louis on 28/12/2017.
 */
class EmailValidator{

    companion object {

        private val EMAIL_PATTERN = Pattern.compile(
                "[a-zA-Z0-9\\+\\.\\_\\%\\-\\+]{1,256}" +
                        "\\@" +
                        "[a-zA-Z0-9][a-zA-Z0-9\\-]{0,64}" +
                        "(" +
                        "\\." +
                        "[a-zA-Z0-9][a-zA-Z0-9\\-]{0,25}" +
                        ")+"
        )

        fun isValidEmail(email: String?): Boolean{
            return email != null && EMAIL_PATTERN.matcher(email).matches()
        }
    }

    class PasswordValidator{
        companion object {

            fun passWordLengthCheck(password: String): Boolean{
                return password.length >= 8
            }

            fun confirmPassword(first: String, second: String): Boolean{
                return first == second
            }

        }
    }

}