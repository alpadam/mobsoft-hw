package hu.bme.aut.mobsoft.lab.mobszofthomework.ui.login;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.google.android.gms.analytics.HitBuilders;
import com.google.android.gms.analytics.Tracker;

import javax.inject.Inject;

import hu.bme.aut.mobsoft.lab.mobszofthomework.MainApplication;
import hu.bme.aut.mobsoft.lab.mobszofthomework.R;

import static android.R.attr.name;

public class LoginActivity extends AppCompatActivity implements LoginScreen {

    @Inject
    LoginPresenter loginPresenter;

    private EditText username;
    private EditText pw;
    private Button loginBtn;

    private static Tracker mTracker;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        MainApplication application = (MainApplication) getApplication();
        mTracker = application.getDefaultTracker();

        username = (EditText) findViewById(R.id.editUsername);
        pw = (EditText) findViewById(R.id.editPassword);
        loginBtn = (Button) findViewById(R.id.loginButton);

        MainApplication.injector.inject(this);

        loginBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
            mTracker.setScreenName("Image~" + name);
            mTracker.send(new HitBuilders.EventBuilder()
                    .setCategory("MOBSOFT")
                    .setAction("LOGIN")
                    .build());
            loginPresenter.login(username.getText().toString(), pw.getText().toString());

            //throw new RuntimeException("This is a crash");
            }
        });
    }

    @Override
    protected void onStart() {
        super.onStart();
        loginPresenter.attachScreen(this);
    }

    @Override
    protected void onStop() {
        super.onStop();
        loginPresenter.detachScreen();
    }

    public void login() {
    }

    public void navigateToFuelRecordList() {
    }

    @Override
    public void showMessage(String text) {
        Toast.makeText(this, text, Toast.LENGTH_SHORT).show();
    }
}