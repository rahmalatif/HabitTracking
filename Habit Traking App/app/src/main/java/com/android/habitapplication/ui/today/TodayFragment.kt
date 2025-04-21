package com.android.habitapplication.ui.today

import android.content.Intent
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProvider
import com.android.habitapplication.databinding.FragmentTodayBinding
import com.android.habitapplication.ui.all_habits.AddHabitActivity
import com.android.habitapplication.ui.try_free.TryFreeFragment

class TodayFragment : Fragment() {

    private var _binding: FragmentTodayBinding? = null

    // This property is only valid between onCreateView and
    // onDestroyView.
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {


        _binding = FragmentTodayBinding.inflate(inflater, container, false)
        val root: View = binding.root

        binding.addBtn.setOnClickListener {
            val intent = Intent(requireContext(), AddHabitActivity::class.java)
            startActivity(intent)
        }


        return root
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}