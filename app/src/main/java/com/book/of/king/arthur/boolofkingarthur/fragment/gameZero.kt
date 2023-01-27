package com.book.of.king.arthur.boolofkingarthur.fragment

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.book.of.king.arthur.boolofkingarthur.R
import com.book.of.king.arthur.boolofkingarthur.databinding.FragmentGameZeroBinding
import com.book.of.king.arthur.boolofkingarthur.gerdhfjlkasdfrdhjafblhjgakduhfjbsdjlfhbsfds


class gameZero : Fragment() {
    val zero = 0
    var zero1 = 0
    val a = 1
    val b = 1
    val c = 2
    val d = 2
    val e = 3
    val f = 3
    val g = 4
    val h = 4
private var binding: FragmentGameZeroBinding? = null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        binding = FragmentGameZeroBinding.inflate(inflater, container, false)
        return binding!!.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
binding!!.imageView2.setOnClickListener {
zero1 = a + zero
}
        binding!!.imageView6.setOnClickListener {
            zero1 = zero1 + b
            if (zero1 == 2){
                binding!!.imageView2.visibility = View.INVISIBLE
                binding!!.imageView6.visibility = View.INVISIBLE
            }
            else{
                zero1 = 0
            }
        }

        binding!!.imageView.setOnClickListener {
            zero1 = c + zero
        }
        binding!!.imageView5.setOnClickListener {
            zero1 = zero1 + d
            if (zero1 == 4){
                binding!!.imageView.visibility = View.INVISIBLE
                binding!!.imageView5.visibility = View.INVISIBLE
            }
            else{
                zero1 = 0
            }
        }
        binding!!.imageView3.setOnClickListener {
            zero1 = e + zero
        }
        binding!!.imageView7.setOnClickListener {
            zero1 = zero1 + f
            if (zero1 == 6){
                binding!!.imageView3.visibility = View.INVISIBLE
                binding!!.imageView7.visibility = View.INVISIBLE
            }
            else{
                zero1 = 0
            }
        }
        binding!!.imageView4.setOnClickListener {
            zero1 = g + zero
        }
        binding!!.imageView8.setOnClickListener {
            zero1 = zero1 + h
            if (zero1 == 8){
                binding!!.imageView4.visibility = View.INVISIBLE
                binding!!.imageView8.visibility = View.INVISIBLE
            }
            else{
                zero1 = 0
            }
        }
        binding!!.back.setOnClickListener {
            val menu = menu()
            var transperent = requireFragmentManager().beginTransaction()
            transperent.replace(gerdhfjlkasdfrdhjafblhjgakduhfjbsdjlfhbsfds.gkjfngsljkgnlkgjnglsifjkgndg.id, menu)
            transperent.commit()
        }
    }
    companion object {

        fun newInstance() =
            gameZero()
    }
}