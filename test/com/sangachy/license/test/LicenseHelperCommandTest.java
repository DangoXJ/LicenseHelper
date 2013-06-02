package com.sangachy.license.test;

import com.sangachy.license.LicenseHelperCommand;
import com.sangachy.license.task.UploadLicenseTask;
import junit.framework.TestCase;

/**
 * Created with IntelliJ IDEA.
 * User: ShouZhi Zhang
 * Date: 13-6-2
 * Time: 下午11:12
 */
public class LicenseHelperCommandTest extends TestCase {
    public LicenseHelperCommandTest(String name) {
        super(name);
    }

    public void testOne() {
        LicenseHelperCommand licenseHelperCommand = new LicenseHelperCommand();
        String[] str = {"-lp", ""};
        assertEquals(null, licenseHelperCommand.parser(str));
    }

    public void testUploadLicenseTask() {
        LicenseHelperCommand licenseHelperCommand = new LicenseHelperCommand();
        String[] str = {"-u", "-lp", "haha"};
        assertEquals(true, licenseHelperCommand.parser(str) instanceof UploadLicenseTask);
    }
}
