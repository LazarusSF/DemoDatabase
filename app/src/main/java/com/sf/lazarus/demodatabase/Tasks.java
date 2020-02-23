package com.sf.lazarus.demodatabase;

/**
 * Created by LAZARUS on 27-09-2017.
 */

public class Tasks {
    private int _ID;
    private String _taskname;

    public Tasks(){

    }
    public Tasks(String taskname){
        this._taskname=taskname;
    }

    public int get_ID() {
        return _ID;
    }

    public String get_taskname() {
        return _taskname;
    }

    public void set_ID(int _ID) {
        this._ID = _ID;
    }

    public void set_taskname(String _taskname) {
        this._taskname = _taskname;
    }
}
