package com.example.aexpress.Validate;

import android.content.Context;
import android.widget.Toast;

public class Validate {
    static Context context;
    static String isEmail = "\\w+@\\w+(\\.\\w+){1,2}";
    static String isPass = ".{8,}";
    public static boolean user(String email, String password, String comfirm){
        if (email.trim().length() == 0){
            Toast.makeText(context, "Please enter email", Toast.LENGTH_SHORT).show();
            return false;
        }
        if (password.trim().length() == 0){
            Toast.makeText(context, "Please enter password", Toast.LENGTH_SHORT).show();
            return false;
        }
        if (comfirm.trim().length() == 0){
            Toast.makeText(context, "Please re-enter your password", Toast.LENGTH_SHORT).show();
            return false;
        }
        if (!email.matches(isEmail)){
            Toast.makeText(context, "Email invalidate", Toast.LENGTH_SHORT).show();
            return false;
        }
        if (!password.matches(isPass)){
            Toast.makeText(context, "Password invalidate", Toast.LENGTH_SHORT).show();
            return false;
        }
        return true;
    }


}
