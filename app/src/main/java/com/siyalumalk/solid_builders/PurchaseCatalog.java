package com.siyalumalk.solid_builders;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TextView;

public class PurchaseCatalog extends AppCompatActivity {

    private EditText inputReqNo, inputDateFrom, inputDateTo;
    private Spinner statusSelect;
    private Button btnFilter;

    //Purchase Order Table
    private TextView purOrderTbl_poNo_00, purOrderTbl_reqNo_01, purOrderTbl_item_02, purOrderTbl_unitPrice_03, purOrderTbl_qty_04, purOrderTbl_poDate_05, purOrderTbl_total_06, purOrderTbl_status_07;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_purchase_catalog);

        inputReqNo = findViewById(R.id.inputpcRequsitionNo);
        inputDateFrom = findViewById(R.id.inputpcDateFrom);
        inputDateTo = findViewById(R.id.inputpcDateTo);

        statusSelect = findViewById(R.id.selectpcFilterStatus);
        btnFilter = findViewById(R.id.btnpcFilter);

        //Purchase Order Table initialization
        purOrderTbl_poNo_00 = findViewById(R.id.col00_PONo_poListTbl);
        purOrderTbl_reqNo_01 = findViewById(R.id.col01_reqNo_poListTbl);
        purOrderTbl_item_02 = findViewById(R.id.col02_item_poListTbl);
        purOrderTbl_unitPrice_03 = findViewById(R.id.col03_unitPrice_poListTbl);
        purOrderTbl_qty_04 = findViewById(R.id.col04_qty_poListTbl);
        purOrderTbl_poDate_05 = findViewById(R.id.col05_poDate_poListTbl);
        purOrderTbl_total_06 = findViewById(R.id.col06_Total_poListTbl);
        purOrderTbl_status_07 = findViewById(R.id.col07_status_poListTbl);




    }
}