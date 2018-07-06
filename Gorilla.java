public class Gorilla extends Mammal {

	public void throwSomething() {
		this.energyLevel -= 5;
		System.out.println("The gorilla has thrown something and lost -5 energy");
	}

	public void eatBananas() {
		this.energyLevel += 10;
		System.out.println("The gorilla ate a banana and gain +10 energy");
	}

	public void climb() {
		this.energyLevel -= 10;
		System.out.println("The gorilla climbed a tree and lost -10 energy");
	}
}
                     