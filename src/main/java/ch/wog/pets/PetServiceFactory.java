package ch.wog.pets;

/**
 * PetServiceFactory
 * Author: rmisteli
 * Created: 01.11.21 - 09:19
 */
public class PetServiceFactory {

    public PetService getPetService(String petType) {
        switch(petType) {
            case "dog":
                return new DogPetService();
            case "cat":
                return new CatPetService();
            default:
                return new DogPetService();
        }
    }
}
