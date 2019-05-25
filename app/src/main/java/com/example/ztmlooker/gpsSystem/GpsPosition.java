
package com.example.ztmlooker.gpsSystem;

import com.google.gson.annotations.SerializedName;

import java.util.List;

import javax.annotation.Generated;

@Generated("net.hexar.json2pojo")
@SuppressWarnings("unused")
public class GpsPosition {

    @SerializedName("LastUpdateData")
    private String mLastUpdateData;
    @SerializedName("Vehicles")
    private List<Vehicle> mVehicles;

    public GpsPosition() {
    }

    public GpsPosition(String mLastUpdateData, List<Vehicle> mVehicles) {
        this.mLastUpdateData = mLastUpdateData;
        this.mVehicles = mVehicles;
    }

    public String getLastUpdateData() {
        return mLastUpdateData;
    }

    public void setLastUpdateData(String lastUpdateData) {
        mLastUpdateData = lastUpdateData;
    }

    public List<Vehicle> getVehicles() {
        return mVehicles;
    }

    public void setVehicles(List<Vehicle> vehicles) {
        mVehicles = vehicles;
    }

}
