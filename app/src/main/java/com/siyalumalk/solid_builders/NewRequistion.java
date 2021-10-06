package com.siyalumalk.solid_builders;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TextView;

public class NewRequistion extends AppCompatActivity {

    private Spinner siteNameSelect;
    private EditText inputDeptHead, inputReqBefore, inputComment;
    private TextView catTbl_Item_00, catTbl_NeedQty_01, catTbl_indicativePrice_02, catTotAmount_View;
    private Button btnSave, btnMakeRequistion;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_new_requistion);

        siteNameSelect = findViewById(R.id.selectSiteLocation);
        inputDeptHead = findViewById(R.id.inputDepartmentHead);
        inputReqBefore = findViewById(R.id.inputRequiredBefore);
        inputComment = findViewById(R.id.inputComments);

        //catalogue item table data initialization
        catTbl_Item_00 = findViewById(R.id.col00_catTblItem);
        catTbl_NeedQty_01 = findViewById(R.id.col01_catTblNeedQty);
        catTbl_indicativePrice_02 = findViewById(R.id.col02_catTblIPrice);

        catTotAmount_View = findViewById(R.id.totcatAmountView);
        btnSave = findViewById(R.id.btnNewReqSave);
        btnMakeRequistion = findViewById(R.id.btnNewReqMakeRequistion);
    }
}