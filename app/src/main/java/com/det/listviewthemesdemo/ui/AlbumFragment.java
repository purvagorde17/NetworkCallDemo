package com.det.listviewthemesdemo.ui;

import android.content.Context;
import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.det.listviewthemesdemo.R;
import com.det.listviewthemesdemo.data.MediaRepository;
import com.det.listviewthemesdemo.model.AlbumItem;
import com.det.listviewthemesdemo.model.ArtistItem;
import com.det.listviewthemesdemo.model.ItemType;
import com.det.listviewthemesdemo.model.ListViewItem;
import com.det.listviewthemesdemo.model.Routes;
import com.det.listviewthemesdemo.model.jsonmodel.Album;
import com.det.listviewthemesdemo.model.jsonmodel.Data;

import java.util.ArrayList;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProvider;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

public class AlbumFragment extends Fragment
{
    CustomAdapter customAdapter;
    ArrayList< ListViewItem > listViewItems;
    AlbumViewModel albumViewModel;
    MutableLiveData< Data< Album > > mutableLiveData;

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
        albumViewModel = new ViewModelProvider( getActivity()).get( AlbumViewModel.class);
        mutableLiveData = albumViewModel.getLiveData();
        if(mutableLiveData.getValue() != null){
            listViewItems = new ArrayList<>();
            for( Album album: mutableLiveData.getValue().getData())
            {
                listViewItems.add( new ListViewItem( new AlbumItem( R.drawable.music, album.getTitle() ), ItemType.ALBUM ) );
            }
            customAdapter = new CustomAdapter(listViewItems );
            recyclerView.setAdapter( customAdapter );
            recyclerView.setLayoutManager(
                    new LinearLayoutManager( getActivity()));
        }
        MediaRepository<Album> mediaRepository = albumViewModel.getMediaRepository();
        mediaRepository.fetchData( Routes.ALBUM, mutableLiveData );
        mutableLiveData.observe( getActivity(), new Observer< Data<Album> >()
        {
            @Override
            public void onChanged( Data<Album> data )
            { listViewItems = new ArrayList<>();
                for(Album ob : data.getData())
                {
                    Log.d( "###",ob.toString() );
                    listViewItems.add( new ListViewItem( new ArtistItem( R.drawable.music, ob.getTitle() ), ItemType.ARTIST ) );
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
