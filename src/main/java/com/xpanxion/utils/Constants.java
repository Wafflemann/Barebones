package com.xpanxion.utils;

public class Constants {
    public static final String FIREFOX = "Firefox";
    public static final String CHROME = "Chrome";
    public static final String INTERNET_EXPLORER = "IE";
    public static final String BASE_URL = "http://xpanxion.com/";
    public static final String BROWSER = System.getProperty("browser");
    public static final String OS = System.getProperty("os.name");

    public static final Boolean ON_GRID = Boolean.valueOf(System.getProperty("onGrid", "false"));

    public static final String FIREFOX_PATH = System.getProperty("user.dir");
    public static final String CHROME_PATH = System.getProperty("user.dir") + "/chromedriver" + (OS.startsWith("Windows")?".exe":"");
    public static final String INTERNET_EXPLORER_PATH = System.getProperty("user.dir") + "\\IEDriverServer.exe";
    public static final String GRID_IP = System.getProperty("gridIP");
}

