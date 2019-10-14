package jp.co.stah.recycleviewsample2

import android.content.Context
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import java.util.*

class WordListAdapter(context: Context, wordList: LinkedList<String>)
    : RecyclerView.Adapter<WordViewHolder>() {




    private val mWordList: LinkedList<String> = wordList
    private val mInflater: LayoutInflater = LayoutInflater.from(context)

    fun getWordList():LinkedList<String>{
        return mWordList
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): WordViewHolder {
        val mItemView = mInflater.inflate(
            R.layout.wordlist_item,
            parent, false
        )
        return WordViewHolder(mItemView, this)


    }

    override fun getItemCount(): Int {
     return   mWordList.size
    }

    override fun onBindViewHolder(holder: WordViewHolder, position: Int) {
        val current = mWordList[position]
        println("position: $position")
        holder.wordItemView!!.text = current

    }
}