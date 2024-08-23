import java.util.Scanner;
public class PetsDriver {
    
    public static void main(String[] args){

        Scanner input = new Scanner(System.in);
        System.out.print("Enter dog or cat: ");
        String pet = input.nextLine().toLowerCase();

            if(pet.equals("dog")){
                Pets petDog = new Dog();
                petDog.activity();
                petDog.petFood();
            }
            else if(pet.equals("cat")){
                Pets petCat = new Cat();
                petCat.activity();
                petCat.petFood();
            }
            else{
                System.out.print("Invalid Input.");
            }

        input.close();
    }
}