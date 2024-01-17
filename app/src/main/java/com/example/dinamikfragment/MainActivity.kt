package com.example.dinamikfragment

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.dinamikfragment.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private val binding by lazy { ActivityMainBinding.inflate(layoutInflater) }
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(binding.root)
        val blankFragment=BlankFragment()
        val blankFragment2=BlankFragment2()

        binding.apply {
            add.setOnClickListener{
                supportFragmentManager.beginTransaction()
                    .add(R.id.my_container, blankFragment)
                    .commit()
            }
        }
        binding.apply {
            remove.setOnClickListener{
                supportFragmentManager.beginTransaction()
                    .remove( blankFragment)
                    .commit()
            }
        }
        binding.apply {
            hide.setOnClickListener{
                supportFragmentManager.beginTransaction()
                    .hide( blankFragment)
                    .commit()
            }
        }
        binding.apply {
            show.setOnClickListener{
                supportFragmentManager.beginTransaction()
                    .show( blankFragment)
                    .commit()
            }
        }
        binding.apply {
            replase.setOnClickListener{
                supportFragmentManager.beginTransaction()
                    .replace(R.id.my_container, blankFragment2)
                    .commit()
            }
        }
    }
}