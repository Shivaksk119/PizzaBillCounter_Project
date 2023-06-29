import java.util.ArrayList;

public class Pizza {
    private int basePrice;
    private int farmhousePrice;

    private int periperiPrice;

    private int RegularBaseVegPizzaCount;
    private int RegularBaseNonVegPizzaCount;
    private int LargeBaseVegPizzaCount;
    private int LargeBaseNonVegPizzaCount;

    private int RegularFarmHouseVegPizzaCount;
    private int RegularFarmHouseNonVegPizzaCount;
    private int LargeFarmHouseVegPizzaCount;
    private int LargeFarmHouseNonVegPizzaCount;

    private int RegularPeriPeriVegPizzaCount;
    private int RegularPeriPeriNonVegPizzaCount;
    private int LargePeriPeriVegPizzaCount;
    private int LargePeriPeriNonVegPizzaCount;

    private boolean isVeg;

    private int toppingPrice;

    private int cheesePrice;

    private String size;

    private boolean isCarryBagAdded;

    private boolean isCheeseAdded;

    private boolean isToppingsAdded;

    private boolean isBillGenerated;

    private int carryBagPrice;

    private ArrayList<String> FinalBill;

    private ArrayList<String> OrderList;

    private int totalAmount;

    public Pizza() {
        this.RegularBaseVegPizzaCount = 0;
        this.RegularBaseNonVegPizzaCount = 0;
        this.LargeBaseVegPizzaCount = 0;
        this.LargeBaseNonVegPizzaCount = 0;
        this.RegularFarmHouseVegPizzaCount = 0;
        this.RegularFarmHouseNonVegPizzaCount = 0;
        this.LargeFarmHouseVegPizzaCount = 0;
        this.LargeFarmHouseNonVegPizzaCount = 0;
        this.RegularPeriPeriVegPizzaCount = 0;
        this.RegularPeriPeriNonVegPizzaCount = 0;
        this.LargePeriPeriVegPizzaCount = 0;
        this.LargePeriPeriNonVegPizzaCount = 0;
        this.toppingPrice = 50;
        this.cheesePrice = 40;
        this.carryBagPrice = 20;
        this.FinalBill = new ArrayList<>();
        this.OrderList = new ArrayList<>();
    }
    public void basePizza(boolean isVeg, String size) {
        if(size.equals("Regular")) {
            if(isVeg) {
                basePrice = 100;
                String Currbill = "The price of the RegularBaseVeg pizza is: "+basePrice;
                FinalBill.add(Currbill);
                OrderList.add("RegularBaseVeg");
                RegularBaseVegPizzaCount++;

            }
            else {
                basePrice = 140;
                String Currbill = "The price of the RegularBaseNonVeg pizza is: "+basePrice;
                FinalBill.add(Currbill);
                OrderList.add("RegularBaseNonVeg");
                RegularBaseNonVegPizzaCount++;
            }
        }
        else {
            if(isVeg) {
                basePrice =180;
                String Currbill = "The price of the LargeBaseVeg pizza is: "+basePrice;
                FinalBill.add(Currbill);
                OrderList.add("LargeBaseVeg");
                LargeBaseVegPizzaCount++;
            }
            else {
                basePrice = 220;
                String Currbill = "The price of the LargeBaseNonVeg pizza is: "+basePrice;
                FinalBill.add(Currbill);
                OrderList.add("LargeBaseNonVeg");
                LargeBaseNonVegPizzaCount++;
            }
        }
        totalAmount = totalAmount + basePrice;

    }
    public void FarmhousePizza(boolean isVeg, String size) {
        if(size.equals("Regular")) {
            if(isVeg) {
                farmhousePrice = 120;
                String Currbill = "The price of the RegularFarmHouseVeg pizza is: "+farmhousePrice;
                FinalBill.add(Currbill);
                OrderList.add("RegularFarmHouseVeg");
                RegularFarmHouseVegPizzaCount++;
            }
            else {
                farmhousePrice = 160;
                String Currbill = "The price of the RegularFarmHouseNonVeg pizza is: "+farmhousePrice;
                FinalBill.add(Currbill);
                OrderList.add("RegularFarmHouseNonVeg");
                RegularFarmHouseNonVegPizzaCount++;
            }
        }
        else {
            if(isVeg) {
                farmhousePrice =200;
                String Currbill = "The price of the LargeFarmHouseVeg pizza is: "+farmhousePrice;
                FinalBill.add(Currbill);
                OrderList.add("LargeFarmHouseVeg");
                LargeFarmHouseVegPizzaCount++;
            }
            else {
                farmhousePrice = 240;
                String Currbill = "The price of the LargeFarmHouseNonVeg pizza is: "+farmhousePrice;
                FinalBill.add(Currbill);
                OrderList.add("LargeFarmHouseNonVeg");
                LargeFarmHouseNonVegPizzaCount++;
            }
        }
        totalAmount = totalAmount + farmhousePrice;

    }

