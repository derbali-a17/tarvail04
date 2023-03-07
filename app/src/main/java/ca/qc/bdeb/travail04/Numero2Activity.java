package ca.qc.bdeb.travail04;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class Numero2Activity extends AppCompatActivity {

    TextView lblLogin, lblPassword;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_numero2);
        //init
        lblLogin = findViewById(R.id.num2_lbl_login);
        lblPassword = findViewById(R.id.num2_lbl_password);
        //récupérer les données
        Bundle bundle = getIntent().getExtras();
        if(bundle != null){
            String login = bundle.getString("login");
            String pwd = bundle.getString("password");
            if(!login.equals(""))
                lblLogin.setText("Votre login est " + login);
            else
                lblLogin.setText("Aucun login n'est envoyé");

            if(!pwd.equals(""))
                lblPassword.setText("Votre mot de passe est " + pwd);
            else
                lblPassword.setText("Aucun mot de passe n'est envoyé");
        }
    }

    public void retournerAuMain(View view) {
        Intent intent = new Intent(this, MainActivity.class);
        startActivity(intent);
        finish();
    }
}