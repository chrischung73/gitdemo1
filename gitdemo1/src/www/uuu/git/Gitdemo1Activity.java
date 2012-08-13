package www.uuu.git;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class Gitdemo1Activity extends Activity {
    /** Called when the activity is first created. */
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);
    }
    public void doOrder(View view)
    {
    	Intent intent = new Intent();
    	intent.setClass(this, Order.class);
    	startActivity(intent);
    }
}