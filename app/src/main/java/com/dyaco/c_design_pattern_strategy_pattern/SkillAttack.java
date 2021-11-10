package com.dyaco.c_design_pattern_strategy_pattern;
//技能行為
import android.util.Log;

public class SkillAttack implements FlightStrategy{
    @Override
    public void execute() {
        Log.v("hank","使用技能攻擊");

    }
}
