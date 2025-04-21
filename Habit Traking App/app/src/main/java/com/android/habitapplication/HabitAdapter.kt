package com.android.habitapplication

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.google.android.material.button.MaterialButton

class HabitAdapter(
    private val habits: List<Habit>,
    private val onHabitClick: (Habit) -> Unit
) : RecyclerView.Adapter<HabitAdapter.HabitViewHolder>() {

    inner class HabitViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        val title: TextView = itemView.findViewById(R.id.habit_title)
        val progressText: TextView = itemView.findViewById(R.id.habit_progress_text)
        val centerIcon: ImageView = itemView.findViewById(R.id.center_icon)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): HabitViewHolder {
        val view = LayoutInflater.from(parent.context)
            .inflate(R.layout.habit_item_list, parent, false)
        return HabitViewHolder(view)
    }

    override fun onBindViewHolder(holder: HabitViewHolder, position: Int) {
        val habit = habits[position]
        holder.title.text = habit.name
        holder.centerIcon.setImageResource(habit.iconResId)
        holder.progressText.text = "${habit.progress}%"

        holder.itemView.setOnClickListener {
            onHabitClick(habit)
        }
    }

    override fun getItemCount(): Int = habits.size
}
