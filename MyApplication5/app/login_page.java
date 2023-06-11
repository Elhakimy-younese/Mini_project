import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import com.example.myapplication.R;

import java.*;
public class login_page {

    EditText email= findViewById(R.id.username);
    EditText password = findViewById(R.id.password);
    Button btn = findViewById(R.id.login);
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);


    }
}
