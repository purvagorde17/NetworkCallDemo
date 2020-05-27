package com.det.listviewthemesdemo.ui;

import com.det.listviewthemesdemo.data.MediaRepository;
import com.det.listviewthemesdemo.model.jsonmodel.Album;
import com.det.listviewthemesdemo.model.jsonmodel.Data;
import com.det.listviewthemesdemo.model.jsonmodel.Track;

import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class TrackViewModel extends ViewModel
{
    MediaRepository mediaRepository;
    MutableLiveData< Data< Track > > liveData;
    public  MutableLiveData< Data<Track> > getLiveData(){
        if(liveData == null ){
            liveData = new MutableLiveData<>();
        }
        return liveData;
    }

    public MediaRepository getMediaRepository()
    {
        if(mediaRepository == null )
        {
            mediaRepository = new MediaRepository();
        }
        return mediaRepository;
    }
}
