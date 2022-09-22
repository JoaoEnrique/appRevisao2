package com.example.apprevisao

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        val edtNome: EditText = findViewById(R.id.edtNome)
        val edtEndereço: EditText = findViewById(R.id.edtEndereco)
        val edtCep: EditText = findViewById(R.id.edtCep)
        val edtBairro: EditText = findViewById(R.id.edtBairro)

        val btnCadastro: Button = findViewById(R.id.BtnCadastrar)

        btnCadastro.setOnClickListener {
            val intent = Intent(this, RespostaActivity::class.java)

            intent.putExtra("nome", edtNome.text.toString())
            intent.putExtra("endereço", edtEndereço.text.toString())
            intent.putExtra("bairro", edtBairro.text.toString())
            intent.putExtra("CEP", edtCep.text.toString())
            startActivity(intent)
        }


    }
}