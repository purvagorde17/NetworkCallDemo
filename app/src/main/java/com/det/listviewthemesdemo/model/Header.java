package com.det.listviewthemesdemo.model;

public class Header
{
    private String header;

    public Header( String header )
    {
        this.header = header;
    }

    @Override
    public String toString()
    {
        return "Header{" +
                "header='" + header + '\'' +
                '}';
    }

    public String getHeader()
    {
        return header;
    }



    public void setHeader( String header )
    {
        this.header = header;
    }
}
