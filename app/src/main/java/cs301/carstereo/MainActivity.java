package cs301.carstereo;

import android.content.DialogInterface;
import android.graphics.Color;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.ProgressBar;
import android.widget.TextView;
import android.widget.ToggleButton;


public class MainActivity extends ActionBarActivity {


    ToggleButton power;
    View v;
    Button am;
    Button fm;
    Button seekUp;
    Button seekDown;
    ProgressBar volume;
    TextView radDisplay;
    boolean amtrue;
    int fmStation = 881;
    int amStation = 530;
    double newfm;
    Button pre1;
    Button pre2;
    Button pre3;
    Button pre4;
    Button pre5;
    Button pre6;
    public int[] amArray = new int[] {550,600,650,700,750,800};
    public double[] fmArray = new double[] {90.9,92.9,94.9,96.9,98.9,100.9};




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        power = (ToggleButton) findViewById(R.id.powerButton);
        am = (Button) findViewById(R.id.am);
        fm = (Button) findViewById(R.id.fm);
        volume = (ProgressBar) findViewById(R.id.volumeControl);
        radDisplay = (TextView) findViewById(R.id.radioDisplay);
        seekDown = (Button) findViewById(R.id.tuneDown);
        seekUp = (Button) findViewById(R.id.tuneUp);

        pre1 = (Button) findViewById(R.id.preset1);
        pre2 = (Button) findViewById(R.id.preset2);
        pre3 = (Button) findViewById(R.id.preset3);
        pre4 = (Button) findViewById(R.id.preset4);
        pre5 = (Button) findViewById(R.id.preset5);
        pre6 = (Button) findViewById(R.id.preset6);

        power.setOnClickListener(new powerButtonListener());
        am.setOnClickListener(new amListener());
        fm.setOnClickListener(new fmListener());
        seekUp.setOnClickListener(new seekUpListener());
        seekDown.setOnClickListener(new seekDownListener());
        pre1.setOnClickListener(new pre1Listener());
        pre2.setOnClickListener(new pre2Listener());
        pre3.setOnClickListener(new pre3Listener());
        pre4.setOnClickListener(new pre4Listener());
        pre5.setOnClickListener(new pre5Listener());
        pre6.setOnClickListener(new pre6Listener());

