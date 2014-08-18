package com.example.androidtutscan;

import com.google.zxing.client.android.CaptureActivity;

import android.net.Uri;
import android.os.Bundle;
import android.app.Activity;
import android.content.ActivityNotFoundException;
import android.content.Intent;
import android.util.Log;
import android.view.Gravity;
import android.view.Menu;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends Activity {

	Button b1;
	//static String contents;

	public static final int REQUEST_CODE = 1;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		
		
		
//		 HandleClick hc = new HandleClick();
//		    findViewById(R.id.butQR).setOnClickListener(hc);
//		
		

		// HandleClick hc =new HandleClick();
		// findViewById(R.id.butQR).setOnClickListener(hc);
		// findViewById(R.id.butProd).setOnClickListener(hc);
		// findViewById(R.id.butOther).setOnClickListener(hc);

		// try{
		// Button scanner = (Button)findViewById(R.id.scanner);
		// scanner.setOnClickListener(new OnClickListener() {
		//
		// @Override
		// public void onClick(View v) {
		// // TODO Auto-generated method stub
		// Intent intent = new Intent("com.google.zxing.client.android.SCAN");
		// intent.putExtra("SCAN_MODE", "QR_CODE_MODE");
		// startActivityForResult(intent,0);
		//
		// }
		// });
		//
		// Button scanner2 = (Button)findViewById(R.id.scanner2);
		// scanner2.setOnClickListener(new OnClickListener() {
		//
		// public void onClick(View v) {
		// Intent intent = new Intent("com.google.zxing.client.android.SCAN");
		// intent.putExtra("SCAN_MODE", "PRODUCT_MODE");
		// startActivityForResult(intent, 0);
		// }
		//
		// });
		//
		// }
		// catch (ActivityNotFoundException anfe){
		// Log.e("onCreate", "Scanner Not Found", anfe);
		// }

//		b1 = (Button) findViewById(R.id.scanner);
//		b1.setOnClickListener(new OnClickListener() {
//
//			public void onClick(View arg0) {
//				// TODO Auto-generated method stub
//
//				Intent intent = new Intent(
//						"com.google.zxing.client.android.SCAN");
//				intent.putExtra("SCAN_MODE", "QR_CODE_MODE");
//				startActivityForResult(intent, 0);
//
//			}
//		});
		
		
		////////////////////////////////////////////////////////////////////////

		////////////////////////////////////////////////////////////////////////
				/////////		TOCNO OD TUKA
		////////////////////////////////////////////////////////////////////////

		////////////////////////////////////////////////////////////////////////
		b1 = (Button) findViewById(R.id.submit);
		b1.setOnClickListener(new OnClickListener() {

			public void onClick(View arg0) {
				// TODO Auto-generated method stub
				Intent intent = new Intent(MainActivity.this,
						CaptureActivity.class);
				// Intent intent = new
				// Intent("com.google.zxing.client.android.SCAN");
				intent.putExtra("SCAN_MODE", "QR_CODE_MODE");
				startActivityForResult(intent, 0);
			}
		});
		
		
		
		
	}
	
	
	
	public void onActivityResult(int requestCode, int resultCode, Intent intent) {
		if (requestCode == 0) {
			if (resultCode == 1) { // nekade e resultcode == RESULT_OK
				// Handle successful scan
				String capturedQrValue = intent.getStringExtra("RESULT");
				//String format = intent.getStringExtra("SCAN_RESULT_FORMAT");
				Toast.makeText(MainActivity.this,
						"Scan Result:" + capturedQrValue, Toast.LENGTH_SHORT)
						.show();

			} else if (resultCode == RESULT_CANCELED) {
				// Handle cancel
				Toast.makeText(MainActivity.this,
						"Scan unsseccfull", Toast.LENGTH_SHORT)
						.show();
			}
		} else {

		}

	}

	
	
////////////////////////////////////////////////////////////////////////

////////////////////////////////////////////////////////////////////////
//////////////////////////TOCNO DO TUKA
////////////////////////////////////////////////////////////////////////

