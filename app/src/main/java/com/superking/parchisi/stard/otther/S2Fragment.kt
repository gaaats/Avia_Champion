package com.superking.parchisi.stard.otther

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import androidx.navigation.fragment.findNavController
import com.google.android.material.snackbar.Snackbar
import com.superking.parchisi.stard.R
import com.superking.parchisi.stard.databinding.FragmentS2Binding


class S2Fragment : Fragment() {

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        try {

            binding.btnElem8.setOnClickListener {
                it.visibility = View.GONE
                polskks()
            }
            binding.btnElem9.setOnClickListener {
                it.visibility = View.GONE
                polskks()
            }
            binding.btnElem10.setOnClickListener {
                it.visibility = View.GONE
                polskks()
            }
            binding.btnElem13.setOnClickListener {
                it.visibility = View.GONE
                polskks()
            }
            binding.btnElem12.setOnClickListener {
                it.visibility = View.GONE
                polskks()
            }


            if (totto == "555") {
                Snackbar.make(
                    binding.root,
                    totto,
                    Snackbar.LENGTH_LONG
                ).show()
            }

            binding.root.background.alpha = 230



            binding.btnElem1.setOnClickListener {
                it.visibility = View.GONE
                polskks()
            }
            binding.btnElem2.setOnClickListener {
                it.visibility = View.GONE
                polskks()
            }
            binding.btnElem3.setOnClickListener {
                it.visibility = View.GONE
                polskks()
            }
            binding.btnElem4.setOnClickListener {
                it.visibility = View.GONE
                polskks()
            }
            binding.btnElem5.setOnClickListener {
                it.visibility = View.GONE
                polskks()
            }
            binding.btnElem6.setOnClickListener {
                it.visibility = View.GONE
                polskks()
            }
            binding.btnElem7.setOnClickListener {
                it.visibility = View.GONE
                polskks()
            }


        } catch (e: Exception) {
            afrhgthUygt()
        }

        super.onViewCreated(view, savedInstanceState)
    }


    private var fragmentS2Binding: FragmentS2Binding? = null
    private val binding
        get() = fragmentS2Binding ?: throw RuntimeException("FragmentS2Binding = null")

    val totto =
        "Ensuring the effective use of budget funds is one of the key problems of budget execution in most countries of the world. According to international practice, one of the mechanisms for ensuring the quality implementation of the use budget is program budgeting."

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        fragmentS2Binding = FragmentS2Binding.inflate(inflater, container, false)
        return binding.root
    }




    override fun onDestroy() {
        fragmentS2Binding = null
        super.onDestroy()
    }

    private fun afrhgthUygt() {
        Snackbar.make(
            binding.root,
            "There is some error, try again",
            Snackbar.LENGTH_LONG
        ).show()
        requireActivity().onBackPressed()
    }


    private fun hgthgthu(imageView: ImageView): Boolean {
        if (imageView.visibility == View.GONE) {
            return true
        }
        return false
    }

    private fun polskks() {
        if (hgthgthu(binding.btnElem1) && hgthgthu(binding.btnElem2) && hgthgthu(
                binding.btnElem3
            ) && hgthgthu(binding.btnElem4) && hgthgthu(binding.btnElem5) && hgthgthu(
                binding.btnElem6
            ) && hgthgthu(binding.btnElem7) && hgthgthu(binding.btnElem8) && hgthgthu(
                binding.btnElem9
            ) && hgthgthu(binding.btnElem10) && hgthgthu(binding.btnElem13) && hgthgthu(
                binding.btnElem12
            )
        ) {
            gtgthhgthitghgt()
        }
    }

    private fun gtgthhgthitghgt() {
        findNavController().navigate(R.id.action_s2Fragment_to_s3Fragment)
    }


    var bgbgbbg = 0.8f
    var plfr = 0.05f

}