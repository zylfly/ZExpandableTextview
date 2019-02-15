package com.zyl.expandabletextview

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.widget.Toast
import com.zyl.ezlibrary.app.LinkType
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    var a =
        "    我所认识的中国，强大、友好 --习大大。“一带一路”经济带带动了沿线国家的经济发展，促进我国与他国的友好往来和贸易发展，可谓“双赢”，Github地址。http://www.baidu.com 自古以来，中国以和平、友好的面孔示人。汉武帝派张骞出使西域，开辟丝绸之路，增进与西域各国的友好往来。http://www.baidu.com 胡麻、胡豆、香料等食材也随之传入中国，汇集于中华美食。@RNG 漠漠古道，驼铃阵阵，这条路奠定了“一带一路”的基础，让世界认识了中国。"

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        tvTest.setContent(a)

        tvTest.setLinkClickListener { type, content, selfContent ->
            //根据类型去判断
            when (type) {
                LinkType.LINK_TYPE -> Toast.makeText(this, "zyl你点击了链接 内容是：$content", Toast.LENGTH_SHORT).show()
                LinkType.MENTION_TYPE -> Toast.makeText(this, "zyl你点击了@用户 内容是：$content", Toast.LENGTH_SHORT).show()
                LinkType.SELF -> Toast.makeText(this, "zyl你点击了自定义规则 内容是：$content $selfContent", Toast.LENGTH_SHORT).show()
            }
        }
    }
}
