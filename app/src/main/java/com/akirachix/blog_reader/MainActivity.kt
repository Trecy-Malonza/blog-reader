package com.akirachix.blog_reader

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import androidx.recyclerview.widget.LinearLayoutManager
import com.akirachix.blog_reader.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        binding.rvRecyclerView.layoutManager=LinearLayoutManager(this)
        displayArticle()



        }
    fun displayArticle(){
        val articles = listOf(
            Blog(
               "Author 1",
                "Title 1",
                "2023-06-01",
                "This is the full description of article 1. It contains more than 100 characters to demonstrate the truncation in the preview.",
                "R.drawable.laptop",
                "https://link_to_full_post_1.com"
            ),
            Blog(
                "Author 2",
                "Title 2",
                "2023-06-02",
                "This is the full description of article 2. It contains more than 100 characters to demonstrate the truncation in the preview.",
                "R.drawable.laptop",
                "https://link_to_full_post_2.com"

            ),
            Blog(
                "Author 3",
                "Title 3",
                "2023-06-03",
                "This is the full description of article 3. It contains more than 100 characters to demonstrate the truncation in the preview.",
                "R.drawable.laptop",
                "https://link_to_full_post_3.com"
            ),
            Blog(
                "Author 4",
                "Title 4",
                "2023-06-04",
                "This is the full description of article 3. It contains more than 100 characters to demonstrate the truncation in the preview.",
                "R.drawable.laptop",
                "https://link_to_full_post_4.com"
            ),
            Blog(
                "Author 5",
                "Title 5",
                "2023-06-05",
                "This is the full description of article 4. It contains more than 100 characters to demonstrate the truncation in the preview.",
                "R.drawable.laptop",
                "https://link_to_full_post_5.com"
            ),
            Blog(
                "Author 6",
                "Title 6",
                "2023-06-06",
                "This is the full description of article 5. It contains more than 100 characters to demonstrate the truncation in the preview.",

                "R.drawable.laptop",
                "https://link_to_full_post_6.com"
            )
        )
//        val blogList = listOf(articles)
        val blogAdapter =BlogAdapter(articles)
        binding.rvRecyclerView.adapter =blogAdapter
    }
    }
