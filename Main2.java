package challenge;

import java.util.Scanner;

public class Main2 {

	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);
	        Veiculos[] veiculos = new Veiculos[1000];
	        int quantidadeVeiculos = 0;
	        int opcao;

	        do {
	            exibirMenu();
	            opcao = scanner.nextInt();

	            switch (opcao) {
	                case 1:
	                    Veiculos veiculo = cadastrarVeiculo(scanner);
	                    if (veiculo != null) {
	                        veiculos[quantidadeVeiculos] = veiculo;
	                        quantidadeVeiculos++;
	                    }
	                    break;
	                case 2:
	                    listarVeiculos(veiculos, quantidadeVeiculos);
	                    break;
	                case 0:
	                    System.out.println("Encerrando o programa.");
	                    break;
	                default:
	                    System.out.println("Opcao invalida. Tente novamente.");
	            }

	        } while (opcao != 0);
	    }

	    private static void listarVeiculos(Veiculos[] veiculos, int quantidadeVeiculos) {
	        for (int i = 0; i < quantidadeVeiculos; i++) {
	            System.out.println(veiculos[i]);
	        }
	    }

	    private static void exibirMenu() {
	        System.out.println("=== MENU ===");
	        System.out.println("1. Cadastrar veiculo");
	        System.out.println("2. Listar veiculos");
	        System.out.println("0. Sair");
	        System.out.print("Escolha uma opcao: ");
	    }

	    private static Veiculos cadastrarVeiculo(Scanner scanner) {
	        System.out.println("\n=== Cadastro de Veiculos ===");
	        System.out.println("Escolha o tipo de veiculo:");
	        System.out.println("1. Moto");
	        System.out.println("2. Carro");
	        System.out.println("3. Bicicleta");
	        System.out.println("4. Caminhao");
	        System.out.println("5. Charrete");
	        System.out.print("Escolha uma opcao: ");
	        int categoria = scanner.nextInt();
	        return cadastrarVeiculo(scanner, categoria);
	    }

    private static Veiculos cadastrarVeiculo(Scanner scanner, int categoria) {
        System.out.println("\n=== Cadastro ===");

        System.out.println("Modelo: ");
        String modelo = scanner.next();

        System.out.print("Motor (true/false): ");
        boolean motor = scanner.nextBoolean();

        System.out.print("Volante (true/false): ");
        boolean volante = scanner.nextBoolean();

        System.out.print("Quantidade de Passageiros: ");
        int passageiros = scanner.nextInt();

        System.out.print("Quantidade de Portas: ");
        int portas = scanner.nextInt();

        System.out.print("Quantidade de Rodas: ");
        int rodas = scanner.nextInt();

        System.out.print("Carga (true/false): ");
        boolean carga = scanner.nextBoolean();

        System.out.print("Capacidade de Carga em KG: ");
        int capCarga = scanner.nextInt();

        System.out.print("Combustivel - Gasolina (true/false): ");
        boolean gasolina = scanner.nextBoolean();

        System.out.print("Combustivel - Alcool (true/false): ");
        boolean alcool = scanner.nextBoolean();

        System.out.print("Combustivel - Diesel (true/false): ");
        boolean diesel = scanner.nextBoolean();

        System.out.print("Combustivel - Eletricidade (true/false): ");
        boolean eletricidade = scanner.nextBoolean();

        System.out.print("Combustivel - Humano (true/false): ");
        boolean humano = scanner.nextBoolean();

        System.out.print("Combustivel - Animal (true/false): ");
        boolean animal = scanner.nextBoolean();

        Combustivel combustivel = new Combustivel(gasolina, alcool, diesel, eletricidade, humano, animal);

        Veiculos veiculo;

        switch (categoria) {
            case 1:
                System.out.print("Partida Eletrica (true/false): ");
                boolean partidaEletrica = scanner.nextBoolean();
                veiculo = new Moto(modelo, motor, volante, passageiros, portas, rodas, carga, capCarga, 
                		partidaEletrica, combustivel);
                System.out.println("Moto cadastrada com sucesso!");
                break;
            case 2:
                System.out.print("Ar-Condicionado (true/false): ");
                boolean arCondicionado = scanner.nextBoolean();
                System.out.print("Radio (true/false): ");
                boolean radio = scanner.nextBoolean();
                veiculo = new Carro(modelo, motor, volante, passageiros, portas, rodas, carga, capCarga, 
                		combustivel, arCondicionado, radio);
                System.out.println("Carro cadastrado com sucesso!");
                break;
            case 3:
                System.out.print("Eletrica (true/false): ");
                boolean eletrica = scanner.nextBoolean();
                System.out.print("Possui bagageiro (true/false): ");
                boolean bagageiro = scanner.nextBoolean();
                veiculo = new Bicicleta(modelo, motor, volante, passageiros, portas, rodas, carga, capCarga, 
                		combustivel, eletrica, bagageiro);
                System.out.println("Bicicleta cadastrada com sucesso!");
                break;
            case 4:
                System.out.print("Eixos: ");
                int eixos = scanner.nextInt();
                veiculo = new Caminhao(modelo, motor, volante, passageiros, portas, rodas, carga, capCarga, 
                		combustivel, eixos);
                System.out.println("Caminhao cadastrado com sucesso!");
                break;
            case 5:
                veiculo = new Charrete(modelo, motor, volante, passageiros, portas, rodas, carga, capCarga, 
                		combustivel);
                System.out.println("Charrete cadastrada com sucesso!");
                break;
            default:
                System.out.println("Categoria de veiculo invalida.");
                return null;
        }

        return veiculo;
        
    }
    
}