package softagi.coffeesenior;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity
{
    int price = 0;

    RadioButton r1,r2,r3;
    Button order_btn;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        r1 = findViewById(R.id.french_radio);
        r2 = findViewById(R.id.turkish_radio);
        r3 = findViewById(R.id.espresso_radio);

        order_btn = findViewById(R.id.order_btn);

        /*r1.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                price = 5;
            }
        });

        r2.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                price = 7;
            }
        });

        r3.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                price = 10;
            }
        });*/

        order_btn.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                Toast.makeText(MainActivity.this, price + "", Toast.LENGTH_SHORT).show();
            }
        });
    }

    public void onRadioButtonClicked(View view)
    {
        // Check which radio button was clicked
        switch(view.getId())
        {
            case R.id.french_radio:
                price = 5;
                break;
            case R.id.turkish_radio:
                price = 7;
                break;
            case R.id.espresso_radio:
                price = 10;
                break;
             default:
                 break;
        }
    }
}
