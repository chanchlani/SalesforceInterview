package modal;

public class AzulProperties {
    private String javaProvider;
    private String javaVersion;
    private String osName;
    private String arch;

    public AzulProperties(){

    }

    public AzulProperties(String javaProvider, String javaVersion, String osName, String arch){
        this.javaProvider = javaProvider;
        this.javaVersion = javaVersion;
        this.osName = osName;
        this.arch = arch;
    }


    public String getJavaProvider() {
        return javaProvider;
    }

    public void setJavaProvider(String javaProvider) {
        this.javaProvider = javaProvider;
    }

    public String getJavaVersion() {
        return javaVersion;
    }

    public void setJavaVersion(String javaVersion) {
        this.javaVersion = javaVersion;
    }

    public String getOsName() {
        return osName;
    }

    public void setOsName(String osName) {
        this.osName = osName;
    }

    public String getArch() {
        return arch;
    }

    public void setArch(String arch) {
        this.arch = arch;
    }

    @Override
    public String toString() {
        return "AzulProperties{" +
                "javaProvider='" + javaProvider + '\'' +
                ", javaVersion='" + javaVersion + '\'' +
                ", osName='" + osName + '\'' +
                ", arch='" + arch + '\'' +
                '}';
    }
}
