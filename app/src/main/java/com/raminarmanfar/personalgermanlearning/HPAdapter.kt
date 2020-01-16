package com.raminarmanfar.personalgermanlearning

import android.content.Context
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView

class HPAdapter(mCtx: Context, val HPs: ArrayList<HPModel>): RecyclerView.Adapter<HPAdapter.ViewHolder> {

    val mCtx = mCtx;

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): HPAdapter.ViewHolder {
        val v = LayoutInflater.from(p0.context).inflate()
    }

    override fun getItemCount(): Int {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun onBindViewHolder(holder: HPAdapter.ViewHolder, position: Int) {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

}