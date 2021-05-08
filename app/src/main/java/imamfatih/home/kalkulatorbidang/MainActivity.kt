package imamfatih.home.kalkulatorbidang

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import android.widget.TextView
import android.widget.Toast
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import imamfatih.home.kalkulatorbidang.adapter.KalkCardAdapter
import imamfatih.home.kalkulatorbidang.adapter.KalkListAdapter
import imamfatih.home.kalkulatorbidang.model.DataKalkulator
import imamfatih.home.kalkulatorbidang.model.Kalkulator

class MainActivity : AppCompatActivity() {

    private lateinit var rvCalc: RecyclerView
    private var list: ArrayList<Kalkulator> = arrayListOf()

    override fun onCreateOptionsMenu(menu: Menu): Boolean {
        menuInflater.inflate(R.menu.menu_main, menu)
        return super.onCreateOptionsMenu(menu)
    }

    override fun onOptionsItemSelected(item:MenuItem):Boolean {
        when(item.itemId) {
            R.id.about -> {
                val about = Intent(this@MainActivity, About::class.java)
                startActivity(about)
                true
            }
            R.id.list -> {
                showRecyclerList()
            }
            R.id.grid -> {
                showRecyclerGrid()
            }
        }
        return super.onOptionsItemSelected(item)
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        rvCalc = findViewById(R.id.rv_kalkulator)
        rvCalc.setHasFixedSize(true)

        //var lay_det_title: TextView = findViewById(R.id.title_detail)

        list.addAll(DataKalkulator.listData)
        showRecyclerGrid()
    }

    private fun showRecyclerGrid(){
        rvCalc.layoutManager = GridLayoutManager(this, 2)
        val grid = KalkCardAdapter(list)
        rvCalc.adapter = grid

        grid.setOnItemClickCallback(object : KalkCardAdapter.OnItemClickCallback{
            override fun onItemClicked(data: Kalkulator) {
                showSelectedHero(data)
            }
        })
    }

    private fun showRecyclerList() {
        rvCalc.layoutManager = LinearLayoutManager(this)
        val listCalcAdapter = KalkListAdapter(list)
        rvCalc.adapter = listCalcAdapter

        listCalcAdapter.setOnItemClickCallback(object : KalkListAdapter.OnItemClickCallback{
            override fun onItemClicked(data: Kalkulator) {
                showSelectedHero(data)
            }
        })
    }
    private fun showSelectedHero(kalk: Kalkulator) {
        //if (kalk.name == "Persegi") {
            val persegi = Intent(this@MainActivity, ActivityDetail::class.java)
            persegi.putExtra(ActivityDetail.EXTRA_TITLE, kalk.name)
            persegi.putExtra(ActivityDetail.EXTRA_DETAIL, kalk.detail)
            persegi.putExtra("photo", kalk.photo)
            startActivity(persegi)
//        } else if (kalk.name == "Persegi Panjang") {
//            action()
//        } else {
//            Toast.makeText(this,"selain kedua",Toast.LENGTH_SHORT).show()
//        }
    }
}
