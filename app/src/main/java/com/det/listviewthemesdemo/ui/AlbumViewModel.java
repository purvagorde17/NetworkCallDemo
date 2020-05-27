package com.det.listviewthemesdemo.ui;

import com.det.listviewthemesdemo.data.MediaRepository;
import com.det.listviewthemesdemo.model.jsonmodel.Album;
import com.det.listviewthemesdemo.model.jsonmodel.Data;

import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class AlbumViewModel extends ViewModel
{

    MediaRepository mediaRepository;
    MutableLiveData< Data< Album > > liveData;
    public  MutableLiveData< Data<Album> > getLiveData(){
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
