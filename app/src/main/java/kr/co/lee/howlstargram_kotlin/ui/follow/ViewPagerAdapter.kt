package kr.co.lee.howlstargram_kotlin.ui.follow

import androidx.core.os.bundleOf
import androidx.fragment.app.Fragment
import androidx.viewpager2.adapter.FragmentStateAdapter
import kr.co.lee.howlstargram_kotlin.utilites.FOLLOW

class ViewPagerAdapter(
    private val pair: Pair<Map<String, Boolean>, Map<String, Boolean>>,
    fragment: Fragment): FragmentStateAdapter(fragment) {
    override fun getItemCount(): Int = 2

    override fun createFragment(position: Int): Fragment {
        val fragment = FollowFragment()
        when(position) {
            0 -> {
                fragment.arguments = bundleOf(
                    FOLLOW to pair.first
                )
            }
            1 -> {
                fragment.arguments = bundleOf(
                    FOLLOW to pair.second
                )
            }
        }

        return fragment
    }
}