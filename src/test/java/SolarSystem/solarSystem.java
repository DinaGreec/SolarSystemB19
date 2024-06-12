package SolarSystem;

public class solarSystem {
    public static void main(String[] args) {
        solarSystemBase solar=new solarSystemBase();
        solar.sun="1";
        solar.star="2";
        solar.planet="2";
        System.out.println("The solar system is ready");

        //

        featureSun xros = new featureSun();
        xros.color="pink";
        xros.temp="2432kv";
        xros.size="0km";

        //

        planet1 renox=new planet1();
        renox.color="gray";
        renox.size="10km";
        renox.radius="5m";
;
    }

}
