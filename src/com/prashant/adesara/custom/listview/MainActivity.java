package com.prashant.adesara.custom.listview;

import java.util.ArrayList;

import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;
import android.widget.ListView;

import com.prashant.adesara.custom.adapter.ItemAdapter;
import com.prashant.adesara.custom.model.ItemsDTO;

/**
 * MainActivity
 * @author Prashant Adesara
 **/
public class MainActivity extends Activity
{
	ItemAdapter itemAdapter;

	@Override
	protected void onCreate(Bundle savedInstanceState)
	{
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		ListView lstView = (ListView) findViewById(R.id.lv_list);
		itemAdapter = new ItemAdapter(this, R.layout.lstview_itemrow_load, getModel());
		lstView.setAdapter(itemAdapter);
	}

	private ArrayList<ItemsDTO> getModel()
	{
		ArrayList<ItemsDTO> list = new ArrayList<ItemsDTO>();
		list.add(get("Title 1", "Sub Title One", "Simply Comments...",
				"01 Apr, 2013 10:12:05 AM"));
		list.add(get("Title 2", "Sub Title Two", "No Comments...",
				"01 Apr, 2013 10:15:10 AM"));
		list.add(get("Title 3", "Sub Title Three", "Comments!!!",
				"01 Apr, 2013 10:18:24 AM"));
		list.add(get("Title 4", "Sub Title Four", "Wow!!! Comments.",
				"01 Apr, 2013 10:20:43 AM"));
		return list;
	}

	private ItemsDTO get(String mainT, String subT, String comment, String dateT)
	{
		return new ItemsDTO(mainT, subT, comment, dateT);
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu)
	{
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}

}
