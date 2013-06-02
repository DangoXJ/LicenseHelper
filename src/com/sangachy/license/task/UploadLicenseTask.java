package com.sangachy.license.task;

import com.sangachy.license.license.Environment;

import java.io.File;
import java.util.ArrayList;
import java.util.Hashtable;
import java.util.List;

/**
 * Created with IntelliJ IDEA.
 * User: ShouZhi Zhang
 * Date: 13-6-2
 * Time: 下午5:50
 */
public class UploadLicenseTask extends SingleTask {

    private String source;
    private String destination;
    private List<File> sources = new ArrayList<File>();
    private List<Environment> envs = new ArrayList<Environment>();

    /**
     * Task 预处理，带参数
     */
    @Override
    public void preExecute(Hashtable config) {
    }

    /**
     * Task 处理
     */
    @Override
    public void excute() {
    }

    /**
     * Task 后置处理
     */
    @Override
    public void aftExcute() {
    }
}
