package tawhidz13.android;

import java.io.FileOutputStream;
import java.io.IOException;
import java.text.NumberFormat;
import java.util.Calendar;
import java.util.Date;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class FirstProjectActivity extends Activity {

	private Button btn0;
	private Button btn1;
	private Button btn2;
	private Button btn3;
	private Button btn4;
	private Button btn5;
	private Button btn6;
	private Button btn7;
	private Button btn8;
	private Button btn9;
	private Button btnfp;
	private TextView tv1;
	private boolean eq=false;
	private boolean mr=false;
	private String opr=null,txt;
	private double op1,op2;
	private double ans=0;
	private double help;
	private int value;
	SharedPreferences sharedPref;
	
    /** Called when the activity is first created. */
    @Override
    public void onCreate(Bundle savedInstanceState) {
//Remove title bar
		this.requestWindowFeature(Window.FEATURE_NO_TITLE);

//Remove notification bar
		this.getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);

		super.onCreate(savedInstanceState);
        this.setContentView(R.layout.main);
        
        btn0=(Button)findViewById(R.id.Button0);
        btn1=(Button)findViewById(R.id.Button1);
        btn2=(Button)findViewById(R.id.Button2);
        btn3=(Button)findViewById(R.id.Button3);
        btn4=(Button)findViewById(R.id.Button4);
        btn5=(Button)findViewById(R.id.Button5);
        btn6=(Button)findViewById(R.id.Button6);
        btn7=(Button)findViewById(R.id.Button7);
        btn8=(Button)findViewById(R.id.Button8);
        btn9=(Button)findViewById(R.id.Button9);
        btnfp=(Button)findViewById(R.id.buttonFp);
        
        tv1= (TextView)findViewById(R.id.textView1);
        String txt="0";
		tv1.setText(txt);
		value=0;
    }
    
    @Override
    public void onSaveInstanceState(Bundle savedInstanceState) {
      super.onSaveInstanceState(savedInstanceState);
      savedInstanceState.putString("MyString", tv1.getText().toString());
    }
    
    @Override
    public void onRestoreInstanceState(Bundle savedInstanceState) {
      super.onRestoreInstanceState(savedInstanceState);
      String myString = savedInstanceState.getString("MyString");
      tv1.setText(myString);
    }
        
	@Override
	protected void onDestroy() {
		// TODO Auto-generated method stub
		super.onDestroy();
	}

	@Override
	protected void onPause() {
		// TODO Auto-generated method stub
		super.onPause();
	}

	@Override
	protected void onRestart() {
		// TODO Auto-generated method stub
		super.onRestart();
	}

	@Override
	protected void onResume() {
		// TODO Auto-generated method stub
		super.onResume();
	}

	@Override
	protected void onStart() {
		// TODO Auto-generated method stub
		super.onStart();
	}

	@Override
	protected void onStop() {
		// TODO Auto-generated method stub
		super.onStop();
	}
	
	public void oneClicked(View v)
	{
		if (tv1.getText()=="0")
		{
			tv1.setText(btn1.getText().toString());
		}
		else if (mr)
		{
			tv1.setText(btn1.getText().toString());
			mr=false;
		}
		else
		{
			String txt=tv1.getText().toString()+btn1.getText().toString();
			tv1.setText(txt);
		}
	}
	
	public void twoClicked(View v)
	{
		if (tv1.getText()=="0")
		{
			tv1.setText(btn2.getText().toString());
		}
		else if (mr)
		{
			tv1.setText(btn2.getText().toString());
			mr=false;
		}
		else
		{
			String txt=tv1.getText().toString()+btn2.getText().toString();
			tv1.setText(txt);
		}
	}
	
	public void threeClicked(View v)
	{
		if (tv1.getText()=="0")
		{
			tv1.setText(btn3.getText().toString());
		}
		else if (mr)
		{
			tv1.setText(btn3.getText().toString());
			mr=false;
		}
		else
		{
			String txt=tv1.getText().toString()+btn3.getText().toString();
			tv1.setText(txt);
		}
	}
	
	public void fourClicked(View v)
	{
		if (tv1.getText()=="0")
		{
			tv1.setText(btn4.getText().toString());
		}
		else if (mr)
		{
			tv1.setText(btn4.getText().toString());
			mr=false;
		}
		else
		{
			String txt=tv1.getText().toString()+btn4.getText().toString();
			tv1.setText(txt);
		}
	}
	
	public void fiveClicked(View v)
	{
		if (tv1.getText()=="0")
		{
			tv1.setText(btn5.getText().toString());
		}
		else if (mr)
		{
			tv1.setText(btn5.getText().toString());
			mr=false;
		}
		else
		{
			String txt=tv1.getText().toString()+btn5.getText().toString();
			tv1.setText(txt);
		}
	}
	
	public void sixClicked(View v)
	{
		if (tv1.getText()=="0")
		{
			tv1.setText(btn6.getText().toString());
		}
		else if (mr)
		{
			tv1.setText(btn6.getText().toString());
			mr=false;
		}
		else
		{
			String txt=tv1.getText().toString()+btn6.getText().toString();
			tv1.setText(txt);
		}
	}
	
	public void sevenClicked(View v)
	{
		if (tv1.getText()=="0")
		{
			tv1.setText(btn7.getText().toString());
		}
		else if (mr)
		{
			tv1.setText(btn7.getText().toString());
			mr=false;
		}
		else
		{
			String txt=tv1.getText().toString()+btn7.getText().toString();
			tv1.setText(txt);
		}
	}
	
	public void eightClicked(View v)
	{
		if (tv1.getText()=="0")
		{
			tv1.setText(btn8.getText().toString());
		}
		else if (mr)
		{
			tv1.setText(btn8.getText().toString());
			mr=false;
		}
		else
		{
			String txt=tv1.getText().toString()+btn8.getText().toString();
			tv1.setText(txt);
		}
	}
	
	public void nineClicked(View v)
	{
		if (tv1.getText()=="0")
		{
			tv1.setText(btn9.getText().toString());
		}
		else if (mr)
		{
			tv1.setText(btn9.getText().toString());
			mr=false;
		}
		else
		{
			String txt=tv1.getText().toString()+btn9.getText().toString();
			tv1.setText(txt);
		}
	}
	
	public void zeroClicked(View v)
	{
		if (tv1.getText()=="0")
		{
			tv1.setText(btn0.getText().toString());
		}
		else if (mr)
		{
			tv1.setText(btn0.getText().toString());
			mr=false;
		}
		else
		{
			String txt=tv1.getText().toString()+btn0.getText().toString();
			tv1.setText(txt);
		}
	}
	
	public void perClicked(View v)
	{
		try
		{
			if(opr==null)
			{
				op1=Double.parseDouble(tv1.getText().toString());
				tv1.setText("0");
				opr="Per";
			}
			else
			{
				secondOp();
				opr="Per";
			}
		}
		catch(Exception e)
		{
			Toast.makeText(this,"Invalid input!",Toast.LENGTH_LONG).show();
		}
	}
	
	public void plusClicked(View v)
	{
		try
		{
			if(opr==null)
			{
				op1=Double.parseDouble(tv1.getText().toString());
				tv1.setText("0");
				opr="P";
			}
			else
			{
				secondOp();
				opr="P";
			}
		}
		catch(Exception e)
		{
			Toast.makeText(this,"Invalid input!",Toast.LENGTH_LONG).show();
		}
	}
	
	public void minusClicked(View v)
	{
		try
		{
			if(opr==null)
			{
				if(tv1.getText().toString()=="0" && op1==0)
				{
					tv1.setText("-");
				}
				else
				{
					op1=Double.parseDouble(tv1.getText().toString());
					tv1.setText("0");
					opr="S";
				}
			}
			else
			{
				secondOp();
				opr="S";
			}
		}
		catch(Exception e)
		{
			Toast.makeText(this,"Invalid input!",Toast.LENGTH_LONG).show();
		}
	}
	
	public void mulClicked(View v)
	{
		try
		{
			if(opr==null)
			{
				op1=Double.parseDouble(tv1.getText().toString());
				tv1.setText("0");
				opr="M";
			}
			else
			{
				secondOp();
				opr="M";
			}
		}
		catch(Exception e)
		{
			Toast.makeText(this,"Invalid input!",Toast.LENGTH_LONG).show();
		}
	}
	
	public void divClicked(View v)
	{
		try
		{
			if(opr==null)
			{
				op1=Double.parseDouble(tv1.getText().toString());
				tv1.setText("0");
				opr="D";
			}
			else
			{
				secondOp();
				opr="D";
			}
		}

		catch(Exception e)
		{
			Toast.makeText(this,"Invalid input!",Toast.LENGTH_LONG).show();
		}
	}

	public void secondOp()
	{
		if(opr=="P")
		{
			txt=tv1.getText().toString();
			op2=Double.parseDouble(txt);
			op1=op1+op2;
			tv1.setText("0");
		}
		else if(opr=="Per")
		{
			txt=tv1.getText().toString();
			op2=Double.parseDouble(txt);
			op1=op1%op2;
			tv1.setText("0");
		}
		else if(opr=="S")
		{
			txt=tv1.getText().toString();
			op2=Double.parseDouble(txt);
			op1=op1-op2;
			tv1.setText("0");
		}
		else if(opr=="D")
		{
			txt=tv1.getText().toString();
			op2=Double.parseDouble(txt);
			op1=op1/op2;
			tv1.setText("0");
		}
		else if(opr=="M")
		{
			txt=tv1.getText().toString();
			op2=Double.parseDouble(txt);
			op1=op1*op2;
			tv1.setText("0");
		}
	}
	
	public void equalClicked(View v)
	{
		try
		{
		/*	if(opr=="Eq")
			{
				op1=op2;
				opr=temp;
			}
		eq=true;
		*/
		op2=Double.parseDouble(tv1.getText().toString());
		
		if(opr=="P")
		{
			help=op1;
			op1=op2;
			op2=help;
			ans=op1+op2;
			op1=ans;

			//ans=ans+op1;
		}
		else if(opr=="S")
		{
			ans=op1-op2;
		}
		else if(opr=="M")
		{
			ans=op1*op2;
		}
		else if(opr=="D")
		{
			if (op2 != 0) 
            { 
				ans=op1/op2;      
			} 
		}
		else if(opr=="Per")
		{
			ans=op1%op2;
		}
		
		if(op1==0)
		{
			tv1.setText(Numformat(op2));
		}
		else if(opr=="D" && op2==0)
		{
			Toast.makeText(this,"Can't divide by zero",Toast.LENGTH_LONG).show();
		}
		else
		{
			if(opr=="P")
			{
				writeToFile(Numformat(op1)+" + "+Numformat(op2));
			}
			else if(opr=="S")
			{
				writeToFile(Numformat(op1)+" - "+Numformat(op2));
			}
			else if(opr=="D")
			{
				writeToFile(Numformat(op1)+" / "+Numformat(op2));
			}
			else if(opr=="M")
			{
				writeToFile(Numformat(op1)+" * "+Numformat(op2));
			}
			else if(opr=="Per")
			{
				writeToFile(Numformat(op1)+" % "+Numformat(op2));
			}
			//opr="Eq";
			writeToFile("= "+Numformat(ans));
			time();
		    tv1.setText(Numformat(ans));


		}
		
		}
		catch(Exception e)
		{
			Toast.makeText(this,"Invalid input!",Toast.LENGTH_LONG).show();
		}
		//opr=null;
	}
	
	private void time()
	{
		Date currentTime=Calendar.getInstance().getTime();
		String ct=currentTime.toString();
		writeToFile(ct);
	}
	
	private void writeToFile(String data) {
	    	String filename = "calculate.txt";
	    	//File file = new File(this.getFilesDir(), filename);
	    	FileOutputStream outputStream;
	    	String newline="\n";

	    	try {
	    	    outputStream = openFileOutput(filename, Context.MODE_APPEND);
	    	    outputStream.write((newline+data+newline).getBytes());
	    	    outputStream.close();
	    	}
	    	catch (IOException e) {
	    		Log.e("Exception", "File write failed: " + e.toString());
	    		} 
	}
	
	/*private void writeToFile(String data,Context context) {
	    try {
	        OutputStreamWriter outputStreamWriter = new OutputStreamWriter(context.openFileOutput("config.txt", Context.MODE_PRIVATE));
	        outputStreamWriter.write(data);
	        outputStreamWriter.close();
	    }
	    catch (IOException e) {
	        Log.e("Exception", "File write failed: " + e.toString());
	    } 
	}*/
	
	public String Numformat(double ans)
	{
		NumberFormat nf = NumberFormat.getInstance();
		nf.setMinimumFractionDigits(0);
		nf.setMaximumFractionDigits(8);
		String output = nf.format(ans);
		return output;
	}
	
	public void fpClicked(View v)
	{
		String s=tv1.getText().toString();
		int pos=s.indexOf(".");
		if(pos<0)
		{
			if (tv1.getText()=="0"||eq)
			{
				eq=false;
				String txt=tv1.getText().toString()+btnfp.getText().toString();
				tv1.setText(txt);
			}
			else
			{
			String txt=tv1.getText().toString()+btnfp.getText().toString();
			tv1.setText(txt);
			}
		}
	}
	
	public void eraseClicked(View v)
	{
		try
		{
			if(tv1.getText().toString()!="0")
			{
				tv1.setText(tv1.getText().subSequence(0,tv1.getText().length()-1));
			}
			
			if(tv1.getText().toString()=="")
			{
				tv1.setText("0");
			}
			
		}
		catch(Exception e)
		{
			Toast.makeText(this,"Invalid input!",Toast.LENGTH_LONG).show();
		}
	}
	
	public void clearClicked(View v)
	{
		tv1.setText("0");
		op1=0;
		op2=0;
		opr=null;
	}
	
		//MEMORY PORTION STARTS
	
	 public int readFromMemory()
	    {	try{
		    	sharedPref = this.getPreferences(Context.MODE_PRIVATE);
		    	int defaultValue = 0;
		    	int memValue = sharedPref.getInt("memory", defaultValue);
		    	return memValue;
	    	}
	    	catch(Exception e){
	    		Toast.makeText(this, "HAHAHHA", Toast.LENGTH_SHORT);
	    		return -1;
	    	}
	    }
	    
	    public boolean writeInMemory(int v)
	    {
	    	try{
		    	sharedPref = this.getPreferences(Context.MODE_PRIVATE);
		    	SharedPreferences.Editor editor = sharedPref.edit();
		    	editor.putInt("memory", v);
		    	editor.commit();
		    	return true;
	    	}
	    	catch(Exception e){return false;}
	    }
	    public void showValue(View v)
	    {
	    	int memValue = readFromMemory();
	    	if(memValue==0)
	    	{
	    		tv1.setText("0");
	    	}
	    	else
	    	{
	    		tv1.setText(""+memValue);
	    	}
	    	mr=true;
	    }
	    
	    public void clear(View v)
	    {
	    	value=0;
	    	if(writeInMemory(value))
	    	{
	    		Toast.makeText(this,"cleared", Toast.LENGTH_SHORT);
	    	}
	    	else
	    	{
	    		Toast.makeText(this,"not cleared", Toast.LENGTH_SHORT);
	    	}
	    }
	    
	    public void Memadd(View v)
	    {
	    	int memValue = readFromMemory();
	    	memValue+=Integer.parseInt(tv1.getText().toString());
	    	if(writeInMemory(memValue))
	    	{
	    		Toast.makeText(this,"added", Toast.LENGTH_SHORT);
	    	}
	    	else
	    	{
	    		Toast.makeText(this,"not added", Toast.LENGTH_SHORT);
	    	}
	    }
	    
	    public void Memminus(View v)
	    {
	    	int memValue = readFromMemory();
	    	memValue-=Float.parseFloat(tv1.getText().toString());
	    	if(writeInMemory(memValue))
	    	{
	    		Toast.makeText(this,"added", Toast.LENGTH_SHORT);
	    	}
	    	else
	    	{
	    		Toast.makeText(this,"not added", Toast.LENGTH_SHORT);
	    	}
	    }
	    
	    //HISTORY STARTS
	    
	    public void goNext(View v)
	    {
	    	String s = "a\na\na\na\na\na\na\nb";
	    	Intent in = new Intent(this, HistoryActivity.class);
	    	in.putExtra("displayMsg", s);
	    	startActivity(in);
	    }
}