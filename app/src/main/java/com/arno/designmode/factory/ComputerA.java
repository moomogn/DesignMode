package com.arno.designmode.factory;

import android.util.Log;

/**
 * Created by Arno on 2017/12/11.
 */

public class ComputerA implements IComputer {
    private static final String TAG = "ComputerA";

    public ComputerA(){
        //初始化高端硬件配置
        Log.i(TAG, "ComputerA: 初始化高端硬件配置");
    }

    @Override
    public void work() {
        //高端机工作
        Log.w(TAG, "ComputerA: 高端机工作");
    }

    @Override
    public void study() {
        //高端机学习
        Log.w(TAG, "ComputerA: 高端机学习");
    }

}
