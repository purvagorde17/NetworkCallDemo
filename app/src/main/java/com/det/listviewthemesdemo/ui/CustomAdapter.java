package com.det.listviewthemesdemo.ui;

import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.det.listviewthemesdemo.R;
import com.det.listviewthemesdemo.model.Album;
import com.det.listviewthemesdemo.model.Artist;
import com.det.listviewthemesdemo.model.Header;
import com.det.listviewthemesdemo.model.ListViewItem;
import com.det.listviewthemesdemo.model.Track;

import java.util.ArrayList;
import java.util.List;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class CustomAdapter extends RecyclerView.Adapter
{
    List< ListViewItem > listViewItems;

    public CustomAdapter( ArrayList< ListViewItem > listViewItems )
    {
        this.listViewItems = listViewItems;
    }

    @Override
    public int getItemViewType( int position )
    {

        return listViewItems.get( position ).getListViewItemType().getValue();
    }

    @Override
    public int getItemCount()
    {
        return listViewItems.size();
    }

    @Override
    public RecyclerView.ViewHolder onCreateViewHolder( @NonNull ViewGroup parent, int viewType )
    {
        switch( viewType )
        {
            case 0:
                View headerLayout = LayoutInflater.from( parent.getContext() ).inflate( R.layout.header_layout, parent, false );
                return new HeaderViewHolder( headerLayout );
            case 1:
                View albumLayout = LayoutInflater.from( parent.getContext() ).inflate( R.layout.albums_row_layout, parent, false );
                return new AlbumsViewHolder( albumLayout );
            case 2:
                View trackLayout = LayoutInflater.from( parent.getContext() ).inflate( R.layout.tracks_row_layout, parent, false );
                return new TracksViewHolder( trackLayout );
            case 3:
                View artistLayout = LayoutInflater.from( parent.getContext() ).inflate( R.layout.artist_row_layout, parent, false );
                return new ArtistViewHolder( artistLayout );
            default:
                return null;
        }

    }


    @Override
    public void onBindViewHolder( RecyclerView.ViewHolder viewHolder, int position )
    {
        switch( listViewItems.get( position ).getListViewItemType().getValue() )
        {
            case 0:
                Header header = ( Header ) listViewItems.get( position ).getListViewItem();
                ( ( HeaderViewHolder ) viewHolder ).setData( header );
                ( ( HeaderViewHolder ) viewHolder ).header.setOnClickListener( new View.OnClickListener()
                {
                    @Override
                    public void onClick( View view )
                    {
                        if(((TextView)view).getText().equals( "Artist" )){
                            Log.d( "###","artist" );
                        }
                        if(((TextView)view).getText().equals( "Albums" )){
                            Log.d( "###","album" );
                        }
                        if(((TextView)view).getText().equals( "Tracks" )){
                            Log.d( "###","track" );
                        }
                    }
                } );
                break;
            case 1:
                Album album = ( Album ) listViewItems.get( position ).getListViewItem();
                ( ( AlbumsViewHolder ) viewHolder ).setData( album );
                break;
            case 2:
                Track track = ( Track ) listViewItems.get( position ).getListViewItem();
                ( ( TracksViewHolder ) viewHolder ).setData( track );
                break;
            case 3:
                Artist artist = ( Artist ) listViewItems.get( position ).getListViewItem();
                ( ( ArtistViewHolder ) viewHolder ).setData( artist );
                break;
        }


    }

   private class HeaderViewHolder extends RecyclerView.ViewHolder
    {
        TextView header;

        public HeaderViewHolder( View view )
        {
            super( view );
            header = view.findViewById( R.id.headertext );
        }

        public void setData( Header header )
        {
            this.header.setText( header.getHeader() );
        }
    }

  private class ArtistViewHolder extends RecyclerView.ViewHolder
    {
        ImageView artistImage;
        TextView artistName, song;

        public ArtistViewHolder( View view )
        {
            super( view );
            artistImage = view.findViewById( R.id.artistImageView );
            artistName = view.findViewById( R.id.artistName );
            song = view.findViewById( R.id.song );
        }

        public void setData( Artist artist )
        {
            artistImage.setImageResource( artist.getArtistImageView() );
            artistName.setText( artist.getArtistName() );
            song.setText( artist.getSong() );
        }
    }

   private class TracksViewHolder extends RecyclerView.ViewHolder
    {
        ImageView trackImage;
        TextView trackName, trackDesc;

        public TracksViewHolder( View view )
        {
            super( view );
            trackImage = view.findViewById( R.id.tracksImageView );
            trackName = view.findViewById( R.id.tracksName );
            trackDesc = view.findViewById( R.id.tracksDesc );
        }

        public void setData( Track track )
        {
            trackImage.setImageResource( track.getTracksImageView() );
            trackName.setText( track.getTrackName() );
            trackDesc.setText( track.getTrackDesc() );
        }
    }

    private class AlbumsViewHolder extends RecyclerView.ViewHolder
    {
        ImageView albumImage;
        TextView albumName, albumDesc;

        public AlbumsViewHolder( View view )
        {
            super( view );
            albumImage = view.findViewById( R.id.albumImageView );
            albumName = view.findViewById( R.id.albumName );
            albumDesc = view.findViewById( R.id.albumDesc );
        }

        public void setData( Album album )
        {
            albumImage.setImageResource( album.getAlbumImage() );
            albumName.setText( album.getAlbumName() );
            albumDesc.setText( album.getDesc() );
        }
    }
}



   /* public CustomAdapter( MainFragment context, ArrayList< ListViewItem > listViewItems )
    {
        mInflater = LayoutInflater.from( context );
        this.listViewItems = listViewItems;
    }

    @Override
    public int getCount()
    {
        return listViewItems.size();
    }

    @Override
    public Object getItem( int i )
    {
        return i;
    }

    @Override
    public long getItemId( int i )
    {
        return i;
    }

    @Override
    public View getView( int i, View view, ViewGroup viewGroup )
    {
        Context contextThemeWrapper;
        switch( listViewItems.get( i ).getListViewItemType() )
        {
            case HEADER:
                Header header = ( Header ) listViewItems.get( i ).getListViewItem();
                HeaderViewHolder headerViewHolder;

                view = mInflater.inflate( R.layout.header_layout, viewGroup, false );
                headerViewHolder = new HeaderViewHolder( view );
                view.setTag( headerViewHolder );

                headerViewHolder.header.setText( header.getHeader() );
                return view;


            case ARTIST:
                Artist artist = ( Artist ) listViewItems.get( i ).getListViewItem();
                ArtistViewHolder artistViewHolder;

                contextThemeWrapper = new ContextThemeWrapper( mInflater.getContext(), R.style.BlueTheme );
                // mInflater.cloneInContext( contextThemeWrapper );
                contextThemeWrapper.getSystemService( Context.LAYOUT_INFLATER_SERVICE );

                LayoutInflater layoutInflater = ( LayoutInflater ) contextThemeWrapper.getSystemService( Context.LAYOUT_INFLATER_SERVICE );
                view = layoutInflater.inflate( R.layout.artist_row_layout, viewGroup, false );
                artistViewHolder = new ArtistViewHolder( view );
                view.setTag( artistViewHolder );

                artistViewHolder.artistImage.setImageResource( artist.getArtistImageView() );
                artistViewHolder.artistName.setText( artist.getArtistName() );
                artistViewHolder.song.setText( artist.getSong() );
                return view;


            case ALBUM:
                Album album = ( Album ) listViewItems.get( i ).getListViewItem();
                AlbumsViewHolder albumViewHolder;

                contextThemeWrapper = new ContextThemeWrapper( mInflater.getContext(), R.style.pinkTheme );
                // mInflater.cloneInContext( contextThemeWrapper );
                contextThemeWrapper.getSystemService( Context.LAYOUT_INFLATER_SERVICE );

                layoutInflater = ( LayoutInflater ) contextThemeWrapper.getSystemService( Context.LAYOUT_INFLATER_SERVICE );
                view = layoutInflater.inflate( R.layout.albums_row_layout, viewGroup, false );
                albumViewHolder = new AlbumsViewHolder( view );
                view.setTag( albumViewHolder );

                albumViewHolder.albumImage.setImageResource( album.getAlbumImage() );
                albumViewHolder.albumName.setText( album.getAlbumName() );
                albumViewHolder.albumDesc.setText( album.getDesc() );
                return view;


            case TRACK:
                Track track = ( Track ) listViewItems.get( i ).getListViewItem();
                TracksViewHolder tracksViewHolder;


                contextThemeWrapper = new ContextThemeWrapper( mInflater.getContext(), R.style.YellowTheme );
                // mInflater.cloneInContext( contextThemeWrapper );
                contextThemeWrapper.getSystemService( Context.LAYOUT_INFLATER_SERVICE );

                layoutInflater = ( LayoutInflater ) contextThemeWrapper.getSystemService( Context.LAYOUT_INFLATER_SERVICE );
                view = layoutInflater.inflate( R.layout.tracks_row_layout, viewGroup, false );
                tracksViewHolder = new TracksViewHolder( view );
                view.setTag( tracksViewHolder );

                tracksViewHolder.trackImage.setImageResource( track.getTracksImageView() );
                tracksViewHolder.trackName.setText( track.getTrackName() );
                tracksViewHolder.trackDesc.setText( track.getTrackDesc() );
                return view;

            default:
                return null;

        }
    }


    */


