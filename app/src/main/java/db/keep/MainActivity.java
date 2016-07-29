package db.keep;

import android.os.Bundle;
import android.view.KeyEvent;
import android.view.View;

import db.keep.app.KeepApplication;
import db.keep.common.BaseActivity;
import db.keep.db.DbHelper;
import db.keep.utils.ToastUtils;

public class MainActivity extends BaseActivity implements View.OnClickListener {
    private double exitTime = 0;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        findViewById(R.id.b1).setOnClickListener(this);
        findViewById(R.id.b2).setOnClickListener(this);
        findViewById(R.id.b3).setOnClickListener(this);
        findViewById(R.id.b4).setOnClickListener(this);
        findViewById(R.id.b5).setOnClickListener(this);
        DbHelper.getDbHelperInstance().getWritableDatabase();
    }

    @Override
    public int getBodyView() {
        return R.layout.activity_main;
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.b1:
                ToastUtils.showMsg("测试一");
                break;
            case R.id.b2:
                ToastUtils.showMsg("测试二");
                break;
            case R.id.b3:
                ToastUtils.showMsg("测试三");
                break;
            case R.id.b4:
                ToastUtils.showMsg("测试四");
                break;
            case R.id.b5:
                ToastUtils.showMsg("测试五");
                break;
        }
    }

    @Override
    public boolean onKeyDown(int keyCode, KeyEvent event) {
        if (keyCode == KeyEvent.KEYCODE_BACK) {
            if (System.currentTimeMillis() - exitTime < 2000) {
                KeepApplication.getInstance().exit();
            } else {
                ToastUtils.showMsg("再按一次退出程序");
                exitTime = System.currentTimeMillis();
                return true;
            }
        }
        return super.onKeyDown(keyCode, event);
    }
}
