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
    TextView tvc337;
    TextView tvc338;
    TextView tvc339;
    TextView tvc355;
    TextView tvt252;
    TextView tva113;
    TextView tvc105;
    TextView tvc109;
    TextView tvc207;
    TextView tvc227;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        tvc203=findViewById(R.id.tvc203);
        tvc206=findViewById(R.id.tvc206);
        tvc218=findViewById(R.id.tvc218);
        tvc235=findViewById(R.id.tvc235);
        tvc346=findViewById(R.id.tvc346);
        tvc337=findViewById(R.id.tvc337);
        tvc338=findViewById(R.id.tvc338);
        tvc339=findViewById(R.id.tvc339);
        tvc355=findViewById(R.id.tvc355);
        tvt252=findViewById(R.id.tvt252);
        tva113=findViewById(R.id.tva113);
        tvc105=findViewById(R.id.tvc105);
        tvc109=findViewById(R.id.tvc109);
        tvc207=findViewById(R.id.tvc207);
        tvc227=findViewById(R.id.tvc227);

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
        tvc337.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i=new Intent(MainActivity.this, ModuleDetailActivity.class);
                i.putExtra("Module Code","C337");
                i.putExtra("ModuleName","Immersive Technologies");
                i.putExtra("AcademicYear","2023");
                i.putExtra("Semester",2);
                i.putExtra("ModuleCredit",4);
                i.putExtra("Venue","W64P");
                startActivity(i);
            }
        });
        tvc338.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i=new Intent(MainActivity.this, ModuleDetailActivity.class);
                i.putExtra("Module Code","C338");
                i.putExtra("ModuleName","AI and Machine Learning");
                i.putExtra("AcademicYear","2023");
                i.putExtra("Semester",2);
                i.putExtra("ModuleCredit",4);
                i.putExtra("Venue","W64P");
                startActivity(i);
            }
        });
        tvc339.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i=new Intent(MainActivity.this, ModuleDetailActivity.class);
                i.putExtra("Module Code","C339");
                i.putExtra("ModuleName","Software Testing and Analysis");
                i.putExtra("AcademicYear","2023");
                i.putExtra("Semester",2);
                i.putExtra("ModuleCredit",4);
                i.putExtra("Venue","W64P");
                startActivity(i);
            }
        });
        tvc355.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i=new Intent(MainActivity.this, ModuleDetailActivity.class);
                i.putExtra("Module Code","C355");
                i.putExtra("ModuleName","Business Intelligence");
                i.putExtra("AcademicYear","2023");
                i.putExtra("Semester",2);
                i.putExtra("ModuleCredit",4);
                i.putExtra("Venue","W64P");
                startActivity(i);
            }
        });
        tvt252.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i=new Intent(MainActivity.this, ModuleDetailActivity.class);
                i.putExtra("Module Code","T252");
                i.putExtra("ModuleName","Fundamentals of Design");
                i.putExtra("AcademicYear","2022");
                i.putExtra("Semester",2);
                i.putExtra("ModuleCredit",4);
                i.putExtra("Venue","W64P");
                startActivity(i);
            }
        });
        tva113.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i=new Intent(MainActivity.this, ModuleDetailActivity.class);
                i.putExtra("Module Code","A113");
                i.putExtra("ModuleName","Mathematics");
                i.putExtra("AcademicYear","2022");
                i.putExtra("Semester",1);
                i.putExtra("ModuleCredit",4);
                i.putExtra("Venue","W64P");
                startActivity(i);
            }
        });
        tvc105.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i=new Intent(MainActivity.this, ModuleDetailActivity.class);
                i.putExtra("Module Code","C105");
                i.putExtra("ModuleName","Programming Fundamentals");
                i.putExtra("AcademicYear","2022");
                i.putExtra("Semester",1);
                i.putExtra("ModuleCredit",4);
                i.putExtra("Venue","W64P");
                startActivity(i);
            }
        });
        tvc109.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i=new Intent(MainActivity.this, ModuleDetailActivity.class);
                i.putExtra("Module Code","C109");
                i.putExtra("ModuleName","IT in Business Process");
                i.putExtra("AcademicYear","2022");
                i.putExtra("Semester",1);
                i.putExtra("ModuleCredit",4);
                i.putExtra("Venue","W64P");
                startActivity(i);
            }
        });
        tvc207.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i=new Intent(MainActivity.this, ModuleDetailActivity.class);
                i.putExtra("Module Code","C207");
                i.putExtra("ModuleName","Database Systems");
                i.putExtra("AcademicYear","2022");
                i.putExtra("Semester",2);
                i.putExtra("ModuleCredit",4);
                i.putExtra("Venue","W64P");
                startActivity(i);
            }
        });
        tvc227.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i=new Intent(MainActivity.this, ModuleDetailActivity.class);
                i.putExtra("Module Code","C227");
                i.putExtra("ModuleName","Computer System Technologies");
                i.putExtra("AcademicYear","2022");
                i.putExtra("Semester",2);
                i.putExtra("ModuleCredit",4);
                i.putExtra("Venue","W64P");
                startActivity(i);
            }
        });
    }

}