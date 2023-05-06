package dataStructure;

public class Food implements Comparable<Food> {

    private String name;
    private String type;
    private int calories;
    private int protein;
    private int fat;
    private int carbohydrate;

    public Food() {
    }

    public Food(String name, String type, int calories, int protein, int fat, int carbohydrate) {
        this.name = name;
        this.type = type;
        this.calories = calories;
        this.protein = protein;
        this.fat = fat;
        this.carbohydrate = carbohydrate;
    }


    public String getName() {
        return name;
    }

    public String getType() {
        return type;
    }

    public int getCalories() {
        return calories;
    }

    public int getProtein() {
        return protein;
    }

    public int getFat() {
        return fat;
    }

    public int getCarbohydrate() {
        return carbohydrate;
    }

    public String toString() {
        return "Food: " + name + " Type: " + type + " Calories: " + calories
                + " Protein: " + protein + " Fat: " + fat + " Carbohydrate: " + carbohydrate;
    }

    @Override
    public int compareTo(Food o) {
        if(this.getCalories()-o.getCalories()<0){
            return -1;
        }else if (this.getCalories()-o.getCalories()>0){
            return 1;
        }else{
            return 0;
        }
    }
}


