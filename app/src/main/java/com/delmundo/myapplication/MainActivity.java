package com.delmundo.myapplication;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.DialogInterface;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity implements AdapterView.OnItemClickListener {
    String[] cName, country, industry, CEO, desc;

    int[] logo = {R.drawable.logo1, R.drawable.logo2, R.drawable.logo3, R.drawable.logo4, R.drawable.logo5, R.drawable.logo6,
            R.drawable.logo7,R.drawable.logo8, R.drawable.logo9, R.drawable.logo10, R.drawable.logo11, R.drawable.logo12, R.drawable.logo13,
            R.drawable.logo14};
    ArrayList<AndroidVer> versions = new ArrayList<>();
    ListView listVer;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        cName = getResources().getStringArray(R.array.companyName);
        country = getResources().getStringArray(R.array.Country);
        industry = getResources().getStringArray(R.array.Industry);
        CEO = getResources().getStringArray(R.array.CEO);
        desc = getResources().getStringArray(R.array.Description);

        for (int i = 0; i < cName.length;  i++){
            versions.add(new AndroidVer(logo[i], cName[i], country[i], industry[i], CEO[i], desc[i]));
        }

        AndroidAdapter adapter = new AndroidAdapter(this,R.layout.item, versions);
        listVer =  findViewById(R.id.ListvCompany);
        listVer.setAdapter(adapter);
        listVer.setOnItemClickListener(this);

    }


    @Override
    public void onItemClick(AdapterView<?> parent, View view, final int i, long id) {
        //Toast.makeText(this, verNames[i], Toast.LENGTH_LONG).show();
        AlertDialog.Builder dialog = new AlertDialog.Builder(this);
        dialog.setIcon(logo[i]);
        dialog.setTitle(cName[i]);
        dialog.setMessage(desc[i]);
        dialog.setNeutralButton("Close", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                dialog.dismiss();
                Toast.makeText(MainActivity.this, cName[i], Toast.LENGTH_LONG).show();
            }
        });
        dialog.create().show();

    }
    }

