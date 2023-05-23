package sg.edu.rp.c346.id22003619.l05_mymodules;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class ModuleDetailActivity extends AppCompatActivity {
TextView tvInfo;
Button btnreturn;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mod_display);
        tvInfo=findViewById(R.id.tvInfo);
        btnreturn=findViewById(R.id.btnReturn);

        Intent i=getIntent();
        String info=String.format("Module Code: %s\nModule Name: %s\nAcademic Year: %s\nSemester: %s\nModule Credit: %s\nVenue: %s",
                i.getStringExtra("Module Code"),
                i.getStringExtra("ModuleName"),
                i.getStringExtra("AcademicYear"),
                i.getIntExtra("Semester",0),
                i.getIntExtra("ModuleCredit",0),
                i.getStringExtra("Venue"));
                tvInfo.setText(info);

        btnreturn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(ModuleDetailActivity.this, MainActivity.class);
                startActivity(intent);
            }
        });







    }
}