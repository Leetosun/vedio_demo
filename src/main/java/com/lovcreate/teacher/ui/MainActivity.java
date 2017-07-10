package com.lovcreate.teacher.ui;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import com.lovcreate.core.views.support.BaseActivity;
import com.lovcreate.teacher.R;
import com.lovcreate.teacher.constant.ConstantApp;
import com.lovcreate.teacher.model.CurrentUserSettings;

import butterknife.Bind;

/**
 * Created by Albert.Ma on 2017/7/1 0001.
 */

public class MainActivity extends BaseActivity {

    @Bind(R.id.title)
    TextView title;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);
        title.setText("教师端teacher");
    }

    public void onClickJoin(View view) {
        forwardToRoom();
    }

    public void forwardToRoom() {
        Intent i = new Intent(MainActivity.this, ChatActivity.class);
        i.putExtra(ConstantApp.ACTION_KEY_CHANNEL_NAME, "my");
        i.putExtra(ConstantApp.ACTION_KEY_ENCRYPTION_KEY, "");
        i.putExtra(ConstantApp.ACTION_KEY_ENCRYPTION_MODE, getResources()
                .getStringArray(R.array.encryption_mode_values)[new CurrentUserSettings().mEncryptionModeIndex]);

        startActivity(i);
    }

}
