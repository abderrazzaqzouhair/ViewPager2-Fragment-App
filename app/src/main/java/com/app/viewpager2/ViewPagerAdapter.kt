package com.app.viewpager2

import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentActivity
import androidx.viewpager2.adapter.FragmentStateAdapter

class ViewPagerAdapter(activity: FragmentActivity) : FragmentStateAdapter(activity) {

    override fun getItemCount(): Int {
        return 3  // We have 3 fragments
    }

    override fun createFragment(position: Int): Fragment {
        return when (position) {
            0 -> FragmentPresentation()
            1 -> FragmentList()
            2 -> FragmentImagePresentation()
            else -> FragmentPresentation()
        }
    }
}
