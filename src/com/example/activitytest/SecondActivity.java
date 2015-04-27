package com.example.activitytest;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.Window;
import android.widget.Button;

public class SecondActivity extends Activity {
	private Button btSecond;
	protected String tag = "SecondActivity";
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		requestWindowFeature(Window.FEATURE_NO_TITLE);
		setContentView(R.layout.second_activity);
		
		inint();
		
	}

	private void inint() {
		btSecond = (Button) findViewById(R.id.btSecond);
		btSecond.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View arg0) {
				Log.d(tag , "点击了button2");
//				Intent intent = new Intent(Intent.ACTION_VIEW);
//				intent.setData(Uri.parse("http://www.baidu.com"));//http://必须要添加
//				startActivity(intent);
				
				Intent intent = new Intent(Intent.ACTION_DIAL);
				intent.setData(Uri.parse("tel:10086"));
				startActivity(intent);
				
			}
		});
		
	}

}
