/**
 *
 */
package com.rcyc.bonvoy.utils;

/**
 * @author sreejithjn
 */
public class EnvironmentConstants {

    // AES encryption key

//    public static final String ENCRYPTION_KEY = System.getenv("RCYC_KEY_VALUE");


    public static final String DB_URL = CryptoUtil.decrypt(System.getenv("DB_URL"));;
    public static final String DB_USERNAME = CryptoUtil.decrypt(System.getenv("DB_USERNAME"));
    public static final String DB_PASSWORD = CryptoUtil.decrypt(System.getenv("DB_PASSWORD"));


    // Resco constants
    public static final String RESCO_URL = CryptoUtil.decrypt(System.getenv("RESCO_APIURL"));

    public static final String RESCO_NAME = CryptoUtil.decrypt(System.getenv("RESCO_USERNAME"));

    public static final String RESCO_PASSWORD = CryptoUtil.decrypt(System.getenv("RESCO_PASSWORD"));

    public static final Integer CONNECTION_TIMEOUT = Integer.valueOf(System.getenv("CONNECT_TIMEOUT"));

    public static final Integer READ_TIMEOUT = Integer.valueOf(System.getenv("READ_TIMEOUT"));
}