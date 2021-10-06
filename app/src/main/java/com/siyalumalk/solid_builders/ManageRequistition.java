package com.siyalumalk.solid_builders;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TextView;

public class ManageRequistition extends AppCompatActivity {

    private Button editButton, deleteButton, filterButton;
    private EditText inputReqNo, inputDateFrom, inputDateTo;
    private Spinner statusSelect;
    //requsition table instances
    private TextView reqListTbl_reqNo_00, reqListTbl_requester_01, reqListTbl_site_02, reqListTbl_reqDate_03, reqListTbl_status_04;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_manage_requistition);

        editButton = findViewById(R.id.btnRqEdit);
        deleteButton = findViewById(R.id.btnRqDelete);
        filterButton = findViewById(R.id.btnRqFilter);

        inputReqNo = findViewById(R.id.inputRequsitionNo);
        inputDateFrom = findViewById(R.id.inputDateFrom);
        inputDateTo = findViewById(R.id.inputDateTo);
        statusSelect = findViewById(R.id.selectFilterStatus);

        //table value initialization
        reqListTbl_reqNo_00 = findViewById(R.id.col00_reqNo_reqTbl);
        reqListTbl_requester_01 = findViewById(R.id.col01_requester_reqTbl);
        reqListTbl_site_02 = findViewById(R.id.col02_site_reqTbl);
        reqListTbl_reqDate_03 = findViewById(R.id.col03_reqDate_reqTbl);


        editButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent editReq = new Intent(ManageRequistition.this,EditRequistion.class);
                startActivity(editReq);

            }
        });

    }
}