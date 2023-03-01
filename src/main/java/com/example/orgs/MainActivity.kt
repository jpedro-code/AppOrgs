package com.example.orgs

import android.app.Activity
import android.os.Bundle
import android.widget.Toast

class MainActivity : Activity() { //herdando da classe activity

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState) //super e reponsavel por resolver todos os problemas
        Toast.makeText(this, "Bem vindo Usuario", Toast.LENGTH_SHORT).show()
        Toast.makeText(this, "Site Orgs Ativado", Toast.LENGTH_SHORT).show()


        setContentView(R.layout.activitiy_main)

    }
}