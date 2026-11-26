// EXERCICIO 1 

class Usuario {
    private String nome;
    private String email;

    public Usuario(String nome, String email) {
        this.nome = nome;
        this.email = email;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void exibirDados() {
        System.out.println("Nome: " + nome);
        System.out.println("Email: " + email);
    }
}

class Administrador extends Usuario {
    private String nivelAcesso;

    public Administrador(String nome, String email, String nivelAcesso) {
        super(nome, email);
        this.nivelAcesso = nivelAcesso;
    }

    public void setNivelAcesso(String nivelAcesso) {
        this.nivelAcesso = nivelAcesso;
    }

    @Override
    public void exibirDados() {
        super.exibirDados();
        System.out.println("Nivel de acesso: " + nivelAcesso);
    }
}


// EXERCICIO 2

class Produto {
    protected String nome;
    protected double preco;

    public Produto(String nome, double preco) {
        this.nome = nome;
        this.preco = preco;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public void mostrarProduto() {
        System.out.println("Nome: " + nome);
        System.out.println("Preco: " + preco);
    }
}

class Notebook extends Produto {
    private int memoriaRAM;

    public Notebook(String nome, double preco, int memoriaRAM) {
        super(nome, preco);
        this.memoriaRAM = memoriaRAM;
    }

    public void setMemoriaRAM(int memoriaRAM) {
        this.memoriaRAM = memoriaRAM;
    }

    @Override
    public void mostrarProduto() {
        super.mostrarProduto();
        System.out.println("Memoria RAM: " + memoriaRAM + " GB");
    }
}


// EXERCICIO 3

class Funcionario {
    private String nome;
    private double salario;

    public Funcionario(String nome, double salario) {
        this.nome = nome;
        this.salario = salario;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public void mostrarFuncionario() {
        System.out.println("Nome: " + nome);
        System.out.println("Salario: " + salario);
    }
}

class Desenvolvedor extends Funcionario {
    private String linguagemPrincipal;

    public Desenvolvedor(String nome, double salario, String linguagemPrincipal) {
        super(nome, salario);
        this.linguagemPrincipal = linguagemPrincipal;
    }

    @Override
    public void mostrarFuncionario() {
        super.mostrarFuncionario();
        System.out.println("Linguagem: " + linguagemPrincipal);
    }
}


// EXERCICIO 4 

class Pessoa {
    protected String nome;
    protected int idade;

    public Pessoa(String nome, int idade) {
        this.nome = nome;
        this.idade = idade;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public void apresentar() {
        System.out.println("Nome: " + nome);
        System.out.println("Idade: " + idade);
    }
}

class Aluno extends Pessoa {
    private String curso;

    public Aluno(String nome, int idade, String curso) {
        super(nome, idade);
        this.curso = curso;
    }

    @Override
    public void apresentar() {
        super.apresentar();
        System.out.println("Curso: " + curso);
    }
}


public class Main {
    public static void main(String[] args) {

        System.out.println("EXERCICIO 1");

        Administrador admin = new Administrador("Carlos", "carlos@email.com", "Basico");
        admin.setNivelAcesso("Total");
        admin.exibirDados();


        System.out.println("\nEXERCICIO 2");

        Notebook notebook = new Notebook("Dell", 3500, 8);
        notebook.setMemoriaRAM(16);
        notebook.mostrarProduto();


        System.out.println("\nEXERCICIO 3");

        Desenvolvedor dev = new Desenvolvedor("Joao", 3000, "Java");
        dev.setSalario(4500);
        dev.mostrarFuncionario();


        System.out.println("\nEXERCICIO 4");

        Aluno aluno = new Aluno("Maria", 18, "Informatica");
        aluno.setIdade(19);
        aluno.apresentar();
    }
}