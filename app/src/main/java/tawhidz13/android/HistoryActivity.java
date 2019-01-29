package tawhidz13.android;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.text.method.ScrollingMovementMethod;
import android.util.Log;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.TextView;

public class HistoryActivity extends Activity {
	
	TextView tv;
	Button back;
	Intent in;
	String s;
	@Override
	protected void onCreate(Bundle savedInstanceState) {

		//Remove title bar
		this.requestWindowFeature(Window.FEATURE_NO_TITLE);

//Remove notification bar
		this.getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);

		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		
		setContentView(R.layout.history);
		tv = (TextView)findViewById(R.id.textView1);
		back = (Button) findViewById(R.id.button2);
		tv.setMovementMethod(new ScrollingMovementMethod());
		in= getIntent();
		//s = in.getStringExtra("displayMsg");
		s=readFromFile(this);
		tv.setText(s);
	}
	
	public void goBack(View v)
	{
		onBackPressed();
	}
	
	private String readFromFile(Context context) {

	    String ret = "";

	    try {
	        InputStream inputStream = context.openFileInput("calculate.txt");

	        if ( inputStream != null ) {
	        	StringBuffer output = new StringBuffer();
	            InputStreamReader inputStreamReader = new InputStreamReader(inputStream);
	            BufferedReader bufferedReader = new BufferedReader(inputStreamReader);
	            String receiveString = "";
	           // StringBuilder stringBuilder = new StringBuilder();

	            while ( (receiveString = bufferedReader.readLine()) != null ) {
	               // stringBuilder.append(receiveString);
	                output.append(receiveString+"\n");
	            }

	            inputStream.close();
	            ret = output.toString();
	        }
	    }
	    catch (FileNotFoundException e) {
	        Log.e("login activity", "File not found: " + e.toString());
	    } catch (IOException e) {
	        Log.e("login activity", "Can not read file: " + e.toString());
	    }

	    return ret;
	}

}
