package com.det.listviewthemesdemo.model;

public class Album
{
    private int albumImage;
    private String albumName;
    private String desc;

    public Album( int albumImage, String albumName, String desc )
    {
        this.albumImage = albumImage;
        this.albumName = albumName;
        this.desc = desc;
    }

    @Override
    public String toString()
    {
        return "Album{" +
                "albumImage=" + albumImage +
                ", albumName='" + albumName + '\'' +
                ", desc='" + desc + '\'' +
                '}';
    }

    public int getAlbumImage()
    {
        return albumImage;
    }

    public void setAlbumImage( int albumImage )
    {
        this.albumImage = albumImage;
    }

    public String getAlbumName()
    {
        return albumName;
    }

    public void setAlbumName( String albumName )
    {
        this.albumName = albumName;
    }

    public String getDesc()
    {
        return desc;
    }

    public void setDesc( String desc )
    {
        this.desc = desc;
    }
}

