package dev.minage.tweets

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import dev.minage.tweets.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        displayTweets()
    }

    fun displayTweets(){
        var tweet = Tweets("Rachael_Minage","Minage","Day 8/100. Today I did inheritance in Kotlin #100DaysOfCode","","","","")
        var tweetOne = Tweets("Fidel_Sikuku","Chidi","Lunch with Elon Musk.#lanes","","","","")
        var tweetTwo = Tweets("Imani_Aimee","Aimee","#Abundance","","","","")
        var tweetThree= Tweets("Kamami","A_Homoseksha","We uki amka ku enda mi na amka kuvuta banji","","","","")


        var tweetingList = listOf(tweet,tweetOne,tweetTwo,tweetThree)
        var contactsAdapter = TweetsRvAdapter(tweetingList)
        binding.rvTweets.layoutManager =  LinearLayoutManager(this)
        binding.rvTweets.adapter = contactsAdapter



    }
}