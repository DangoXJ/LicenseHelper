package com.sangachy.license;

/**
 * Created with IntelliJ IDEA.
 * User: ShouZhi Zhang
 * Date: 13-6-2
 * Time: 下午6:46
 */
public class Main {
    public static void main(String[] args) {
        LicenseHelperCommand command = new LicenseHelperCommand();
        String[] str = {"-lp", ""};
        LicenseHelperCommand licenseHelperCommand = new LicenseHelperCommand();
        licenseHelperCommand.parser(str);
    }
}
