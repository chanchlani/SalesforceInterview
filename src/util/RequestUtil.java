package util;

import modal.AzulProperties;

public class RequestUtil {
    public String generateAzulUrl(AzulProperties azulProperties){
        String javaVersion = null;
        if(azulProperties.getJavaVersion()==null || azulProperties.getJavaVersion().isEmpty()){
            javaVersion="8";
        }else{
            javaVersion = azulProperties.getJavaVersion().startsWith("1.")?azulProperties.getJavaVersion().split("1\\.")[1]:azulProperties.getJavaVersion();
            javaVersion = javaVersion.split("\\.")[0];

        }

        //check if java version < 1.6 then we need to return version corresponds to 1.8
        if(Integer.parseInt(javaVersion)<8){
            javaVersion = "8";
        }
        String osName = azulProperties.getOsName();
        if(osName.contains("Mac")){
            osName = "macos";
        }else if(osName.contains("win")||osName.contains("Win")){
            osName="windows";
        }else {
            osName="linux";
        }
        String arch = azulProperties.getArch().split("_")[0];
        String hw_bit = azulProperties.getArch().split("_")[1];
        String url = Constants.API + "?java_version="+javaVersion+"&os="+osName+"&arch="+arch+"&hw_bitness="+hw_bit+Constants.SUFFIX_URL;
        return url;
    }
}