////////////////////////////////////////////////////////////////////////
	
	
//	private class HandleClick implements OnClickListener{
//	    public void onClick(View arg0) {
//	      Intent intent = new Intent("com.google.zxing.client.android.SCAN");
//	      switch(arg0.getId()){
//	        case R.id.butQR:
//	          intent.putExtra("SCAN_MODE", "QR_CODE_MODE");
//	        break;
////	        case R.id.butProd:
////	          intent.putExtra("SCAN_MODE", "PRODUCT_MODE");
////	        break;
////	        case R.id.butOther:
////	          intent.putExtra("SCAN_FORMATS", "CODE_39,CODE_93,CODE_128,DATA_MATRIX,ITF,CODABAR");
////	        break;
//	      }
//	      startActivityForResult(intent, 0);    //Barcode Scanner to scan for us
//	    }
//	  }
//	
//	
//	 public void onActivityResult(int requestCode, int resultCode, Intent intent) {
//		    if (requestCode == 0) {
//		      TextView tvStatus=(TextView)findViewById(R.id.tvStatus);
//		      TextView tvResult=(TextView)findViewById(R.id.tvResult);
//		      if (resultCode == RESULT_OK) {
//		        tvStatus.setText(intent.getStringExtra("SCAN_RESULT_FORMAT"));
//		        tvResult.setText(intent.getStringExtra("SCAN_RESULT"));
//		      } else if (resultCode == RESULT_CANCELED) {
//		        tvStatus.setText("Press a button to start a scan.");
//		        tvResult.setText("Scan cancelled.");
//		      }
//		    }
//	 }
	
	
//	public void onActivityResult(int requestCode, int resultCode, Intent intent) {
//		if (requestCode == 0) {
//			if (resultCode == RESULT_OK) {
//				contents = intent.getStringExtra("SCAN_RESULT");
//				// String format = intent.getStringExtra("SCAN_RESULT_FORMAT");
//				Log.i("Barcode Result", contents);
//				if (contents.contains("http:")) {
//					Intent i1 = new Intent(MainActivity.this,
//							webclass.class);
//					startActivity(i1);
//				} else {
//					Toast.makeText(getApplicationContext(), contents,
//							Toast.LENGTH_LONG).show();
//				}
//				// Handle successful scan
//			} else if (resultCode == RESULT_CANCELED) {
//				// Handle cancel
//				Log.i("Barcode Result", "Result canceled");
//			}
//		}
//	}

	// public void onActivityResult(int requestCode, int resultCode, Intent
	// intent){
	// if (requestCode == 0) {
	// if (resultCode == RESULT_OK) {
	// String contents = intent.getStringExtra("SCAN_RESULT");
	// String format = intent.getStringExtra("SCAN_RESULT_FORMAT");
	// // Handle successful scan
	// Toast toast = Toast.makeText(this, "Content:" + contents + " Format:" +
	// format , Toast.LENGTH_LONG);
	// toast.setGravity(Gravity.TOP, 25, 400);
	// toast.show();
	// } else if (resultCode == RESULT_CANCELED) {
	// // Handle cancel
	// Toast toast = Toast.makeText(this, "Scan was Cancelled!",
	// Toast.LENGTH_LONG);
	// toast.setGravity(Gravity.TOP, 25, 400);
	// toast.show();
	//
	// }
	// }
	// }
	//
	//
	//

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.activity_main, menu);
		return true;
	}

	// private class HandleClick implements OnClickListener{
	//
	// @Override
	// public void onClick(View arg0) {
	// // TODO Auto-generated method stub
	//
	// Intent intent = new Intent("com.google.zxing.client.android.SCAN");
	// switch(arg0.getId()){
	// case R.id.butQR:
	// intent.putExtra("SCAN_MODE", "QR_CODE_MODE");
	// break;
	// case R.id.butProd:
	// intent.putExtra("SCAN_MODE", "PRODUCT_MODE");
	// break;
	// case R.id.butOther:
	// intent.putExtra("SCAN_FORMATS",
	// "CODE_39,CODE_93,CODE_128,DATA_MATRIX,ITF,CODABAR");
	// break;
	// }
	// startActivityForResult(intent, 0); //Barcode scaner to scan for us
	//
	//
	//
	// }
	//
	// public void onActivityResult(int requestCode, int resultCode, Intent
	// intent) {
	// if (requestCode == 0) {
	// TextView tvStatus=(TextView)findViewById(R.id.tvStatus);
	// TextView tvResult=(TextView)findViewById(R.id.tvResult);
	// if (resultCode == RESULT_OK) {
	// tvStatus.setText(intent.getStringExtra("SCAN_RESULT_FORMAT"));
	// tvResult.setText(intent.getStringExtra("SCAN_RESULT"));
	// } else if (resultCode == RESULT_CANCELED) {
	// tvStatus.setText("Press a button to start a scan.");
	// tvResult.setText("Scan cancelled.");
	// }
	// }
	//
	// }
	// }
	//
	//

	// public void scanNow(View view){
	// Log.d("test"," button works");
	// Intent intent = new Intent("com.google.zxing.client.android.SCAN");
	// intent.putExtra("com.google.zxing.client.android.SCAN.SCAN_MODE",
	// "QR_CODE_MODE");
	// startActivityForResult(intent, 0);
	//
	// }
	//
	// public void onActivityResult(int requestCode, int resultCode, Intent
	// intent)
	// {
	// if (requestCode == 0)
	// {
	// if (resultCode == RESULT_OK)
	// {
	// String contents = intent.getStringExtra("SCAN_RESULT");
	// String format = intent.getStringExtra("SCAN_RESULT_FORMAT");
	// Log.i("xZing", "contents: "+contents+" format: "+format);
	// // Handle successful scan
	// }
	// else if (resultCode == RESULT_CANCELED)
	// {
	// // Handle cancel
	// Log.i("xZing", "Cancelled");
	// }
	// }
	// }

}


