package com.superking.parchisi.stard.otther

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.lifecycle.lifecycleScope
import androidx.navigation.fragment.findNavController
import com.google.android.material.snackbar.Snackbar
import com.superking.parchisi.stard.R
import com.superking.parchisi.stard.databinding.FragmentS3Binding
import kotlinx.coroutines.delay
import kotlin.random.Random


class S3Fragment : Fragment() {
    private var fragmentS3Binding: FragmentS3Binding? = null
    private val binding get() = fragmentS3Binding ?: throw RuntimeException("FragmentS3Binding = null")

    val text = "An airplane or aeroplane (informally plane) is a fixed-wing aircraft that is propelled forward by thrust from a jet engine, propeller, or rocket engine. Airplanes come in a variety of sizes, shapes, and wing configurations. The broad spectrum of uses for airplanes includes recreation, transportation of goods and people, military, and research. Worldwide, commercial aviation transports more than four billion passengers annually on airliners[1] and transports more than 200 billion tonne-kilometers[2] of cargo annually, which is less than 1% of the world's cargo movement.[3] Most airplanes are flown by a pilot on board the aircraft, but some are designed to be remotely or computer-controlled such as drones."


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        fragmentS3Binding = FragmentS3Binding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        try {
            var currentPoint = Random.nextInt(from = 100, until = 5000)
            currentPoint = gtjgtjigtjigt(currentPoint)

            if (currentPoint == 33333){
                lucky()
            }

            Snackbar.make(
                binding.root,
                "You have $currentPoint points",
                Snackbar.LENGTH_LONG
            ).show()


            gtgtgthgtgt()


        } catch (e: Exception) {
            vfvvf()
        }


        super.onViewCreated(view, savedInstanceState)
    }


    override fun onPause() {
        onDestroy()
        super.onPause()
    }

    override fun onDestroy() {
        fragmentS3Binding = null
        super.onDestroy()
    }

    private fun vfvvf() {
        Snackbar.make(
            binding.root,
            "Some error...",
            Snackbar.LENGTH_LONG
        ).show()
        requireActivity().onBackPressed()
    }

    private fun lucky() {
        Snackbar.make(
            binding.root,
            text,
            Snackbar.LENGTH_LONG
        ).show()
        requireActivity().onBackPressed()
    }


    private fun gtjgtjigtjigt(currentPoint: Int): Int {
        var hyujuj = currentPoint
        hyujuj += 500
        hyujuj += 55
        hyujuj += 62
        return hyujuj
    }

    private fun gtgtgthgtgt() {
        lifecycleScope.launchWhenCreated {
            delay(1700)
            frhhfrfhuhrf()
        }
    }

    private fun frhhfrfhuhrf() {
        findNavController().navigate(R.id.action_s3Fragment_to_s1Fragment)
    }

}