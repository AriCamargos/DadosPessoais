package pessoa;
public class TestePessoa {
    public static void main(String[] args) {
        Pessoa p1 = new Pessoa("Joaquina Brasil", 1993, 2021, 1.8, 70);
        
        p1.imprimirDados();
        p1.descobrirGeracao();
        p1.calcularIdade();
        p1.calcularImc();
        p1.tabelaImc();
    }
}
