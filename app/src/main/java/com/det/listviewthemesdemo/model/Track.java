package com.det.listviewthemesdemo.model;

public class Track
{
    private int tracksImageView;
    private String trackName;
    private String trackDesc;

    public Track( int tracksImageView, String trackName, String trackDesc )
    {
        this.tracksImageView = tracksImageView;
        this.trackName = trackName;
        this.trackDesc = trackDesc;
    }

    @Override
    public String toString()
    {
        return "Tracks{" +
                "tracksImageView=" + tracksImageView +
                ", trackName='" + trackName + '\'' +
                ", trackDesc='" + trackDesc + '\'' +
                '}';
    }

    public int getTracksImageView()
    {
        return tracksImageView;
    }

    public void setTracksImageView( int tracksImageView )
    {
        this.tracksImageView = tracksImageView;
    }

    public String getTrackName()
    {
        return trackName;
    }

    public void setTrackName( String trackName )
    {
        this.trackName = trackName;
    }

    public String getTrackDesc()
    {
        return trackDesc;
    }

    public void setTrackDesc( String trackDesc )
    {
        this.trackDesc = trackDesc;
    }
}