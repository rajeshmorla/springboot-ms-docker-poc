package com.digisense.ms.model;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonProperty;

import io.swagger.annotations.ApiModelProperty;
import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;	
@ToString
@Getter
@Builder
@Setter
@AllArgsConstructor(access = AccessLevel.PROTECTED)
@NoArgsConstructor(access = AccessLevel.PRIVATE)

public class Trip {

	@JsonProperty(value = "tripID")
	private String tripID;

	@JsonProperty("vehicleID")
	private String vehicleID;

	@JsonProperty(value = "vehicleType")
	private String vehicleType;

	@JsonProperty(value = "vehicleModel")
	private String vehicleModel;

	@JsonProperty(value = "vehicleSeries")
	private String vehicleSeries;

	@JsonProperty(value = "vehicleGroupType")
	private String vehicleGroupType;

	@JsonProperty(value = "vehicleGroup")
	private String vehicleGroup;

	@JsonProperty(value = "driverName")
	private String driverName;

	@JsonProperty(value = "driverContactNo")
	private String driverContactNo;
	
	@JsonProperty(value = "driverID")
	private String driverID;


	@JsonProperty(value = "startDateTime")
	private Long startDateTime;

	@JsonProperty(value = "endDateTime")
	private Long endDateTime;

	@JsonProperty(value = "status")
	private String status;

	@JsonProperty(value = "vin")
	private String vin;

	@JsonProperty(value = "regNo")
	private String regNo;

	@JsonProperty(value = "image")
	private String image;

	@JsonProperty("wayPoints")
	private List<String> wayPoints;
	
	@JsonProperty("pickupLatitude")
	private Double pickupLatitude;	
	
	@JsonProperty("pickupLongitude")
	private Double pickupLongitude;
	
	@JsonProperty("dropLatitude")
	private Double dropLatitude;	
	
	@JsonProperty("dropLongitude")
	private Double dropLongitude;	
	
	@JsonProperty("fuelEconomy")
	private String fuelEconomy;

	@JsonProperty("idleTime")
	private String idleTime;

	@JsonProperty("distanceCovered")
	private String distanceCovered;

	@JsonProperty("avgSpeed")
	private String avgSpeed;
	
	@JsonProperty("alerts")
	private String alerts;

	@JsonProperty("totalAlerts")
	private String totalAlerts;

	@JsonProperty("alertsSummary")
	private String alertsSummary;

	@JsonProperty("tripScore")
	private String tripScore;

	@JsonProperty("earnedPoints")
	private String earnedPoints;

	@JsonProperty("expenses")
	private String expenses;

	@JsonProperty("dropContactPerson")
	private String dropContactPerson;

	@JsonProperty("dropContactPersonNo")
	private String dropContactPersonNo;

	@JsonProperty("dropCity")
	private String dropCity;

	@JsonProperty("dropState")
	private String dropState;

	@JsonProperty("dropPincode")
	private String dropPincode;

	@JsonProperty("pickupContactPerson")
	private String pickupContactPerson;

	@JsonProperty("pickupContactPersonNo")
	private String pickupContactPersonNo;

	@JsonProperty("pickupCity")
	private String pickupCity;

	@JsonProperty("pickupState")
	private String pickupState;

	@JsonProperty("pickupPincode")
	private String pickupPincode;

	@JsonProperty("pickupAddress")
	private String pickupAddress;

	@JsonProperty("dropAddress")
	private String dropAddress;
	@ApiModelProperty(hidden= true)
	@JsonProperty("remarks")
	private String remarks;

}