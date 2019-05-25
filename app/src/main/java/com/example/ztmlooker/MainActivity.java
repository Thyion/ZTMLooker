package com.example.ztmlooker;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import com.example.ztmlooker.gpsSystem.DownloadGpsPositionAPI;
import com.example.ztmlooker.gpsSystem.GpsPosition;
import com.example.ztmlooker.gpsSystem.GpsPositionTaker;
import com.example.ztmlooker.routes.Routes;
import com.example.ztmlooker.routes.RoutesTaker;

public class MainActivity extends AppCompatActivity {

    public static GpsPosition gpsPositions;
    public static Routes routes = null;

    public static TextView textView;

    public void LoginOnClick(View view){

//        Intent intent = new Intent(getApplicationContext(), Panel.class);
//        intent.putExtra("Panel", 2);
//        startActivity(intent);

        //RoutesTaker routesTaker = new RoutesTaker();
        //textView.setText(routes.getLastUpdate());
        gpsPositions = new GpsPosition();
        new Thread(new Runnable() {
            public void run() {
                textView.setText("dddd");
                GpsPositionTaker gpsPositionTaker = new GpsPositionTaker();
                textView.setText(gpsPositions.getVehicles().get(0).getLine());

            }
        }).start();








    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu){
        MenuInflater menuInflater = getMenuInflater();
        menuInflater.inflate(R.menu.main_menu, menu);
        return super.onCreateOptionsMenu(menu);
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        super.onOptionsItemSelected(item);

        switch (item.getItemId()){
            case R.id.exit:
                Toast.makeText(this, "Exit", Toast.LENGTH_LONG).show();
                System.exit(1);
                return true;
            default:
                return true;
        }
    }
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        textView = findViewById(R.id.textView2);



    }
}
