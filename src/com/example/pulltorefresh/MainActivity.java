package com.example.pulltorefresh;

import android.app.Activity;
import android.os.Bundle;
import android.os.Handler;
import android.support.v4.widget.SwipeRefreshLayout;
import android.support.v4.widget.SwipeRefreshLayout.OnRefreshListener;
import android.widget.ScrollView;

public class MainActivity extends Activity {

	SwipeRefreshLayout swipeRefreshLayout;
	ScrollView scrollView;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		initUI();
	}

	@SuppressWarnings("deprecation")
	private void initUI() {
		swipeRefreshLayout = (SwipeRefreshLayout) findViewById(R.id.lySwipeRefresh);
		scrollView = (ScrollView) findViewById(R.id.scrollView);
		swipeRefreshLayout.setColorScheme(android.R.color.holo_blue_light,
				android.R.color.white, android.R.color.holo_blue_light,
				android.R.color.white);
		swipeRefreshLayout.setOnRefreshListener(new OnRefreshListener() {

			@Override
			public void onRefresh() {

				new Handler().postDelayed(new Runnable() {
					@Override
					public void run() {
						swipeRefreshLayout.setRefreshing(false);
						// if you want to start a new activity
						// startActivity(new Intent(MainActivity.this,
						// Activityb.class));
					}
				}, 5000);
			}
		});
	}

}