    public void PeriPeriPizza(boolean isVeg, String size) {
        if(size.equals("Regular")) {
            if(isVeg) {
                periperiPrice = 140;
                String Currbill = "The price of the RegularPeriPeriVeg pizza is: "+periperiPrice;
                FinalBill.add(Currbill);
                OrderList.add("RegularPeriPeriVeg");
                RegularPeriPeriVegPizzaCount++;
            }
            else {
                periperiPrice = 180;
                String Currbill = "The price of the RegularPeriPeriNonVeg pizza is: "+periperiPrice;
                FinalBill.add(Currbill);
                OrderList.add("RegularPeriPeriNonVeg");
                RegularPeriPeriNonVegPizzaCount++;
            }
        }
        else {
            if(isVeg) {
                periperiPrice =220;
                String Currbill = "The price of the LargePeriPeriVeg pizza is: "+periperiPrice;
                FinalBill.add(Currbill);
                OrderList.add("LargePeriPeriVeg");
                LargePeriPeriVegPizzaCount++;
            }
            else {
                periperiPrice = 260;
                String Currbill = "The price of the LargePeriPeriNonVeg pizza is: "+periperiPrice;
                FinalBill.add(Currbill);
                OrderList.add("LargePeriPeriNonVeg");
                LargePeriPeriNonVegPizzaCount++;
            }
        }
        totalAmount = totalAmount + periperiPrice;
    }
    public void addExtraCheese() {
        if(isCheeseAdded==false) {
            isCheeseAdded=true;
            totalAmount = totalAmount + cheesePrice;
            String Currbill = "Extra Cheese added: "+ cheesePrice;
            FinalBill.add(Currbill);
            OrderList.add("Extra Cheese");
        }
    }
    public void addExtraToppings() {
        if(isToppingsAdded==false) {
            isToppingsAdded = true;
            totalAmount = totalAmount+toppingPrice;
            String Currbill = "Extra Topping added: "+toppingPrice;
            FinalBill.add(Currbill);
            OrderList.add("Extra Topping");
        }

    }
    public void addExtraCarryBag() {
        if(isCarryBagAdded==false) {
            isCarryBagAdded = true;
            totalAmount = totalAmount+carryBagPrice;
            String Currbill = "Extra Carrybag added: "+carryBagPrice;
            FinalBill.add(Currbill);
            OrderList.add("Extra Carrybag");
        }
    }

    //Remove PIZZA's
    public void removeRegularBaseVegPizza() {
        if(RegularBaseVegPizzaCount>0) {
            totalAmount = totalAmount - 100;
            RegularBaseVegPizzaCount--;
            for(int i=0;i<FinalBill.size();i++) {
                String str = FinalBill.get(i);
                if(str.contains("RegularBaseVeg")) {
                    FinalBill.remove(i);
                    break;
                }
            }
            for(int i=0;i<OrderList.size();i++) {
                String str = OrderList.get(i);
                if(str.contains("RegularBaseVeg")) {
                    OrderList.remove(i);
                    break;
                }
            }
        }
    }
    public void removeRegularBaseNonVegPizza() {
        if(RegularBaseNonVegPizzaCount>0) {
            totalAmount = totalAmount - 140;
            RegularBaseNonVegPizzaCount--;
            for(int i=0;i<FinalBill.size();i++) {
                String str = FinalBill.get(i);
                if(str.contains("RegularBaseNonVeg")) {
                    FinalBill.remove(i);
                    break;
                }
            }
            for(int i=0;i<OrderList.size();i++) {
                String str = OrderList.get(i);
                if(str.contains("RegularBaseNonVeg")) {
                    OrderList.remove(i);
                    break;
                }
            }
        }
    }
    public void removeLargeBaseVegPizza() {
        if(LargeBaseVegPizzaCount>0) {
            totalAmount = totalAmount - 180;
            LargeBaseVegPizzaCount--;
            for(int i=0;i<FinalBill.size();i++) {
                String str = FinalBill.get(i);
                if(str.contains("LargeBaseVeg")) {
                    FinalBill.remove(i);
                    break;
                }
            }
            for(int i=0;i<OrderList.size();i++) {
                String str = OrderList.get(i);
                if(str.contains("LargeBaseVeg")) {
                    OrderList.remove(i);
                    break;
                }
            }
        }
    }
    public void removeLargeBaseNonVegPizza() {
        if(LargeBaseNonVegPizzaCount>0) {
            totalAmount = totalAmount - 220;
            LargeBaseNonVegPizzaCount--;
            for(int i=0;i<FinalBill.size();i++) {
                String str = FinalBill.get(i);
                if(str.contains("LargeBaseNonVeg")) {
                    FinalBill.remove(i);
                    break;
                }
            }
            for(int i=0;i<OrderList.size();i++) {
                String str = OrderList.get(i);
                if(str.contains("LargeBaseNonVeg")) {
                    OrderList.remove(i);
                    break;
                }
            }
        }
    }

