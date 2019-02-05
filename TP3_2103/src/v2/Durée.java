package v2;

public class Durée {

	private final int h;
	private final int m;
	private final int s;

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
	
	public Durée ajouterUneSeconde() {
		return new Durée(
				this.s + 1 > 59 ? (this.m + 1 > 59 ? this.h + 1 : this.h) : this.h, 
				this.s + 1 > 59 ? (this.m + 1 > 59 ? 0 : this.m + 1) : this.m, 
				this.s + 1 > 59 ? 0 : this.s + 1
						);
	}

	public String toString() {
		return this.h + ":" + this.m + ":" + this.s;
	}
}
