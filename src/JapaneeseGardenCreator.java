public class JapaneeseGardenCreator implements AbstractGardenCreator {
    public AbstractTree createTree() {
        return new JapTree();
    }

    public AbstractFlower createFlower() {
        return new JapFlower();
    }
}
