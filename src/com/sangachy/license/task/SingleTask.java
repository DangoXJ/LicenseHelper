package com.sangachy.license.task;

import java.util.Hashtable;

/**
 * Created with IntelliJ IDEA.
 * User: ShouZhi Zhang
 * Date: 13-6-2
 * Time: 下午5:47
 */
public abstract class SingleTask {

    /**
     * Task 预处理
     */
    public void preExecute() {
        this.preExecute(null);
    }

    /**
     * Task 预处理，带参数
     */
    public abstract void preExecute(Hashtable config);

    /**
     * Task 处理
     */
    public abstract void excute();

    /**
     * Task 后置处理
     */
    public abstract void aftExcute();
}
