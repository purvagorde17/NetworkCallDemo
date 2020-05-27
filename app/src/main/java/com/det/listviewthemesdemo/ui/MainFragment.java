package com.det.listviewthemesdemo.ui;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.det.listviewthemesdemo.R;
import com.det.listviewthemesdemo.model.AlbumItem;
import com.det.listviewthemesdemo.model.ArtistItem;
import com.det.listviewthemesdemo.model.HeaderItem;
import com.det.listviewthemesdemo.model.ItemType;
import com.det.listviewthemesdemo.model.ListViewItem;
import com.det.listviewthemesdemo.model.TrackItem;

import java.util.ArrayList;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

public class MainFragment extends Fragment
{

    private ArrayList< ListViewItem > listViewItems;
    @Nullable
    @Override
    public View onCreateView( @NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState )
    {
        RecyclerView recyclerView;
        View view;
        view = inflater.inflate( R.layout.main_recycler_view , null);
        recyclerView = view.findViewById( R.id.recycler_view );

        setData();

        CustomAdapter myAdapter = new CustomAdapter( getActivity().getApplicationContext(), listViewItems );
        recyclerView.setAdapter( myAdapter );
        recyclerView.setLayoutManager(
                new LinearLayoutManager( getActivity()));
        return view;
    }
    private void setData()
    {
        listViewItems = new ArrayList<>();
        listViewItems.add( new ListViewItem( new HeaderItem( "Artist" ), ItemType.HEADER ) );
        listViewItems.add( new ListViewItem( new ArtistItem( R.drawable.music, "A.R.Rehman" ), ItemType.ARTIST ) );
        listViewItems.add( new ListViewItem( new ArtistItem( R.drawable.song, "Jubin"), ItemType.ARTIST ) );
        listViewItems.add( new ListViewItem( new ArtistItem( R.drawable.music, "neha kakkar" ), ItemType.ARTIST ) );
        listViewItems.add( new ListViewItem( new HeaderItem( "Tracks" ), ItemType.HEADER ) );
        listViewItems.add( new ListViewItem( new TrackItem( R.drawable.music, "tu hi yaar mera", "neha kakkar" ), ItemType.TRACK ) );
        listViewItems.add( new ListViewItem( new TrackItem( R.drawable.song, "sawarne lage", "jubin" ), ItemType.TRACK ) );
        listViewItems.add( new ListViewItem( new TrackItem( R.drawable.music, "Jay ho", "A.R.Rehman" ), ItemType.TRACK ) );
        listViewItems.add( new ListViewItem( new HeaderItem( "Albums" ), ItemType.HEADER ) );
        listViewItems.add( new ListViewItem( new AlbumItem( R.drawable.song, "Classical songs"), ItemType.ALBUM ) );
        listViewItems.add( new ListViewItem( new AlbumItem( R.drawable.music, "Malyalam songs" ), ItemType.ALBUM ) );
        listViewItems.add( new ListViewItem( new AlbumItem( R.drawable.music, "Bengali songs" ), ItemType.ALBUM ) );

    }
}
