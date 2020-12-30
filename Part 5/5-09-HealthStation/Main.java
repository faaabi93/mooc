
public class Main {

    public static void main(String[] args) {
        // write experimental code here to check how your program functions
        HealthStation childrensHospital = new HealthStation();

        Person fabian = new Person("Fabian", 1, 110, 7);
        Person markus = new Person("Markus", 33, 176, 85);
        
        System.out.println(markus.getName() + " weight: " + childrensHospital.weigh(markus) + " kilos");
        System.out.println(fabian.getName() + " weight: " + childrensHospital.weigh(fabian) + " kilos");

        childrensHospital.feed(markus);
        childrensHospital.feed(markus);

        System.out.println("weighings performed: " + childrensHospital.weighings());

        System.out.println(markus.getName() + " weight: " + childrensHospital.weigh(markus) + " kilos");
        System.out.println(fabian.getName() + " weight: " + childrensHospital.weigh(fabian) + " kilos");
    
        childrensHospital.weigh(markus);
        System.out.println("weighings performed: " + childrensHospital.weighings());
    }
}
