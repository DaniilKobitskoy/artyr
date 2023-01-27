package com.book.of.king.arthur.boolofkingarthur.fragment

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import com.book.of.king.arthur.boolofkingarthur.R
import com.book.of.king.arthur.boolofkingarthur.databinding.FragmentGameTwoBinding
import com.book.of.king.arthur.boolofkingarthur.gerdhfjlkasdfrdhjafblhjgakduhfjbsdjlfhbsfds


class gameTwo : Fragment() {

private var binding: FragmentGameTwoBinding? = null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        binding = FragmentGameTwoBinding.inflate(inflater, container, false)
        return binding!!.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding!!.button.setOnClickListener {
            Toast.makeText(requireContext(), "Lose", Toast.LENGTH_SHORT).show()
        }
        binding!!.button1.setOnClickListener {
            Toast.makeText(requireContext(), "Lose", Toast.LENGTH_SHORT).show()
        }
        binding!!.button2.setOnClickListener {
            val menu = menu()
            var transport = requireFragmentManager().beginTransaction()
            transport.replace(gerdhfjlkasdfrdhjafblhjgakduhfjbsdjlfhbsfds.gkjfngsljkgnlkgjnglsifjkgndg.id, menu)
            transport.commit()
        }


    }
    companion object {

        fun newInstance() =
            gameTwo()
    }
}