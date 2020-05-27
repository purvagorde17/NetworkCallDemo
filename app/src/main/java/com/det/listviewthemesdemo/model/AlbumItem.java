package com.det.listviewthemesdemo.model;

public class AlbumItem
{
    private int albumImage;
    private String albumName;


    public AlbumItem( int albumImage, String albumName )
    {
        this.albumImage = albumImage;
        this.albumName = albumName;

    }


    @Override
    public String toString()
    {
        return "AlbumItem{" +
                "albumImage=" + albumImage +
                ", albumName='" + albumName + '\'' +
                '}';
    }

    public int getAlbumImage()
    {
        return albumImage;
    }

    public String getAlbumName()
    {
        return albumName;
    }

    public void setAlbumName( String albumName )
    {
        this.albumName = albumName;
    }


}

