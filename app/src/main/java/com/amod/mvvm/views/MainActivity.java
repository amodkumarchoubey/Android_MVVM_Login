package com.amod.mvvm.views;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;
import androidx.databinding.BindingAdapter;
import androidx.databinding.DataBindingUtil;

import com.amod.mvvm.R;
import com.amod.mvvm.databinding.ActivityMainBinding;
import com.amod.mvvm.viewmodels.LoginViewModel;


public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        ActivityMainBinding activityMainBinding = DataBindingUtil.setContentView(this, R.layout.activity_main);
        activityMainBinding.setViewModel(new LoginViewModel());
        activityMainBinding.executePendingBindings();

    }

    @BindingAdapter({"toastMessage"})
    public static void runMe(View view, String message) {
        if (message != null) {
            Toast.makeText(view.getContext(), message, Toast.LENGTH_SHORT).show();
            if (message.equalsIgnoreCase(LoginViewModel.successMessage)) {
                Context context = view.getContext();
                Intent intent = new Intent(context, HomeActivity.class);
                context.startActivity(intent);
            }
        }

    }
}