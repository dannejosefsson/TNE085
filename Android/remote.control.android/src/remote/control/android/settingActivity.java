package remote.control.android;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.RadioButton;
import android.widget.RadioGroup;

public class settingActivity extends Activity implements OnClickListener 
{
	private static final String TAG = "REMOTE";
	
	CheckBox acc;
	CheckBox accBrain;
	CheckBox adkUs;
	
	private RadioGroup radioAlgorithmGroup;
	private RadioButton radioLinear;
	private RadioButton radioExponential;
	private RadioButton radioLogarithmic;

	Button btnBack;
	
	public void onCreate(Bundle savedInstanceState) 
	{         
		Log.d(TAG,"onCreate Settings");
		super.onCreate(savedInstanceState);    
        
		getCurrentAlgorithm();
		setContentView(R.layout.settings); 
        initButtons();
        initOnClickListners();        
	}
	
	//TODO implement function - get information about current alogrithm usedS
	void getCurrentAlgorithm()
	{
		//Send broadcast
		//update radio buttons
		
	}
	
	//TODO implement function - set new algorithm according to checked radio button
	void radioButtonClicked()
	{
		//Send broadcast etc...
		
	}
	
	private void initButtons()
	{
        acc = (CheckBox) findViewById(R.id.checkbox_accelerometer);
        acc.setChecked(LogService.accSensor);
        accBrain = (CheckBox) findViewById(R.id.checkBox_BrainAccelerometer);
        accBrain.setChecked(LogService.accBrainSensor);
        adkUs = (CheckBox) findViewById(R.id.checkBox_AdkUltrasound);
        adkUs.setChecked(LogService.usAdkSensor);
        btnBack = (Button) findViewById(R.id.backButton);
        
        //radio buttons
        radioLinear = (RadioButton) findViewById(R.id.radioLinear);
        radioExponential = (RadioButton) findViewById(R.id.radioExponential);
        radioLogarithmic = (RadioButton) findViewById(R.id.radioLogarithmic);
        radioAlgorithmGroup = (RadioGroup) findViewById(R.id.radioAlgorithmGroup);
	}
	
	private void initOnClickListners()
	{
        acc.setOnClickListener(this);
        accBrain.setOnClickListener(this);
        adkUs.setOnClickListener(this);
        btnBack.setOnClickListener(this);
        radioLinear.setOnClickListener(this);
        radioExponential.setOnClickListener(this);
        radioLogarithmic.setOnClickListener(this);
	}	

	public void onClick(View src) 
    {
    	switch (src.getId()) 
    	{
	    	case R.id.checkbox_accelerometer:
	    		Log.d(TAG,"checkbox acc remote checked");
		    	Intent sensorAccActionIntent = new Intent("CheckboxAccRemoteAction");	
		    	sendBroadcast(sensorAccActionIntent);	    		
	    	break;
	    	case R.id.checkBox_BrainAccelerometer:
	    		Log.d(TAG,"checkbox acc brain checked");
		    	Intent sensorAccBrainActionIntent = new Intent("CheckboxAccBrainAction");	
		    	sendBroadcast(sensorAccBrainActionIntent);	    		
	    	break;
	    	case R.id.checkBox_AdkUltrasound:
	    		Log.d(TAG,"checkbox US adk checked");
		    	Intent sensorUsBrainActionIntent = new Intent("CheckboxUsOnAdkAction");	
		    	sendBroadcast(sensorUsBrainActionIntent);	    		
	    	break;
	    	case R.id.backButton:
	    		Log.d(TAG,"backButton pushed");
	   		 	finish();
	    	break;
	    	
	    	case R.id.radioLinear:
	    		
	    		radioButtonClicked();
	    		break;
	    	
	    	case R.id.radioExponential:
	    		
	    		radioButtonClicked();
	    		break;
	    	
	    	case R.id.radioLogarithmic:
	    		
	    		radioButtonClicked();
	    		break;
    	}    	   	
    }
	
	 @Override
	 public void onPause() 
	 {		 
		 Log.d(TAG,"onPause settings");
		 super.onPause();
		 finish();
	 }

	 @Override
	 public void onResume()
	 {		 
		 Log.d(TAG,"onResume settings");
		 super.onResume();
	 }
}	
