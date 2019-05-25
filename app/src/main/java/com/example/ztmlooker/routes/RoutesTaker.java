package com.example.ztmlooker.routes;

public class RoutesTaker {

    public RoutesTaker() {
        DownloadRoutesAPI task = new DownloadRoutesAPI();
        String url = "https://ckan.multimediagdansk.pl/dataset/c24aa637-3619-4dc2-a171-a23eec8f2172/resource/22313c56-5acf-41c7-a5fd-dc5dc72b3851/download/routes.json";
        try {
            task.execute(url).get();
        } catch (Exception e) {
            e.printStackTrace();

        }
    }



}
