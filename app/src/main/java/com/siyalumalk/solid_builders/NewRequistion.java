package com.siyalumalk.solid_builders;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

import com.vishnusivadas.advanced_httpurlconnection.PutData;

public class NewRequistion extends AppCompatActivity {

    private Spinner siteNameSelect;
    private EditText inputDeptHead, inputDelDate, inputOrderDate,inputComment;
    private TextView catTbl_Item_00, catTbl_NeedQty_01, catTbl_indicativePrice_02, catTotAmount_View;
    private Button btnSave, btnMakeRequistion;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_new_requistion);

        siteNameSelect = findViewById(R.id.selectSiteLocation);
        inputDeptHead = findViewById(R.id.inputDepartmentHead);
        inputDelDate = findViewById(R.id.inputRequiredBefore);
        inputOrderDate = findViewById(R.id.inputOrderDate);
        inputComment = findViewById(R.id.inputComments);

        //catalogue item table data initialization
        catTbl_Item_00 = findViewById(R.id.col00_catTblItem);
        catTbl_NeedQty_01 = findViewById(R.id.col01_catTblNeedQty);
        catTbl_indicativePrice_02 = findViewById(R.id.col02_catTblIPrice);

        catTotAmount_View = findViewById(R.id.totcatAmountView);
        btnSave = findViewById(R.id.btnNewReqSave);
        btnMakeRequistion = findViewById(R.id.btnNewReqMakeRequistion);



        btnMakeRequistion.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {


                //get values to string

                //String strSiteName = String.valueOf(siteNameSelect);
                String strSiteName = "fsdfs";
                String strDeptHead = inputDeptHead.getText().toString();
                String strDelDate = inputDelDate.getText().toString();
                String strOrderDate = inputOrderDate.getText().toString();
                String strComment = inputComment.getText().toString();
                //String strTotal = String.valueOf(catTotAmount_View);
                String strTotal = "7000";
                System.out.println(strTotal + strDeptHead + strDelDate + strOrderDate + strComment);

                if(!strSiteName.equals("") && !strDeptHead.equals("") && !strDelDate.equals("") && !strOrderDate.equals("") && !strComment.equals("")){


                    Handler handler = new Handler(Looper.getMainLooper());
                    handler.post(new Runnable() {
                        @Override
                        public void run() {
                            String[] field = new String[6];
                            field[0] = "siteName";
                            field[1] = "siteManagerName";
                            field[2] = "delDate";
                            field[3] = "orderDate";
                            field[4] = "comment";
                            field[5] = "total";

                            String[] data = new String[6];
                            data[0] = strSiteName;
                            data[1] = strDeptHead;
                            data[2] = strDelDate;
                            data[3] = strOrderDate;
                            data[4] = strComment;
                            data[5] = strTotal;

                            System.out.println("Heloooooooooooooooooooooooooooooooooooooooooooo");
                            System.out.println(strSiteName + strDeptHead + strDelDate + strOrderDate +strComment +strTotal);

                            PutData putData = new PutData("http://192.168.8.189/SolidBuilders/addNewRequstitionDetails.php", "POST",field,data);

                            if(putData.startPut()){

                                if(putData.onComplete()){

                                    String result = putData.getResult();

                                    if(result.equals("Requstition Added Successfully")){

                                        Toast.makeText(getApplicationContext(), result, Toast.LENGTH_SHORT).show();

                                    }
                                    else{

                                        Toast.makeText(getApplicationContext(), result, Toast.LENGTH_SHORT).show();

                                    }

                                }

                            }
                        }
                    });

                }
                else {

                    Toast.makeText(getApplicationContext(),"All Fileds are required", Toast.LENGTH_SHORT).show();

                }

            }
        });
    }
}