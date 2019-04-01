package com.travix.medusa.busyflights.service.impl;

import org.springframework.stereotype.Service;

import com.travix.medusa.busyflights.domain.FlightSupplierResponse;
import com.travix.medusa.busyflights.domain.busyflights.BusyFlightsRequest;
import com.travix.medusa.busyflights.service.FlightSupplierSearcher;

@Service
public class ToughJetSearcher
    extends FlightSupplierSearcher {

    @Override
    protected FlightSupplierResponse[] search(BusyFlightsRequest in) {
        return this.flightSupplierConnector.toughJetFlightsSearch(this.busyFlightsRequestTransformer.toToughJetRequest(in));
    }
}
