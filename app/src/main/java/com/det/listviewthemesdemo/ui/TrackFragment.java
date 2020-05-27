package com.det.listviewthemesdemo.ui;

import android.content.Context;
import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.det.listviewthemesdemo.R;
import com.det.listviewthemesdemo.data.MediaRepository;
import com.det.listviewthemesdemo.model.ArtistItem;
import com.det.listviewthemesdemo.model.ItemType;
import com.det.listviewthemesdemo.model.ListViewItem;
import com.det.listviewthemesdemo.model.Routes;
import com.det.listviewthemesdemo.model.TrackItem;
import com.det.listviewthemesdemo.model.jsonmodel.Artist;
import com.det.listviewthemesdemo.model.jsonmodel.Data;
import com.det.listviewthemesdemo.model.jsonmodel.Track;

import java.util.ArrayList;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProvider;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

public class TrackFragment extends Fragment
{
    CustomAdapter customAdapter;
    ArrayList< ListViewItem > listViewItems;
    TrackViewModel trackViewModel;
    MutableLiveData< Data< Track > > mutableLiveData;

    @Override
    public void onAttach( @NonNull Context context )
    {
        super.onAttach( context );
    }

    @Nullable
    @Override
    public View onCreateView( @NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState )
    {
        final RecyclerView recyclerView;
        View view;
        view = inflater.inflate( R.layout.main_recycler_view , null);
        recyclerView = view.findViewById( R.id.recycler_view );
        trackViewModel = new ViewModelProvider( getActivity()).get( TrackViewModel.class);
        mutableLiveData = trackViewModel.getLiveData();
        if(mutableLiveData.getValue() != null){
            listViewItems = new ArrayList<>();
            for( Track track: mutableLiveData.getValue().getData())
            {
                listViewItems.add( new ListViewItem( new TrackItem( R.drawable.music, track.getTitle(),track.getArtist().getName() ), ItemType.TRACK ) );
            }
            customAdapter = new CustomAdapter(listViewItems );
            recyclerView.setAdapter( customAdapter );
            recyclerView.setLayoutManager(
                    new LinearLayoutManager( getActivity()));
        }
        MediaRepository<Track> mediaRepository = trackViewModel.getMediaRepository();
        mediaRepository.fetchData( Routes.TRACK, mutableLiveData );
        mutableLiveData.observe( getActivity(), new Observer< Data<Track> >()
        {
            @Override
            public void onChanged( Data<Track> data )
            {
                listViewItems = new ArrayList<>();
                for(Track ob : data.getData())
                {
                    Log.d( "###", ob.toString() );
                    listViewItems.add( new ListViewItem( new TrackItem( R.drawable.music, ob.getTitle(),ob.getArtist().getName() ), ItemType.TRACK ) );
                    customAdapter = new CustomAdapter(listViewItems );
                    recyclerView.setAdapter( customAdapter );
                    recyclerView.setLayoutManager(
                            new LinearLayoutManager( getActivity()));

                }
            }
        } );
        return view;
    }
}
