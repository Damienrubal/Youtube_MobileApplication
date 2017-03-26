package com.example.damin.tp_final_mobileapplication.Model;


import java.util.List;

/**
 * Created by damin on 17/03/2017.
 */

public class Video {

    private String kind;
    private String etag;
    private String nextPageToken;
    private String regionCode;
    private PageInfo pageInfo;
    private List<Item> items = null;

    public String getKind() {
        return kind;
    }
    public void setKind(String kind) {
        this.kind = kind;
    }
    public String getEtag() {
        return etag;
    }
    public void setEtag(String etag) {
        this.etag = etag;
    }
    public String getNextPageToken() {
        return nextPageToken;
    }
    public void setNextPageToken(String nextPageToken) {
        this.nextPageToken = nextPageToken;
    }
    public String getRegionCode() {
        return regionCode;
    }
    public void setRegionCode(String regionCode) {
        this.regionCode = regionCode;
    }
    public PageInfo getPageInfo() {
        return pageInfo;
    }

    public void setPageInfo(PageInfo pageInfo) {
        this.pageInfo = pageInfo;
    }

    public List<Item> getItems() {
        return items;
    }

    public void setItems(List<Item> items) {
        this.items = items;
    }


    public class Default {

        private String url;
        private Integer width;
        private Integer height;

        public String getUrl() {
            return url;
        }

        public void setUrl(String url) {
            this.url = url;
        }

        public Integer getWidth() {
            return width;
        }

        public void setWidth(Integer width) {
            this.width = width;
        }

        public Integer getHeight() {
            return height;
        }

        public void setHeight(Integer height) {
            this.height = height;
        }

    }


    public class High {

        private String url;

        private Integer width;

        private Integer height;

        public String getUrl() {
            return url;
        }
        public void setUrl(String url) {
            this.url = url;
        }
        public Integer getWidth() {
            return width;
        }
        public void setWidth(Integer width) {
            this.width = width;
        }
        public Integer getHeight() {
            return height;
        }
        public void setHeight(Integer height) {
            this.height = height;
        }
    }

    public class Id {

        private String kind;
        private String videoId;
        public String getKind() {
            return kind;
        }
        public void setKind(String kind) {
            this.kind = kind;
        }
        public String getVideoId() {
            return videoId;
        }
        public void setVideoId(String videoId) {
            this.videoId = videoId;
        }
    }

    public class Item {

        private String kind;
        private String etag;
        private Id id;
        private Snippet snippet;


        public String getKind() {
            return kind;
        }
        public void setKind(String kind) {
            this.kind = kind;
        }
        public String getEtag() {
            return etag;
        }
        public void setEtag(String etag) {
            this.etag = etag;
        }
        public Id getId() {
            return id;
        }
        public void setId(Id id) {
            this.id = id;
        }
        public Snippet getSnippet() {
            return snippet;
        }
        public void setSnippet(Snippet snippet) {
            this.snippet = snippet;
        }
    }


    public class Medium {


        private String url;
        private Integer width;
        private Integer height;
        public String getUrl() {
            return url;
        }
        public void setUrl(String url) {
            this.url = url;
        }
        public Integer getWidth() {
            return width;
        }
        public void setWidth(Integer width) {
            this.width = width;
        }
        public Integer getHeight() {
            return height;
        }
        public void setHeight(Integer height) {
            this.height = height;
        }
    }


    public class PageInfo {

        private Integer totalResults;
        private Integer resultsPerPage;

        public Integer getTotalResults() {
            return totalResults;
        }
        public void setTotalResults(Integer totalResults) {
            this.totalResults = totalResults;
        }
        public Integer getResultsPerPage() {
            return resultsPerPage;
        }
        public void setResultsPerPage(Integer resultsPerPage) {
            this.resultsPerPage = resultsPerPage;
        }

    }


    public class Snippet {

        private String publishedAt;
        private String channelId;
        private String title;
        private String description;
        private Thumbnails thumbnails;
        private String channelTitle;
        private String liveBroadcastContent;

        public String getPublishedAt() {
            return publishedAt;
        }
        public void setPublishedAt(String publishedAt) {
            this.publishedAt = publishedAt;
        }
        public String getChannelId() {
            return channelId;
        }
        public void setChannelId(String channelId) {
            this.channelId = channelId;
        }
        public String getTitle() {
            return title;
        }
        public void setTitle(String title) {
            this.title = title;
        }
        public String getDescription() {
            return description;
        }
        public void setDescription(String description) {
            this.description = description;
        }
        public Thumbnails getThumbnails() {
            return thumbnails;
        }
        public void setThumbnails(Thumbnails thumbnails) {
            this.thumbnails = thumbnails;
        }
        public String getChannelTitle() {
            return channelTitle;
        }
        public void setChannelTitle(String channelTitle) {
            this.channelTitle = channelTitle;
        }
       public String getLiveBroadcastContent() {
            return liveBroadcastContent;
        }
        public void setLiveBroadcastContent(String liveBroadcastContent) {
            this.liveBroadcastContent = liveBroadcastContent;
        }

    }


    public class Thumbnails {

        private Default _default;
        private Medium medium;
        private High high;
        public Default getDefault() {
            return _default;
        }
        public void setDefault(Default _default) {
            this._default = _default;
        }
        public Medium getMedium() {
            return medium;
        }
        public void setMedium(Medium medium) {
            this.medium = medium;
        }
        public High getHigh() {
            return high;
        }
        public void setHigh(High high) {
            this.high = high;
        }

    }
}
