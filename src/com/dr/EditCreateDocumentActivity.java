package com.dr;

import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;

public class EditCreateDocumentActivity extends Activity
{

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
	super.onCreate(savedInstanceState);
	setContentView(R.layout.activity_edit_create_document);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu)
    {
	// Inflate the menu; this adds items to the action bar if it is present.
	getMenuInflater().inflate(R.menu.edit_create_document, menu);
	return true;
    }

}
