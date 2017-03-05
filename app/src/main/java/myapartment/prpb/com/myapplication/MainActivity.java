package myapartment.prpb.com.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import anroid.widget.TextView;

public class MainActivity extends AppCompatActivity {
  TextView tv;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        tv=new TextView();
        tv.setText("Hello");
    }
}
