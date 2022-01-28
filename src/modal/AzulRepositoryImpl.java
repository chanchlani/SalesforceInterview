package modal;

import util.Constants;

public class AzulRepositoryImpl implements AzulRepository{

    public AzulProperties setAzulProperties(){
        AzulProperties azulProperties = new AzulProperties();
        azulProperties.setJavaProvider(System.getProperty(Constants.JAVA_VENDOR));
        azulProperties.setJavaVersion(System.getProperty(Constants.JAVA_VERSION));
        azulProperties.setOsName(System.getProperty(Constants.OS_NAME));
        azulProperties.setArch(System.getProperty(Constants.OS_ARCH));
        return azulProperties;
    }
}
