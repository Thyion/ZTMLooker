
package com.example.ztmlooker.routes;

import java.util.List;
import javax.annotation.Generated;
import com.google.gson.annotations.SerializedName;

@Generated("net.hexar.json2pojo")
@SuppressWarnings("unused")
public class Routes {

    @SerializedName("lastUpdate")
    private String mLastUpdate;
    @SerializedName("routes")
    private List<Route> mRoutes;

    public String getLastUpdate() {
        return mLastUpdate;
    }

    public void setLastUpdate(String lastUpdate) {
        mLastUpdate = lastUpdate;
    }

    public List<Route> getRoutes() {
        return mRoutes;
    }

    public void setRoutes(List<Route> routes) {
        mRoutes = routes;
    }

}
