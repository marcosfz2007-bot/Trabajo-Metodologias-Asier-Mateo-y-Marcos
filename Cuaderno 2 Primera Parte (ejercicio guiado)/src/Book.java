class Book {
    private String name;
    private Author[] authors;
    private double price;
    private int qty;

    public Book(String name, Author[] authors, double price, int qty) {
        this.name = name;
        this.authors = authors;
        this.price = price;
        this.qty = qty;
    }

    public String getName() {
        return name;
    }

    public Author[] getAuthors() {
        return authors;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getQty() {
        return qty;
    }

    public void setQty(int qty) {
        this.qty = qty;
    }

    // Devuelve los nombres de todos los autores
    public String getAuthorNames() {
        String names = "";
        for (int i = 0; i < authors.length; i++) {
            names += authors[i].getName();
            if (i < authors.length - 1) {
                names += ", ";
            }
        }
        return names;
    }

    @Override
    public String toString() {
        String authorsText = "";
        for (int i = 0; i < authors.length; i++) {
            authorsText += authors[i].toString();
            if (i < authors.length - 1) {
                authorsText += ", ";
            }
        }

        return "Book[name=" + name +
                ",authors={" + authorsText +
                "},price=" + price +
                ",qty=" + qty + "]";
    }
}