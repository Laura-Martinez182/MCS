package model;
public enum Category {
	Cat1("NEWIE", 0), 
    Cat2("LITTLE_CONTRIBUTOR", 3), 
    Cat3("MILD_CONTRIBUTOR", 10), 
    Cat4("STAR_CONTRIBUTOR", 30);

    public final String categ;
    public final int num;

     category(String categ, int num) {
        this.categ = categ;
        this.num = num;
    }
    
 
    // Metodos para recuperar los valores
    public String getCatg() {
        return categ;
    }

    public int getNum() {
        return num;
    }

}