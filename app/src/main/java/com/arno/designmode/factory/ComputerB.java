package com.arno.designmode.factory;

import android.util.Log;

/**
 * Created by Arno on 2017/12/11.
 */

public class ComputerB implements IComputer {
    private static final String TAG = "ComputerB";

    public ComputerB(){
        //初始化普通硬件配置
        Log.i(TAG, "ComputerB: 初始化普通硬件配置");
    }

    @Override
    public void work() {
        //普通机工作
        Log.w(TAG, "ComputerB: 普通机工作");
    }

    @Override
    public void study() {
        //普通机学习
        Log.w(TAG, "ComputerB: 普通机学习");
    }
}
