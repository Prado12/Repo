package com.travix.medusa.busyflights.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import com.travix.medusa.busyflights.connector.FlightSupplierConnector;
import com.travix.medusa.busyflights.domain.FlightSupplierResponse;
import com.travix.medusa.busyflights.domain.busyflights.BusyFlightsRequest;
import com.travix.medusa.busyflights.service.transformer.BusyFlightsRequestTransformer;

/**
 * Performs a flight search on a flight supplier.
 * @author pratibha
 *
 */
@Component
public abstract class FlightSupplierSearcher {


    @Autowired
    protected FlightSupplierConnector flightSupplierConnector;
    @Autowired
    protected BusyFlightsRequestTransformer busyFlightsRequestTransformer;

    public FlightSupplierResponse[] searchOnSupplier(BusyFlightsRequest request) {
        try {
            return this.search(request);
        } catch (Exception e) {
        	//log exception
        }
        return new FlightSupplierResponse[0];
    }

    protected abstract FlightSupplierResponse[] search(BusyFlightsRequest request);
}