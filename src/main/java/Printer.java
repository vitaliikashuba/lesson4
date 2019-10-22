public class Printer {
    private String manufacturer;
    private String model;
    private boolean isColor;
    private String type;
    private boolean isDuplex;
    private int tonerLevelBlack;
    private int tonerLevelMagenta;
    private int tonerLevelYellow;
    private int tonerLevelBlue;
    private int printedPages;
    private int maxTonerLevel;
    private int tonerVolumePerPage;

    void fillUp(int tonerVolume, String color) {
        if (color == "yellow"){
          if (tonerLevelYellow + tonerVolume > maxTonerLevel){
              tonerLevelYellow = maxTonerLevel;
          }else {
              tonerLevelYellow +=tonerVolume;
          }
        }
        else if(color == "black"){
            tonerLevelBlack += tonerVolume;
        }
    }

    void print(int pages, String color, boolean isDuplex){
            printedPages += pages;
            if (color == "yellow"){

                if (isDuplex){
                    tonerLevelYellow -= pages*tonerVolumePerPage*2;
                }else{tonerLevelYellow -= pages*tonerVolumePerPage;}
            }

        }

   boolean tonerIsEmpty(){
        if (tonerLevelYellow==0 && tonerLevelBlack==0){
            return true;
        }else return false;
    }

   int getTonerLevel(String toner){
        if (toner == "yellow"){
           return tonerLevelYellow;
        }
        return 0;
    }
}

