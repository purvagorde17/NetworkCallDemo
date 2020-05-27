package com.det.listviewthemesdemo.model.jsonmodel;

import java.util.List;

public class Data<T>
{
    private T [] data;

    public Data( T [] data )
    {
        this.data = data;
    }

    public T [] getData()
    {
        return data;
    }

    public void setData( T [] data )
    {
        this.data = data;
    }
}
