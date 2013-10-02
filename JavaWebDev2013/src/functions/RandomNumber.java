package functions;

public class RandomNumber implements Function{

	@Override
	public int apply(int number) {
		return (int) (Math.random() * 100);
	}

}
