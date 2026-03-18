package es.uah.matcomp.mp.e1.ejerciciosclases;

public class Main {

  public static void main(String[] args) {

    // =====================================================
    // EJERCICIO 2.3 — Author y Book
    // =====================================================
    System.out.println("===== 2.3: Author & Book =====");

    Author a1 = new Author("Tan Ah Teck", "ahteck@nowhere.com");
    System.out.println(a1);

    a1.setEmail("ahteck@somewhere.com");
    System.out.println(a1);
    System.out.println("name is: " + a1.getName());
    System.out.println("email is: " + a1.getEmail());

    Book b1 = new Book("12345", "Java for dummies", a1, 8.8, 88);
    System.out.println(b1);

    b1.setPrice(9.9);
    b1.setQty(99);
    System.out.println(b1);
    System.out.println("isbn is: " + b1.getIsbn());
    System.out.println("name is: " + b1.getName());
    System.out.println("price is: " + b1.getPrice());
    System.out.println("qty is: " + b1.getQty());
    System.out.println("author is: " + b1.getAuthor());
    System.out.println("author's name: " + b1.getAuthorName());
    System.out.println("author's name: " + b1.getAuthor().getName());
    System.out.println("author's email: " + b1.getAuthor().getEmail());

    // =====================================================
    // EJERCICIO 2.4 — Customer (discount) e Invoice
    // =====================================================
    System.out.println("\n===== 2.4: Customer (discount) & Invoice =====");

    es.uah.matcomp.mp.e1.ejerciciosclases.Customer c1 =
            new es.uah.matcomp.mp.e1.ejerciciosclases.Customer(88, "Tan Ah Teck", 10);

    System.out.println(c1);

    c1.setDiscount(8);
    System.out.println(c1);
    System.out.println("id is: " + c1.getId());
    System.out.println("name is: " + c1.getName());
    System.out.println("discount is: " + c1.getDiscount());

    Invoice inv1 = new Invoice(101, c1, 888.8);
    System.out.println(inv1);

    inv1.setAmount(999.9);
    System.out.println(inv1);
    System.out.println("id is: " + inv1.getId());
    System.out.println("customer is: " + inv1.getCustomer());
    System.out.println("amount is: " + inv1.getAmount());
    System.out.println("customer's id is: " + inv1.getCustomerId());
    System.out.println("customer's name is: " + inv1.getCustomerName());
    System.out.println("customer's discount is: " + inv1.getCustomerDiscount());
    System.out.printf("amount after discount is: %.2f%n",
            inv1.getAmountAfterDiscount());

    // =====================================================
    // EJERCICIO 2.5 — Customer (gender) y Account
    // =====================================================
    System.out.println("\n===== 2.5: Customer (gender) & Account =====");

    es.uah.matcomp.mp.e1.ejerciciosclases.Customer2.Customer c2 =
            new es.uah.matcomp.mp.e1.ejerciciosclases.Customer2.Customer(88, "Tan Ah Teck", 'm');

    System.out.println(c2);
    System.out.println("id is: " + c2.getId());
    System.out.println("name is: " + c2.getName());
    System.out.println("gender is: " + c2.getGender());

    Account acc1 = new Account(101, c2, 888.8);
    System.out.println(acc1);

    acc1.setBalance(999.9);
    System.out.println(acc1);
    System.out.println("id is: " + acc1.getId());
    System.out.println("customer is: " + acc1.getCustomer());
    System.out.println("balance is: " + acc1.getBalance());
    System.out.println("customer's name is: " + acc1.getCustomerName());

    acc1.deposit(100.1);
    System.out.println(acc1);

    acc1.withdraw(200);
    System.out.println(acc1);

    acc1.withdraw(2000);
    System.out.println(acc1);

    // =====================================================
    // EJERCICIO 2.6 — MyPoint
    // =====================================================
    System.out.println("\n===== 2.6: MyPoint =====");

    MyPoint p1 = new MyPoint();           // constructor por defecto → (0,0)
    System.out.println(p1);
    p1.setX(8);
    p1.setY(6);
    System.out.println("x is: " + p1.getX());
    System.out.println("y is: " + p1.getY());

    p1.setXY(3, 0);
    System.out.println(p1.getXY()[0]);    // 3
    System.out.println(p1.getXY()[1]);    // 0
    System.out.println(p1);               // (3,0)

    MyPoint p2 = new MyPoint(0, 4);
    System.out.println(p2);               // (0,4)

    // Versiones sobrecargadas de distance()
    System.out.println(p1.distance(p2));  // distance(MyPoint)   → versión con instancia
    System.out.println(p2.distance(p1));  // distance(MyPoint)   → versión con instancia
    System.out.println(p1.distance(5, 6));// distance(int,int)   → versión con coordenadas
    System.out.println(p1.distance());    // distance()          → versión al origen (0,0)

    // Array (1,1)…(10,10) → matriz de distancias
    System.out.println("\nMatriz de distancias entre (1,1)...(10,10):");
    MyPoint[] pts = new MyPoint[10];
          for (int i = 0; i < 10; i++) {
      pts[i] = new MyPoint(i + 1, i + 1);
    }
      for (int i = 0; i < 10; i++) {
      for (int j = 0; j < 10; j++) {
        System.out.printf("%6.2f", pts[i].distance(pts[j]));
      }
      System.out.println();
    }
    // =====================================================
    // EJERCICIO 2.7 — MyLine
    // =====================================================
    System.out.println("\n===== 2.7: MyLine =====");

    MyLine line1 = new MyLine(0, 0, 3, 4);
    System.out.println(line1);
    System.out.println("length: " + line1.getLength());
    System.out.printf("gradient: %.4f rad%n", line1.getGradient());

    MyPoint pa = new MyPoint(1, 2);
    MyPoint pb = new MyPoint(4, 6);
    MyLine line2 = new MyLine(pa, pb);
    System.out.println(line2);
    System.out.println("length: " + line2.getLength());
    System.out.printf("gradient: %.4f rad%n", line2.getGradient());

    line2.setBeginXY(0, 0);
    line2.setEndXY(1, 1);
    System.out.println(line2);
    System.out.println("beginX: " + line2.getBeginX() + ", beginY: " + line2.getBeginY());
    System.out.println("endX: "   + line2.getEndX()   + ", endY: "   + line2.getEndY());

    // =====================================================
    // EJERCICIO 2.8 — MyCircle
    // =====================================================
    System.out.println("\n===== 2.8: MyCircle =====");

    MyCircle circle1 = new MyCircle();
    System.out.println(circle1);
    System.out.printf("area: %.4f%n",          circle1.getArea());
    System.out.printf("circumference: %.4f%n", circle1.getCircumference());

    MyCircle circle2 = new MyCircle(2, 3, 5);
    System.out.println(circle2);
    System.out.printf("area: %.4f%n",          circle2.getArea());
    System.out.printf("circumference: %.4f%n", circle2.getCircumference());

    MyPoint center3 = new MyPoint(1, 1);
    MyCircle circle3 = new MyCircle(center3, 3);
    System.out.println(circle3);
    System.out.printf("distance between centers: %.4f%n", circle2.distance(circle3));

    circle3.setCenterXY(10, 10);
    System.out.println("centerX: " + circle3.getCenterX() + ", centerY: " + circle3.getCenterY());
    System.out.println(circle3.getCenterXY()[0] + ", " + circle3.getCenterXY()[1]);

    // =====================================================
    // EJERCICIO 2.9 — MyTriangle
    // =====================================================
    System.out.println("\n===== 2.9: MyTriangle =====");

    MyTriangle t1 = new MyTriangle(0, 0, 3, 0, 0, 4);
    System.out.println(t1);
    System.out.printf("perimeter: %.4f%n", t1.getPerimeter());
    System.out.println("type: " + t1.getType());       // Scalene

    MyTriangle t2 = new MyTriangle(
            new MyPoint(0, 0), new MyPoint(1, 0), new MyPoint(0, 1));
    System.out.println(t2);
    System.out.printf("perimeter: %.4f%n", t2.getPerimeter());
    System.out.println("type: " + t2.getType());       // Isosceles

    MyTriangle t3 = new MyTriangle(0, 0, 2, 0, 1, 2);
    System.out.println(t3);
    System.out.printf("perimeter: %.4f%n", t3.getPerimeter());
    System.out.println("type: " + t3.getType());

  }
}