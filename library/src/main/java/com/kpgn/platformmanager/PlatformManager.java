package com.kpgn.platformmanager;

/**
 * <b>The core public access point to the PlatformManager library.</b>
 * <br/><br/>
 * Features:<br/>
 *  - checks if platform is BlackBerry / Android. <br/>
 *
 * @author Gokul Nath KP
 **/
public class PlatformManager {

    /**
     * Gets if platform version is BlackBerry.
     *
     * @return Returns boolean value.
     */
    public static boolean isBlackBerry() {
        return android.os.Build.BRAND.toLowerCase().contains("blackberry");
    }

    /**
     * Gets if platform version is Android.
     *
     * @return Returns boolean value.
     */
    public static boolean isAndroid() {
        return !isBlackBerry();
    }
}
