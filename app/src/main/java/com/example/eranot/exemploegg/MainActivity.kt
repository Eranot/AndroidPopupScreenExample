package com.example.eranot.exemploegg

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        // QUANDO TU CLICA NO BOTÃO ISSO ACONTECE
        // SE A VISIBILIDADE DELES FOR GONE (TIPO INVISÍVEL)
        // ELE TROCA PRA VISÍVEL, SE FOR O CONTRÁRIO ELE TROCA PRA GONE
        btn_show.setOnClickListener {

            if(minha_view.visibility == View.GONE){
                minha_view.visibility = View.VISIBLE
            } else {
                minha_view.visibility = View.GONE
            }

        }

    }
}
