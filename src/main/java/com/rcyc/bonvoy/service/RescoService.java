package com.rcyc.bonvoy.service;

import com.rcyc.bonvoy.dto.resco.ResInfoBooking;
import com.rcyc.bonvoy.dto.resco.ResListEvent;

import java.util.List;

public interface RescoService {

    public ResListEvent getAllEvents() throws Exception;

    ResInfoBooking getAllBookings() throws Exception;
}
