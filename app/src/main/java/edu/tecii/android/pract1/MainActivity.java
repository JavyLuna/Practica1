package edu.tecii.android.pract1;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{
    EditText text;
    Button boton;
    TextView label;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        text = (EditText)findViewById(R.id.text);
        boton = (Button)findViewById(R.id.boton1);
        label=(TextView)findViewById(R.id.label);
        boton.setOnClickListener(this);
        }

    public void onClick(View v){
        switch(v.getId()) {
            case R.id.boton1:
                int temp = Integer.parseInt(text.getText().toString());
                int resultado  = temp * (temp + 1) / 2;
                    label.setText(" " + resultado);
                break;
            default:
                break;
        }
    }
}
