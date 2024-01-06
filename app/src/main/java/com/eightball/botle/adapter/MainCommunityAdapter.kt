package com.eightball.botle.adapter

import android.content.Context
import android.content.Intent
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.eightball.botle.DTO.MainCommunityData
import com.eightball.botle.R

class MainCommunityAdapter (private val context: Context) : RecyclerView.Adapter<MainCommunityAdapter.ViewHolder>() {

    var datas = mutableListOf<MainCommunityData>()
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val view = LayoutInflater.from(context).inflate(R.layout.main_recyclerview,parent,false)
        return ViewHolder(view)
    }

    override fun getItemCount(): Int = datas.size
    override fun onBindViewHolder(holder: MainCommunityAdapter.ViewHolder, position: Int) {
        holder.bind(datas[position])
    }

    inner class ViewHolder(view: View) : RecyclerView.ViewHolder(view) {
        private val subject: TextView = itemView.findViewById(R.id.subject_text)
        private val text: TextView = itemView.findViewById(R.id.text)
        private val emotion: TextView = itemView.findViewById(R.id.emotion_image)
        private val nickname: TextView = itemView.findViewById(R.id.nickname_Dday_text)
        fun bind(item: MainCommunityData){
            subject.text = item.subject
            text.text = item.text
            emotion.text = item.emotion
            nickname.text = item.nickname

        }
    }

}