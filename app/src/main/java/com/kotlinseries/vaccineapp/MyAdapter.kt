package com.kotlinseries.vaccineapp

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast
import androidx.recyclerview.widget.RecyclerView

class MyAdapter(val vaccineList:ArrayList<VaccineModel>):RecyclerView.Adapter<MyAdapter.MyViewHolder>()
//the vaccine model it would be acting as item in the recyclerview
{
inner class MyViewHolder(itemView: View):RecyclerView.ViewHolder(itemView){
    var vaccineImage: ImageView
    var vaccinetitle:TextView
    init {
        vaccineImage = itemView.findViewById(R.id.imageview)
        vaccinetitle =itemView.findViewById(R.id.text1)
        itemView.setOnClickListener(){
Toast.makeText(itemView.context,"You choose: ${vaccineList[adapterPosition].name}",Toast.LENGTH_SHORT).show()

        }



    }
}

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyViewHolder {
      val v = LayoutInflater.from(parent.context).inflate(R.layout.recycler_view_layout,parent,false)
        return MyViewHolder(v)

    }

    override fun getItemCount(): Int {
return vaccineList.size


    }

    override fun onBindViewHolder(holder: MyViewHolder, position: Int) {
holder.vaccinetitle.setText(vaccineList[position].name)
        holder.vaccineImage.setImageResource(vaccineList[position].img)


    }


}