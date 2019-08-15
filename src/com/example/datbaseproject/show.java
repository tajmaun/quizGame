package com.example.datbaseproject;

import java.util.ArrayList;

import android.app.Activity;
import android.content.Intent;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class show extends Activity {
	String DB_PATH = "/data/data/com.example.datbaseproject/databases/maun";
	String str="ID No   :";
	String ptr="Name    :";
	String ktr="Marks   : ";
	SQLiteDatabase sb;
	 ArrayList<String> list;
	public void onCreate(Bundle savedInstanceState)
    {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.file);
		Intent intent=getIntent();
		String type=intent.getStringExtra("tag");
		sb=SQLiteDatabase.openDatabase(DB_PATH, null, SQLiteDatabase.OPEN_READWRITE);
		Cursor c=sb.rawQuery("SELECT * FROM student WHERE rollno='type'", null);
		if(c.moveToFirst())
		{
			str+= " "+c.getString(0);
			ptr+= " "+c.getString(1);
			ktr+= " "+c.getString(2);
		}
		ListView animalList=(ListView)findViewById(R.id.listViewAnimals);
		 list = new ArrayList<String>();
		 ArrayAdapter<String> arrayAdapter =      
                 new ArrayAdapter<String>(this,android.R.layout.simple_list_item_1, list);
		
    }
	void hahaha()
	{
	list.add(str);
	list.add(ptr);
	list.add(ktr);
	
	}
	
    
}
