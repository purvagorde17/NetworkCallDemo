package com.det.listviewthemesdemo.model;

public enum Routes {
    ALBUM("http://api.deezer.com/2.0/chart/0/albums?&index=0&limit=10&access_token=sgoVYxJdoU520b47df063afpGdr1Hgv520b47df063ebCWy45p"),
    ARTIST("http://api.deezer.com/2.0/chart/0/artists?&index=0&limit=10&access_token=sgoVYxJdoU520b47df063afpGdr1Hgv520b47df063ebCWy45p"),
    TRACK("http://api.deezer.com/2.0/chart/0/tracks?&index=0&limit=10&access_token=sgoVYxJdoU520b47df063afpGdr1Hgv520b47df063ebCWy45p");

    private String url;

    Routes(String envUrl) {
        this.url = envUrl;
    }

    public String getUrl() {
        return url;
    }
}
