package imamfatih.home.kalkulatorbidang.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.bumptech.glide.request.RequestOptions
import imamfatih.home.kalkulatorbidang.R
import imamfatih.home.kalkulatorbidang.model.Kalkulator

class KalkCardAdapter(val listCalc: ArrayList<Kalkulator>): RecyclerView.Adapter<KalkCardAdapter.CardViewHolder>() {

    private lateinit var onItemClickCallback: OnItemClickCallback

    fun setOnItemClickCallback(onItemClickCallback: OnItemClickCallback){
        this.onItemClickCallback = onItemClickCallback
    }

    override fun onCreateViewHolder(viewGroup: ViewGroup, viewType: Int): CardViewHolder {
        val view: View = LayoutInflater.from(viewGroup.context).inflate(R.layout.card_row_kalkulator, viewGroup, false)
        return CardViewHolder(view)
    }

    override fun getItemCount(): Int {
        return listCalc.size
    }

    override fun onBindViewHolder(holder: CardViewHolder, position: Int) {
        Glide.with(holder.itemView.context)
            .load(listCalc[position].photo)
            .apply(RequestOptions().override(450,470))
            .into(holder.imgPhoto)
       //holder.textCard.text = listCalc[position].name

        holder.itemView.setOnClickListener {
            onItemClickCallback.onItemClicked(listCalc[holder.adapterPosition])
        }
    }

    inner class CardViewHolder(itemView: View): RecyclerView.ViewHolder(itemView){
        var imgPhoto : ImageView = itemView.findViewById(R.id.img_card)
        //var textCard: TextView = itemView.findViewById(R.id.text_card)
    }

    interface OnItemClickCallback{
        fun onItemClicked(data:Kalkulator)
    }
}