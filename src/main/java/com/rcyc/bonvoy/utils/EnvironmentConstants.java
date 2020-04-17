/**
 *
 */
package com.rcyc.bonvoy.utils;

/**
 * @author Muhammed Aboobacker Created :28-Nov-2018
 */
public class EnvironmentConstants {

    // AES encryption key

//    public static final String ENCRYPTION_KEY = System.getenv("RCYC_KEY_VALUE");

    // Resco constants
    public static final String RESCO_URL = System.getenv("RESCO_APIURL");

    public static final String RESCO_NAME = System.getenv("RESCO_USERNAME");

    public static final String RESCO_PASSWORD = System.getenv("RESCO_PASSWORD");
//    public static final String RESCO_PASSWORD = CryptoUtil.decrypt(System.getenv("RESCO_PASSWORD"));
//
//    public static final String AGENCY_ID = System.getenv("RESCO_AGENCY_ID");
//
//    public static final int TOKEN_TIMEOUT = Integer.parseInt(System.getenv("TOKEN_TIMEOUT"));
//
//    public static final int JWT_TIMEOUT = Integer.parseInt(System.getenv("JWT_TIMEOUT"));
//
//    public static final String BASE_URL = System.getenv("BASE_URL");
//
//    // Database environment constants
//
//    public static final String DB_URL = CryptoUtil.decrypt(System.getenv("DB_URL"));
//
//    public static final String DB_USERNAME = CryptoUtil.decrypt(System.getenv("DB_USERNAME"));
//
//    public static final String DB_PASSWORD = CryptoUtil.decrypt(System.getenv("DB_PASSWORD"));
//
//    // Mail environment constants
//
//    public static final String ENABLE_MAIL_NOTIFICATION = System.getenv("ENABLE_MAIL_NOTIFICATION");
//
//    public static final String MAIL_TO = System.getenv("ALERT_MAIL_TO");
//
//    public static final String MAIL_FROM = System.getenv("ALERT_MAIL_FROM");
//
//    public static final String MAIL_PASSWORD = CryptoUtil.decrypt(System.getenv("MAIL_PASSWORD"));
//
//    public static final String MAIL_USER = CryptoUtil.decrypt(System.getenv("MAIL_USER"));
//
//    public static final String SMTP_PORT = System.getenv("SMTP_PORT");
//
//    public static final String SMTP_HOST = System.getenv("SMTP_HOST");
//
////	public static final String BOOKING_STATUS_VERIFIED=System.getenv("BOOKING_STATUS_VERIFIED");
//
//    //
    public static final Integer CONNECTION_TIMEOUT = Integer.valueOf(System.getenv("CONNECT_TIMEOUT"));

