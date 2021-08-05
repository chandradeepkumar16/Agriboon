package agriboon.example.myagriboonapp;

import android.os.Bundle;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class ItemActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_item);
        String type= getIntent().getStringExtra("type");
        Toast.makeText(this, ""+type, Toast.LENGTH_SHORT).show();
    }
}