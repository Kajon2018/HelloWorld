package com.maidi.helloworld;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Administrator on 2017/8/16.
 */

public class Sandbox {
    private List<String> mGreentings = new ArrayList<String>();
//    /*String*/

    public Sandbox() {
    }

    public List<String> getGreentings() {
        return mGreentings;
    }

    public void setGreentings(List<String> greentings) {
        mGreentings = greentings;

    }

}