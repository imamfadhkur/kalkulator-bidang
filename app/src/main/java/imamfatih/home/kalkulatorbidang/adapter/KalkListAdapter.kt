package imamfatih.home.kalkulatorbidang.adapter

import android.content.Intent
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.bumptech.glide.request.RequestOptions
import imamfatih.home.kalkulatorbidang.ActivityDetail
import imamfatih.home.kalkulatorbidang.R
import imamfatih.home.kalkulatorbidang.model.Kalkulator

class KalkListAdapter(private val listCalc: ArrayList<Kalkulator>):
    RecyclerView.Adapter<KalkListAdapter.ListViewHolder>() {

    private lateinit var onItemClickCallback: OnItemClickCallback

    fun setOnItemClickCallback(onItemClickCallback: OnItemClickCallback){
        this.onItemClickCallback = onItemClickCallback
    }

    override fun onCreateViewHolder(viewGroup: ViewGroup, i: Int): ListViewHolder {
        val view: View = LayoutInflater.from(viewGroup.context).inflate(R.layout.item_row_kalkulator, viewGroup, false)
        return ListViewHolder(view)
    }

    override fun getItemCount(): Int {
        return listCalc.size
    }

    override fun onBindViewHolder(holder: ListViewHolder, position: Int) {
        val kalkulator = listCalc[position]
        Glide.with(holder.itemView.context)
            .load(kalkulator.photo)
            .apply(RequestOptions().override(200,200))
            .into(holder.imgPhoto)

        holder.tvDetail.text = kalkulator.detail
        holder.tvName.text = kalkulator.name
        holder.itemView.setOnClickListener{onItemClickCallback.onItemClicked(listCalc[holder.adapterPosition])}
    }

    interface OnItemClickCallback{fun onItemClicked(data:Kalkulator)}

    inner class ListViewHolder(itemView: View): RecyclerView.ViewHolder(itemView){
        var tvName: TextView = itemView.findViewById(R.id.tv_item_name)
        var tvDetail: TextView = itemView.findViewById(R.id.tv_item_detail)
        var imgPhoto: ImageView = itemView.findViewById(R.id.img_item_photo)
    }
}