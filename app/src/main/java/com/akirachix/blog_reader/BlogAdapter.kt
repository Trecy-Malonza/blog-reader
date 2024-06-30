package com.akirachix.blog_reader



import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class BlogAdapter(val blogList: List<Blog>):RecyclerView.Adapter<BlogViewHolder>(){
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): BlogViewHolder {
        val itemView =LayoutInflater.from(parent.context).inflate(R.layout.item_article,parent,false)
        return  BlogViewHolder(itemView)
    }

    override fun onBindViewHolder(holder: BlogViewHolder, position: Int) {
        val blog =blogList[position]
        holder.author.text = blog.author
        holder.title.text =blog.title
        holder.publishingDate.text =blog.publishingDate
        holder.preview.text = blog.blogPreview

    }

    override fun getItemCount(): Int {
       return blogList.size
    }
}


class  BlogViewHolder(itemView: View):RecyclerView.ViewHolder(itemView){
//   var profile = itemView.findViewById<ImageView>(R.id.authorProfilePicture)
    var author = itemView.findViewById<TextView>(R.id.author)
    var title =itemView.findViewById<TextView>(R.id.title)
    var publishingDate =itemView.findViewById<TextView>(R.id.publishingDate)
    var preview =itemView.findViewById<TextView>(R.id.preview)
//    var articlephoto =itemView.findViewById<ImageView>(R.id.articlePhoto)

}


