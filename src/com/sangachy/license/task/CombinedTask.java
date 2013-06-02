package com.sangachy.license.task;

import java.util.ArrayList;
import java.util.Hashtable;
import java.util.List;

/**
 * Created with IntelliJ IDEA.
 * User: ShouZhi Zhang
 * Date: 13-6-2
 * Time: 下午5:57
 */
public class CombinedTask extends SingleTask {

    private List<SingleTask> tasks = new ArrayList<SingleTask>();

    public void addTask(SingleTask task) {
        this.tasks.add(task);
    }

    /**
     * Task 预处理，带参数
     */
    @Override
    public void preExecute(Hashtable config) {
    }

    /**
     * CombinedTask 处理
     */
    @Override
    public void excute() {
        for (SingleTask next : tasks) {
            next.excute();
        }
    }

    /**
     * CombinedTask 后置处理
     */
    @Override
    public void aftExcute() {
        for (SingleTask next : tasks) {
            next.aftExcute();
        }
    }
}
