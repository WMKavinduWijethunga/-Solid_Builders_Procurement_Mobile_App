package com.siyalumalk.solid_builders;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class Inventory extends AppCompatActivity {

    private Button saveButton, addButton;

    //Text Views of the Item Details Table
    private TextView itemID_itmDetTblCol00, item_itmDetTblCol01, unitPrice_itmDetTelCol02, inStk_itmDetTblCol03, rol_itmDetTblCol04;
    private Button addBtn_itemDetTblCol_05;

    //Selected items table instances
    private TextView item_selItemTblCol00, indicativePrice_selItemTblCol02;
    private EditText needQty_selItemTblCol01;

    private Button btnInventorySave;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_inventory);

        //Item Details Table
        itemID_itmDetTblCol00 = findViewById(R.id.col00_ItemIDTxt);
        item_itmDetTblCol01 = findViewById(R.id.col01_ItemTxt);
        unitPrice_itmDetTelCol02 = findViewById(R.id.col02_UnitPriceTxt);
        inStk_itmDetTblCol03 = findViewById(R.id.col03_inStockTxt);
        rol_itmDetTblCol04 = findViewById(R.id.col04_rolTxt);
        addBtn_itemDetTblCol_05 = findViewById(R.id.btnInventoryAdd);

        //Selected Items Table
        item_selItemTblCol00 = findViewById(R.id.col00_sTblItem);
        needQty_selItemTblCol01 = findViewById(R.id.col01_sTblNeedQty_editText);
        indicativePrice_selItemTblCol02 = findViewById(R.id.col02_sTblIPrice);

        btnInventorySave = findViewById(R.id.btnInventorySave);
    }
}