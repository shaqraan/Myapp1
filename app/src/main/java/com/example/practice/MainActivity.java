


package com.example.practice;

        import androidx.appcompat.app.AppCompatActivity;

        import android.content.Intent;
        import android.os.Bundle;
        import android.view.View;
        import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    Button b1 , b2;
    @Override

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        b1=(Button) findViewById(R.id.login);
        b2=(Button) findViewById(R.id.signup);
        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent s=new Intent(MainActivity.this,MainActivity2.class);
                startActivity(s);
            }
        });
        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent p=new Intent(MainActivity.this,signup.class);
                startActivity(p);


            }
        });
    }
}