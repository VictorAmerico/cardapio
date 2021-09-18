import java.util.Scanner;

class Bebida {
    private String tipo; 
    private String marca;
    private float preço;
    private int estoque;
   
    public Bebida(String tipo, String marca, float preço,int estoque) {
        this.tipo = tipo;
        this.marca = marca;
        this.preço = preço;
        this.estoque = estoque;
        
    }
    public void imprimir() {
        System.out.println("Tipo: " + this.tipo);
        System.out.println("Marca: " + this.marca);
        System.out.println("Preço: " + this.preço);
        System.out.println("Estoque: " + this.estoque);
      
    }
    

}

class Vinho extends Bebida {
    private  String tipo_uva;
    private  int ano;
    private String pais;
    private  String cor;

    public Vinho(String tipo_uva, String tipo, String marca, float preço,int estoque,int ano, String pais, String cor) {
    super(tipo, marca, preço, estoque); 
    this.tipo_uva =  tipo_uva;
    this.ano = ano;
    this.cor = cor;
    this.pais = pais;
    }
    public void exibir() {
    imprimir(); 
    System.out.println(tipo_uva);
    System.out.println(ano);
    System.out.println(cor);
    System.out.println(pais);
    }

    public void x(String tipo_uva, int ano, String cor, String pais) {
    this.tipo_uva = tipo_uva;
    this.cor = cor;
    this.pais = pais;
    this.ano = ano;
    }
   }

  
   //String tipo, String marca, float preço,int estoque,int ano, String pais, String cor, String escolha

   class teste{

    private static Scanner x = new  Scanner(System.in);

    public static void main(String[] args) {

        System.out.println("===========================");
        System.out.println("          CÁRDAPIO         ");
        System.out.println("===========================");

        System.out.println("===========================");
        System.out.println("           VINHOS          ");
        System.out.println("===========================");

        System.out.println("===========================");
        System.out.println("        - Petrus -         ");
        System.out.println("        - Le Pin -         ");
        System.out.println("       - Tinto comum -      ");
        System.out.println("        - Château -         ");
        System.out.println("         - Rose -           ");
        System.out.println("===========================");

        System.out.println("===========================");
        System.out.println("          CERVEJAS         ");
        System.out.println("===========================");

        System.out.println("===========================");
        System.out.println("        - Skol -         ");
        System.out.println("        - Heineken -         ");
        System.out.println("        - Bohemia -         ");
        System.out.println("        - Itaipava -         ");
        System.out.println("        - Kaiser -         ");
        System.out.println("===========================");


        System.out.println("Qual tipo de bebida você deseja?");


        String input = x.nextLine();
        String vinho1String = "Petrus";
        String vinho2String = "Le Pin";
        String vinho3String = "Tinto comum";
        String vinho4String = "Château";
        String vinho5String = "Rose";        
        String cerveja1String = "Skol";
        String cervej2aString = "Heineken";
        String cervej3aString = "Bohemia";
        String cervej4aString = "Itaipava";
        String cervej5aString = "Kaiser";
        
        

        if(vinho1String.equalsIgnoreCase(input)){
            Vinho tipovinho = new Vinho("Merlot","Vinho", "Petrus", 13517, 40, 1815, "França", "Branco");
            tipovinho.imprimir();
        }
        if(vinho2String.equalsIgnoreCase(input)){
            Vinho tipovinho = new Vinho("Merlot","Vinho", "Le Pin", 27000, 13, 1728, "França", "Tinto");
            tipovinho.imprimir();
        }
        if(vinho3String.equalsIgnoreCase(input)){
            Vinho tipovinho = new Vinho("Merlot","Vinho", "Tinto comum", 180, 30, 1965, "Canadá", "Tinto");
            tipovinho.imprimir();
        }
        if(vinho4String.equalsIgnoreCase(input)){
            Vinho tipovinho = new Vinho("Tempranillo","Vinho", "Château", 1550, 38, 1957, "França", "Branco");
            tipovinho.imprimir();
        }
        if(vinho5String.equalsIgnoreCase(input)){
            Vinho tipovinho = new Vinho("Cabert","Vinho", "Rose", 1970, 20 , 1850, "França", "Branco");
            tipovinho.imprimir();
        }
        if(cerveja1String.equalsIgnoreCase(input)){
            Bebida falcao = new Bebida("Cerveja", "Skol", 13, 1200);
        falcao.imprimir();
        }
        if(cervej2aString.equalsIgnoreCase(input)){
            Bebida falcao = new Bebida("Cerveja", "Brahma", 15, 1300);
        falcao.imprimir();
        }
        if(cervej3aString.equalsIgnoreCase(input)){
            Bebida falcao = new Bebida("Cerveja", "Itaipava", 13, 3000);
        falcao.imprimir();
        }
        if(cervej4aString.equalsIgnoreCase(input)){
            Bebida falcao = new Bebida("Cerveja", "Kaiser", 19, 700);
        falcao.imprimir();
        }
        if(cervej5aString.equalsIgnoreCase(input)){
            Bebida falcao = new Bebida("Cerveja", "Bohemia", 13, 1400);
        falcao.imprimir();
        }

    }
   }