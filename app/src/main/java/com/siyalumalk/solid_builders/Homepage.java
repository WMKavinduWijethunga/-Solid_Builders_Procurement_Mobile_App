package com.siyalumalk.solid_builders;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class Homepage extends AppCompatActivity {

    //declaring instances
    private ImageButton imgBtnMakeOrder, imgBtnManageReq, imgBtnNewReq, imgBtnInventory, imgBtnPurchaseCat;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_homepage);

        //assining activity buttons
        imgBtnMakeOrder = findViewById(R.id.btnMakeOrders);
        imgBtnManageReq = findViewById(R.id.btnManageReq);
        imgBtnNewReq = findViewById(R.id.btnNewReq);
        imgBtnInventory = findViewById(R.id.btnInventory);
        imgBtnPurchaseCat = findViewById(R.id.btnPurchaseCat);

        //redirect to relevent pages on button clicks
        /*
            imgBtnMakeOrder -> new order page
            imgBtnManageReq -> View previous requistition
            imgBtnNewReq -> add a new requistions
            imgBtnInventory -> Inventory check page
            imgBtnPurchaseCat -> view catalog
        */

        //imgBtnMakeOrder -> Inventory
        imgBtnMakeOrder.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent makeOrderIntent = new Intent(Homepage.this,Inventory.class);
                startActivity(makeOrderIntent);

            }
        });

        //imgBtnManageReq -> Manage requistion
        imgBtnManageReq.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent makeOrderIntent = new Intent(Homepage.this,ManageRequistition.class);
                startActivity(makeOrderIntent);

            }
        });

        //imgBtnNewReq -> New Requistition
        imgBtnNewReq.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent makeOrderIntent = new Intent(Homepage.this,NewRequistion.class);
                startActivity(makeOrderIntent);

            }
        });

        //imgBtnInventory -> Inventory
        imgBtnInventory.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent makeOrderIntent = new Intent(Homepage.this,Inventory.class);
                startActivity(makeOrderIntent);

            }
        });

        //imgBtnPurchaseCat -> Purchase catlogue
        imgBtnPurchaseCat.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent makeOrderIntent = new Intent(Homepage.this,PurchaseCatalog.class);
                startActivity(makeOrderIntent);

            }
        });
    }
}