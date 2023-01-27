package com.book.of.king.arthur.boolofkingarthur.fragment

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.book.of.king.arthur.boolofkingarthur.gerdhfjlkasdfrdhjafblhjgakduhfjbsdjlfhbsfds
import com.book.of.king.arthur.boolofkingarthur.databinding.FragmentMenuBinding


class menu : Fragment() {
private var binding: FragmentMenuBinding? = null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
       binding = FragmentMenuBinding.inflate(inflater, container, false )
        return binding!!.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding!!.button5.setOnClickListener {
    var game = bookgame()
    var trasporter = requireFragmentManager().beginTransaction()
    trasporter.replace(gerdhfjlkasdfrdhjafblhjgakduhfjbsdjlfhbsfds.gkjfngsljkgnlkgjnglsifjkgndg.id, game)
    .commit()
        }
        binding!!.button2.setOnClickListener {
            var game = gameZero()
            var trasporter = requireFragmentManager().beginTransaction()
            trasporter.replace(gerdhfjlkasdfrdhjafblhjgakduhfjbsdjlfhbsfds.gkjfngsljkgnlkgjnglsifjkgndg.id, game)
                .commit()
        }
        binding!!.button3.setOnClickListener {
            var game = gameOne()
            var trasporter = requireFragmentManager().beginTransaction()
            trasporter.replace(gerdhfjlkasdfrdhjafblhjgakduhfjbsdjlfhbsfds.gkjfngsljkgnlkgjnglsifjkgndg.id, game)
                .commit()
        }
        binding!!.button3.setOnClickListener {
            var game = gameTwo()
            var trasporter = requireFragmentManager().beginTransaction()
            trasporter.replace(gerdhfjlkasdfrdhjafblhjgakduhfjbsdjlfhbsfds.gkjfngsljkgnlkgjnglsifjkgndg.id, game)
                .commit()
        }
    }

    companion object {

        fun newInstance() =
            menu()
    }
}