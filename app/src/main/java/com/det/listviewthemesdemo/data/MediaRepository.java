package com.det.listviewthemesdemo.data;

import android.os.AsyncTask;
import android.util.Log;

import com.det.listviewthemesdemo.model.Routes;
import com.det.listviewthemesdemo.model.TrackItem;
import com.det.listviewthemesdemo.model.jsonmodel.Album;
import com.det.listviewthemesdemo.model.jsonmodel.Artist;
import com.det.listviewthemesdemo.model.jsonmodel.Data;
import com.det.listviewthemesdemo.model.jsonmodel.Track;
import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.lang.ref.WeakReference;
import java.net.URL;

import androidx.lifecycle.MutableLiveData;

public class MediaRepository<T>
{
    public void fetchData( Routes route, MutableLiveData<Data<T>> dataLiveData ){
        new MediaAsyncTask<>( route,dataLiveData ).execute( );
}
}
 class MediaAsyncTask<T> extends AsyncTask<String, Void, Data<T>>
{
    private WeakReference<MutableLiveData<Data<T>>> wDataLiveData;
    private Routes route;
    public MediaAsyncTask( Routes route, MutableLiveData<Data<T>> liveData) {
        this.wDataLiveData = new WeakReference<>(liveData );
        this.route = route;
    }

    protected Data<T> doInBackground(String... urls) {
        Data<T> data = null;
        try {
            StringBuffer response = new StringBuffer();
            URL imageDataUrl = new URL(route.getUrl());
            BufferedReader in = new BufferedReader(
                    new InputStreamReader( imageDataUrl.openStream()));

            String inputLine;
            while ((inputLine = in.readLine()) != null) {
                response.append(inputLine);
            }
            Log.d( "###",response.toString() );
         //   data = new Gson().fromJson( response.toString(),Data.class );
            switch( route ){
                case ARTIST:
                    data = new Gson().fromJson(response.toString(), new TypeToken<Data< Artist >>(){}.getType());
                    break;
                case TRACK:
                    data = new Gson().fromJson(response.toString(), new TypeToken<Data< Track >>(){}.getType());
                    break;
                case ALBUM:
                    data = new Gson().fromJson(response.toString(), new TypeToken<Data< Album >>(){}.getType());
                    break;
            }

        } catch (Exception e) {
            Log.e( "Error", e.getMessage());
            e.printStackTrace();
        }
        return data;
    }
    protected void onPostExecute(Data<T> data) {
        if(wDataLiveData != null && wDataLiveData.get() != null){
            wDataLiveData.get().postValue( data );
        }

    }
}
