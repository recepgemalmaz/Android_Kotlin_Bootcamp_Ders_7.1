package com.recepgemalmaz.navigationcomponentkullanimi

import android.os.Bundle
import android.util.Log
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.Navigation
import com.recepgemalmaz.navigationcomponentkullanimi.databinding.FragmentAnasayfaBinding


class AnasayfaFragment : Fragment() {

    private lateinit var binding: FragmentAnasayfaBinding

    override fun onCreateView(

        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentAnasayfaBinding.inflate(inflater, container, false)

        binding.buttonDetay.setOnClickListener {
            //binding.textViewAnasayfa.text = "Merhaba"
            //Navigation.findNavController(binding.buttonDetay).navigate(R.id.detayGecis)
            val urun = Urunler(1, "TV")
            val gecis = AnasayfaFragmentDirections.detayGecis(ad = "recep" , yas = 22, boy = 1.78f, bekar = true, urun = urun)
            Navigation.findNavController(it).navigate(gecis)
        }
        binding.buttonGoster.setOnClickListener {
            Navigation.findNavController(it).navigate(R.id.bottomSheetGecis)
        }
        return binding.root
    }

    //life cycle yasam dongusu
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        Log.e("Yasam Dongusu", "onCreate")
        //uygulama calsitiginda ilk calisan fonksiyon ve bir kere calisir
    }

    override fun onPause() {
        super.onPause()
        Log.e("Yasam Dongusu", "onPause")
        //uygulama arka plana atildiginda calisir yani sayfa gorunmez oldugunda calisir
    }

    override fun onResume() {
        super.onResume()
        Log.e("Yasam Dongusu", "onResume")
        //uygulama arka plandan on plana ciktiginda calisir yani sayfa gorunur oldugunda calisir
    }


}