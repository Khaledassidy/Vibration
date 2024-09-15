
package com.example.vibration;

import android.os.Bundle;
import android.os.Vibrator;
import android.widget.Button;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;


//badna net3lam eno keeff bas nekbous 3ala l button na3mel vibrate
//hyde best5dem class esmo Vibrator
//l vibration 3ebra 3an service awjoude bel android system bestd3eha mn 5elle getsystemservice(Vibratorsystem) hyde btrje3 object mno3 vibrator mn5zena w ba3den mn3mel 3mlyet l vibrate
//w fe method b2lb l vibrator class esma vibrate wbte5od wa2t bel millisec
//bas hyda she kelo ma bseer iza ma 7atet l permisision ta3et l vibration
public class MainActivity extends AppCompatActivity {
    Button vibrate;
    Vibrator vibrator;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        vibrate=findViewById(R.id.vibrate);

        vibrator=(Vibrator) getSystemService(VIBRATOR_SERVICE);
        vibrate.setOnClickListener(v->{
            vibrator.vibrate(100);
        });

    }
}