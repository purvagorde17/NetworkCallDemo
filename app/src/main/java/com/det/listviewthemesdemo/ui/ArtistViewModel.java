package com.det.listviewthemesdemo.ui;

import com.det.listviewthemesdemo.data.MediaRepository;
import com.det.listviewthemesdemo.model.jsonmodel.Artist;
import com.det.listviewthemesdemo.model.jsonmodel.Data;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class ArtistViewModel extends ViewModel
{
    MediaRepository mediaRepository;
    MutableLiveData< Data< Artist > > liveData;
    public  MutableLiveData< Data<Artist> > getLiveData(){
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
