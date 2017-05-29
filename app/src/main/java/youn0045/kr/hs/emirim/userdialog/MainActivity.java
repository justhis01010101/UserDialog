package youn0045.kr.hs.emirim.userdialog;

import android.graphics.Color;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button but = (Button) findViewById(R.id.but_information);
        but.setOnClickListener(this);

    }

    @Override
    public void onClick(View view) {
        View dlgv= View.inflate(this,R.layout.dialog, null);
        AlertDialog.Builder dialog = new AlertDialog.Builder(this);
        dialog.setTitle("저즈디즈 잘셍겼당");
        dialog.setIcon(R.drawable.star);
        dialog.setView(dlgv);
        dialog.setPositiveButton("ㅇㅈ", null);
        dialog.setNegativeButton("울 귀요미", null);
        dialog.show();
    }
}
