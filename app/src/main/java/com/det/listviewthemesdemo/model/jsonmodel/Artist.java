package com.det.listviewthemesdemo.model.jsonmodel;

public class Artist
{
   private int id;
   private String name;
   private String link;
   private String picture;
   private String pictureSmall;
   private String pictureMedium;
   private String pictureBig;
   private String pictureXl;
   private boolean radio;
   private String tracklist;
   private String md5Image;
   private int position;
   private String type;


   public Artist( int id, String name, String link, String picture, String pictureSmall, String pictureMedium, String pictureBig, String pictureXl, boolean radio, String tracklist, String md5Image, int position, String type )
   {
      this.id = id;
      this.name = name;
      this.link = link;
      this.picture = picture;
      this.pictureSmall = pictureSmall;
      this.pictureMedium = pictureMedium;
      this.pictureBig = pictureBig;
      this.pictureXl = pictureXl;
      this.radio = radio;
      this.tracklist = tracklist;
      this.md5Image = md5Image;
      this.position = position;
      this.type = type;
   }

   @Override
   public String toString()
   {
      return "Artist{" +
              "id=" + id +
              ", name='" + name + '\'' +
              ", link='" + link + '\'' +
              ", picture='" + picture + '\'' +
              ", pictureSmall='" + pictureSmall + '\'' +
              ", pictureMedium='" + pictureMedium + '\'' +
              ", pictureBig='" + pictureBig + '\'' +
              ", pictureXl='" + pictureXl + '\'' +
              ", radio=" + radio +
              ", tracklist='" + tracklist + '\'' +
              ", md5Image='" + md5Image + '\'' +
              ", position=" + position +
              ", type='" + type + '\'' +
              '}';
   }

   public String getName()
   {
      return name;
   }

   public void setId( int id )
   {
      this.id = id;
   }

   public void setName( String name )
   {
      this.name = name;
   }

   public void setLink( String link )
   {
      this.link = link;
   }

   public void setPicture( String picture )
   {
      this.picture = picture;
   }

   public void setPictureSmall( String pictureSmall )
   {
      this.pictureSmall = pictureSmall;
   }

   public void setPictureMedium( String pictureMedium )
   {
      this.pictureMedium = pictureMedium;
   }

   public void setPictureBig( String pictureBig )
   {
      this.pictureBig = pictureBig;
   }

   public void setPictureXl( String pictureXl )
   {
      this.pictureXl = pictureXl;
   }

   public void setRadio( boolean radio )
   {
      this.radio = radio;
   }

   public void setTracklist( String tracklist )
   {
      this.tracklist = tracklist;
   }

   public void setMd5Image( String md5Image )
   {
      this.md5Image = md5Image;
   }

   public void setPosition( int position )
   {
      this.position = position;
   }

   public void setType( String type )
   {
      this.type = type;
   }
}
