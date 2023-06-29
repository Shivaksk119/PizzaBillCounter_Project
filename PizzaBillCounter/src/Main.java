import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        System.out.println("Welcome to Btech Pizza Walla");
        System.out.println("How many pizza's do you need");

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        if(n<=0) {
            System.out.println("INVALID ENTRY"+"\n"+"RETRY");
            return;
        }
        String kind = sc.nextLine();

        Pizza pizza = new Pizza();

        for(int i=0;i<n;i++)
        {
            System.out.println("Select the kind of Pizza");
            System.out.print("1. Base Pizza"+"\n"+"2. FarmHouse Pizza"+"\n"+"3. PeriPeri Pizza"+"\n"+"Enter: Base or FarmHouse or PeriPeri to select."+"\n");
            kind = sc.nextLine();
            if (kind.equals("Base")) {
                System.out.println("veg or Non Veg ?");
                String pizzaType = sc.nextLine();
                boolean isVeg;
                if(pizzaType.equals("Veg")) {
                    isVeg = true;
                }
                else {
                    isVeg = false;
                }
                System.out.println("Regular or Large Pizza ?");
                String pizzaSize = sc.nextLine();
                pizza.basePizza(isVeg,pizzaSize);

            }else if(kind.equals("FarmHouse")) {
                System.out.println("veg or Non Veg ?");
                String pizzaType = sc.nextLine();
                boolean isVeg;
                if(pizzaType.equals("Veg")) {
                    isVeg = true;
                }
                else {
                    isVeg = false;
                }
                System.out.println("Regular or Large Pizza ?");
                String pizzaSize = sc.nextLine();
                pizza.FarmhousePizza(isVeg,pizzaSize);

            } else if(kind.equals("PeriPeri")) {
                System.out.println("veg or Non Veg ?");
                String pizzaType = sc.nextLine();
                boolean isVeg;
                if (pizzaType.equals("Veg")) {
                    isVeg = true;
                } else {
                    isVeg = false;
                }
                System.out.println("Regular or Large Pizza ?");
                String pizzaSize = sc.nextLine();
                pizza.PeriPeriPizza(isVeg, pizzaSize);
            }
        }

        System.out.println("Would you like to have some extra cheese Enter Y/N");
        String ans;
        ans = sc.nextLine();
        if(ans.equals("Y")) {
            pizza.addExtraCheese();
        }

        System.out.println("Would you like to have some extra carry bag Enter Y/N");
        ans = sc.nextLine();
        if(ans.equals("Y")) {
            pizza.addExtraCarryBag();
        }

        System.out.println("Would you like to have some extra toppings Enter Y/N");
        ans = sc.nextLine();
        if(ans.equals("Y")) {
            pizza.addExtraToppings();
        }

        System.out.println("Would you like to Confirm the Order or want remove anything from order list"+"\n"+"Enter: Y-to confirm, N-to remove");
        ans = sc.nextLine();
        if(ans.equals("N")) {
            System.out.println("How many would you like to remove?");
            int count = sc.nextInt();
            String input = sc.nextLine();
            for(int i=1;i<=count;i++) {
                pizza.ShowOrderList();
                System.out.println("Enter the exact order name to select.");
                input = sc.nextLine();
                if(input.equals("RegularBaseVeg")) {
                    pizza.removeRegularBaseVegPizza();
                }
                else if(input.equals("RegularBaseNonVeg")) {
                    pizza.removeRegularBaseNonVegPizza();
                }
                else if(input.equals("LargeBaseVeg")) {
                    pizza.removeLargeBaseVegPizza();
                }
                else if(input.equals("LargeBaseNonVeg")) {
                    pizza.removeLargeBaseNonVegPizza();
                }
                else if(input.equals("RegularFarmHouseVeg")) {
                    pizza.removeRegularFarmHouseVegPizza();
                }
                else if(input.equals("RegularFarmHouseNonVeg")) {
                    pizza.removeRegularFarmHouseNonVegPizza();
                }
                else if(input.equals("LargeFarmHouseVeg")) {
                    pizza.removeLargeFarmHouseVegPizza();
                }
                else if(input.equals("LargeFarmHouseNonVeg")) {
                    pizza.removeLargeFarmHouseNonVegPizza();
                }
                else if(input.equals("RegularPeriPeriVeg")) {
                    pizza.removeRegularPeriPeriVegPizza();
                }
                else if(input.equals("RegularPeriPeriNonVeg")) {
                    pizza.removeRegularPeriPeriNonVegPizza();
                }
                else if(input.equals("LargePeriPeriVeg")) {
                    pizza.removeLargePeriPeriVegPizza();
                }
                else if(input.equals("LargePeriPeriNonVeg")) {
                    pizza.removeLargePeriPeriNonVegPizza();
                }
                else if(input.equals("Extra Cheese")) {
                    pizza.removeExtraCheese();
                }
                else if(input.equals("Extra Toppings")) {
                    pizza.removeExtraToppings();
                }
                else if(input.equals("Extra CarryBag")) {
                    pizza.removeExtraCarryBag();
                }
            }
            System.out.println();
            System.out.println("Thanks for Confirming.");
            System.out.println();
        }
        else {
            System.out.println("Thanks for Confirming.");
            System.out.println();

        }
        System.out.println("Here is Your BILL:");
        pizza.printBill();
    }
}