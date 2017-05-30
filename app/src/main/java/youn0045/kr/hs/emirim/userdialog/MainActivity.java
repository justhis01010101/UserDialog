
package youn0045.kr.hs.emirim.userdialog;

import android.content.DialogInterface;
import android.graphics.Color;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;

import org.w3c.dom.Text;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    TextView textName, textEmail;
    EditText editName, editEmail;

    @Override

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button but = (Button) findViewById(R.id.but_information);
        but.setOnClickListener(this);
        textName=(TextView)findViewById(R.id.text_name);
        textEmail=(TextView)findViewById(R.id.text_email);

    }

    @Override
    public void onClick(View view) {
        final View dlgv= View.inflate(this,R.layout.dialog, null);
        AlertDialog.Builder dialog = new AlertDialog.Builder(this);
        dialog.setTitle("저즈디즈 잘셍겼당");
        dialog.setIcon(R.drawable.star);
        dialog.setView(dlgv);
        dialog.setPositiveButton("ㅇㅈ", new DialogInterface.OnClickListener() { //익명클래스
            @Override
            public void onClick(DialogInterface dialogInterface, int i) {
                editName= (EditText)dlgv.findViewById(R.id.edit_name);
                editEmail= (EditText)dlgv.findViewById(R.id.edit_email);
                textName.setText(editName.getText());
                textEmail.setText(editEmail.getText());
            }
        });
        dialog.setNegativeButton("귀여운데 잘생기기까지? 그건 노인정", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialogInterface, int i) {
                Toast toast = new Toast(MainActivity.this);
                View toastV= View.inflate(MainActivity.this, R.layout.toast, null);
                TextView textToast= (TextView)toastV.findViewById(R.id.text_toast);
                textToast.setText("취소되었습니다");
                toast.setView(toastV);
                toast.show();
            }
        });
        dialog.show();
    }
}
