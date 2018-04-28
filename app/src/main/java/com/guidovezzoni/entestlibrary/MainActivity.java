package com.guidovezzoni.entestlibrary;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Toast;

import com.guidovezzoni.entest.InAppTest;
import com.guidovezzoni.entest.model.TestSummary;

@SuppressWarnings("squid:MaximumInheritanceDepth")
public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        FloatingActionButton fab = findViewById(R.id.fab);
        fab.setOnClickListener(this::runTests);
    }

    @SuppressWarnings("unused")
    private void runTests(View view) {
        InAppTest inAppTest = new InAppTest();

        inAppTest.addTest(expected -> 5 + 5 == expected, 10);
        inAppTest.addTest(expected -> 5 * 5 == expected, 25);
        inAppTest.addTest(expected -> 5 + 5 == expected, 55);

        TestSummary testSummary = inAppTest.run();

        final String s = "Total number of test:" + testSummary.getTotal() +
                "\nSuccess: " + testSummary.getSuccess() +
                "\nFailed: " + testSummary.getFail() +
                "\nExceptions: " + testSummary.getException() +
                "\nNot run: " + testSummary.getNotExecuted();

        Toast.makeText(this, s, Toast.LENGTH_LONG).show();
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
