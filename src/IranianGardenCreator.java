public class IranianGardenCreator implements AbstractGardenCreator {

    public AbstractTree createTree() {
        return new Chenar();
    }

    public AbstractFlower createFlower() {
        return new Khatmi();
    }
}
