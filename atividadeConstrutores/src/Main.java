public class Main {
    public static void main(String[] args) {
        Estudante estudante1= new Estudante("Pedro",1202,"agronomia");

        Estudante estudante2= new Estudante ("Paulo", 2525);

        System.out.println(estudante1.getNome() + " | " + estudante1.getMatricula()+ " | "+estudante1.getCurso());
        System.out.println(estudante2.getNome()+" | "+estudante2.getMatricula()+" | "+estudante2.getCurso());

        System.out.println("-----------------------------------------------------------------------------------------------------");

        Livro livro1= new Livro("O mágico de Oz","L. Frank Baum", 350.50);
        System.out.println(livro1.getTitulo() + " | "+ livro1.getAutor() + " | "+ livro1.getPreco()+ " reais");

        Livro livro2= new Livro("Jogos Vorazes","Suzanne Collins");
        System.out.println(livro2.getTitulo() + " | "+ livro2.getAutor() + " | "+ livro2.getPreco()+ "reais");
        System.out.println("-----------------------------------------------------------------------------------------------------");

        Cachorro cachorro1= new Cachorro("Bolinha", "Viralata", 1);
        System.out.println(cachorro1.getNome() + " | " + cachorro1.getRaca() + " | " + cachorro1.getIdade()+" anos");
        Cachorro cachorro2= new Cachorro("Flash", "Pitbull");
        System.out.println(cachorro2.getNome() + " | " + cachorro2.getRaca() + " | " + cachorro2.getIdade()+ " anos");
    }
}