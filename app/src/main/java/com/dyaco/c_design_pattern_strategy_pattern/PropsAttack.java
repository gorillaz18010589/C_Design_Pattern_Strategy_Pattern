package com.dyaco.c_design_pattern_strategy_pattern;
//道具行為
import android.util.Log;

public class PropsAttack implements FlightStrategy {
    @Override
    public void execute() {
        Log.v("hank","使用道具攻擊");

    }
}
