package sg.edu.rp.c346.id22003619.l05_mymodules;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
TextView tvc203;
TextView tvc206;
TextView tvc218;
TextView tvc235;
TextView tvc346;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        tvc203=findViewById(R.id.tvc203);
        tvc206=findViewById(R.id.tvc206);
        tvc218=findViewById(R.id.tvc218);
        tvc235=findViewById(R.id.tvc235);
        tvc346=findViewById(R.id.tvc346);

        tvc203.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i=new Intent(MainActivity.this, ModuleDetailActivity.class);
                i.putExtra("Module Code","C203");
                i.putExtra("ModuleName","Web App Development in PHP");
                i.putExtra("AcademicYear","2023");
                i.putExtra("Semester",1);
                i.putExtra("ModuleCredit",4);
                i.putExtra("Venue","W64P");
                startActivity(i);
            }
        });
        tvc206.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i=new Intent(MainActivity.this, ModuleDetailActivity.class);
                i.putExtra("Module Code","C206");
                i.putExtra("ModuleName","Software Development Process");
                i.putExtra("AcademicYear","2023");
                i.putExtra("Semester",1);
                i.putExtra("ModuleCredit",4);
                i.putExtra("Venue","W64P");
                startActivity(i);
            }
        });
        tvc218.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i=new Intent(MainActivity.this, ModuleDetailActivity.class);
                i.putExtra("Module Code","C218");
                i.putExtra("ModuleName","UI/UX Design for Apps");
                i.putExtra("AcademicYear","2023");
                i.putExtra("Semester",1);
                i.putExtra("ModuleCredit",4);
                i.putExtra("Venue","W64P");
                startActivity(i);
            }
        });
        tvc235.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i=new Intent(MainActivity.this, ModuleDetailActivity.class);
                i.putExtra("Module Code","C235");
                i.putExtra("ModuleName","IT Security & Management");
                i.putExtra("AcademicYear","2023");
                i.putExtra("Semester",1);
                i.putExtra("ModuleCredit",4);
                i.putExtra("Venue","W64P");
                startActivity(i);
            }
        });
        tvc346.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i=new Intent(MainActivity.this, ModuleDetailActivity.class);
                i.putExtra("Module Code","C346");
                i.putExtra("ModuleName","Mobile App Development");
                i.putExtra("AcademicYear","2023");
                i.putExtra("Semester",1);
                i.putExtra("ModuleCredit",4);
                i.putExtra("Venue","E63A");
                startActivity(i);
            }
        });
    }

}