
public class FlowerDemo {

	public static void main(String[] args) {
		Flower flower1 = new Flower();
		Flower flower2 = new Flower("Rose", 10, 80);
		
		flower1.setFlowerName("Tulip");
		flower1.setNumberOfPetals(6);
		flower1.setPrice(50);
		System.out.println(flower1.getFlowerName() + " " + flower1.getNumberOfPetals() + " " + flower1.getPrice());

	}

}
