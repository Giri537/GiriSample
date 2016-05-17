package com.example.nupur.girisamplegit;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
	TextView textView;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		//
//		ssh-rsa AAAAB3NzaC1yc2EAAAADAQABAAACAQC0IaD1XG9cpqRqNZe0PrIfmXlfIy5dqrSO22lUutVckFG7vvWeH951AlywA82imzaa8KIcr1PgbfIoWe7qWU7c3oTBOjFA2/z+5vBDKGMyBkBSj8ThI9FBaZPUtOfhZGoziPTz+tNGh9eW+b3bd3wqkRO/8geDn9joKEEKvb0SUxEJn/8+yQdWZus99/dkgOxbR26HkftDnIgb6tsY1u518z1/+ShMD520+FNO4reI6WYcWEG+ZTA9XhIPhsDmR4kp2dPH8Zj/MST2ES9kxW5eKTX/HkDxxe7uw5ut2Cydu4r4pycoO/0bSuqt9HZMbgod9XnF6lzMq45TP4O+Yg61IY15h7dskfzQI85rE5yq5mhHKs9sWlYn+A7rqLZZEJAGBNufZO9TsfpeWe+UIMSlsOugr2F9wVxRkvI6/pSyxMOlZy3066E4up02g98ExML9QlmCpiFcfEqqUTpKaPjV6zCzjslRksr8oqK1XdJi7UN8/u4qo+nnGLbWF1cwss2P0UnZOP+ShwAydbkaLhNxUgFJR4e5sdIn4zu+ZTydSuJezPEzTPeKQwYLdbY23OmoP758ltPpW30p0LabNapMu0RdeFhSce6QauMyJu6FCuDlbTFgMunkGFMEgPqBTqomOkVyKM4OIEGZnUK2Tq5gqfjvBfAnuSbM8+VPvjHj8w== giri@hitwicket.com
		textView = (TextView) findViewById(R.id.giri);
		textView.setText("giri wellcome");


		//
	}
}
