package v1;

public class Durée {

	private int h;
	private int m;
	private int s;

	public Durée(int h, int m, int s) {
		if (h < 0 || m < 0 || m > 59 || s < 0 || s > 59) {
			throw new IllegalArgumentException();
		}

		this.h = h;
		this.m = m;
		this.s = s;
	}

	public int getHeures() {
		return this.h;
	}

	public int getMinutes() {
		return this.m;
	}

	public int getSecondes() {
		return this.s;
	}

	public boolean égal(Durée d) {
		return this.h == d.getHeures() && this.m == d.getMinutes() && this.s == d.getSecondes();
	}

	public boolean inf(Durée d) {
		return this.h < d.getHeures() || this.m < d.getMinutes() || this.s < d.getSecondes();
	}

	public void ajouterUneSeconde() {
		this.s = this.s + 1;
		if (this.s > 59) {
			this.s = 0;
			this.m = this.m + 1;
			if (this.m > 59) {
				this.m = 0;
				this.h = this.h + 1;
			}
		}
	}

	public String toString() {
		return this.h + ":" + this.m + ":" + this.s;
	}
}
