public class VRacineCarree {
	
	public static void main(String[] args) {
		
		final int a = 2;
		final int n = 4;
		
		Rationnel r = new Rationnel(a, 1);
		
		for(int i = 0; i < n; i++) {
			r = new Rationnel(a, 1).division(r).somme(r).produit(new Rationnel(1, 2));
		}
		
		System.out.println("Valeur approchée de racine carrée de 2 = " + r.toString());
		System.out.println("Valeur approchée de racine carrée de 2 = " + r.resultat());
		
	}
	
	
}
