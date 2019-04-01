package com.travix.medusa.busyflights.domain;

public interface FlightSupplierRequest {

    /**Retrieve the mandatory arguments in order to be used to perform HTTP requests.
     * @return the mandatory arguments
     */
    Object[] getMandatoryArguments();
}