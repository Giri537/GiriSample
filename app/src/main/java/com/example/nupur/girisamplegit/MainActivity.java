package com.example.nupur.girisamplegit;

import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;
import android.widget.VideoView;

public class MainActivity extends AppCompatActivity {


	Context context;
	VideoView mVideoView;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		context = this;
		final TextView time = (TextView) findViewById(R.id.time);
		Button buttonPlayVideo = (Button) findViewById(R.id.playvideoplayer);
//		getWindow().setFormat(PixelFormat.UNKNOWN);
		mVideoView = (VideoView) findViewById(R.id.videoview);
		String uriPath = "android.resource://com.example.nupur.girisamplegit/" + R.raw.fi;
		Uri uri = Uri.parse(uriPath);
		mVideoView.setVideoURI(uri);
		mVideoView.requestFocus();
		mVideoView.start();
		new Handler().postDelayed(new Runnable() {
			@Override
			public void run() {

				Toast.makeText(MainActivity.this, "Paused", Toast.LENGTH_SHORT).show();
			}
		}, 2000);


	}


}
