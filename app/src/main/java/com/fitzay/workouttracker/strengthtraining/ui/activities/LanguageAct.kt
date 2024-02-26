package com.fitzay.workouttracker.strengthtraining.ui.activities

import android.app.ActivityOptions
import android.content.Context
import android.content.Intent
import android.content.SharedPreferences
import android.os.Build
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View
import android.widget.RadioButton
import androidx.databinding.DataBindingUtil
import androidx.recyclerview.widget.LinearLayoutManager
import com.fitzay.workouttracker.strengthtraining.R
import com.fitzay.workouttracker.strengthtraining.core.AppController
import com.fitzay.workouttracker.strengthtraining.core.utils.SharedPreferencesHelper
import com.fitzay.workouttracker.strengthtraining.core.utils.setLocale
import com.fitzay.workouttracker.strengthtraining.databinding.ActivityLanguageBinding
import com.fitzay.workouttracker.strengthtraining.domain.models.LanguageM
import com.fitzay.workouttracker.strengthtraining.ui.MainActivity
import com.fitzay.workouttracker.strengthtraining.ui.adapters.LanguageShowAdapter
import com.fitzay.workouttracker.strengthtraining.ui.adapters.RingToneShowAdapter
import com.fitzay.workouttracker.strengthtraining.ui.callback.LanguageItemClick
import com.fitzay.workouttracker.strengthtraining.ui.questions.start.GenderActivity
import com.fitzay.workouttracker.strengthtraining.ui.questions.start.PartShouldFocusActivity
import com.google.android.gms.ads.AdListener
import com.google.android.gms.ads.AdLoader
import com.google.android.gms.ads.AdRequest
import com.google.android.gms.ads.LoadAdError
import com.google.android.gms.ads.nativead.NativeAdOptions
import java.util.Locale

class LanguageAct : AppCompatActivity(),LanguageItemClick {


    private lateinit var binding:ActivityLanguageBinding
    private  var adapter:LanguageShowAdapter?=null
    private  var list=ArrayList<LanguageM>()
    lateinit var sharedPreferencesHelper:SharedPreferencesHelper

    var lang="English"
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = DataBindingUtil.setContentView(this, R.layout.activity_language)

        val sharedPref = getSharedPreferences("myPrefs", Context.MODE_PRIVATE)



        list.add(LanguageM("English", R.drawable.english__usa_, false))
        list.add(LanguageM("Arabic", R.drawable.arabic, false))
        list.add(LanguageM("Hindi", R.drawable.india__in__1, false))
        list.add(LanguageM("Mandarin Chinese", R.drawable.mandarin_chinese, false))
        list.add(LanguageM("Spanish", R.drawable.spanish, false))
        list.add(LanguageM("French", R.drawable.french, false))
        list.add(LanguageM("Italian", R.drawable.italy__it__1, false))
        list.add(LanguageM("Russian", R.drawable.russian, false))
        list.add(LanguageM("Portuguese", R.drawable.portugal, false))
        list.add(LanguageM("Japanese", R.drawable.japanese, false))


        binding.apply {

            if (AppController.fitzayModel != null && AppController.fitzayModel?.FitzayNativeName?.showAd == true) {
                clAds.visibility = View.VISIBLE
                loadAdaptiveNative()
            } else {
                clAds.visibility = View.GONE
            }


            sharedPreferencesHelper = SharedPreferencesHelper(this@LanguageAct)
            var la=intent.getStringExtra("invisibleKey")
            if (la=="invisible")
            {
                  ivBack.visibility=View.INVISIBLE
            }
            else {
                ivBack.visibility = View.VISIBLE
            }
        languageRv.layoutManager = LinearLayoutManager(
            this@LanguageAct,
            LinearLayoutManager.VERTICAL,
            false
        )
        adapter = LanguageShowAdapter(
            this@LanguageAct,
            list,this@LanguageAct
        )
        languageRv.adapter = adapter

            tick.setOnClickListener {
                when(SharedPreferencesHelper(this@LanguageAct).getPosition()) {

                    0 -> lang = "en"
                    1 -> lang = "ar"
                    2 -> lang = "hi"
                    3 -> lang = "zh"
                    4 -> lang = "es"
                    5 -> lang = "fr"
                    6 -> lang = "it"
                    7 -> lang = "ru"
                    8 -> lang = "pt"
                    9 -> lang = "ja"

                }
                setLocale(this@LanguageAct,lang)
                val editor = sharedPref.edit()
                editor.putString("key", lang)
                editor.apply()

                if (la=="invisible")
                {
                    val intent = Intent(this@LanguageAct, ProfileAct::class.java).apply {
                        Intent.FLAG_ACTIVITY_SINGLE_TOP
                    }
                    startActivity(intent)
                }
                else {
                    val intent = Intent(this@LanguageAct, MainActivity::class.java).apply {
                        Intent.FLAG_ACTIVITY_SINGLE_TOP
                    }
                    startActivity(intent)
                    finish()
                }



            }

            ivBack.setOnClickListener {
               onBackPressed()
            }


    }
    }
    override fun itemClick(position: Int, model: LanguageM, check: RadioButton) {

        sharedPreferencesHelper.setPosition(position)

        adapter!!.notifyDataSetChanged()

        Log.i("TAG", "itemClick: "+model.languageName)
        lang=model.languageName
    }

    private fun loadAdaptiveNative() {

        binding.apply {
            layoutAd.visibility = View.GONE

            val template = if (AppController.fitzayModel?.FitzayNativeLanguage?.ctalocation == "up") {
                plannerTemplateDown.visibility = View.GONE
                plannerTemplateUp.visibility = View.VISIBLE
                plannerTemplateUp
            } else {
                plannerTemplateDown.visibility = View.VISIBLE
                plannerTemplateUp.visibility = View.GONE
                plannerTemplateDown
            }

            if (AppController.fitzayModel != null) {
                val adLoader =
                    AdLoader.Builder(
                        this@LanguageAct,
                        AppController.fitzayModel!!.FitzayNativeLanguage.adID
                    )
                        .forNativeAd { NativeAd: com.google.android.gms.ads.nativead.NativeAd ->
                            template.setNativeAd(NativeAd)
                            skeletonLayout.visibility = View.GONE
                            clAds.visibility = View.VISIBLE
                            layoutAd.visibility = View.VISIBLE

                        }.withAdListener(object : AdListener() {
                            override fun onAdFailedToLoad(loadAdError: LoadAdError) {
                                super.onAdFailedToLoad(loadAdError)
                                clAds.visibility = View.GONE
                                layoutAd.visibility = View.GONE
                            }
                        })
                        .withNativeAdOptions(
                            NativeAdOptions.Builder()
                                .setRequestCustomMuteThisAd(true)
                                .setAdChoicesPlacement(NativeAdOptions.ADCHOICES_TOP_LEFT)
                                .build()
                        )
                        .build()

                adLoader.loadAd(AdRequest.Builder().build())
            }
        }

    }

}