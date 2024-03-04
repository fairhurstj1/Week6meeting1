public class Cat {

    //setup inst var
    //cat name
    private String catName;
    //cat color
    private String catColor;
    //cat weight
    private double catWeight;
    //cat breed
    private String catBreed;

    public Cat(){
        catBreed = "Need a breed";
    }
    public Cat(String name, String color, double weight, String breed)
    {
        this.catName = name;
        catColor = color;
        catWeight = weight;
        catBreed = breed;
    }

    //setup setters, getters ;for each inst var
    //Setter method technically a mutator method
    //Getter is Accessor method - means we can get data from the method



    //setter for catName
    public void setCatName(String aCatName){
        catName = aCatName;
    }//ends setCatName method
    //getter for catName
    public String getCatName(){
        return catName;
    }//ends getCatName



    //setter for catColor
    public void setCatColor(String aCatColor){
        catColor = aCatColor;
    }//ends setCatColor method
    //getter for catColor
    public String getCatColor(){
        return catColor;
    }//ends getCatColor



    //setter for catWeight
    public void setCatWeight(double aCatWeight){
        catWeight = aCatWeight;
    }//ends setCatWeight method
    //getter for catWeight
    public double getCatWeight(){
        return catWeight;
    }//ends getCatWeight



    //setter for catBreed
    public void setCatBreed(String aCatBreed){
        catBreed = aCatBreed;
    }//ends setCatBreed method
    //getter for catBreed
    public String getCatBreed(){
        return catBreed;
    }//ends getCatBreed

    //create disp method to print obj info
    public void displayCatInfo(){
        System.out.println("This cat's name is: "+this.getCatName());
        System.out.println("This cat's color is: "+this.getCatColor());
        System.out.println("This cat's weight is: "+this.getCatWeight());
        System.out.println("This cat's breed is: "+this.getCatBreed());
    }

    //method to recalc cat weight
    public double calcWeight(){
        //add 1 pound to cat weight
        return catWeight+1;
    }
}



