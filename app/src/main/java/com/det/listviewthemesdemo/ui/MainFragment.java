package com.det.listviewthemesdemo.ui;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.det.listviewthemesdemo.R;
import com.det.listviewthemesdemo.model.Album;
import com.det.listviewthemesdemo.model.Artist;
import com.det.listviewthemesdemo.model.Header;
import com.det.listviewthemesdemo.model.ItemType;
import com.det.listviewthemesdemo.model.ListViewItem;
import com.det.listviewthemesdemo.model.Track;

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

        CustomAdapter myAdapter = new CustomAdapter(  listViewItems );
        recyclerView.setAdapter( myAdapter );
        recyclerView.setLayoutManager(
                new LinearLayoutManager( getActivity()));
        return view;
    }
    private void setData()
    {
        listViewItems = new ArrayList<>();
        listViewItems.add( new ListViewItem( new Header( "Artist" ), ItemType.HEADER ) );
        listViewItems.add( new ListViewItem( new Artist( R.drawable.music, "A.R.Rehman", "Jay ho" ), ItemType.ARTIST ) );
        listViewItems.add( new ListViewItem( new Artist( R.drawable.song, "Jubin", "Saware" ), ItemType.ARTIST ) );
        listViewItems.add( new ListViewItem( new Artist( R.drawable.music, "neha kakkar", "Tu hi yaar mera" ), ItemType.ARTIST ) );
        listViewItems.add( new ListViewItem( new Header( "Tracks" ), ItemType.HEADER ) );
        listViewItems.add( new ListViewItem( new Track( R.drawable.music, "tu hi yaar mera", "neha kakkar" ), ItemType.TRACK ) );
        listViewItems.add( new ListViewItem( new Track( R.drawable.song, "sawarne lage", "jubin" ), ItemType.TRACK ) );
        listViewItems.add( new ListViewItem( new Track( R.drawable.music, "Jay ho", "A.R.Rehman" ), ItemType.TRACK ) );
        listViewItems.add( new ListViewItem( new Header( "Albums" ), ItemType.HEADER ) );
        listViewItems.add( new ListViewItem( new Album( R.drawable.song, "Classical songs", "A very selective collection of top tracks" ), ItemType.ALBUM ) );
        listViewItems.add( new ListViewItem( new Album( R.drawable.music, "Malyalam songs", "Top tracks of various singers" ), ItemType.ALBUM ) );
        listViewItems.add( new ListViewItem( new Album( R.drawable.music, "Bengali songs", "A very selective collection of of top tracks" ), ItemType.ALBUM ) );

    }
}
