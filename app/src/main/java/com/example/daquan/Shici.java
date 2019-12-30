package com.example.daquan;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class Shici extends AppCompatActivity
{
    private TextView poetry;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_poetry);
        poetry = findViewById(R.id.poetry);
        String tag = getIntent().getStringExtra("tag");
        if (tag.equals("山居秋暝"))
        {
            poetry.setText("山居秋暝\n" +
                    "[唐] 王维\n" +
                    "空山新雨后，天气晚来秋。\n" +
                    "明月松间照，清泉石上流。\n" +
                    "竹喧归浣女，莲动下渔舟。\n" +
                    "随意春芳歇，王孙自可留。");
        } else if (tag.equals("送元二使安西"))
        {
            poetry.setText("送元二使安西\n" +
                    "[唐] 王维\n" +
                    "渭城朝雨浥轻尘，客舍青青柳色新。\n" +
                    "劝君更尽一杯酒，西出阳关无故人。");
        } else if (tag.equals("无题"))
        {
            poetry.setText("无题\n" +
                    "[唐] 李商隐\n" +
                    "相见时难别亦难，东风无力百花残。\n" +
                    "春蚕到死丝方尽，蜡炬成灰泪始干。\n" +
                    "晓镜但愁云鬓改，夜吟应觉月光寒。\n" +
                    "蓬山此去无多路，青鸟殷勤为探看。");
        } else if (tag.equals("夜雨寄北"))
        {
            poetry.setText("夜雨寄北\n" +
                    "[唐] 李商隐\n" +
                    "君问归期未有期，巴山夜雨涨秋池。\n" +
                    "何当共剪西窗烛，却话巴山夜雨时。");
        } else if (tag.equals("清明"))
        {
            poetry.setText("清明\n" +
                    "[唐] 杜牧\n" +
                    "清明时节雨纷纷，路上行人欲断魂。\n" +
                    "借问酒家何处有，牧童遥指杏花村。");
        } else if (tag.equals("山行"))
        {
            poetry.setText("山行\n" +
                    "[唐] 杜牧\n" +
                    "远上寒山石径斜，白云生处有人家。\n" +
                    "停车坐爱枫林晚，霜叶红于二月花。");
        } else if (tag.equals("示儿"))
        {
            poetry.setText("示儿\n" +
                    "[宋] 陆游\n" +
                    "死去元知万事空，但悲不见九州同。\n" +
                    "王师北定中原日，家祭无忘告乃翁。");
        } else if (tag.equals("鹧鸪天"))
        {
            poetry.setText("鹧鸪天·家住苍烟落照间\n" +
                    "[宋] 陆游\n" +
                    "家住苍烟落照间，丝毫尘事不相关。\n" +
                    "斟残玉瀣行穿竹，卷罢黄庭卧看山。\n" +
                    "\n" +
                    "贪啸傲，任衰残，不妨随处一开颜。\n" +
                    "元知造物心肠别，老却英雄似等闲！");
        } else if (tag.equals("归园田居"))
        {
            poetry.setText("归园田居 其一\n" +
                    "[魏晋] 陶渊明\n" +
                    "少无适俗韵，性本爱丘山。\n" +
                    "误落尘网中，一去三十年。(误落 一作：误入)\n" +
                    "羁鸟恋旧林，池鱼思故渊。\n" +
                    "开荒南野际，守拙归园田。\n" +
                    "方宅十余亩，草屋八九间。\n" +
                    "榆柳荫后檐，桃李罗堂前。\n" +
                    "暧暧远人村，依依墟里烟。\n" +
                    "狗吠深巷中，鸡鸣桑树颠。(颠 通 巅)\n" +
                    "户庭无尘杂，虚室有余闲。\n" +
                    "久在樊笼里，复得返自然。");
        } else if (tag.equals("饮酒"))
        {
            poetry.setText("饮酒 其五\n" +
                    "[魏晋] 陶渊明\n" +
                    "结庐在人境，而无车马喧。\n" +
                    "问君何能尔？心远地自偏。\n" +
                    "采菊东篱下，悠然见南山。\n" +
                    "山气日夕佳，飞鸟相与还。\n" +
                    "此中有真意，欲辨已忘言。");
        }

    }
}
