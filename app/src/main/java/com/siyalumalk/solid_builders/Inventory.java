package com.siyalumalk.solid_builders;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import com.vishnusivadas.advanced_httpurlconnection.PutData;

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

        btnInventorySave.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                String orderID = "5";
                String strItemName = item_selItemTblCol00.getText().toString();
                String strQty = needQty_selItemTblCol01.getText().toString();
                String strPrice = indicativePrice_selItemTblCol02.getText().toString();

                if(!strQty.equals("")){

                    Handler handler = new Handler(Looper.getMainLooper());
                    handler.post(new Runnable() {
                        @Override
                        public void run() {

                            String[] field = new String[4];
                            field[0] = "purchOID";
                            field[1] = "itemName";
                            field[2] = "price";
                            field[3] = "quantity";

                            String[] data = new String[4];
                            data[0] = orderID;
                            data[1] = strItemName;
                            data[2] = strPrice;
                            data[3] = strQty;

                            PutData putData = new PutData("http://192.168.8.189/SolidBuilders/addPurchaseOrderList.php", "POST", field, data);

                            if(putData.startPut()){

                                if(putData.onComplete()){

                                    String result = putData.getResult();

                                    if(result.equals("Purchase order items added successfully!")){

                                        Toast.makeText(getApplicationContext(), result, Toast.LENGTH_SHORT).show();

                                    }
                                    else{

                                        Toast.makeText(getApplicationContext(), "", Toast.LENGTH_SHORT).show();

                                    }

                                }

                            }

                        }
                    });

                }
                else{
                    Toast.makeText(getApplicationContext(), "Quantity field is required!", Toast.LENGTH_SHORT).show();
                }

            }
        });
    }
}