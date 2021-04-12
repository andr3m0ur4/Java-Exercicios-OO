public class TestarPessoa {
    public static void main(String[] args) {
        Pessoa pessoa = new Pessoa();
        pessoa.setNome("André Moura");
        pessoa.setIdade(30);
        pessoa.setAltura(1.78);

        System.out.println("Nome: " + pessoa.getNome());
        System.out.println("Idade: " + pessoa.getIdade());
        System.out.println("Altura: " + pessoa.getAltura());
        System.out.println("Fez aniversário!");
        pessoa.fazAniversario(true);

        System.out.println("Nome: " + pessoa.getNome());
        System.out.println("Idade: " + pessoa.getIdade());
        System.out.println("Altura: " + pessoa.getAltura());
    }
}
