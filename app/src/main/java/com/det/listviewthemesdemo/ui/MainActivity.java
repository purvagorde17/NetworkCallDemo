package com.det.listviewthemesdemo.ui;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Bundle;

import com.det.listviewthemesdemo.R;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentManager;
import androidx.localbroadcastmanager.content.LocalBroadcastManager;

public class MainActivity extends AppCompatActivity
{

    @Override
    protected void onCreate( Bundle savedInstanceState )
    {
        super.onCreate( savedInstanceState );
        setContentView( R.layout.activity_main );

        LocalBroadcastManager.getInstance( this ).registerReceiver( mReceiver, new IntentFilter( "action.OPEN_ALBUM" ) );
        LocalBroadcastManager.getInstance( this ).registerReceiver( mReceiver, new IntentFilter( "action.OPEN_ARTIST" ) );
        LocalBroadcastManager.getInstance( this ).registerReceiver( mReceiver, new IntentFilter( "action.OPEN_TRACK" ) );
        MainFragment mainFragment = new MainFragment();
        FragmentManager fragmentManager = getSupportFragmentManager();
        fragmentManager.beginTransaction().addToBackStack( null ).add( R.id.fragment_container, mainFragment ).commit();
    }

    private BroadcastReceiver mReceiver = new BroadcastReceiver()
    {
        @Override
        public void onReceive( Context context, Intent intent )
        {
            if( intent.getAction().equals( "action.OPEN_ALBUM" ) )
            {
                AlbumFragment albumFragment = new AlbumFragment();
                FragmentManager fragmentManager = getSupportFragmentManager();
                fragmentManager.beginTransaction().addToBackStack( null ).replace( R.id.fragment_container, albumFragment ).commit();
            }
            if( intent.getAction().equals( "action.OPEN_ARTIST" ) )
            {
                ArtistFragment artistFragment = new ArtistFragment();
                FragmentManager fragmentManager = getSupportFragmentManager();
                fragmentManager.beginTransaction().addToBackStack( null ).replace( R.id.fragment_container, artistFragment ).commit();
            }
            if( intent.getAction().equals( "action.OPEN_TRACK" ) )
            {
                TrackFragment trackFragment = new TrackFragment();
                FragmentManager fragmentManager = getSupportFragmentManager();
                fragmentManager.beginTransaction().addToBackStack( null ).replace( R.id.fragment_container, trackFragment ).commit();
            }
        }
    };

}