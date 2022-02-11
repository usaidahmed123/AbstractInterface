
abstract class AbstractVehicle1 {
	char colour;
	int wheeler;
	abstract void speed();
	void mileage() {
		System.out.println("Economy");
	}
}
	class unicorn extends AbstractVehicle1{
		void speed() {
			System.out.println("125km/h");
		}
	}
public class AbstractVehicle{
	public static void main(String[] args) {
		unicorn ty = new unicorn();
		ty.speed();
		ty.mileage();
		// TODO Auto-generated method stub

	}

}
