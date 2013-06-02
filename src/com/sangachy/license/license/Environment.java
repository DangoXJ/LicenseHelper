package com.sangachy.license.license;

import java.io.File;

/**
 * Created with IntelliJ IDEA.
 * User: ShouZhi Zhang
 * Date: 13-6-2
 * Time: 下午9:07
 */

public class Environment {
    /**
     * 0
     */
    private String meidCGP = null;
    /**
     * 8
     */
    private String meidUSN = null;
    /**
     * USN2068
     */
    private String envId = null;
    /**
     * 64.2.66.
     */
    private String envIp = null;
    /**
     * admin
     */
    private String lmtUser = null;
    /**
     * Huaweisy@2G
     */
    private String lmtPasswd = null;
    /**
     * root
     */
    private String sshUser = null;
    /**
     * cnp200@HW
     */
    private String sshPasswd = null;
    /**
     * ≥ı ºªØ ±¥”ª∑æ≥ªÒ»°°£
     */
    private String ESN = null;
    /**
     * 9090 status
     */
    private String port9090Status = null;

    public Environment(String meidCGP, String meidUSN, String envId, String envIp,
                       String lmtUser, String lmtPasswd, String sshUser, String sshPasswd) {
        this.meidCGP = meidCGP;
        this.meidUSN = meidUSN;
        this.envId = envId;
        this.envIp = envIp;
        this.lmtUser = lmtUser;
        this.lmtPasswd = lmtPasswd;
        this.sshUser = sshUser;
        this.sshPasswd = sshPasswd;
        this.ESN = initESN();
        this.port9090Status = init9090Status();
    }

    public Environment() {

    }

    public String getESN() {
        return this.ESN;
    }

    public void preUpload() {

    }

    public boolean upload(File file) {

        return true;
    }

    public void aftUpload() {

    }

    public void readFromXML(String path) {

    }

    public void saveToXML(String path) {

    }

    private String initESN() {
        return null;
    }

    private String init9090Status() {
        return null;
    }


}
