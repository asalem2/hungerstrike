package com.example.squid.myapplication;
import org.apache.http.Header;
import org.apache.http.HttpResponse;

import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import java.util.*;
import java.util.Scanner;
import java.net.HttpURLConnection;
import org.json.JSONArray;



public class MainActivity extends ActionBarActivity {
    ListView listview;
    Reponse response Obj;
    CutomAdapter adapter;
    string url = ;
    Gson gson;
    AsyncHttpClient client;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        client new AsyncHttpClient();
        client.get(MainActivity.this, url, new AsyncHttpResponseHandler()){
            public void onSuccess(int statusCode, Header[] headers, byt [] responseBody){
                String responsestr = new string(responseBody);
                gson = new Gson();
                responseObj = gson.from
            }
        }
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }
    public String choice_of_main(){
        Scanner user_input = new Scanner( System.in );
        String choice;
        System.out.println("1. Red Meat. 2. White Meat 3. Veggies");
            choice = user_input.next( );

    }

    HttpResponse<JsonNode> jsonResponse = request.asJson();
    Gson gson = new Gson();
    String responseJSONString = jsonResponse.getBody().toString();
    MyResponseObject myObject = gson.fromJson(responseJSONString, String.class);

    //recipe clasify cuisine (recipe api)
    public static boolean Recipe_is_valid(String response){
        // These code snippets use an open-source library. http://unirest.io/java
        HttpResponse<JsonNode> response = Unirest.post("https://webknox-recipes.p.mashape.com/recipes/cuisine")
                .header("X-Mashape-Key", "OyXfl66F9YmshzYE9joLYoANUEw3p1hMCuEjsnn3WyBvd7nQVn")
                .header("Content-Type", "application/x-www-form-urlencoded")
                .header("Accept", "application/json")
                .field("ingredientList", "3 oz pork shoulder")
                .field("title", "Pork roast with green beans")
                .asJson();

    }
    /*
    //recipe note_card (recipe api)
    public static boolean Recipe_card(String response){
        // These code snippets use an open-source library. http://unirest.io/java
        HttpResponse<JsonNode> response = Unirest.post("https://spoonacular-recipe-food-nutrition-v1.p.mashape.com/recipes/visualizeRecipe")
                .header("X-Mashape-Key", "OyXfl66F9YmshzYE9joLYoANUEw3p1hMCuEjsnn3WyBvd7nQVn")
                .field("author", "Emily Henderson")
                .field("backgroundColor", "#ffffff")
                .field("backgroundImage", "background1")
                .field("fontColor", "#333333")
                .field("image", new File("The image."))
                .field("ingredients", "2 cups of green beans")
                .field("instructions", "cook the beans")
                .field("mask", "ellipseMask")
                .field("readyInMinutes", 60)
                .field("servings", 2)
                .field("source", "spoonacular.com")
                .field("title", "Pork tenderloin with green beans")
                .asJson();
    }
    */
    //recipe calorie_count (recipe api)
    public static boolean calorie_consumption(String response) {
// These code snippets use an open-source library. http://unirest.io/java
        HttpResponse<JsonNode> response = Unirest.get("https://webknox-recipes.p.mashape.com/recipes/mealplans/generate?targetCalories=2000&timeFrame=day")
                .header("X-Mashape-Key", "OyXfl66F9YmshzYE9joLYoANUEw3p1hMCuEjsnn3WyBvd7nQVn")
                .header("Accept", "application/json")
                .asJson();
    }
    /*
    //recipe ingredients (recipe api)
    public static boolean ingredients(String response ) {
        // These code snippets use an open-source library. http://unirest.io/java
        HttpResponse<JsonNode> response = Unirest.get("https://webknox-recipes.p.mashape.com/recipes/findByIngredients?ingredients=apples%2Cflour%2Csugar&number=5")
                .header("X-Mashape-Key", "PgAD8QQiT1msh480NXiurUetSpV8p1Lv5V8jsnXYxFzDObr54X")
                .header("Accept", "application/json")
                .asJson();
    }
    */
     /*
    public static boolean Recipe_is_valid(String response, String ip){
        System.out.println("Testing recaptcha");
        try{
            HttpResponse<JsonNode> response = Unirest.get("https://webknox-recipes.p.mashape.com/recipes/search?cuisine=italian&diet=vegetarian&excludeIngredients=coconut&intolerances=egg%2C+gluten&number=10&offset=0&query=burger&type=main+course")
                    .header("X-Mashape-Key", "PgAD8QQiT1msh480NXiurUetSpV8p1Lv5V8jsnXYxFzDObr54X").header("Accept", "application/json").asJson();
        }
        catch (  Exception e) {
            e.printStackTrace();
            return false;
        }
    }
    */
    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
