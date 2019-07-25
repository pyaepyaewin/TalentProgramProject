package com.example.talentprogram.ViewHolder

import android.view.View
import androidx.recyclerview.widget.RecyclerView
import kotlinx.android.synthetic.main.activities.view.*
import kotlinx.android.synthetic.main.activities.view.imageChairman
import kotlinx.android.synthetic.main.activity_activities_detail.view.*

class ActivitiesViewHolder (v: View):RecyclerView.ViewHolder(v){
    var image=v.imageChairman
  var name=v.txtChairmanName
    var text=v.txtChairmanText

}