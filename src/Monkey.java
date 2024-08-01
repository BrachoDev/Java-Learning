// Carlos Bracho

public class Monkey extends RescueAnimal{

    // Instance variables specific for Monkey
    private String specie;
    private float tailLength;
    private float height;
    private float bodyLength;

    // Constructor
    public Monkey(String name, String specie, String gender, String age,
                  String weight, String acquisitionDate, String acquisitionCountry,
                  String trainingStatus, boolean reserved, String inServiceCountry, float tailLength,
                  float height, float bodyLength) {
        setName(name);
        setSpecie(specie);
        setGender(gender);
        setAge(age);
        setWeight(weight);
        setAcquisitionDate(acquisitionDate);
        setAcquisitionLocation(acquisitionCountry);
        setTrainingStatus(trainingStatus);
        setReserved(reserved);
        setInServiceCountry(inServiceCountry);
        setTailLength(tailLength);
        setHeight(height);
        setBodyLength(bodyLength);
    }

    // Mutator methods:
    public void setSpecie(String monkeySpecie) {
        this.specie = specie;
    }

    public void setTailLength(float tailLength) {
        this.tailLength = tailLength;
    }

    public void setHeight(float height) {
        this.height = height;
    }

    public void setBodyLength(float bodyLength) {
        this.bodyLength = bodyLength;
    }

    // Accessor Methods:
    public String getSpecie() {
        return specie;
    }

    public float getTailLength() {
        return tailLength;
    }

    public float getHeight() {
        return height;
    }

    public float getBodyLength() {
        return bodyLength;
    }
}
