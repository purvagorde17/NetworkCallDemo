package com.det.listviewthemesdemo.model;

public class Artist
{

    private int artistImageView;
    private String artistName;
    private String song;

    @Override
    public String toString()
    {
        return "Artist{" +
                "artistImageView=" + artistImageView +
                ", artistName='" + artistName + '\'' +
                ", song='" + song + '\'' +
                '}';
    }

    public Artist( int artistImageView, String artistName, String song )
    {
        this.artistImageView = artistImageView;
        this.artistName = artistName;
        this.song = song;
    }

    public int getArtistImageView()
    {
        return artistImageView;
    }

    public void setArtistImageView( int artistImageView )
    {
        this.artistImageView = artistImageView;
    }

    public String getArtistName()
    {
        return artistName;
    }

    public void setArtistName( String artistName )
    {
        this.artistName = artistName;
    }

    public String getSong()
    {
        return song;
    }

    public void setSong( String song )
    {
        this.song = song;
    }
}
