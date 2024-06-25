package org.example.entity;

import java.time.LocalDate;

public class Account {
    private String accountID;
    private String username;
    private String password;
    private String createBy;
    private String updateBy;
    private LocalDate createAt;
    private LocalDate updateAt;

    public Account(String accountID, String username, String password, String updateBy, String createBy, LocalDate createAt, LocalDate updateAt) {
        this.accountID = accountID;
        this.username = username;
        this.password = password;
        this.updateBy = updateBy;
        this.createBy = createBy;
        this.createAt = createAt;
        this.updateAt = updateAt;
    }

    public String getAccountID() {
        return accountID;
    }

    public void setAccountID(String accountID) {
        this.accountID = accountID;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getCreateBy() {
        return createBy;
    }

    public void setCreateBy(String createBy) {
        this.createBy = createBy;
    }

    public String getUpdateBy() {
        return updateBy;
    }

    public void setUpdateBy(String updateBy) {
        this.updateBy = updateBy;
    }

    public LocalDate getCreateAt() {
        return createAt;
    }

    public void setCreateAt(LocalDate createAt) {
        this.createAt = createAt;
    }

    public LocalDate getUpdateAt() {
        return updateAt;
    }

    public void setUpdateAt(LocalDate updateAt) {
        this.updateAt = updateAt;
    }
}
