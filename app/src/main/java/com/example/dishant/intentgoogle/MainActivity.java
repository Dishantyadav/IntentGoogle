package com.example.dishant.intentgoogle;

import android.app.Activity;
import android.app.SearchManager;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends Activity {

    private static final String TAG = "MainActivity";

    /**
     * Creating EditText object
     */
    private EditText edit;


    /**
     * Called when the activity is first created.
     */

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Log.d(TAG, "onCreate: Started");

        edit = (EditText) findViewById(R.id.editText);


    }

    /**
     * created a new method onSearchClick
     * Where all the intent function performed
     * and this method is declare in button onClick in xml file
     * @param view
     */

    public void onSearchClick(View view){

        Intent intent = new Intent(Intent.ACTION_WEB_SEARCH);
        String temp = edit.getText().toString();
        intent.putExtra(SearchManager.QUERY,temp);
        startActivity(intent);
    }
}
