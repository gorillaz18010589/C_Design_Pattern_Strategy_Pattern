package com.dyaco.c_design_pattern_strategy_pattern;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //物件化英雄,沒有帶入實作攻擊的策略時,預設為普通攻擊
        Hero hero = new Hero();
        hero.attack(); // 使用普通攻擊

        //換上技能攻擊策略,攻擊
        hero.changeAttackStrategy(new SkillAttack());
        hero.attack(); // 使用技能攻擊

        //換上道具攻擊策略,攻擊
        hero.changeAttackStrategy(new PropsAttack());
        hero.attack(); //使用道具攻擊
    }
}