package com.dyaco.c_design_pattern_strategy_pattern;


public class Hero {
    private FlightStrategy flightStrategy;


    public Hero() {
    }

    /**
     * 攻擊.如果沒有放入技能預設為普通攻擊
     */
    public void attack() {
        if (flightStrategy == null) {
            flightStrategy = new NormalAttack();
        }
        flightStrategy.execute();
    }

    //更換攻擊策略,因為有實作FlightStrategy flightStrategy的類別策略都可放進來,各自時做不同
    public void changeAttackStrategy(FlightStrategy flightStrategy) {
        this.flightStrategy = flightStrategy;
    }

}
