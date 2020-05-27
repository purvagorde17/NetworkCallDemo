package com.det.listviewthemesdemo.model.jsonmodel;

public class Album
{
    private int id;
    private String title;
    private String link;
    private String cover;
    private String coverSmall;
    private String coverMedium;
    private String coverBig;
    private String coverXl;
    private String recordType;
    private String trackList;
    private boolean explicitLyrics;
    private String md5Image;
    private int position;
    private Artist artist;
    private String type;

    public Album( int id, String title, String link, String cover, String coverSmall, String coverMedium, String coverBig, String coverXl, String recordType, String trackList, boolean explicitLyrics, String md5Image, int position, Artist artist, String type )
    {
        this.id = id;
        this.title = title;
        this.link = link;
        this.cover = cover;
        this.coverSmall = coverSmall;
        this.coverMedium = coverMedium;
        this.coverBig = coverBig;
        this.coverXl = coverXl;
        this.recordType = recordType;
        this.trackList = trackList;
        this.explicitLyrics = explicitLyrics;
        this.md5Image = md5Image;
        this.position = position;
        this.artist = artist;
        this.type = type;
    }

    public String getTitle()
    {
        return title;
    }

    public void setId( int id )
    {
        this.id = id;
    }

    public void setTitle( String title )
    {
        this.title = title;
    }

    public void setLink( String link )
    {
        this.link = link;
    }

    public void setCover( String cover )
    {
        this.cover = cover;
    }

    public void setCoverSmall( String coverSmall )
    {
        this.coverSmall = coverSmall;
    }

    public void setCoverMedium( String coverMedium )
    {
        this.coverMedium = coverMedium;
    }

    public void setCoverBig( String coverBig )
    {
        this.coverBig = coverBig;
    }

    public void setCoverXl( String coverXl )
    {
        this.coverXl = coverXl;
    }

    public void setRecordType( String recordType )
    {
        this.recordType = recordType;
    }

    public void setTrackList( String trackList )
    {
        this.trackList = trackList;
    }

    public void setExplicitLyrics( boolean explicitLyrics )
    {
        this.explicitLyrics = explicitLyrics;
    }

    public void setMd5Image( String md5Image )
    {
        this.md5Image = md5Image;
    }

    public void setPosition( int position )
    {
        this.position = position;
    }

    public void setArtist( Artist artist )
    {
        this.artist = artist;
    }

    public void setType( String type )
    {
        this.type = type;
    }
}
