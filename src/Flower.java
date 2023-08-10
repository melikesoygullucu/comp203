
public class Flower {
	private String flowerName;
	private int numberOfPetals;
	private float price;

	public Flower() {
	}

	public Flower(String flowerName, int numberOfPetals, float price) {
		this.flowerName = flowerName;
		this.numberOfPetals = numberOfPetals;
		this.price = price;

	}

	public String getFlowerName() {
		return flowerName;
	}

	public void setFlowerName(String flowerName) {
		this.flowerName = flowerName;
	}

	public int getNumberOfPetals() {
		return numberOfPetals;
	}

	public void setNumberOfPetals(int numberOfPetals) {
		this.numberOfPetals = numberOfPetals;
	}

	public float getPrice() {
		return price;
	}

	public void setPrice(float price) {
		this.price = price;
	}

}
