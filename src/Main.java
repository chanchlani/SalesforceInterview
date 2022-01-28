import modal.AzulProperties;
import modal.AzulRepository;
import modal.AzulRepositoryImpl;
import services.AzulService;

public class Main {
    public static AzulService azulService = new AzulService();;

    public static void main(String args[]){
        //Test 1 : Recommend Azul java version for your system configuration
        AzulRepository azulRepository = new AzulRepositoryImpl();
        AzulProperties azulProperties = azulRepository.setAzulProperties();
        String azulUrl = azulService.getRequiredVersion(azulProperties);

        System.out.println("*******Test 1 - Your Current System *********");
        System.out.println("Current System Configuration:");
        System.out.println(azulProperties);
        System.out.println("Please download the required jdk from following path for your system: "+ azulUrl);


        //Test 2
        azulProperties = new AzulProperties("Oracle","1.8.0_311","Windows","x86_64");
        azulUrl = azulService.getRequiredVersion(azulProperties);

        System.out.println("*******Test 2 - Test System *********");
        System.out.println("Current System Configuration:");
        System.out.println(azulProperties);
        System.out.println("Please download the required jdk from following path for your system: "+ azulUrl);

        //Test 3 - java < 1.8
        azulProperties = new AzulProperties("Oracle","1.6.0_311","Windows","x86_64");
        azulUrl = azulService.getRequiredVersion(azulProperties);

        System.out.println("*******Test 3 - Test System *********");
        System.out.println("Current System Configuration:");
        System.out.println(azulProperties);
        System.out.println("Please download the required jdk from following path for your system: "+ azulUrl);

        //Test 4 - already on Azul
        azulProperties = new AzulProperties("Azul","1.8.28.0.1","Mac OS X","x86_64");
        azulUrl = azulService.getRequiredVersion(azulProperties);

        System.out.println("*******Test 4 - Test System *********");
        System.out.println("Current System Configuration:");
        System.out.println(azulProperties);
        System.out.println("Please download the required jdk from following path for your system: "+ azulUrl);
    }
}
