package com.example.ztmlooker.gpsSystem;

public class GpsPositionTaker {

    public GpsPositionTaker() {
        DownloadGpsPositionAPI task = new DownloadGpsPositionAPI();
        String url = "http://ckan2.multimediagdansk.pl/gpsPositions";
        try {
            task.execute(url).get();
        } catch (Exception e) {
            e.printStackTrace();

        }

    }



}
