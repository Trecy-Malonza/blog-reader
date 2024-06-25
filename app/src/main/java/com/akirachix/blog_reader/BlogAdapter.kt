package com.akirachix.blog_reader

//import android.content.Context
//import android.content.Intent
//import android.net.Uri
//import android.view.LayoutInflater
//import android.view.View
//import android.view.ViewGroup
//import android.widget.Button
//import android.widget.ImageView
//import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class BlogAdapter(val blog: List<Blog>):RecyclerView.Adapter<BlogAdapter.BlogViewHolder()> {


//        override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): BlogViewHolder {
//            val view = LayoutInflater.from(context).inflate(R.layout.item_article, parent, false)
//            return ArticleViewHolder(view)
//        }
//
//        override fun onBindViewHolder(holder: ArticleViewHolder, position: Int) {
//            val blog = blog[position]
//            holder.author.text=blog.authorsName
//            holder.title.text=blog.title
//            holder.publishingDate.text=blog.publishingDate
//            holder.preview.text =blog.blogPreview.take(100)
//
//
////
////                Picasso
////                .load(article.authorProfilePicture)
////                .resize(40, 40)  // Resize to 40x40 pixels
////                .centerCrop()
////                .into(holder.authorProfilePicture)
////
////            Picasso.get()
////                .load(article.articlePhoto)
////                .resize(800, 400)  // Resize to 800x400 pixels
////                .centerCrop()
////                .into(holder.articlePhoto)
////
////            holder.viewFullPostButton.setOnClickListener {
////                val intent = Intent(Intent.ACTION_VIEW, Uri.parse(article.fullPostLink))
////                context.startActivity(intent)
//            }
//        }
//
//        override fun getItemCount():Int{
//            return b
//
//        class ArticleViewHolder(view: View) : RecyclerView.ViewHolder(view) {
//            val author: TextView = view.findViewById(R.id.author)
//            val title: TextView = view.findViewById(R.id.title)
//            val publishingDate: TextView = view.findViewById(R.id.publishingDate)
//            val preview: TextView = view.findViewById(R.id.preview)
//            val authorProfilePicture: ImageView = view.findViewById(R.id.authorProfilePicture)
//            val articlePhoto: ImageView = view.findViewById(R.id.articlePhoto)
//            val viewFullPostButton: Button = view.findViewById(R.id.viewFullPostButton)
//        }
//    }
//
//}
