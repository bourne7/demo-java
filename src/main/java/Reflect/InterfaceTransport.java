package Reflect;

public interface InterfaceTransport {
    String info();

    default String defaultInfo(){
        return "Default info.";
    }

    static String staticInfo(){
        return "Static info.";
    }
}