    public void removeRegularFarmHouseVegPizza() {
        if(RegularFarmHouseVegPizzaCount>0) {
            totalAmount = totalAmount - 120;
            RegularFarmHouseVegPizzaCount--;
            for(int i=0;i<FinalBill.size();i++) {
                String str = FinalBill.get(i);
                if(str.contains("RegularFarmHouseVeg")) {
                    FinalBill.remove(i);
                    break;
                }
            }
            for(int i=0;i<OrderList.size();i++) {
                String str = OrderList.get(i);
                if(str.contains("RegularFarmHouseVeg")) {
                    OrderList.remove(i);
                    break;
                }
            }
        }
    }

    public void removeRegularFarmHouseNonVegPizza() {
        if(RegularFarmHouseNonVegPizzaCount>0) {
            totalAmount = totalAmount - 160;
            RegularFarmHouseNonVegPizzaCount--;
            for(int i=0;i<FinalBill.size();i++) {
                String str = FinalBill.get(i);
                if(str.contains("RegularFarmHouseNonVeg")) {
                    FinalBill.remove(i);
                    break;
                }
            }
            for(int i=0;i<OrderList.size();i++) {
                String str = OrderList.get(i);
                if(str.contains("RegularFarmHouseNonVeg")) {
                    OrderList.remove(i);
                    break;
                }
            }
        }
    }

    public void removeLargeFarmHouseVegPizza() {
        if(LargeFarmHouseVegPizzaCount>0) {
            totalAmount = totalAmount - 200;
            LargeFarmHouseVegPizzaCount--;
            for(int i=0;i<FinalBill.size();i++) {
                String str = FinalBill.get(i);
                if(str.contains("LargeFarmHouseVeg")) {
                    FinalBill.remove(i);
                    break;
                }
            }
            for(int i=0;i<OrderList.size();i++) {
                String str = OrderList.get(i);
                if(str.contains("LargeFarmHouseVeg")) {
                    OrderList.remove(i);
                    break;
                }
            }
        }
    }

    public void removeLargeFarmHouseNonVegPizza() {
        if(LargeFarmHouseNonVegPizzaCount>0) {
            totalAmount = totalAmount - 240;
            LargeFarmHouseNonVegPizzaCount--;
            for(int i=0;i<FinalBill.size();i++) {
                String str = FinalBill.get(i);
                if(str.contains("LargeFarmHouseNonVeg")) {
                    FinalBill.remove(i);
                    break;
                }
            }
            for(int i=0;i<OrderList.size();i++) {
                String str = OrderList.get(i);
                if(str.contains("LargeFarmHouseNonVeg")) {
                    OrderList.remove(i);
                    break;
                }
            }
        }
    }

    public void removeRegularPeriPeriVegPizza() {
        if(RegularPeriPeriVegPizzaCount>0) {
            totalAmount = totalAmount - 120;
            RegularPeriPeriVegPizzaCount--;
            for(int i=0;i<FinalBill.size();i++) {
                String str = FinalBill.get(i);
                if(str.contains("RegularPeriPeriVeg")) {
                    FinalBill.remove(i);
                    break;
                }
            }
            for(int i=0;i<OrderList.size();i++) {
                String str = OrderList.get(i);
                if(str.contains("RegularPeriPeriVeg")) {
                    OrderList.remove(i);
                    break;
                }
            }
        }
    }

