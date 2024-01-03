package com.app.practicaldevstree.adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.app.practicaldevstree.data.model.PlaceEntity
import com.app.practicaldevstree.databinding.RowLocationListBinding

class LocationAdapter(
    var list: ArrayList<PlaceEntity>,
    val listenerEdit: onClickEditListener,
    val listenerDelete: onClickDeleteListener
) : RecyclerView.Adapter<LocationAdapter.ViewHolder>() {

    inner class ViewHolder(val binding: RowLocationListBinding) :
        RecyclerView.ViewHolder(binding.root) {
        fun bind(model: PlaceEntity) {
            binding.txtPlaceName.text = model.name
            binding.txtPlaceAddress.text = model.address

            binding.imgDelete.setOnClickListener {
                listenerDelete.onClickDelete(list[layoutPosition])
            }

            binding.imgEdit.setOnClickListener {
                listenerEdit.onClickEdit(list[layoutPosition])
            }
        }
    }

    fun updateList(newList: ArrayList<PlaceEntity>) {
        list = newList
        notifyDataSetChanged()
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): LocationAdapter.ViewHolder {
        val binding =
            RowLocationListBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return ViewHolder(binding)
    }

    override fun onBindViewHolder(holder: LocationAdapter.ViewHolder, position: Int) {
        holder.bind(list[position])
    }

    override fun getItemCount(): Int {
        return list.size
    }
}

interface onClickEditListener {
    fun onClickEdit(model: PlaceEntity)
}

interface onClickDeleteListener {
    fun onClickDelete(model: PlaceEntity)
}
