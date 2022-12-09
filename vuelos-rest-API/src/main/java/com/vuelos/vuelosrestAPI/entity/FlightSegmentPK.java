package com.vuelos.vuelosrestAPI.entity;

import java.io.Serializable;

import jakarta.persistence.Embeddable;

@Embeddable
class FlightSegmentPK implements Serializable {
	
	private String FLIGHTSEGMENT_AIRLINECODE_PK;
	private String FLIGHTSEGMENT_FLIGHTNUMBER_PK;
	private String FLIGHTSEGMENT_AIRPORTCODE_PK;
	
	public FlightSegmentPK() {
		
	}
	
	public FlightSegmentPK(String fLIGHTSEGMENT_AIRLINECODE_PK, String fLIGHTSEGMENT_FLIGHTNUMBER_PK,
			String fLIGHTSEGMENT_AIRPORTCODE_PK) {
		
		FLIGHTSEGMENT_AIRLINECODE_PK = fLIGHTSEGMENT_AIRLINECODE_PK;
		FLIGHTSEGMENT_FLIGHTNUMBER_PK = fLIGHTSEGMENT_FLIGHTNUMBER_PK;
		FLIGHTSEGMENT_AIRPORTCODE_PK = fLIGHTSEGMENT_AIRPORTCODE_PK;
	}

	public String getFLIGHTSEGMENT_AIRLINECODE_PK() {
		return FLIGHTSEGMENT_AIRLINECODE_PK;
	}

	public void setFLIGHTSEGMENT_AIRLINECODE_PK(String fLIGHTSEGMENT_AIRLINECODE_PK) {
		FLIGHTSEGMENT_AIRLINECODE_PK = fLIGHTSEGMENT_AIRLINECODE_PK;
	}

	public String getFLIGHTSEGMENT_FLIGHTNUMBER_PK() {
		return FLIGHTSEGMENT_FLIGHTNUMBER_PK;
	}

	public void setFLIGHTSEGMENT_FLIGHTNUMBER_PK(String fLIGHTSEGMENT_FLIGHTNUMBER_PK) {
		FLIGHTSEGMENT_FLIGHTNUMBER_PK = fLIGHTSEGMENT_FLIGHTNUMBER_PK;
	}

	public String getFLIGHTSEGMENT_AIRPORTCODE_PK() {
		return FLIGHTSEGMENT_AIRPORTCODE_PK;
	}

	public void setFLIGHTSEGMENT_AIRPORTCODE_PK(String fLIGHTSEGMENT_AIRPORTCODE_PK) {
		FLIGHTSEGMENT_AIRPORTCODE_PK = fLIGHTSEGMENT_AIRPORTCODE_PK;
	}
	
	
	
	
	
}