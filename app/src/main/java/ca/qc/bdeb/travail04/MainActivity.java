package ca.qc.bdeb.travail04;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void lancerNumero1(View view) {
        Intent intent = new Intent(this, Numero1Activity.class);
        startActivity(intent);
        finish();
    }

    public void lancerNumero2(View view) {
        EditText txtLogin = findViewById(R.id.num2_txt_login);
        EditText txtPassword = findViewById(R.id.num2_txt_password);
        Intent intent = new Intent(this, Numero2Activity.class);
        //placer les informations à envoyer
        intent.putExtra("login", txtLogin.getText().toString());
        intent.putExtra("password", txtPassword.getText().toString());
        //démarrer l'activité 2
        startActivity(intent);
        finish();
    }

    public void lancerNumero3(View view) {
        Intent intent = new Intent(this, Numero3Activity.class);
        startActivity(intent);
    }
}