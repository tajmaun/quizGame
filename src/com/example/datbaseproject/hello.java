package com.example.datbaseproject;
import android.app.Activity;
import android.app.AlertDialog.Builder;
import android.content.Intent;
import android.database.sqlite.SQLiteDatabase;
import android.net.Uri;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.text.Editable;
import android.view.View;
import android.view.View.OnClickListener;

public class hello extends Activity {
	SQLiteDatabase sb;
	EditText editRollno;
	Button button1, button2, button3, button4;
	protected void onCreate(Bundle savedInstanceState)   
	{
		super.onCreate(savedInstanceState);
		setContentView(R.layout.search);
		add();
	}
	public void add()
	{
		//comment added
		editRollno=(EditText)findViewById(R.id.editRollno);
		button1=(Button)findViewById(R.id.btnView);
		if(editRollno.getText().toString().trim().length()==0)
		{
			showMessage("Error", "Please enter Rollno");
			return;
		}
		else
		{
			button1.setOnClickListener(new OnClickListener()
			{
				public void onClick(View arg0)
				{
					String str=editRollno.getText().toString();  
					Intent browserIntent = 
							new Intent(getApplicationContext(), show.class);
					browserIntent.putExtra("tag",str);
					startActivity(browserIntent);
				}

			});
		}
	}
	public void showMessage(String title,String message)
	{
		Builder builder=new Builder(this);
		builder.setCancelable(true);
		builder.setTitle(title);
		builder.setMessage(message);
		builder.show();
	}

}
