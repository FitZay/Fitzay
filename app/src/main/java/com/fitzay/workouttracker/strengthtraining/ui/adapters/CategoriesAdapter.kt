package com.fitzay.workouttracker.strengthtraining.ui.adapters

import android.content.Intent
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import androidx.recyclerview.widget.StaggeredGridLayoutManager
import com.fitzay.workouttracker.strengthtraining.R
import com.fitzay.workouttracker.strengthtraining.databinding.CategoriesLayoutBinding
import com.fitzay.workouttracker.strengthtraining.domain.models.CategoriesModel


class CategoriesAdapter(
    var data: ArrayList<CategoriesModel> , var excercisetype : String
) :
    RecyclerView.Adapter<RecyclerView.ViewHolder>() {

    private val mData: ArrayList<CategoriesModel> = data

    private lateinit var binding: CategoriesLayoutBinding

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RecyclerView.ViewHolder {

        binding = CategoriesLayoutBinding.inflate(
            LayoutInflater.from(parent.context),
            parent,
            false
        )
        val lp = binding.root.layoutParams
        if (lp is StaggeredGridLayoutManager.LayoutParams) {
            lp.isFullSpan = false
        }
        return ViewHolder(binding.root)


    }

    override fun onBindViewHolder(holder1: RecyclerView.ViewHolder, position: Int) {

        val holder = holder1 as ViewHolder
        holder.cat.text = mData[position].catName + " " + mData[position].catType

        binding.apply {
            when(mData[position].catName){
                "ABS" ->{
                    layoutImg.setBackgroundResource(R.drawable.abs_index)
                }
                "CHEST" ->{
                    layoutImg.setBackgroundResource(R.drawable.chest_index)
                }
                "ARM" ->{
                    layoutImg.setBackgroundResource(R.drawable.arm_index)
                }
                "LEG" ->{
                    layoutImg.setBackgroundResource(R.drawable.leg_index)
                }
                "SHOULDER & BACK" ->{
                    layoutImg.setBackgroundResource(R.drawable.shoulder_index)
                }
            }
        }



        holder.itemView.setOnClickListener {
            val intent =
                Intent(
                    holder.itemView.context,
                    com.fitzay.workouttracker.strengthtraining.ui.activities.DisplayWorkoutsActivity::class.java
                ).apply {
                    putExtra("EXTRA_NAME", mData[position].catName)
                    putExtra("EXTRA_ID", mData[position].catId)
                    putExtra("EXTRA_TYPE", mData[position].catType)
                    putExtra("EXTRA_EXERCISE", excercisetype)

                }
            intent.flags = Intent.FLAG_ACTIVITY_SINGLE_TOP
            holder.itemView.context.startActivity(intent)
        }

    }

    // total number of cells
    override fun getItemCount(): Int {
        return mData.size
    }

    override fun getItemId(position: Int): Long {
        return position.toLong()
    }

    override fun getItemViewType(position: Int): Int {
        return position
    }

    inner class ViewHolder internal constructor(itemView: View) :
        RecyclerView.ViewHolder(itemView) {
        var cat: TextView

        init {
            cat = itemView.findViewById(R.id.cat)

        }
    }
}