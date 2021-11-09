public class Client {

    private GardenType type;
    private AbstractTree tree = null;
    private AbstractFlower flower= null;

    public Client(GardenType gt) {
        this.type = gt;
    }

    public void setTree(AbstractTree tree) {
        this.tree = tree;
    }

    public void setFlower(AbstractFlower flower) {
        this.flower = flower;
    }

    public void setType(GardenType type) {
        this.type = type;
    }

    public AbstractTree getTree() {
        return this.tree;
    }

    public AbstractFlower getFlower() {
        return this.flower;
    }

    public GardenType getType() {
        return this.type;
    }

    public void createGarden() {
        AbstractGardenCreator gardenCreator = GardenProvider.getGardenCreator(this.type);
        if (gardenCreator != null) {
            this.flower = gardenCreator.createFlower();
            this.tree = gardenCreator.createTree();
        }
    }
}
