package com.example.activitytest;
import com.example.activitytest.R;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.Window;
import android.widget.Button;
import android.widget.Toast;


public class FirstActivity extends Activity {
	private static String tag = "FirstActivity";
	private Button btFirst;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		requestWindowFeature(Window.FEATURE_NO_TITLE);
		setContentView(R.layout.first_activity);
		init();
	}
	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}
	
	@Override
	public boolean onOptionsItemSelected(MenuItem item) {
		switch (item.getItemId()) {
		case R.id.Add:
			Toast.makeText(FirstActivity.this, "Add", 0).show();
			break;
		case R.id.Remove:
			Toast.makeText(FirstActivity.this, "Remove", 0).show();
			break;
		default:
			break;
		}
		return true;
	}
	private void init() {
		btFirst = (Button) findViewById(R.id.btFirst);
		btFirst.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View arg0) {
				Log.v(tag, "点击了button");
				//显示intent，此时在清单文件中，只需要注册activity
//				Intent intent = new Intent(FirstActivity.this, SecondActivity.class);
//				startActivity(intent);
				
				//隐示intent,此时清单文件中，必须要添加intent-filter，action和category缺一不可
				Intent intent = new Intent("xx");//action可以为任意字符串
				//默认会添加一个DEFAULT的category
				intent.addCategory("addCategory");//如果再添加一条category，清单文件中也要再添加一个
				startActivity(intent);
			}
		});
	}
}
