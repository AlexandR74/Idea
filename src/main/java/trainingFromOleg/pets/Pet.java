package trainingFromOleg.pets;

public class Pet {

    private String name = "Vaska";
    private static String petState = "I have name";

    public Pet() {
    }

    public Pet(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public static String getPetState() {
        return petState;
    }

    public static void setPetState(String petState) {
        Pet.petState = petState;
    }
}