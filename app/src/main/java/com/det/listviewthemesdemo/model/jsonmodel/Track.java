package com.det.listviewthemesdemo.model.jsonmodel;

public class Track
{
    private int id;
    private String title;
    private String titleShort;
    private String titleVersion;
    private String link;
    private int duration;
    private int rank;
    private boolean explictLyrics;
    private int explicitContentLyrics;
    private int explicitContentCover;
    private String preview;
    private String md5Origin;
    private String md5Image;
    private int mediaVersion;
    private String filesize128;
    private String filesize320;
    private String filesizeMisc;
    private int position;
    private Artist artist;
    private Album album;
    private String type;

    public Artist getArtist()
    {
        return artist;
    }

    public String getTitle()
    {
        return title;
    }

    public Track( int id, String title, String titleShort, String titleVersion, String link, int duration, int rank, boolean explictLyrics, int explicitContentLyrics, int explicitContentCover, String preview, String md5Origin, String md5Image, int mediaVersion, String filesize128, String filesize320, String filesizeMisc, int position, Artist artist, Album album, String type )
    {
        this.id = id;
        this.title = title;
        this.titleShort = titleShort;
        this.titleVersion = titleVersion;
        this.link = link;
        this.duration = duration;
        this.rank = rank;
        this.explictLyrics = explictLyrics;
        this.explicitContentLyrics = explicitContentLyrics;
        this.explicitContentCover = explicitContentCover;
        this.preview = preview;
        this.md5Origin = md5Origin;
        this.md5Image = md5Image;
        this.mediaVersion = mediaVersion;
        this.filesize128 = filesize128;
        this.filesize320 = filesize320;
        this.filesizeMisc = filesizeMisc;
        this.position = position;
        this.artist = artist;
        this.album = album;
        this.type = type;
    }

    public void setId( int id )
    {
        this.id = id;
    }

    public void setTitle( String title )
    {
        this.title = title;
    }

    public void setTitleShort( String titleShort )
    {
        this.titleShort = titleShort;
    }

    public void setTitleVersion( String titleVersion )
    {
        this.titleVersion = titleVersion;
    }

    public void setLink( String link )
    {
        this.link = link;
    }

    public void setDuration( int duration )
    {
        this.duration = duration;
    }

    public void setRank( int rank )
    {
        this.rank = rank;
    }

    public void setExplictLyrics( boolean explictLyrics )
    {
        this.explictLyrics = explictLyrics;
    }

    public void setExplicitContentLyrics( int explicitContentLyrics )
    {
        this.explicitContentLyrics = explicitContentLyrics;
    }

    public void setExplicitContentCover( int explicitContentCover )
    {
        this.explicitContentCover = explicitContentCover;
    }

    public void setPreview( String preview )
    {
        this.preview = preview;
    }

    public void setMd5Origin( String md5Origin )
    {
        this.md5Origin = md5Origin;
    }

    public void setMd5Image( String md5Image )
    {
        this.md5Image = md5Image;
    }

    public void setMediaVersion( int mediaVersion )
    {
        this.mediaVersion = mediaVersion;
    }

    public void setFilesize128( String filesize128 )
    {
        this.filesize128 = filesize128;
    }

    public void setFilesize320( String filesize320 )
    {
        this.filesize320 = filesize320;
    }

    public void setFilesizeMisc( String filesizeMisc )
    {
        this.filesizeMisc = filesizeMisc;
    }

    public void setPosition( int position )
    {
        this.position = position;
    }

    public void setArtist( Artist artist )
    {
        this.artist = artist;
    }

    public void setAlbum( Album album )
    {
        this.album = album;
    }

    public void setType( String type )
    {
        this.type = type;
    }
}
