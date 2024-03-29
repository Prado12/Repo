package com.travix.medusa.busyflights.service.sorting;

import java.util.Comparator;

import org.springframework.stereotype.Service;

import com.travix.medusa.busyflights.domain.busyflights.BusyFlightsResponse;

/**
 * Compares BusyFlightsResponses fare. For sorting purpose.
 * @author pratibha
 *
 */
@Service
public class BusyFlightsFareComparator
    implements Comparator<BusyFlightsResponse> {

    @Override
    public int compare(BusyFlightsResponse in1, BusyFlightsResponse in2) {
        return in1.getFare().compareTo(in2.getFare());
    }

}