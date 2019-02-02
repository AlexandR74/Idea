package banjo;

public class Banjo {
    public  String areYouPlayingBanjo(String name) {
        if (name.startsWith("R"))return name +" plays banjo";
        if (name.startsWith("r"))return name +" plays banjo";

        return name + " does not play banjo";
    }
}

//return name.matches("[Rr].*") ? name + " plays banjo" : name + " does not play banjo";
