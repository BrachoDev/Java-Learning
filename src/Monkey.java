// Carlos Bracho

public class Monkey extends RescueAnimal{

    // Instance variables specific for Monkey
    private String specie;
    private double tailLength;
    private double height;
    private double bodyLength;

    // Constructor
    public Monkey(String name, String specie, String gender, String age,
                  String weight, String acquisitionDate, String acquisitionCountry,
                  String trainingStatus, boolean reserved, String inServiceCountry, double tailLength,
                  double height, double bodyLength) {
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

    public void setTailLength(double tailLength) {
        this.tailLength = tailLength;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public void setBodyLength(double bodyLength) {
        this.bodyLength = bodyLength;
    }

    // Accessor Methods:
    public String getSpecie() {
        return specie;
    }

    public double getTailLength() {
        return tailLength;
    }

    public double getHeight() {
        return height;
    }

    public double getBodyLength() {
        return bodyLength;
    }
}
