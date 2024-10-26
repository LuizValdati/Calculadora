package trabalho1;

public class Calculadora {
    private PilhaGenerica<Float> pilhaReais;
    private PilhaGenerica<Character> pilhaOperadores;

    Calculadora(){
        pilhaReais = new PilhaGenerica<Float>();
        pilhaOperadores = new PilhaGenerica<Character>();
    }

    void imprimeMenu(){
        System.out.println("--------CALCULADORA--------");
        System.out.println("Selecione a opção desejada");
        System.out.println("1 - Empilhar número");
        System.out.println("2 - Empilhar operador");
        System.out.println("3 - Calcular");
        System.out.println("4 - Imprimir Pilhas");
        System.out.println("5 - Sair");
        System.out.println("Selecione uma opção: ");
    }

    void Empilharnumero(Float n){
        pilhaReais.empilha(n);
    }
    
    void Empilharoperador(Character n){
        pilhaOperadores.empilha(n);
    }

    void imprimePilhas(){
        System.out.println("Números: ");
        pilhaReais.imprimePilha();
        System.out.println("---------------------------");
        System.out.println("Operadores: ");
        pilhaOperadores.imprimePilha();
    }

    void Calcular(){
        //PilhaGenerica atualop = pilhaOperadores;
        //PilhaGenerica atualre = pilhaReais;
        if(pilhaOperadores.getQt() == 0){
            System.out.println("Não possui nenhum operador!");
            return;}
        if(pilhaReais.getQt() == 0){
            System.out.println("Não possui nenhum número!");
            return;}
        
        if(pilhaReais.getQt() <= pilhaOperadores.getQt()){
            System.out.println("Faltam " + pilhaOperadores.getQt() + " números para realizar operação");
			return;
        }
		else{
		if(pilhaOperadores.getQt() + 1 < pilhaReais.getQt()){
            int opfalta = pilhaReais.getQt() - 1;
			System.out.println("Faltam " + opfalta + " operadores para realizar operação");
			return;
        }
		else{
			float a, b = 0;
            while (pilhaOperadores.getQt() > 0) {
			a = pilhaReais.desempilha();
			b = pilhaReais.desempilha();
			switch(pilhaOperadores.desempilha()){
				case '+':
					pilhaReais.empilha(a + b);
					break;
				case '-':
					pilhaReais.empilha(a - b);
					break;
				case '/':
                    if (b == 0) {
                        System.out.println("Erro: divisão por zero.");
                        return;
                    }
					pilhaReais.empilha(a / b);
					break;
				case '*':
					pilhaReais.empilha(a * b);
					break;
			}
		}
		System.out.println("Resultado: " + pilhaReais.desempilha());
        return;
    }
}
    }
}