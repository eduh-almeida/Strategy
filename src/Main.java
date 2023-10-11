public class Main {
    public static void main(String[] args) {
        Disciplina disciplinaAritmetica = new Disciplina("Matemática", 7.0, 8.0, new Aritmetica());
        Disciplina disciplinaGeometrica = new Disciplina("Física", 9.0, 6.0, new Geometrica());

        System.out.println(disciplinaAritmetica.getNome() + ": Média " + disciplinaAritmetica.getMedia() + ", Situação: " + disciplinaAritmetica.getSituacao());
        System.out.println(disciplinaGeometrica.getNome() + ": Média " + disciplinaGeometrica.getMedia() + ", Situação: " + disciplinaGeometrica.getSituacao());
    }
}