    public static final Integer READ_TIMEOUT = Integer.valueOf(System.getenv("READ_TIMEOUT"));
//    public static final String ENABLE_RESCO_AUDIT = System.getenv("ENABLE_RESCO_AUDIT");
//
//    public static final String SPA_ACTIVE =  System.getenv("SPA_ACTIVE");
//
//
//	/*public static final Integer EXCURSION_RESERVE_BEFORE_VOYAGE_DEPARTURE_BUSINESS_MIN_DAYS = Integer
//			.valueOf(System.getenv("EXCURSION_RESERVE_BEFORE_VOYAGE_DEPARTURE_BUSINESS_MIN_DAYS"));
//
//	public static final Integer EXCURSION_RESERVE_BEFORE_VOYAGE_DEPARTURE_BUSINESS_MAX_DAYS = Integer
//			.valueOf(System.getenv("EXCURSION_RESERVE_BEFORE_VOYAGE_DEPARTURE_BUSINESS_MAX_DAYS"));
//
//	public static final Integer OVERLAPPING_EXCURSION_TIMELIMIT_IN_MINUTES = Integer
//			.valueOf(System.getenv("OVERLAPPING_EXCURSION_TIMELIMIT_IN_MINUTES"));*/
//
//
//
//    public static final String ITEM_ID_NON_RCYC_AIR_FLIGHTNO = System.getenv("ITEM_ID_NON_RCYC_AIR_FLIGHTNO");
//    public static final String ITEM_ID_NON_RCYC_AIR_RECORDLOCATOR = System.getenv("ITEM_ID_NON_RCYC_AIR_RECORDLOCATOR");
//    public static final String ITEM_ID_NON_RCYC_AIR_AIRLINE = System.getenv("ITEM_ID_NON_RCYC_AIR_AIRLINE");
//    public static final String ITEM_ID_NON_RCYC_AIR_DEPTR_AIRPORT = System.getenv("ITEM_ID_NON_RCYC_AIR_DEPTR_AIRPORT");
//    public static final String ITEM_ID_NON_RCYC_AIR_DEPTR_DATE = System.getenv("ITEM_ID_NON_RCYC_AIR_DEPTR_DATE");
//    public static final String ITEM_ID_NON_RCYC_AIR_DEPTR_TIME = System.getenv("ITEM_ID_NON_RCYC_AIR_DEPTR_TIME");
//    public static final String ITEM_ID_NON_RCYC_AIR_ARVL_AIRPORT = System.getenv("ITEM_ID_NON_RCYC_AIR_ARVL_AIRPORT");
//    public static final String ITEM_ID_NON_RCYC_AIR_ARVL_DATE = System.getenv("ITEM_ID_NON_RCYC_AIR_ARVL_DATE");
//    public static final String ITEM_ID_NON_RCYC_AIR_ARVL_TIME = System.getenv("ITEM_ID_NON_RCYC_AIR_ARVL_TIME");
//    public static final String ITEM_ID_NON_RCYC_AIR_SEAT_ASSIGNMENT = System.getenv("ITEM_ID_NON_RCYC_AIR_SEAT_ASSIGNMENT");
//    public static final String ITEM_ID_NON_RCYC_AIR_DURATION = System.getenv("ITEM_ID_NON_RCYC_AIR_DURATION");
//    public static final String ITEM_ID_NON_RCYC_AIR_CLASSNAME = System.getenv("ITEM_ID_NON_RCYC_AIR_CLASSNAME");
//    public static final String ITEM_ID_NON_RCYC_AIR_ETICKET_NO = System.getenv("ITEM_ID_NON_RCYC_AIR_ETICKET_NO");
//    public static final String ITEM_ID_NON_RCYC_AIR_RATE = System.getenv("ITEM_ID_NON_RCYC_AIR_RATE");
//    public static final String ITEM_ID_NON_RCYC_AIR_TYPE = System.getenv("ITEM_ID_NON_RCYC_AIR_TYPE");
//    public static final String ITEM_ID_RCYC_AIR_FLIGHTNO = System.getenv("ITEM_ID_RCYC_AIR_FLIGHTNO");
//    public static final String ITEM_ID_RCYC_AIR_RECORDLOCATOR = System.getenv("ITEM_ID_RCYC_AIR_RECORDLOCATOR");
//    public static final String ITEM_ID_RCYC_AIR_AIRLINE = System.getenv("ITEM_ID_RCYC_AIR_AIRLINE");
//    public static final String ITEM_ID_RCYC_AIR_DEPTR_AIRPORT = System.getenv("ITEM_ID_RCYC_AIR_DEPTR_AIRPORT");
//    public static final String ITEM_ID_RCYC_AIR_DEPTR_DATE = System.getenv("ITEM_ID_RCYC_AIR_DEPTR_DATE");
//    public static final String ITEM_ID_RCYC_AIR_DEPTR_TIME = System.getenv("ITEM_ID_RCYC_AIR_DEPTR_TIME");
//    public static final String ITEM_ID_RCYC_AIR_ARVL_AIRPORT = System.getenv("ITEM_ID_RCYC_AIR_ARVL_AIRPORT");
//    public static final String ITEM_ID_RCYC_AIR_ARVL_DATE = System.getenv("ITEM_ID_RCYC_AIR_ARVL_DATE");
//    public static final String ITEM_ID_RCYC_AIR_ARVL_TIME = System.getenv("ITEM_ID_RCYC_AIR_ARVL_TIME");
//    public static final String ITEM_ID_RCYC_AIR_SEAT_ASSIGNMENT = System.getenv("ITEM_ID_RCYC_AIR_SEAT_ASSIGNMENT");
//    public static final String ITEM_ID_RCYC_AIR_CLASSNAME = System.getenv("ITEM_ID_RCYC_AIR_CLASSNAME");
//    public static final String ITEM_ID_RCYC_AIR_ETICKET_NO = System.getenv("ITEM_ID_RCYC_AIR_ETICKET_NO");
//    public static final String ITEM_ID_RCYC_AIR_TYPE = System.getenv("ITEM_ID_RCYC_AIR_TYPE");
//    public static final String NON_RCYC_IB_FLIGHT_CODE = System.getenv("NON_RCYC_IB_FLIGHT_CODE");
//    public static final String NON_RCYC_OB_FLIGHT_CODE = System.getenv("NON_RCYC_OB_FLIGHT_CODE");
//    public static final String RCYC_IB_FLIGHT_CODE = System.getenv("RCYC_IB_FLIGHT_CODE");
//    public static final String RCYC_OB_FLIGHT_CODE = System.getenv("RCYC_OB_FLIGHT_CODE");
//
//
//    public static final String ITEM_ID_NON_RCYC_AIR_TYPE_INBOUND = System.getenv("ITEM_ID_NON_RCYC_AIR_TYPE_INBOUND");
//    public static final String ITEM_ID_NON_RCYC_AIR_TYPE_OUTBOUND = System.getenv("ITEM_ID_NON_RCYC_AIR_TYPE_OUTBOUND");
//    public static final String ITEM_ID_NON_RCYC_AIR_CLASSNAME_ECONOMY = System.getenv("ITEM_ID_NON_RCYC_AIR_CLASSNAME_ECONOMY");
//
//    public static final String RCYC_AGENT_ID = System.getenv("RCYC_AGENT_ID");
//
//
//    public static final String LUGGAGE_ADDRESS_TYPE_ID =System.getenv("LUGGAGE_ADDRESS_TYPE_ID");
//    public static final String LUGGAGE_STREET_ADRESS_ID = System.getenv("LUGGAGE_STREET_ADRESS_ID");
//    public static final String LUGGAGE_CITY_ID = System.getenv("LUGGAGE_CITY_ID");
//    public static final String LUGGAGE_STATE_OR_PROVINCE_ID = System.getenv("LUGGAGE_STATE_OR_PROVINCE_ID");
//    public static final String LUGGAGE_POSTAL_CODE_ID = System.getenv("LUGGAGE_POSTAL_CODE_ID");
//    public static final String LUGGAGE_COUNTRY_ID = System.getenv("LUGGAGE_COUNTRY_ID");
//    public static final String LUGGAGE_APPLY_TO_ALL_GUESTS = System.getenv("LUGGAGE_APPLY_TO_ALL_GUESTS");
//
//
//    public static final String LUGGAGE_IS_APPLICABLE_YES = System.getenv("LUGGAGE_IS_APPLICABLE_YES");
//    public static final String LUGGAGE_IS_APPLICABLE_NO = System.getenv("LUGGAGE_IS_APPLICABLE_NO");
//
//    public static final String LUGGAGE_HOME_ID = System.getenv("LUGGAGE_HOME_ID");
//    public static final String LUGGAGE_OTHER_ID = System.getenv("LUGGAGE_OTHER_ID");
//
//    public static final String LUGGAGE_TMPLATE_ID = System.getenv("LUGGAGE_TMPLATE_ID");
//    public static String spaUrl = CryptoUtil.decrypt(System.getenv("SPA_APIURL"));
//
//
//    public static final String T_AND_C_TEMPLATE_ID = System.getenv("T_AND_C_TEMPLATE_ID");
//    public static final String T_AND_C_BOOKING_NUMBER_ITEM_ID = System.getenv("T_AND_C_BOOKING_NUMBER_ITEM_ID");
//    public static final String T_AND_C_NAME_ITEM_ID = System.getenv("T_AND_C_NAME_ITEM_ID");
//    public static final String T_AND_C_DOCUMENT_NAME_ITEM_ID = System.getenv("T_AND_C_DOCUMENT_NAME_ITEM_ID");
//    public static final String T_AND_C_DOCUMENT_VERSION_ITEM_ID = System.getenv("T_AND_C_DOCUMENT_VERSION_ITEM_ID");
//    public static final String T_AND_C_DATE_ITEM_ID = System.getenv("T_AND_C_DATE_ITEM_ID");
//
//    public static final String addNoteTempId = System.getenv("RESCO_NOTE_TEMPID"); //1238
//    public static final String addNoteItemId = System.getenv("RESCO_NOTE_ITEMID"); //1496

}