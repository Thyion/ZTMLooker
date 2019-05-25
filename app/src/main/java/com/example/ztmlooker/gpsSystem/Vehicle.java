
package com.example.ztmlooker.gpsSystem;

import com.google.gson.annotations.SerializedName;

import javax.annotation.Generated;

@Generated("net.hexar.json2pojo")
@SuppressWarnings("unused")
public class Vehicle {

    @SerializedName("DataGenerated")
    private String mDataGenerated;
    @SerializedName("Delay")
    private Long mDelay;
    @SerializedName("GPSQuality")
    private Long mGPSQuality;
    @SerializedName("Lat")
    private Double mLat;
    @SerializedName("Line")
    private String mLine;
    @SerializedName("Lon")
    private Double mLon;
    @SerializedName("Route")
    private String mRoute;
    @SerializedName("Speed")
    private Long mSpeed;
    @SerializedName("VehicleCode")
    private String mVehicleCode;
    @SerializedName("VehicleId")
    private Long mVehicleId;
    @SerializedName("VehicleService")
    private String mVehicleService;

    public Vehicle(String mDataGenerated, Long mDelay, Long mGPSQuality, Double mLat, String mLine, Double mLon, String mRoute, Long mSpeed, String mVehicleCode, Long mVehicleId, String mVehicleService) {
        this.mDataGenerated = mDataGenerated;
        this.mDelay = mDelay;
        this.mGPSQuality = mGPSQuality;
        this.mLat = mLat;
        this.mLine = mLine;
        this.mLon = mLon;
        this.mRoute = mRoute;
        this.mSpeed = mSpeed;
        this.mVehicleCode = mVehicleCode;
        this.mVehicleId = mVehicleId;
        this.mVehicleService = mVehicleService;
    }

    public String getDataGenerated() {
        return mDataGenerated;
    }

    public void setDataGenerated(String dataGenerated) {
        mDataGenerated = dataGenerated;
    }

    public Long getDelay() {
        return mDelay;
    }

    public void setDelay(Long delay) {
        mDelay = delay;
    }

    public Long getGPSQuality() {
        return mGPSQuality;
    }

    public void setGPSQuality(Long gPSQuality) {
        mGPSQuality = gPSQuality;
    }

    public Double getLat() {
        return mLat;
    }

    public void setLat(Double lat) {
        mLat = lat;
    }

    public String getLine() {
        return mLine;
    }

    public void setLine(String line) {
        mLine = line;
    }

    public Double getLon() {
        return mLon;
    }

    public void setLon(Double lon) {
        mLon = lon;
    }

    public String getRoute() {
        return mRoute;
    }

    public void setRoute(String route) {
        mRoute = route;
    }

    public Long getSpeed() {
        return mSpeed;
    }

    public void setSpeed(Long speed) {
        mSpeed = speed;
    }

    public String getVehicleCode() {
        return mVehicleCode;
    }

    public void setVehicleCode(String vehicleCode) {
        mVehicleCode = vehicleCode;
    }

    public Long getVehicleId() {
        return mVehicleId;
    }

    public void setVehicleId(Long vehicleId) {
        mVehicleId = vehicleId;
    }

    public String getVehicleService() {
        return mVehicleService;
    }

    public void setVehicleService(String vehicleService) {
        mVehicleService = vehicleService;
    }

}
