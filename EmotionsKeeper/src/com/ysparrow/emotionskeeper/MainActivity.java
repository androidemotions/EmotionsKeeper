package com.ysparrow.emotionskeeper;

import android.app.Activity;
import android.graphics.Color;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
	super.onCreate(savedInstanceState);
	setContentView(R.layout.activity_main);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
	// Inflate the menu; this adds items to the action bar if it is present.
	getMenuInflater().inflate(R.menu.main, menu);

	Button button1 = (Button) findViewById(R.id.button1);
	Button button2 = (Button) findViewById(R.id.button2);
	Button button3 = (Button) findViewById(R.id.button3);
	Button button4 = (Button) findViewById(R.id.button4);
	
	button1.setBackgroundColor(Color.rgb(255, 51, 0));
	button2.setBackgroundColor(Color.rgb(255, 102, 0));
	button3.setBackgroundColor(Color.rgb(153, 204, 0));
	button4.setBackgroundColor(Color.rgb(51, 204, 51));

	button1.setOnClickListener(new OnClickListener() {

	    @Override
	    public void onClick(View view) {
		TextView messageText = (TextView) findViewById(R.id.textView2);
		messageText.setText("You are Angry");
		
	    }

	});

	button2.setOnClickListener(new OnClickListener() {

	    @Override
	    public void onClick(View view) {
		TextView messageText = (TextView) findViewById(R.id.textView2);
		messageText.setText("You are Satisfy");
	    }

	});

	button3.setOnClickListener(new OnClickListener() {

	    @Override
	    public void onClick(View view) {
		TextView messageText = (TextView) findViewById(R.id.textView2);
		messageText.setText("You are Good");
	    }

	});
	button4.setOnClickListener(new OnClickListener() {

	    @Override
	    public void onClick(View view) {
		TextView messageText = (TextView) findViewById(R.id.textView2);
		messageText.setText("You are Happy");
	    }

	});
	return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
	// Handle action bar item clicks here. The action bar will
	// automatically handle clicks on the Home/Up button, so long
	// as you specify a parent activity in AndroidManifest.xml.
	int id = item.getItemId();
	if (id == R.id.action_settings) {
	    return true;
	}
	return super.onOptionsItemSelected(item);
    }

}
