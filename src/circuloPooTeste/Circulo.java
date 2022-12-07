package circuloPooTeste;

public class Circulo {
	private int x, y;
	private double raio;

	public Circulo() {
		raio = 0.0;
		x = y = 0;
	}

	public int getX(int x) {
		return (x);
	}

	public void setX(int cordenada1) {
		x = cordenada1;
	}

	public int getY(int y) {
		return (y);
	}

	public void setY(int cordenada2) {
		y = cordenada2;
	}

	public int getRaio(int raio) {
		return (raio);
	}

	public void setRaio(double r) {
		raio = r;
	}

	public double area() {
		return Math.PI * Math.pow(raio, 2);
	}

	public double perimetro() {
		return 2 * Math.PI * raio;
	}

	public void moveX(int x1) {
		x += x1;
	}

	public void moveY(int y1) {
		y += y1;
	}

	public void aumenta(int r1) {
		raio *= r1;
	}

	public void exibe() {
		System.out.println("\nCentro: (" + x + ", " + y + ")");
		System.out.printf("Raio: %.2f", raio);
		System.out.printf("\nÁrea: %.2f", area());
		System.out.printf("\nPerímetro: %.2f", perimetro());
	}
}
