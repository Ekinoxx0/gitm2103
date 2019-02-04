public class Rationnel {

	public static long pgcd(long a, long b) {
		while (a != b) {
			if (a > b) {
				a -= b;
			} else {
				b -= a;
			}
		}
		return a;
	}

	//

	private long numerateur;
	private long denominateur;

	public Rationnel(long numerateur, long denominateur) throws IllegalArgumentException {
		if (denominateur == 0) {
			throw new IllegalArgumentException();
		}
		this.numerateur = numerateur;
		this.denominateur = denominateur;
	}

	public long getNumérateur() {
		return this.numerateur;
	}

	public long getDénominateur() {
		return this.denominateur;
	}

	public Rationnel réduction() {
		long pgcd = pgcd(this.numerateur, this.denominateur);
		return new Rationnel(this.numerateur / pgcd, this.denominateur / pgcd);
	}

	public Rationnel somme(Rationnel r) {
		return new Rationnel(this.numerateur * r.denominateur + r.numerateur * this.denominateur,
				this.denominateur * r.denominateur);
	}

	public Rationnel produit(Rationnel r) {
		return new Rationnel(this.numerateur * r.numerateur, this.denominateur * r.denominateur);
	}
	
	public Rationnel division(Rationnel r) {
		return new Rationnel(this.numerateur * r.denominateur, this.denominateur * r.numerateur);
	}
	
	public double resultat() {
		return (double) this.numerateur / (double) this.denominateur;
	}

	@Override
	public String toString() {
		Rationnel irreductible = this.réduction();
		return irreductible.numerateur + "/" + irreductible.denominateur;
	}
}