    public void removeRegularPeriPeriNonVegPizza() {
        if(RegularPeriPeriNonVegPizzaCount>0) {
            totalAmount = totalAmount - 160;
            RegularPeriPeriNonVegPizzaCount--;
            for(int i=0;i<FinalBill.size();i++) {
                String str = FinalBill.get(i);
                if(str.contains("RegularPeriPeriNonVeg")) {
                    FinalBill.remove(i);
                    break;
                }
            }
            for(int i=0;i<OrderList.size();i++) {
                String str = OrderList.get(i);
                if(str.contains("RegularPeriPeriNonVeg")) {
                    OrderList.remove(i);
                    break;
                }
            }
        }
    }

    public void removeLargePeriPeriVegPizza() {
        if(LargePeriPeriVegPizzaCount>0) {
            totalAmount = totalAmount - 200;
            LargePeriPeriVegPizzaCount--;
            for(int i=0;i<FinalBill.size();i++) {
                String str = FinalBill.get(i);
                if(str.contains("LargePeriPeriVeg")) {
                    FinalBill.remove(i);
                    break;
                }
            }
            for(int i=0;i<OrderList.size();i++) {
                String str = OrderList.get(i);
                if(str.contains("LargePeriPeriVeg")) {
                    OrderList.remove(i);
                    break;
                }
            }
        }
    }

    public void removeLargePeriPeriNonVegPizza() {
        if(RegularPeriPeriNonVegPizzaCount>0) {
            totalAmount = totalAmount - 240;
            LargePeriPeriNonVegPizzaCount--;
            for(int i=0;i<FinalBill.size();i++) {
                String str = FinalBill.get(i);
                if(str.contains("LargePeriPeriNonVeg")) {
                    FinalBill.remove(i);
                    break;
                }
            }
            for(int i=0;i<OrderList.size();i++) {
                String str = OrderList.get(i);
                if(str.contains("LargePeriPeriNonVeg")) {
                    OrderList.remove(i);
                    break;
                }
            }
        }
    }

    public void removeExtraCheese() {
        if(isCheeseAdded==true) {
            totalAmount = totalAmount - 40;
            isCheeseAdded = false;
            for(int i=0;i<FinalBill.size();i++) {
                String str = FinalBill.get(i);
                if(str.contains("Extra Cheese")) {
                    FinalBill.remove(i);
                    break;
                }
            }
            for(int i=0;i<OrderList.size();i++) {
                String str = OrderList.get(i);
                if(str.contains("Extra Cheese")) {
                    OrderList.remove(i);
                    break;
                }
            }
        }
    }

    public void removeExtraToppings() {
        if(isToppingsAdded==true) {
            totalAmount = totalAmount - 50;
            isToppingsAdded = false;
            for(int i=0;i<FinalBill.size();i++) {
                String str = FinalBill.get(i);
                if(str.contains("Extra Toppings")) {
                    FinalBill.remove(i);
                    break;
                }
            }
            for(int i=0;i<OrderList.size();i++) {
                String str = OrderList.get(i);
                if(str.contains("Extra Toppings")) {
                    OrderList.remove(i);
                    break;
                }
            }
        }
    }

    public void removeExtraCarryBag() {
        if(isCarryBagAdded==true) {
            totalAmount = totalAmount - 20;
            isCarryBagAdded = false;
            for(int i=0;i<FinalBill.size();i++) {
                String str = FinalBill.get(i);
                if(str.contains("Extra CarryBag")) {
                    FinalBill.remove(i);
                    break;
                }
            }
            for(int i=0;i<OrderList.size();i++) {
                String str = OrderList.get(i);
                if(str.contains("Extra CarryBag")) {
                    OrderList.remove(i);
                    break;
                }
            }
        }
    }

    public void ShowOrderList() {
        System.out.println("Order List:");
        for(String order : OrderList) {
            System.out.println(order);
        }
    }
    public void printBill() {
        if(isBillGenerated==false) {
            isBillGenerated = true;
            String Currbill = "Total bill is Equal to: " + totalAmount;
            FinalBill.add(Currbill);

        }
        for(int i=0;i<FinalBill.size();i++) {
            System.out.println(FinalBill.get(i));
        }
    }

}
