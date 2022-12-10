public class Main {

    public static void main(String[] args) {
        exercicioCarro.Carro carro1 = new exercicioCarro.Carro();

        carro1.setCor("azul");
        carro1.setModelo("BMW Serie 1");
        carro1.setCapacidadeTanque(50);

        System.out.println(carro1.getModelo());
        System.out.println(carro1.getCor());
        System.out.println(carro1.getCapacidadeTanque());
        System.out.println(carro1.TotalValorTanque(6.39));

        exercicioCarro.Carro carro2 = new exercicioCarro.Carro("cinza", "Mercedes Benz Classe C", 66);

        System.out.println(carro2.getModelo());
        System.out.println(carro2.getCor());
        System.out.println(carro2.getCapacidadeTanque());
        System.out.println(carro2.TotalValorTanque(6.39));


    }



}