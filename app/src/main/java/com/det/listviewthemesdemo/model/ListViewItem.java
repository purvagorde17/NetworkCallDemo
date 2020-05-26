package com.det.listviewthemesdemo.model;

public class ListViewItem
{
   private Object listViewItem;
   private ItemType listViewItemType;

    public ListViewItem( Object listViewItem, ItemType listViewItemType )
    {
        this.listViewItem = listViewItem;
        this.listViewItemType = listViewItemType;
    }

    public Object getListViewItem()
    {
        return listViewItem;
    }

    public ItemType getListViewItemType()
    {
        return listViewItemType;
    }
}