        pre1.setOnLongClickListener(new pre1LongListener());
        pre2.setOnLongClickListener(new pre2LongListener());
        pre3.setOnLongClickListener(new pre3LongListener());
        pre4.setOnLongClickListener(new pre4LongListener());
        pre5.setOnLongClickListener(new pre5LongListener());
        pre6.setOnLongClickListener(new pre6LongListener());

    }

    public class powerButtonListener implements View.OnClickListener {


        @Override
        public void onClick(View v) {

            if (power.isChecked() == true) {
                am.setBackgroundColor(Color.GREEN);
                fm.setBackgroundColor(Color.GREEN);
                power.setBackgroundColor(Color.GREEN);
                radDisplay.setBackgroundColor(Color.GREEN);
                volume.setBackgroundColor(Color.GREEN);
            }
            else
            {
                am.setBackgroundColor(Color.RED);
                fm.setBackgroundColor(Color.RED);
                power.setBackgroundColor(Color.RED);
                radDisplay.setBackgroundColor(Color.RED);
                volume.setBackgroundColor(Color.RED);
            }
        }
    }

    public class amListener implements View.OnClickListener {


        @Override
        public void onClick(View v) {
            if (power.isChecked() == true) {

                radDisplay.setText(amStation + " AM");
                amtrue = true;
            }
        }
    }

    public class fmListener implements View.OnClickListener {


        @Override
        public void onClick(View v) {
            if (power.isChecked() == true) {
                newfm = (double) fmStation;
                newfm = newfm/10;
                radDisplay.setText(newfm + " FM");
                amtrue = false;
            }
        }
    }

    public class seekUpListener implements View.OnClickListener {


        @Override
        public void onClick(View v) {
            if (power.isChecked() == true) {
                if (amtrue == true) {
                    if (amStation == 1700){
                        amStation = 520;
                    }
                    amStation = amStation +10;
                    radDisplay.setText(amStation + " AM");
                }

                else {
                    if (fmStation == 1079){
                        fmStation = 879;
                    }
                    fmStation = fmStation + 2;
                    newfm = (double) fmStation;
                    newfm = newfm/10;
                    radDisplay.setText(newfm + " FM");
                }
            }
        }
    }

    public class seekDownListener implements View.OnClickListener {

        @Override
        public void onClick(View v) {
            if (power.isChecked() == true) {
                if (amtrue == true) {
                    if(amStation == 530){
                        amStation = 1710;
                    }
                    amStation = amStation - 10;
                    radDisplay.setText(amStation + " AM");
                }

                else {
                    if (fmStation == 881){
                        fmStation = 1081;
                    }
                    fmStation = fmStation - 2;
                    newfm = (double) fmStation;
                    newfm = newfm/10;
                    radDisplay.setText(newfm + " FM");
                }
            }
        }
    }


    public class pre1Listener implements View.OnClickListener {

        @Override
        public void onClick(View v) {
            if (power.isChecked() == true){
                if (amtrue == true){
                    radDisplay.setText(amArray[0]+"");
                }
                else {
                    radDisplay.setText(fmArray[0]+"");
                }
            }
        }
    }

    public class pre2Listener implements View.OnClickListener {

        @Override
        public void onClick(View v) {
            if (power.isChecked() == true){
                if (amtrue == true){
                    radDisplay.setText(amArray[1]+"");
                }
                else {
                    radDisplay.setText(fmArray[1]+"");
                }
            }
        }
    }
    public class pre3Listener implements View.OnClickListener {

        @Override
        public void onClick(View v) {
            if (power.isChecked() == true){
                if (amtrue == true){
                    radDisplay.setText(amArray[2]+"");
                }
                else {
                    radDisplay.setText(fmArray[2]+"");
                }
            }
        }
    }
    public class pre4Listener implements View.OnClickListener {

        @Override
        public void onClick(View v) {
            if (power.isChecked() == true){
                if (amtrue == true){
                    radDisplay.setText(amArray[3]+"");
                }
                else {
                    radDisplay.setText(fmArray[3]+"");
                }
            }
        }
    }
    public class pre5Listener implements View.OnClickListener {

        @Override
        public void onClick(View v) {
            if (power.isChecked() == true){
                if (amtrue == true){
                    radDisplay.setText(amArray[4]+"");
                }
                else {
                    radDisplay.setText(fmArray[4]+"");
                }
            }
        }
    }
    public class pre6Listener implements View.OnClickListener {

        @Override
        public void onClick(View v) {
            if (power.isChecked() == true){
                if (amtrue == true){
                    radDisplay.setText(amArray[5]+"");
                }
                else {
                    radDisplay.setText(fmArray[5]+"");
                }
            }
        }
    }

    public class pre1LongListener implements View.OnLongClickListener {

        @Override
        public boolean onLongClick(View v) {
            if (power.isChecked() == true){
               amArray[0]= radDisplay.getText();
            }
            return true;
        }
    }
    public class pre2LongListener implements View.OnLongClickListener {

        @Override
        public boolean onLongClick(View v) {
            if (power.isChecked() == true){
                radDisplay.setText(radDisplay.getText());
            }
            return true;
        }
    }

    public class pre3LongListener implements View.OnLongClickListener {

        @Override
        public boolean onLongClick(View v) {
            if (power.isChecked() == true){
                radDisplay.setText(radDisplay.getText());
            }
            return true;
        }
    }

    public class pre4LongListener implements View.OnLongClickListener {

        @Override
        public boolean onLongClick(View v) {
            if (power.isChecked() == true){
                radDisplay.setText(radDisplay.getText());
            }
            return true;
        }
    }

    public class pre5LongListener implements View.OnLongClickListener {

        @Override
        public boolean onLongClick(View v) {
            if (power.isChecked() == true){
                radDisplay.setText(radDisplay.getText());
            }
            return true;
        }
    }

    public class pre6LongListener implements View.OnLongClickListener {

        @Override
        public boolean onLongClick(View v) {
            if (power.isChecked() == true){
                radDisplay.setText(radDisplay.getText());
            }
            return true;
        }
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
