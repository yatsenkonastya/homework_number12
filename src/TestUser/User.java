package TestUser;

public class User {
    public  User() {

    }
    public User(String userName) {
        this.userName = userName;
    }
    public User(String userName, String password){
        this.userName = userName;
        this.password = password;
    }
    public String userName;
    private int age;
    public String email;
    private String password;
    public boolean isActive;
    static public double amoundSpendMoney;
    public  double purchasePrice = 0;
    static double allDiscount;

    public  int getAge() {
        return age;
    }
    public void setAge(int userAge) {
        if (userAge < 17) {
            age = 18;
        } else age = 21;
    }
    public String getPassword() {
        return password;
    }
    public void setPassword(String password) {
        if (!password.isEmpty()) {
            if (!password.contains(" ")){
                if (password.length() !=8 ) {
                    System.out.println("Пароль повинен складатися з 8 символів");
                } else if (!password.matches("(.*)[0-9](.*)")) {
                    System.out.println("У паролі повинні бути присутні букви");
                } else if (password.equals(password.toLowerCase())) {
                    System.out.println("У паролі повинна бути хоч одна буква великого регістру ");
                } else this.password = password;
            } else System.out.println("Введіть пароль без пробілів");
        } else System.out.println("Введіть пароль довжиною 8 символів");
    }

    public void makePurchase(double purchasePrise){
        if(purchasePrise >= 0){
            User.amoundSpendMoney += purchasePrise;
            this.purchasePrice += purchasePrise;
            System.out.println(this.userName + " здійснив покупку на сумму: " + purchasePrise);
    }
        }
    public void purchaseOfUser() {
        System.out.println(this.userName + " здійснив покупки на загальну сумму " + this.purchasePrice);
    }
        static public void printTotalAmoundOfSpentMoney() {
            System.out.println("Усі користувачі витратили " + amoundSpendMoney);
        }
    public void addDiscountForUser(int percent) {
        double discount = this.purchasePrice * percent / 100.0;
        allDiscount += discount;
        System.out.println(this.userName + " має знижку " + discount);
    }
    //  function that displays discount for ALL users
    static public void addDiscount() {
        System.out.println("Загальна знижка для користувачів " + allDiscount);
    }

    }
