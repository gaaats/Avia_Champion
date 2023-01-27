package com.superking.parchisi.stard

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import com.google.android.material.snackbar.Snackbar
import com.superking.parchisi.stard.databinding.FragmentS1Binding


class S1Fragment : Fragment() {


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        fragmentS1Binding = FragmentS1Binding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {

        try {
            gtjojojtgijgtijigt()

        } catch (e: Exception) {
            Snackbar.make(binding.root, "Some error, restarting...", Snackbar.LENGTH_LONG)
                .show()
        }
        super.onViewCreated(view, savedInstanceState)

    }

    private fun gtjojojtgijgtijigt() {
        binding.btnPlayGameeee.setOnClickListener {
            try {
                findNavController().navigate(R.id.action_s1Fragment_to_s2Fragment)
            } catch (e: Exception) {
                Snackbar.make(
                    binding.root,
                    "Some error, restarting...",
                    Snackbar.LENGTH_LONG
                )
                    .show()
            }
        }
    }

    override fun onDestroyView() {
        fragmentS1Binding = null
        super.onDestroyView()
    }

    private var fragmentS1Binding: FragmentS1Binding? = null
    private val binding get() = fragmentS1Binding ?: throw RuntimeException("FragmentS1Binding = null")


}