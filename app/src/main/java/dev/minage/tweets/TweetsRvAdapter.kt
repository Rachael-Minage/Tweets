package dev.minage.tweets

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class TweetsRvAdapter (var tweetList: List<Tweets>): RecyclerView.Adapter<TweetsRvAdapter.TweetsViewHolder>(){
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): TweetsViewHolder {
        var itemView = LayoutInflater.from(parent.context).inflate(R.layout.tweet_list_items,parent,false)
        return TweetsViewHolder(itemView)
    }


    class TweetsViewHolder(itemView: View):RecyclerView.ViewHolder(itemView){
        var tvHandleName = itemView.findViewById<TextView>(R.id.tvHandleName)
        var tvHandle = itemView.findViewById<TextView>(R.id.tvHandle)
        var tvTimeStamp = itemView.findViewById<TextView>(R.id.tvTimeStamp)
        var tvTweet = itemView.findViewById<TextView>(R.id.tvTweet)
        var imgAvatar= itemView.findViewById<ImageView>(R.id.imgAvatar)
        var imgLike= itemView.findViewById<ImageView>(R.id.imgLike)
        var imgShare= itemView.findViewById<ImageView>(R.id.imgShare)
        var imgComments= itemView.findViewById<ImageView>(R.id.imgComments)
        var imgRetweet= itemView.findViewById<ImageView>(R.id.imgRetweet)




    }

    override fun onBindViewHolder(holder: TweetsViewHolder, position: Int) {
        var currentContact = tweetList.get(position)
        holder.tvHandleName.text = currentContact.handle
        holder.tvHandle.text = currentContact.displayName
        holder.tvTweet.text = currentContact.tweet


    }

    override fun getItemCount(): Int {
          return tweetList.size
    }
}





