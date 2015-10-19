//recipe api
package com.example.squid.myapplication;

import java.util.List;

/**
 * Created by squid on 10/19/2015.
 */
public class response_computer_daily_meal {

    /**
     * nutrients : {"protein":90.62,"fat":56.21,"carbohydrates":309.43,"calories":1997.07}
     * meals : [{"id":47200,"title":"Post Grape-nuts Carb Bars","image":"post_grape-nuts_carb_bars-47200.jpg","imageUrls":["post_grape-nuts_carb_bars-47200.jpg","post-grape-nuts-carb-bars-2-47200.jpg"]},{"id":223009,"title":"Lemon-spiced chicken with chickpeas","image":"Lemon-spiced-chicken-with-chickpeas-223009.jpg","imageUrls":["Lemon-spiced-chicken-with-chickpeas-223009.jpg"]},{"id":302815,"title":"Grilled Peanut Butter and Banana Sandwich","image":"Grilled-Peanut-Butter-and-Banana-Sandwich-302815.jpg","imageUrls":["Grilled-Peanut-Butter-and-Banana-Sandwich-302815.jpg"]}]
     */

    private NutrientsEntity nutrients;
    private List<MealsEntity> meals;

    public void setNutrients(NutrientsEntity nutrients) {
        this.nutrients = nutrients;
    }

    public void setMeals(List<MealsEntity> meals) {
        this.meals = meals;
    }

    public NutrientsEntity getNutrients() {
        return nutrients;
    }

    public List<MealsEntity> getMeals() {
        return meals;
    }

    public static class NutrientsEntity {
        /**
         * protein : 90.62
         * fat : 56.21
         * carbohydrates : 309.43
         * calories : 1997.07
         */

        private double protein;
        private double fat;
        private double carbohydrates;
        private double calories;

        public void setProtein(double protein) {
            this.protein = protein;
        }

        public void setFat(double fat) {
            this.fat = fat;
        }

        public void setCarbohydrates(double carbohydrates) {
            this.carbohydrates = carbohydrates;
        }

        public void setCalories(double calories) {
            this.calories = calories;
        }

        public double getProtein() {
            return protein;
        }

        public double getFat() {
            return fat;
        }

        public double getCarbohydrates() {
            return carbohydrates;
        }

        public double getCalories() {
            return calories;
        }
    }

    public static class MealsEntity {
        /**
         * id : 47200
         * title : Post Grape-nuts Carb Bars
         * image : post_grape-nuts_carb_bars-47200.jpg
         * imageUrls : ["post_grape-nuts_carb_bars-47200.jpg","post-grape-nuts-carb-bars-2-47200.jpg"]
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
