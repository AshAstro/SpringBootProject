package com.springboot.model;

public class AccountInfo {
    private int userID;
    private String userFullName;
    private int accountNo;
    private String accountType;
    private String accountStatus;
    private String accountCreateDate;

    public AccountInfo() {
        super();
    }

    public AccountInfo(int userID, String userFullName, int accountNo, String accountType, String accountStatus, String accountCreateDate) {
        this.userID = userID;
        this.userFullName = userFullName;
        this.accountNo = accountNo;
        this.accountType = accountType;
        this.accountStatus = accountStatus;
        this.accountCreateDate = accountCreateDate;
    }

    public int getUserID() {
        return userID;
    }

    public void setUserID(int userID) {
        this.userID = userID;
    }

    public String getUserFullName() {
        return userFullName;
    }

    public void setUserFullName(String userFullName) {
        this.userFullName = userFullName;
    }

    public int getAccountNo() {
        return accountNo;
    }

    public void setAccountNo(int accountNo) {
        this.accountNo = accountNo;
    }

    public String getAccountType() {
        return accountType;
    }

    public void setAccountType(String accountType) {
        this.accountType = accountType;
    }

    public String getAccountStatus() {
        return accountStatus;
    }

    public void setAccountStatus(String accountStatus) {
        this.accountStatus = accountStatus;
    }

    public String getAccountCreateDate() {
        return accountCreateDate;
    }

    public void setAccountCreateDate(String accountCreateDate) {
        this.accountCreateDate = accountCreateDate;
    }

    @Override
    public String toString() {
        return "AccountInfo{" +
                "userID=" + userID +
                ", userFullName='" + userFullName + '\'' +
                ", accountNo=" + accountNo +
                ", accountType='" + accountType + '\'' +
                ", accountStatus='" + accountStatus + '\'' +
                ", accountCreateDate='" + accountCreateDate + '\'' +
                '}';
    }
}
