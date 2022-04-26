package kr.co.lee.howlstargram_kotlin.ui.gallerybottomsheet

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.google.android.material.bottomsheet.BottomSheetDialogFragment
import dagger.hilt.android.AndroidEntryPoint
import kr.co.lee.howlstargram_kotlin.databinding.FragmentAddBottomSheetBinding

@AndroidEntryPoint
class BottomSheetDialogFragment: BottomSheetDialogFragment() {
    private lateinit var adapter: RecyclerAdapter
    private var _binding: FragmentAddBottomSheetBinding? = null
    private val binding: FragmentAddBottomSheetBinding
        get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        _binding = FragmentAddBottomSheetBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        initAdapter()
    }

    private fun initAdapter() {
        adapter = RecyclerAdapter()
        binding.rvMake.adapter = adapter
    }
}