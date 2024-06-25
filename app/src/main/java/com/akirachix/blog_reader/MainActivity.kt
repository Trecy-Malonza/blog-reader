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



        }
    }
val article = listOf(
    Blog(
        "Author 1",
        R.drawable.iv,
        "Title 1",
        "2023-06-01",
        "This is the full description of article 1. It contains more than 100 characters to demonstrate the truncation in the preview.",
        R.drawable.user_profile_filled_svgrepo_com,
        "https://link_to_full_post_1.com"
    ),
    Blog(
        "Author 2",
        R.drawable.profile_placeholder,
        "Title 2",
        "2023-06-02",
        "This is the full description of article 2. It contains more than 100 characters to demonstrate the truncation in the preview.",
        R.drawable.computer,
        "https://link_to_full_post_2.com"
    ),
    Blog(
        "Author 3",
        R.drawable.profile_placeholder,
        "Title 3",
        "2023-06-03",
        "This is the full description of article 3. It contains more than 100 characters to demonstrate the truncation in the preview.",
        R.drawable.computer,
        "https://link_to_full_post_3.com"
    ),
    Blog(
        "Author 4",
        R.drawable.profile_placeholder,
        "Title 4",
        "2023-06-04",
        "This is the full description of article 4. It contains more than 100 characters to demonstrate the truncation in the preview.",
        R.drawable.computer,
        "https://link_to_full_post_4.com"
    ),
    Blog(
        "Author 5",
        R.drawable.profile_placeholder,
        "Title 5",
        "2023-06-05",
        "This is the full description of article 5. It contains more than 100 characters to demonstrate the truncation in the preview.",
        R.drawable.computer,
        "https://link_to_full_post_5.com"
    ),
    Blog(
        "Author 6",
        R.drawable.profile_placeholder,
        "Title 6",
        "2023-06-06",
        "This is the full description of article 6. It contains more than 100 characters to demonstrate the truncation in the preview.",
        R.drawable.computer,
        "https://link_to_full_post_6.com"
    ),
    Blog(
        "Author 7",
        R.drawable.profile_placeholder,
        "Title 7",
        "2023-06-07",
        "This is the full description of article 7. It contains more than 100 characters to demonstrate the truncation in the preview.",
        R.drawable.computer,
        "https://link_to_full_post_7.com"
    )
)

blogAdapter = BlogAdapter(this, blogs)
recyclerView.adapter = articleAdapter
}
}




//lateinit var binding: ActivityMainBinding
//override fun onCreate(savedInstanceState: Bundle?) {
//    super.onCreate(savedInstanceState)
//    binding =ActivityMainBinding.inflate(layoutInflater)
//    setContentView(binding.root)
//    binding.rvContacts.layoutManager= LinearLayoutManager(this)
//    displayContacts()