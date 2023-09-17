package com.recepgemalmaz.navigationcomponentkullanimi

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.activity.OnBackPressedCallback
import androidx.navigation.Navigation
import androidx.navigation.fragment.navArgs
import com.google.android.material.snackbar.Snackbar
import com.recepgemalmaz.navigationcomponentkullanimi.databinding.FragmentDetayBinding

class DetayFragment : Fragment() {

    private lateinit var binding: FragmentDetayBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding= FragmentDetayBinding.inflate(inflater, container, false)


        val bundle: DetayFragmentArgs by navArgs()
        val gelenAd = bundle.ad
        val gelenYas = bundle.yas
        val gelenBoy = bundle.boy
        val gelenBekar = bundle.bekar
        val urunId = bundle.urun.id
        val urunAd = bundle.urun.ad

        binding.textViewBilgi.text = "Ad: $gelenAd \nYaş: $gelenYas \nBoy: $gelenBoy \nBekar: $gelenBekar \nÜrün Id: $urunId \nÜrün Ad: $urunAd"

        val geriTusu = object : OnBackPressedCallback(true) { //true olursa geri tusu aktif degil
            override fun handleOnBackPressed() {
                Snackbar.make(
                    binding.textViewBilgi,
                    "Geri donmek istiyor musunuz ",
                    Snackbar.LENGTH_SHORT
                ).setAction("Evet") {
                    isEnabled = false
                    requireActivity().onBackPressedDispatcher.onBackPressed()
                }.show()
            }
        }


        requireActivity().onBackPressedDispatcher.addCallback(viewLifecycleOwner, geriTusu)
        return binding.root
    }


}