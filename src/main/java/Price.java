class Price {
    int id;
    String description;
    int askValue;
    int bidValue;
    int difference;

    public Price(int id, String description, int askValue, int bidValue, int difference) {
        this.id = id;
        this.description = description;
        this.askValue = askValue;
        this.bidValue = bidValue;
        this.difference = difference;
    }
}