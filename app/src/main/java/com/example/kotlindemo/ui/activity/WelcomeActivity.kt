//package com.example.kotlindemo.ui.activity
//
//import BaseActivity
//import android.content.Intent
//import android.os.Bundle
//import androidx.viewpager2.widget.ViewPager2
//import kotlinx.android.synthetic.main.activity_welcome.*
//import com.example.kotlindemo.base.viewmodel.BaseViewModel
//import com.example.kotlindemo.R
//import com.example.kotlindemo.app.util.CacheUtil
//import com.example.kotlindemo.app.util.SettingUtil
//import com.example.kotlindemo.databinding.ActivityWelcomeBinding
//import com.example.kotlindemo.ext.view.gone
//import com.example.kotlindemo.ext.view.visible
//
///**
// * 作者　: Koma
// * 　: 2020/2/22
// * 描述　:
// */
//@Suppress("DEPRECATED_IDENTITY_EQUALS")
//class WelcomeActivity : BaseActivity<BaseViewModel, ActivityWelcomeBinding>() {
//
//    private var resList = arrayOf("唱", "跳", "r a p")
//
//
//    override fun layoutId() = R.layout.activity_welcome
//
//    override fun initView(savedInstanceState: Bundle?) {
//        //防止出现按Home键回到桌面时，再次点击重新进入该界面bug
//        if (intent.flags and Intent.FLAG_ACTIVITY_BROUGHT_TO_FRONT !== 0) {
//            finish()
//            return
//        }
//        welcome_baseview.setBackgroundColor(SettingUtil.getColor(this))
//        if (CacheUtil.isFirst()) {
//            //是第一次打开App 显示引导页
//            welcome_image.gone()
//            mViewPager.apply {
//                adapter = WelcomeBannerAdapter()
//                setLifecycleRegistry(lifecycle)
//                registerOnPageChangeCallback(object : ViewPager2.OnPageChangeCallback() {
//                    override fun onPageSelected(position: Int) {
//                        super.onPageSelected(position)
//                        if (position == resList.size - 1) {
//                            welcomeJoin.visible()
//                        } else {
//                            welcomeJoin.gone()
//                        }
//                    }
//                })
//                create(resList.toList())
//            }
//        } else {
//            //不是第一次打开App 0.3秒后自动跳转到主页
//            welcome_image.visible()
//            mViewPager.postDelayed({
//                startActivity(Intent(this, MainActivity::class.java))
//                finish()
//                //带点渐变动画
//                overridePendingTransition(android.R.anim.fade_in, android.R.anim.fade_out)
//            }, 300)
//        }
//    }
//
//    inner class ProxyClick {
//        fun toMain() {
//            CacheUtil.setFirst(false)
//            startActivity(Intent(this@WelcomeActivity, MainActivity::class.java))
//            finish()
//            //带点渐变动画
//            overridePendingTransition(android.R.anim.fade_in, android.R.anim.fade_out)
//        }
//    }
//
//}