package one.digitalinnovation.gof.strategy;

public class ComportamentoNormal implements Comportamento {

	@Override
	public void mover() {
		System.out.println("Movendo-se normalmente...");
	}

	@Override
	public void pular() {
		System.out.println("Pulando 2 metros");
		
	}

}
