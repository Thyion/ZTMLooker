package com.example.ztmlooker.gpsSystem;

import android.os.AsyncTask;

import com.example.ztmlooker.MainActivity;
import com.example.ztmlooker.gpsSystem.GpsPosition;
import com.google.gson.Gson;

import org.json.JSONException;
import org.json.JSONObject;

import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;

public class DownloadGpsPositionAPI extends AsyncTask<String, Void, String> {


    @Override
    protected String doInBackground(String... urls) {


        String delay = "";
        URL url;
        HttpURLConnection urlConnection;

        try{

            url = new URL(urls[0]);
            urlConnection = (HttpURLConnection) url.openConnection();
            InputStream inputStream = urlConnection.getInputStream();
            InputStreamReader inputStreamReader = new InputStreamReader(inputStream);
            int data = inputStreamReader.read();
            while(data != -1){
                char literka = (char) data;
                delay += literka;
                data = inputStreamReader.read();
            }
            return delay;
        }catch (Exception ex){
            ex.printStackTrace();
            return "Error";
        }
    }

    @Override
    protected void onPostExecute(String s) {
        super.onPostExecute(s);
        if(s.equals("Error")){

        }else {
            try {
                JSONObject jsonObject = new JSONObject(s);
                Gson gson = new Gson();
                MainActivity.gpsPositions = gson.fromJson(jsonObject.toString(), GpsPosition.class);
                MainActivity.textView.setText(MainActivity.gpsPositions.getVehicles().get(0).getLine());
            } catch (JSONException e) {
                e.printStackTrace();
            }
        }




    }
}