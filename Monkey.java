public class Monkey extends RescueAnimal {
    private String species;
    private String tailLength;
    private String height;
    private String bodyLength;

    public Monkey(String animalType,String species, String name, String gender, String age,
                  String weight, String tailLength, String height, String bodyLength,
                  String acquisitionDate, String acquisitionCountry, String trainingStatus,
                  boolean reserved, String inServiceCountry) {
        setAnimalType(animalType);
        setName(name);
        setSpecies(species);
        setGender(gender);
        setAge(age);
        setWeight(weight);
        setTailLength(tailLength);
        setHeight(height);
        setBodyLength(bodyLength);
        setAcquisitionDate(acquisitionDate);
        setAcquisitionLocation(acquisitionCountry);
        setTrainingStatus(trainingStatus);
        setReserved(reserved);
        setInServiceCountry(inServiceCountry);
    }

    public Monkey(){

    }

    //Mutator methods
    public void setSpecies(String monkeySpecies) {
        species = monkeySpecies;
    }
    public void setTailLength(String monkeyTailLength) {
        tailLength = monkeyTailLength;
    }
    public void setHeight(String monkeyHeight) {
        height = monkeyHeight;
    }
    public void setBodyLength(String monkeyBodyLength) {
        bodyLength = monkeyBodyLength;
    }

    //Accessor methods
    public String getSpecies() {
        return species;
    }
    public String getTailLength() {
        return tailLength;
    }
    public String getHeight() {
        return height;
    }
    public String getBodyLength () {
        return bodyLength;
    }

}
