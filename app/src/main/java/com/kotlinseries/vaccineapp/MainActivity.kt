package com.kotlinseries.vaccineapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //step-1 Adapterview:Recyclerview
        val recyclerview:RecyclerView =findViewById(R.id.rv)
        recyclerview.layoutManager=LinearLayoutManager(this,LinearLayoutManager.VERTICAL,false)
        //step2-Data source:List of vaccine model objects
        var vaccinelist:ArrayList<VaccineModel> = ArrayList()
var v1:VaccineModel=VaccineModel("Covid19 Vaccine",R.drawable.vaccine1)
        var v2:VaccineModel=VaccineModel("BCG Vaccine",R.drawable.vaccine4)
        var v3:VaccineModel=VaccineModel("ASTRA Vaccine",R.drawable.vaccine5)
        var v4:VaccineModel=VaccineModel("DTP Vaccine",R.drawable.vaccine6)
        var v5:VaccineModel=VaccineModel("johnson Vaccine",R.drawable.vaccine7)
        var v6:VaccineModel=VaccineModel("Faiza Vaccine",R.drawable.vaccine8)
        var v7:VaccineModel=VaccineModel("Chickenpox Vaccine",R.drawable.vaccine9)

        //I will add them to the list by using vaccinelist.add
        vaccinelist.add(v1)
        vaccinelist.add(v2)
        vaccinelist.add(v3)
        vaccinelist.add(v4)
        vaccinelist.add(v5)
        vaccinelist.add(v6)
        vaccinelist.add(v7)


    //step3 Adapter
        val adapter=MyAdapter(vaccinelist)
        //combining the adapter with recyclerview
        recyclerview.adapter=adapter







    }
}