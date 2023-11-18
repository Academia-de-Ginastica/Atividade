package dwbe.projetoacademia;


import dwbe.projetoacademia.model.Aluno;
import dwbe.projetoacademia.model.Mensalidade;
import dwbe.projetoacademia.model.Professor;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.ArrayList;
import java.util.List;

@SpringBootTest
class ProjetoacademiaApplicationTests {

	public static void main(String[] args) {


		Aluno aluno1 = new Aluno(1, "Wallace", "123456", "7845632",null, "5555", "Rua Marechal", "4444", "sim", 0 );
		Aluno aluno2 = new Aluno(2, "Carlos", "123456", "7845632",null, "5555", "Rua Marechal", "4444", "sim", 0 );
		Aluno aluno3 = new Aluno(3, "Gustavo", "123456", "7845632",null, "5555", "Rua Marechal", "4444", "sim", 0 );
		Aluno aluno4 = new Aluno(4, "Natanael", "123456", "7845632",null, "5555", "Rua Marechal", "4444", "sim", 0 );
		Aluno aluno5 = new Aluno(5, "Jacimar", "123456", "7845632",null, "5555", "Rua Marechal", "4444", "não", 2 );
		Mensalidade mensalidade1 = new Mensalidade(1, aluno1, null, 110.0, null, 120.0);
		Mensalidade mensalidade2 = new Mensalidade(2, aluno2, null, .0, null, 120.0);
		Mensalidade mensalidade3 = new Mensalidade(3, aluno3, null, 120.0, null, 120.0);
		Mensalidade mensalidade4 = new Mensalidade(4, aluno4, null, 120.0, null, 120.0);

		List<String> periodos = new ArrayList<>();
		List<String> periodo1 = new ArrayList<>();
		List<String> periodo2 = new ArrayList<>();
		List<String> periodo3 = new ArrayList<>();
		periodos.add("Manhâ, Tarde e Noite");
		periodo1.add("Manhâ");
		periodo2.add("Tarde");
		periodo3.add("Noite");
		Professor professor1 = new Professor(1, "Maria", "745963", "888888", null, "8888", " Rua Halfeld", "11111", "Natação", 60, periodo1);
		Professor professor2 = new Professor(2, "João", "147258", "222222", null, "2222", " Rua Halfeld", "11111", "Musculação", 90, periodos);
		Professor professor3 = new Professor(3, "Mariane", "258369", "444444", null, "4444", " Rua Halfeld", "11111", "Dança", 60, periodo3);
		Professor professor4 = new Professor(4, "Gabriel", "369147", "666666", null, "6666", " Rua Halfeld", "11111", "Boxe", 90, periodo2);
		System.out.println(aluno1.getNome());
		System.out.println(mensalidade1.getValorMensalidade());
		System.out.println(professor2.getNome());
		System.out.println(periodos);

		System.out.println(aluno1.getNome());
		System.out.println(mensalidade1.getValorMensalidade());
		System.out.println(professor2.getNome());
		System.out.println(periodos);
	}
}
