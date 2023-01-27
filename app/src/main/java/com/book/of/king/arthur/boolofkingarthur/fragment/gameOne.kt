package com.book.of.king.arthur.boolofkingarthur.fragment

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import com.book.of.king.arthur.boolofkingarthur.gerdhfjlkasdfrdhjafblhjgakduhfjbsdjlfhbsfds
import com.book.of.king.arthur.boolofkingarthur.databinding.FragmentGameOneBinding


class gameOne : Fragment() {
private var binding: FragmentGameOneBinding? = null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        binding = FragmentGameOneBinding.inflate(inflater,container,false)
        return binding!!.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
binding!!.button.setOnClickListener {

    val menu = menu()
    var transport = requireFragmentManager().beginTransaction()
    transport.replace(gerdhfjlkasdfrdhjafblhjgakduhfjbsdjlfhbsfds.gkjfngsljkgnlkgjnglsifjkgndg.id, menu)
    transport.commit()
    Toast.makeText(requireContext(), "WIN", Toast.LENGTH_SHORT).show()

}
        binding!!.button2.setOnClickListener {

            Toast.makeText(requireContext(), "Lose, repeat", Toast.LENGTH_SHORT).show()

        }
        binding!!.button3.setOnClickListener {


            Toast.makeText(requireContext(), "Lose, repeat", Toast.LENGTH_SHORT).show()

        }
        binding!!.button4.setOnClickListener {


            Toast.makeText(requireContext(), "Lose, repeat", Toast.LENGTH_SHORT).show()

        }
        binding!!.button5.setOnClickListener {

            Toast.makeText(requireContext(), "Lose, repeat", Toast.LENGTH_SHORT).show()

        }
    }

    companion object {

        fun newInstance() =
            gameOne()
    }
}