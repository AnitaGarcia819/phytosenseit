package org.opencv.samples.tutorial3;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class NoResultFound extends Activity {
	
	private Button mTryAgainButton;
	@Override
	protected void onCreate(final Bundle savedInstanceSate)
	{
		super.onCreate(savedInstanceSate);
		setContentView(R.layout.noresults);
		
		 mTryAgainButton = (Button) findViewById(R.id.button);
		 mTryAgainButton.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				
				
			}
		});
	}
	
}
