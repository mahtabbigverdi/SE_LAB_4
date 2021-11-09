public class GardenProvider {
    public static AbstractGardenCreator getGardenCreator(GardenType gt){
        if (gt == GardenType.IRANIAN)
            return new IranianGardenCreator();
        else if (gt == GardenType.JAPANESE)
            return new JapaneeseGardenCreator();
        else
            return null;
    }
}
