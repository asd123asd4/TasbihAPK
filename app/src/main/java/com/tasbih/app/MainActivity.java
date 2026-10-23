package com.tasbih.app;
import android.app.Activity; import android.os.Bundle; import android.widget.*; import android.view.Gravity;
public class MainActivity extends Activity {
 int count=0;
 protected void onCreate(Bundle b){super.onCreate(b);
 LinearLayout l=new LinearLayout(this); l.setOrientation(LinearLayout.VERTICAL); l.setGravity(Gravity.CENTER_HORIZONTAL); l.setPadding(50,100,50,50);
 TextView tv=new TextView(this); tv.setTextSize(60); tv.setText("0"); tv.setGravity(Gravity.CENTER);
 Button btn=new Button(this); btn.setText("سبح"); btn.setTextSize(30);
 btn.setOnClickListener(v->{count++; tv.setText(""+count);});
 l.addView(tv); l.addView(btn); setContentView(l);
 }
}
