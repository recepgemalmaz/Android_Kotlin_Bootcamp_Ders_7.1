package com.recepgemalmaz.navigationcomponentkullanimi

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.google.android.material.bottomsheet.BottomSheetDialogFragment
import com.google.android.material.snackbar.Snackbar
import com.recepgemalmaz.navigationcomponentkullanimi.databinding.FragmentBottomSheetBinding


class BottomSheetFragment : BottomSheetDialogFragment() {

    private lateinit var binding: FragmentBottomSheetBinding
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        binding = FragmentBottomSheetBinding.inflate(inflater, container, false)

        binding.imageViewkopyala.setOnClickListener {

            Snackbar.make(it, "Kopyalandi", Snackbar.LENGTH_SHORT).show()
        }

        binding.imageViewpaylas.setOnClickListener {

            Snackbar.make(it, "Paylasildi", Snackbar.LENGTH_SHORT).show()
        }
        return binding.root
    }


}