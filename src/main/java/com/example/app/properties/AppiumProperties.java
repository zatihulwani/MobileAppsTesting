package com.example.app.properties;

public class AppiumProperties {


    private String platformName;
    private String deviceName;
    private String udid;
    private String automationName;
    private String app;
    private Integer newCommandTimeout;
    private Boolean autoGrantPermission;
    private String appiumUrl;

    public String getPlatformName() {
        return platformName;
    }

    public void setPlatformName(String platformName) {
        this.platformName = platformName;
    }

    public String getDeviceName() {
        return deviceName;
    }

    public void setDeviceName(String deviceName) {
        this.deviceName = deviceName;
    }

    public String getUdid() {
        return udid;
    }

    public void setUdid(String udid) {
        this.udid = udid;
    }

    public String getAutomationName() {
        return automationName;
    }

    public void setAutomationName(String automationName) {
        this.automationName = automationName;
    }

    public String getApp() {
        return app;
    }

    public void setApp(String app) {
        this.app = app;
    }

    public Integer getNewCommandTimeout() {
        return newCommandTimeout;
    }

    public void setNewCommandTimeout(Integer newCommandTimeout) {
        this.newCommandTimeout = newCommandTimeout;
    }

    public Boolean getAutoGrantPermission() {
        return autoGrantPermission;
    }

    public void setAutoGrantPermission(Boolean autoGrantPermission) {
        this.autoGrantPermission = autoGrantPermission;
    }

    public String getAppiumUrl() {
        return appiumUrl;
    }

    public void setAppiumUrl(String appiumUrl) {
        this.appiumUrl = appiumUrl;
    }
}
