package testpack;
public class testclass {
  public static void main(String[] args) {
		double leib = 0;
        for (int i = 0; i < 200; i++)
        {
            leib = leib + Math.pow(-1, i) / (2 * i + 1);
        }
        double pi = leib * 4;
        System.out.println(pi);
	}
}
