package com.sangachy.license;

import com.sangachy.license.task.ApplyLicenseTask;
import com.sangachy.license.task.SingleTask;
import com.sangachy.license.task.UploadLicenseTask;
import org.apache.commons.cli.*;

import java.util.Hashtable;

/**
 * Created with IntelliJ IDEA.
 * User: ShouZhi Zhang
 * Date: 13-6-2
 * Time: 下午6:43
 */
public class LicenseHelperCommand {
    private Options options = new Options();

    private void printHelp() {
        HelpFormatter helpFormatter = new HelpFormatter();
        helpFormatter.printHelp("Options", options);
    }

    public static void main(String[] args) {
        String[] arg = {"-Dsfa", "afsd"};
        LicenseHelperCommand licenseHelperCommand = new LicenseHelperCommand();
        licenseHelperCommand.parser(arg);
    }

    public SingleTask parser(String[] args) {

        options.addOption("h", "help", false, "帮助信息");

        options.addOption("u", "upload", false, "上传License");
        options.addOption("a", "apply", false, "申请License");


        options.addOption("tp", "temp-path", true, "License 模板路径");
        options.addOption("lp", "lic-path", true, "License 保存路径");

        options.addOption("e", "esn-key", true, "ESN 号键值");
        options.addOption("ek", "env-key", true, "环境键值");


        PosixParser basicParser = new PosixParser();
        CommandLine commandLine;

        try {
            commandLine = basicParser.parse(options, args);

            if (commandLine.getOptions().length <= 0) {
                System.out.println("输入参数小于0！");
                printHelp();
                return null;
            }


            if (commandLine.getOptions().length > 0) {

                if (commandLine.hasOption("h")) {
                    printHelp();
                    return null;
                }

                if (!commandLine.hasOption("a") || !commandLine.hasOption("u")) {
                    System.out.println("疑？你不告诉我要做什么我怎么办呢？！");
                    printHelp();
                    return null;
                }

                if (commandLine.hasOption("a")) {
                    return getApplyLicenseTask(commandLine);
                }

                if (commandLine.hasOption("u")) {
                    return getUploadTask(commandLine);
                }

            }
            return null;
        } catch (ParseException e) {
            System.out.println(e.getMessage());
            printHelp();
            return null;
        }
    }

    public SingleTask getUploadTask(CommandLine commandLine) {
        String licensePath = commandLine.getOptionValue("lp");
        if (null == licensePath) {
            System.out.println("呀，你竟然木有指定License 路径，囧。");
            return null;
        }

        String envKey = commandLine.getOptionValue("ek");
        if (null == envKey) {
            System.out.println("你木有指定特定的环境，所以将会上传到所有的环境");
            //envKey = "";
        }
        Hashtable hashTable = new Hashtable();
        hashTable.put("", licensePath);
        hashTable.put(" ", envKey);
        SingleTask task = new UploadLicenseTask();
        task.preExecute(hashTable);
        task.excute();
        task.aftExcute();
        return task;
    }

    public SingleTask getApplyLicenseTask(CommandLine commandLine) {
        String templatePath = commandLine.getOptionValue("tp");
        if (null == templatePath) {
            System.out.println("没有指定License 模板路径,用默认路径代替。");
            // templatePath = "";
        }

        String esnKey = commandLine.getOptionValue("e");
        if (null == esnKey) {
            System.out.println("默认使用PS 10.0 测试最新ESN。");
            // esnKey = "";
        }
        Hashtable hashTable = new Hashtable();
        hashTable.put("", templatePath);
        hashTable.put(" ", esnKey);
        SingleTask task = new ApplyLicenseTask();

        task.preExecute(hashTable);
        task.excute();
        task.aftExcute();
        return task;
    }
}
