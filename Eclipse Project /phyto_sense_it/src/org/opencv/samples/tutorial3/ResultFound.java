package org.opencv.samples.tutorial3;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.widget.Toast;

public class ResultFound extends Activity {
	
	int disease;
	/** Called when the activity is first created. */
	@Override
	public void onCreate(Bundle savedInstanceState) {
	    super.onCreate(savedInstanceState);
	    setContentView(R.layout.result_found);
	    // TODO Auto-generated method stub
	       Intent i = getIntent();
	       Intent deleteInent = getIntent();

	        // Selected image id passed by Extras
	        disease = i.getExtras().getInt("Disease");
	       
	        switch(disease){
	
	        case 1:
	        	Toast.makeText(this, "Disease 1!", Toast.LENGTH_LONG);
	        	break;
	        case 2:
	        	Toast.makeText(this, "Disease 2!", Toast.LENGTH_LONG);
	        	break;
	        case 3:
	        	Toast.makeText(this, "Disease 3!", Toast.LENGTH_LONG);
	        	break;

	        }
	}

}
