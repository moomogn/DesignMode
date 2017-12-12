package com.arno.designmode.factory;

import android.util.Log;

/**
 * Created by Arno on 2017/12/12.
 */

public class LenovoComputerFactory implements IComputerFactory {
    private static final String TAG = "LenovoComputerFactory";

    public LenovoComputerFactory(){
        Log.i(TAG, "LenovoComputerFactory: 联想电脑工厂初始化");
    }
    @Override
    public IComputer createComputerA() {
        Log.i(TAG, "createComputerA: 联想电脑工厂制造高级配置电脑");
        return new ComputerA();
    }

    @Override
    public IComputer createComputerB() {
        Log.i(TAG, "createComputerB: 联想电脑工厂制造普通配置电脑");
        return new ComputerB();
    }
}
