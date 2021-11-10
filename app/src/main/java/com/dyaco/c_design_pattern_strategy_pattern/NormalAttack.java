package com.dyaco.c_design_pattern_strategy_pattern;
//一班攻擊行為
import android.util.Log;

public class NormalAttack implements FlightStrategy{

    @Override
    public void execute() {
        Log.v("hank","使用普通攻擊");
    }
}
