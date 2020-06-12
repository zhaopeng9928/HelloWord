package com.zhaopeng.domain;

/**
 * @Author zhaopeng
 * @Date 2020/6/11
 */
public class Dept {

    private String deptNo;
    private String dName;
    private String loc;

    public String getDeptNo() {
        return deptNo;
    }

    public void setDeptNo(String deptNo) {
        this.deptNo = deptNo;
    }

    public String getdName() {
        return dName;
    }

    public void setdName(String dName) {
        this.dName = dName;
    }

    public String getLoc() {
        return loc;
    }

    public void setLoc(String loc) {
        this.loc = loc;
    }

    @Override
    public String toString() {
        return "Dept{" +
                "deptNo='" + deptNo + '\'' +
                ", dName='" + dName + '\'' +
                ", loc='" + loc + '\'' +
                '}';
    }
}
