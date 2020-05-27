package com.det.listviewthemesdemo.model;

public class TrackItem
{
    private int tracksImageView;
    private String trackName;
    private String trackArtist;

    public void setTracksImageView( int tracksImageView )
    {
        this.tracksImageView = tracksImageView;
    }

    public void setTrackName( String trackName )
    {
        this.trackName = trackName;
    }

    public void setTrackArtist( String trackArtist )
    {
        this.trackArtist = trackArtist;
    }

    public int getTracksImageView()
    {
        return tracksImageView;
    }

    public String getTrackName()
    {
        return trackName;
    }

    public String getTrackArtist()
    {
        return trackArtist;
    }

    @Override
    public String toString()
    {
        return "TrackItem{" +
                "tracksImageView=" + tracksImageView +
                ", trackName='" + trackName + '\'' +
                ", trackArtist='" + trackArtist + '\'' +
                '}';
    }

    public TrackItem( int tracksImageView, String trackName, String trackArtist )
    {
        this.tracksImageView = tracksImageView;
        this.trackName = trackName;
        this.trackArtist = trackArtist;
    }
}