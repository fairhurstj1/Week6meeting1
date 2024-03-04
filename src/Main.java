public class Main {
    public static void main(String[] args) {
        Cat cat1 = new Cat("Satan, Lord of Darkness", "Essence of the Void", 2000, "Archdemon");
//        cat1.setCatName("Satan, Lord of Darkness");
//        cat1.setCatColor("Essence of the Void");
//
//        System.out.println("Cat 1 name: "+cat1.getCatName());
//        System.out.println("Cat 1 color: "+cat1.getCatColor());
//        System.out.println("Cat 1 weight: "+cat1.getCatWeight());
//        System.out.println("Cat 1 breed: "+cat1.getCatBreed());

        //create cat using constructor

        Cat cat2 = new Cat("Fluffy", "Black", 7.4, "Alley");
        System.out.println("Cat 2 name: "+cat2.getCatName()+"\nCat 2 color: "+cat2.getCatColor()+"\nCat 2 weight: "+cat2.getCatWeight()+"\nCat 2 breed: "+cat2.getCatBreed());

        //use setCatName to change cat2's name
        cat2.setCatName("Felix");
        cat2.setCatBreed("Bengal");
        cat2.setCatWeight(25);
        cat2.setCatColor("Orange");

//      System.out.println("Cat 2 name: "+cat2.getCatName()+"\nCat 2 color: "+cat2.getCatColor()+"\nCat 2 weight: "+cat2.getCatWeight()+"\nCat 2 breed: "+cat2.getCatBreed());

        //test new disp method
        cat1.displayCatInfo();
        cat2.displayCatInfo();

        System.out.println("This cat's new weight is "+cat1.calcWeight());

    }
}