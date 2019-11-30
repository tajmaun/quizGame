package com.example.datbaseproject;

/*import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;

public class MainActivity extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
	}


}*/

import com.example.datbaseproject.R;

import android.app.Activity;
import android.app.AlertDialog.Builder;
import android.content.Context;
import android.content.Intent;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends Activity {

	Button entry,srch,dlte;
	SQLiteDatabase db;
	String str="maun";
	protected void onCreate(Bundle savedInstanceState)   
	{
		super.onCreate(savedInstanceState);
		setContentView(R.layout.click);
		add();
	}
	public void add()
	{


		entry=(Button)findViewById(R.id.addEntry);
		srch=(Button)findViewById(R.id.Search);
		dlte=(Button)findViewById(R.id.delete_entry);
		db=openOrCreateDatabase(str, Context.MODE_PRIVATE, null);
		entry.setOnClickListener(new OnClickListener()
		{


			public void onClick(View arg0)
			{

				Intent browserIntent = 
						new Intent(getApplicationContext(), play.class);
				browserIntent.putExtra("tag",str);
				startActivity(browserIntent);


			}

		});
		srch.setOnClickListener(new OnClickListener()
		{


			public void onClick(View arg0)
			{

				Intent browserIntent = 
						new Intent(getApplicationContext(), hello.class);
				startActivity(browserIntent);

			}

		});
		dlte.setOnClickListener(new OnClickListener()
		{


			public void onClick(View arg0)
			{

				Intent browserIntent = 
						new Intent(getApplicationContext(), play.class);
				startActivity(browserIntent);

			}

		});



	}



}
