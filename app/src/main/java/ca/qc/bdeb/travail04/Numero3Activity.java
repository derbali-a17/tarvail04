package ca.qc.bdeb.travail04;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.app.ActivityCompat;

import android.content.Intent;
import android.content.pm.PackageManager;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.Manifest;

public class Numero3Activity extends AppCompatActivity {

    public static final int REQUEST_CODE = 1;
    EditText txtPhoneNumber;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_numero3);
        txtPhoneNumber = findViewById(R.id.num3_txt_phone_number);
    }

    public void lancerAppel(View view) {
        String phoneNumber = txtPhoneNumber.getText().toString();
        //lancer l'application de téléphonie (intent implicite)
        /* S'assurer que la permission de passer appel est accordée */
        if(ActivityCompat.checkSelfPermission(this, Manifest.permission.CALL_PHONE) != PackageManager.PERMISSION_GRANTED){
            ActivityCompat.requestPermissions(this, new String[]{Manifest.permission.CALL_PHONE}, REQUEST_CODE);
        }else{
            Intent intent = new Intent();
            intent.setAction(Intent.ACTION_CALL);
            Uri uri = Uri.parse("tel: " + phoneNumber);
            intent.setData(uri);
            startActivity(intent);
        }
    }

    /*
    @Override
    protected void onActivityResult(int requestCode, int resultCode, @Nullable Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
    }
     */
}