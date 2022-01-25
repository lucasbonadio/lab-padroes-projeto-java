package one.digitalinnovation.gof.strategy;

public class ComportamentoDefensivo implements Comportamento {

	@Override
	public void mover() {
		System.out.println("Movendo-se defensivamente...");
	}

	@Override
	public void pular() {
		System.out.println("Pulando 1 metro");
		
	}

}
