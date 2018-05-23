package kotlinrecyclerview.demo.com.kotlinrecyclerview;

import android.content.Context
import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import kotlinx.android.synthetic.main.row_item.view.*

/**
 * Created by C140959 on 08-05-2018.
 */

class MyAdapter(val items: ArrayList<String>, val context: Context) : RecyclerView.Adapter<MyAdapter.MyViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup?, viewType: Int): MyViewHolder {
        return MyViewHolder(LayoutInflater.from(context).inflate(R.layout.row_item, parent, false))
    }

    override fun getItemCount(): Int {
        return items.size
    }

    override fun onBindViewHolder(holder: MyViewHolder?, position: Int) {
        holder?.nameList?.text = items.get(position)
    }

    class MyViewHolder(view: View) : RecyclerView.ViewHolder(view) {
        val nameList = view.tvName
    }
}
