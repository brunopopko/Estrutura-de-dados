//Persa”, “Siamês” e “Ragdool”

class ProjetoGato {
    public static void main(String[] args) {
        Gato persa;
        persa = new Gato();
        persa.cor = "branco";
        persa.idade = 6;
        persa.sexo = "macho";
        System.out.println("Cor do gato persa: " + persa.cor);

        Gato siames;
        siames = new Gato();
        siames.cor = "marrom";
        siames.idade = 5;
        siames.sexo = "macho";
        System.out.println("Cor do gato siamês: " + siames.cor);

        Gato ragdool;
        ragdool = new Gato();
        ragdool.cor = "cinza";
        ragdool.idade = 4;
        ragdool.sexo = "femea";
        System.out.println("Cor do gato ragdool: " + ragdool.cor);
        
    }
}
