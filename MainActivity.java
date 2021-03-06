package com.example.aditya.veh1;

import android.graphics.Typeface;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.ProgressBar;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;
import android.widget.Toast;


public class MainActivity extends ActionBarActivity {

    RadioGroup rg;
    RadioButton rb;
    ProgressBar pb;
    Typeface tf;
    TextView rpmtext;
    TextView vehspdtext;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        rg= (RadioGroup)findViewById(R.id.rgroup);
        pb=(ProgressBar)findViewById(R.id.progressBar);
        pb.setProgress(80);
        rpmtext=(TextView)findViewById(R.id.valuerpm);
        vehspdtext=(TextView)findViewById(R.id.valuevehspd);
        tf= Typeface.createFromAsset(getAssets(), "fonts/digital-7.ttf");
        rpmtext.setTypeface(tf);
        vehspdtext.setTypeface(tf);

    }
    public void rbclick(View v)
    {
        int radiobuttonid = rg.getCheckedRadioButtonId();
        rb= (RadioButton) findViewById(radiobuttonid);

        Toast.makeText(getBaseContext(), "selected "+rb.getText(), Toast.LENGTH_LONG).show();
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
