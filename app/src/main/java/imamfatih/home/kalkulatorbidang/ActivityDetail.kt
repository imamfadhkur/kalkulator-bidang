package imamfatih.home.kalkulatorbidang

import android.media.Image
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import android.widget.TextView
import imamfatih.home.kalkulatorbidang.model.Kalkulator
import android.graphics.drawable.Drawable as Drawable1

class ActivityDetail : AppCompatActivity() {

    //private var data = ActivityDetail

    companion object{
        const val EXTRA_TITLE = "extra_title"
        const val EXTRA_DETAIL = "extra_detail"
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_detail)

        //data = intent.getParcelableExtra(EXTRA_PHOTO)

        val tvTitleDet: TextView = findViewById(R.id.title_detail)
        val tvDetailDetail: TextView = findViewById(R.id.detail_detail)
        val tvImageDetail: ImageView = findViewById(R.id.image_detail)

        val bundle: Bundle? = intent.extras

        val title = intent.getStringExtra(EXTRA_TITLE)
        val photo: Int = bundle!!.getInt("photo")
        val detail = intent.getStringExtra(EXTRA_DETAIL)
        tvTitleDet.text = title
        tvDetailDetail.text = detail
        tvImageDetail.setImageResource(photo)

    }

}
