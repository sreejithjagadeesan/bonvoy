package com.rcyc.bonvoy.service;

import com.rcyc.bonvoy.dto.resco.*;

import java.util.List;

public interface RescoService {

    ResListEvent getAllEvents() throws Exception;

    ResInfoBooking getAllBookings(String eventId) throws Exception;

    ResInfoFolio getAllFolios(String eventId) throws Exception;

    ResInfoBookingDetail getBookingDetails(String bookingId) throws Exception;

    ResListSurcharge getSurcharges(String agentId, String tripId, String travellerId) throws Exception;
}
