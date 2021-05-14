package com.example.loginactivity

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.LayoutInflater
import com.example.loginactivity.databinding.ActivityDetailBinding

class DetailActivity : AppCompatActivity() {
    private var binding:ActivityDetailBinding? = null
    private var logo = 0
    private var name:String? = null
    private var detail:String? = null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding= ActivityDetailBinding.inflate(layoutInflater)

        setContentView(binding?.root)
        logo = intent.getIntExtra(FactAdapter.LOGO_EXTRAs,0)
        name = intent.getStringExtra(FactAdapter.NAME_EXTRAs)
        detail = intent.getStringExtra(FactAdapter.FACT_EXTRAs)

    }
    private fun setUpFactDetail(){
        binding?.detailTv?.text = detail
        binding?.logoTv?.setImageResource(logo)
        title = name
    }
    override fun onDestroy() {
        super.onDestroy()
        binding = null
    }
}