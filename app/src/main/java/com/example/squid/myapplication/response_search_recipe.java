//recipe api

package com.example.squid.myapplication;

import java.util.List;

/**
 * Created by squid on 10/19/2015.
 */
public class response_search_recipe {

    /**
     * expires : 1380752010364
     * results : [{"id":95004,"title":"Lentil Soup","imageUrls":["lentil-soup-2-95004.png","lentil_soup-95004.jpg"],"image":"lentil-soup-2-95004.png"},{"id":20291,"title":"Pomegranate Lentil Soup","imageUrls":["pomegranate_lentil_soup-20291.jpg","pomegranate-lentil-soup-2-20291.jpg"],"image":"pomegranate_lentil_soup-20291.jpg"},{"id":20365,"title":"Crockpot Lentil Soup","imageUrls":["crockpot_lentil_soup-20365.jpg","crockpot-lentil-soup-2-20365.jpg"],"image":"crockpot_lentil_soup-20365.jpg"},{"id":33824,"title":"Lentil-barley Soup","imageUrls":["lentil-barley_soup-33824.jpg","lentil-barley-soup-2-33824.jpg"],"image":"lentil-barley_soup-33824.jpg"},{"id":33883,"title":"Lentil Cream Soup","imageUrls":["lentil-cream-soup-2-33883.jpg"],"image":"lentil-cream-soup-2-33883.jpg"},{"id":34004,"title":"Blended Lentil Soup","imageUrls":["blended_lentil_soup-34004.jpg","blended-lentil-soup-2-34004.jpg"],"image":"blended_lentil_soup-34004.jpg"},{"id":34024,"title":"Sicilian Lentil Soup","imageUrls":["sicilian-lentil-soup-2-34024.jpg"],"image":"sicilian-lentil-soup-2-34024.jpg"},{"id":34044,"title":"Lentil Soup With Yams","imageUrls":["lentil_soup_with_yams-34044.jpg","lentil-soup-with-yams-2-34044.jpg"],"image":"lentil_soup_with_yams-34044.jpg"},{"id":34047,"title":"Vegetable Lentil Soup","imageUrls":["vegetable_lentil_soup-34047.JPG","vegetable-lentil-soup-2-34047.jpg"],"image":"vegetable_lentil_soup-34047.JPG"},{"id":34093,"title":"French Lentil Soup","imageUrls":["french-lentil-soup-2-34093.jpg","french_lentil_soup-34093.jpg"],"image":"french-lentil-soup-2-34093.jpg"}]
     * number : 10
     * offset : 0
     * processingTimeMs : 123045
     * isStale : false
     */

    private long expires;
    private int number;
    private int offset;
    private int processingTimeMs;
    private boolean isStale;
    private List<ResultsEntity> results;

    public void setExpires(long expires) {
        this.expires = expires;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public void setOffset(int offset) {
        this.offset = offset;
    }

    public void setProcessingTimeMs(int processingTimeMs) {
        this.processingTimeMs = processingTimeMs;
    }

    public void setIsStale(boolean isStale) {
        this.isStale = isStale;
    }

    public void setResults(List<ResultsEntity> results) {
        this.results = results;
    }

    public long getExpires() {
        return expires;
    }

    public int getNumber() {
        return number;
    }

    public int getOffset() {
        return offset;
    }

    public int getProcessingTimeMs() {
        return processingTimeMs;
    }

    public boolean getIsStale() {
        return isStale;
    }

    public List<ResultsEntity> getResults() {
        return results;
    }

    public static class ResultsEntity {
        /**
         * id : 95004
         * title : Lentil Soup
         * imageUrls : ["lentil-soup-2-95004.png","lentil_soup-95004.jpg"]
         * image : lentil-soup-2-95004.png
         */

        private int id;
        private String title;
        private String image;
        private List<String> imageUrls;

        public void setId(int id) {
            this.id = id;
        }

        public void setTitle(String title) {
            this.title = title;
        }

        public void setImage(String image) {
            this.image = image;
        }

        public void setImageUrls(List<String> imageUrls) {
            this.imageUrls = imageUrls;
        }

        public int getId() {
            return id;
        }

        public String getTitle() {
            return title;
        }

        public String getImage() {
            return image;
        }

        public List<String> getImageUrls() {
            return imageUrls;
        }
    }
}
