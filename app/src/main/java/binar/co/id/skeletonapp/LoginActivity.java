package binar.co.id.skeletonapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class LoginActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        setupLogin();
    }

    private void setupLogin() {
        final Button btSignin = findViewById(R.id.bt_signin);
        btSignin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                doLogin();
            }
        });
    }

    private void doLogin() {
        // add validation here, if meet the criteria, call method goToMainMenu(), if not call method showError()

        // end here
    }

    private void goToMainMenu() {
        final Intent intent = new Intent(this, MainMenuActivity.class);
        startActivity(intent);
    }

    private void showError(){
        Toast.makeText(this, R.string.incorrect_login, Toast.LENGTH_LONG).show();
    }
}
