package com.det.listviewthemesdemo.model;

public class ArtistItem
{

    private int artistImageView;
    private String artistName;


    @Override
    public String toString()
    {
        return "ArtistItem{" +
                "artistImageView=" + artistImageView +
                ", artistName='" + artistName + '\'' +
                '}';
    }

    public ArtistItem( int artistImageView, String artistName )
    {
        this.artistImageView = artistImageView;
        this.artistName = artistName;
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
}
