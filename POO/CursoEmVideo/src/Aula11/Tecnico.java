package Aula11;

public final class Tecnico extends Aluno{
	private int registroProfissional;
	
	public void praticar() {
		for (int i = 0; i < 3; i++)
			System.out.println("Praticando...");
	}

	public int getRegistroProfissional() {
		return registroProfissional;
	}

	public void setRegistroProfissional(int registroProfissional) {
		this.registroProfissional = registroProfissional;
	}
}
