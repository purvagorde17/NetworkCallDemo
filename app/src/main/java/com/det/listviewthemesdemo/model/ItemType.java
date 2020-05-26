package com.det.listviewthemesdemo.model;

public enum ItemType
{
    HEADER( 0 ),
    ALBUM( 1 ),
    TRACK( 2 ),
    ARTIST( 3 );


    private final int value;

    ItemType( final int newValue )
    {
        value = newValue;
    }

    public int getValue()
    {
        return value;
    }
}

