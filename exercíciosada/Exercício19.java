package exercíciosada;

public class Exercício19 {
    public static void main(String[] args) {
        String[] praias = {"Riviera", "Vista Linda", "Boracéia", "São Lourenço", "Enseada"};
        int[] dist = {8, 13, 16, 5, 11};
        
        for (int c=0; c<praias.length; c++) {
            System.out.println("A praia de " + praias[c] + " fica a " + dist[c] + "Km de distância do hotel.");
        }
        System.out.println(" ");
        System.out.println("A praia mais distânte é a de " + praias[2] + " que fica a " + dist[2] + "Km de distância.");
        
    }
}
