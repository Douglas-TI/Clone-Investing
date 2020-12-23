package br.com.douglassilverio.cloneinvesting;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        fadeInLogo();

        final Handler handler = new Handler(Looper.getMainLooper());
        handler.postDelayed(new Runnable() {
            @Override
            public void run() {
                telaInicial();
                finish();
            }
        }, 3000);
    }

    public void fadeInLogo(){
        View logo = findViewById(R.id.imageView2);
        Animation animeFade = AnimationUtils.loadAnimation(getApplicationContext(), R.anim.fade_in);
        logo.startAnimation(animeFade);
    }

    public void telaInicial(){
        Intent intent = new Intent(this, TelaInicial.class);
        startActivity(intent);
    }
}