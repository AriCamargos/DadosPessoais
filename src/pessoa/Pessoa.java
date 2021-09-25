package pessoa;

import java.text.DecimalFormat;

public class Pessoa {
    private String name;
    private int anoNascimento;
    private int anoAtual;
    private double altura;
    private int geracao;
    private double peso;

    public Pessoa(String name, int anoNascimento, int anoAtual, double altura, double peso ) {
        this.name = name;
        this.anoNascimento = anoNascimento;
        this.anoAtual = anoAtual;
        this.altura = altura;
        this.geracao = geracao;
        this.peso = peso;
    }
    
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAnoNascimento() {
        return this.anoNascimento;
    }

    public void setAnoNascimento(int anoNascimento) {
        this.anoNascimento = anoNascimento;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public int getAnoAtual() {
        return this.anoAtual - this.anoNascimento;
    }

    public void setAnoAtual(int ano) {
        this.anoAtual = ano;
    }

    public int getGeracao() {
        return geracao;
    }

    public void setGeracao(int geracao) {
        this.geracao = geracao;
    }
    
    public int calcularIdade(){
        int ano = 2021;
        int idade = (ano - this.getAnoNascimento());
        return idade;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }
    
    public void imprimirDados(){
        int idade = calcularIdade();
        System.out.println(" ❣ IMPRIMINDO DADOS ❣ \n");
        System.out.println("Nome: " + this.getName());
        System.out.println("Ano de nascimento: " + this.getAnoNascimento());
        System.out.println("Sua idade é de " + this.calcularIdade());
        System.out.println("Altura: " + this.getAltura());
        System.out.println("Peso: " + this.getPeso());
        System.out.println("O seu IMC é de: " + new DecimalFormat("#,##0.00").format(this.calcularImc()));
    }
    
    public void descobrirGeracao(){
        System.out.println(" \n ★ Geração ★️ ");
        if(this.getAnoNascimento() >=1945 && this.getAnoNascimento()<= 1964){
            System.out.println("Baby Boomers");
        }else if(this.getAnoNascimento()>= 1965 && this.getAnoNascimento()<= 1979){ 
            System.out.println("X");
        }else if(this.getAnoNascimento() >= 1980 && this.getAnoNascimento()<= 1995){
            System.out.println("Y - Millennials");
        }else if(this.getAnoNascimento()>= 1996 && this.getAnoNascimento() <= 2021){
            System.out.println("Z - Centennial");
        }else{
            System.out.println("Inválido");
        }
    }
    
    public double calcularImc(){
        double imc = this.getPeso()/Math.pow(this.getAltura(), 2);
        return imc;
    }
    public void tabelaImc(){
        System.out.println("\n ☼ Tabela de IMC ☼ ");
        if(this.calcularImc()< 18.5){
            System.out.println("Abaixo do peso");
        }else if(this.calcularImc()>18.5 && this.calcularImc()<= 24.9){
            System.out.println("Peso normal ✓");
        }else if(this.calcularImc() >= 25 && this.calcularImc()<=29.9){
            System.out.println("Sobrepreso");
        }else if(this.calcularImc() >= 30 && this.calcularImc()<=34.9){
            System.out.println("Obesidade grau 1");
        }else if(this.calcularImc() >= 35 && this.calcularImc()<= 39.9){
            System.out.println("Obesidade grau 2");
        }else if(this.calcularImc()>= 40){
            System.out.println("Obesidade grau 3");
        }else{
            System.out.println("Inválido");
        }
    }
    
}
