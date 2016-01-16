package com.example.administrator.intenttab_05_53;

import android.app.TabActivity;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.TabHost;

public class MainActivity extends TabActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TabHost tabHost = getTabHost();
        tabHost.addTab(tabHost
        .newTabSpec("tab1")
        .setIndicator("已接电话",
                getResources().getDrawable(R.mipmap.ic_launcher))
        .setContent(new Intent(this,BeCalledActivity.class)));

        tabHost.addTab(tabHost
        .newTabSpec("tab1")
        .setIndicator("呼出电话",
                getResources().getDrawable(R.mipmap.ic_launcher))
        .setContent(new Intent(this,CalledActivity.class)));

        tabHost.addTab(tabHost
        .newTabSpec("tab1")
        .setIndicator("未接电话",
                getResources().getDrawable(R.mipmap.ic_launcher))
        .setContent(new Intent(this,NoCallActivity.class)));

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
