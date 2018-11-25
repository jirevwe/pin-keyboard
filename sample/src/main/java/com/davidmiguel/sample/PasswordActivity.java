package com.davidmiguel.sample;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.WindowManager;
import android.widget.Toast;

import com.davidmiguel.numberkeyboard.NumberKeyboard;
import com.davidmiguel.numberkeyboard.NumberKeyboardListener;
import com.goodiebag.pinview.PinView;

public class PasswordActivity extends AppCompatActivity implements NumberKeyboardListener {

    private PinView mPinView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setContentView(R.layout.activity_password);

        mPinView = findViewById(R.id.pin_view);
        NumberKeyboard mNumberKeyboard = findViewById(R.id.numberKeyboard);
        mNumberKeyboard.setListener(this);
    }

    @Override
    public void onNumberClicked(int number) {
        mPinView.append(String.valueOf(number));
    }

    @Override
    public void onLeftAuxButtonClicked() {
        Toast.makeText(this, mPinView.getValue(), Toast.LENGTH_SHORT).show();
    }

    @Override
    public void onRightAuxButtonClicked() {
        mPinView.backSpaceClicked();
    }
}
