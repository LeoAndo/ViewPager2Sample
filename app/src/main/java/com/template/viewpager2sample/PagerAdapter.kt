package com.template.viewpager2sample

import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentActivity
import androidx.viewpager2.adapter.FragmentStateAdapter

class PagerAdapter(private val activity: FragmentActivity) : FragmentStateAdapter(activity) {
    override fun getItemCount(): Int = TabType.values().size

    override fun createFragment(position: Int): Fragment {
        val pageNo = position + 1
        return BlankFragment.newInstance("Page no: $pageNo")
    }

    fun getPageTitle(position: Int): CharSequence? = activity.getString(
        when (TabType.values()[position]) {
            TabType.PAGE_1 -> R.string.page_1
            TabType.PAGE_2 -> R.string.page_2
            TabType.PAGE_3 -> R.string.page_3
        }
    )

    enum class TabType {
        PAGE_1,
        PAGE_2,
        PAGE_3
    }
}