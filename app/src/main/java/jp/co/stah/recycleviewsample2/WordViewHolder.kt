package jp.co.stah.recycleviewsample2

import android.view.View
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class WordViewHolder(itemView : View, adapter: WordListAdapter) :
    RecyclerView.ViewHolder(itemView),View.OnClickListener{




    val wordItemView: TextView? = itemView.findViewById(R.id.textView)
    val mAdapter: WordListAdapter? = adapter

    init{
        wordItemView!!.setOnClickListener(this)
    }

    override fun onClick(p0: View?) {
        // Get the position of the item that was clicked.
        val mPosition = layoutPosition
        println("recycle : $mPosition")
        // Use that to access the affected item in mWordList.

        val str = mAdapter!!.getWordList().get(mPosition)
        // val element = mWordList.get(mPosition)
        // Change the word in the mWordList.
        //mWordList.set(mPosition, "Clicked! $element")
        mAdapter!!.getWordList().set(mPosition, "Clicked! $str")
        // Notify the adapter, that the data has changed so it can
        // update the RecyclerView to display the data.
        mAdapter!!.notifyDataSetChanged()
    }

}