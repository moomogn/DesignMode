package com.arno.designmode.factory;

import android.util.Log;

/**
 * Created by Arno on 2017/12/11.
 */

public class SimpleFactory {
    private static final String TAG = "ComputerFactory";

    public static IComputer createProduct(String arg){
        IComputer product = null;
        switch (arg) {
            case "A":
                product = new ComputerA();
                // 下载学习软件 M
                Log.i(TAG, "createProduct: 下载学习软件 M");
                // 下载工作软件 N
                Log.i(TAG, "createProduct: 下载工作软件 N");
                // init something

                break;
            case "B":
                product = new ComputerB();
                // 下载学习软件 X
                Log.i(TAG, "createProduct: 下载学习软件 X");
                // 下载工作软件 Y
                Log.i(TAG, "createProduct: 下载工作软件 Y");
                // init something

                break;
            default:
                throw new RuntimeException("product not exist for arg: "+arg);
        }
        return product;
    }

}
