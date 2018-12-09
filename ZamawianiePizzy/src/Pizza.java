public class Pizza {
    private String pizzaDough;
    private String sauce;
    private String ingredients;

    public void setPizzaDough(String pizzaDough) {
        this.pizzaDough = pizzaDough;
    }

    public void setSauce(String sauce) {
        this.sauce = sauce;
    }

    public void setIngredients(String ingredients) {
        this.ingredients = ingredients;
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("-Ciasto: ");
        stringBuilder.append(pizzaDough);
        stringBuilder.append("\n-Sos: ");
        stringBuilder.append(sauce);
        stringBuilder.append("\n-Składniki: ");
        stringBuilder.append(ingredients);
        return stringBuilder.toString();
    }

}
