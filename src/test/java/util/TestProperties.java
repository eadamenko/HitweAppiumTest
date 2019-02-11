package util;

public class TestProperties {

    private String host;
    private String platformVersion;
    private String deviceName;
    private String testURL;


    public void setHost(String host) {
        this.host = host;
    }

    public void setPlatformVersion(String platformVersion) {
        this.platformVersion = platformVersion;
    }

    public void setDeviceName(String deviceName) {
        this.deviceName = deviceName;
    }

    public void setTestURL(String testURL) {
        this.testURL = testURL;
    }


    public String getHost() {
        return host;
    }

    public String getPlatformVersion() {
        return platformVersion;
    }

    public String getDeviceName() {
        return deviceName;
    }

    public String getTestURL() {
        return testURL;
    }

}
