package encapsulation;

public class Printer {
    private int tonerLevel = 100;
    private int numberOfPagesPrinted = 0;
    private boolean isDuplex = false;

    public Printer(int tonerLevel, int numberOfPagesPrinted, boolean isDuplex) {
        if(tonerLevel < 0){
            this.tonerLevel = 0;
        }else if(tonerLevel > 100){
            this.tonerLevel = 100;
        }
        this.tonerLevel = tonerLevel;
        this.numberOfPagesPrinted = numberOfPagesPrinted;
        this.isDuplex = isDuplex;
    }

    public void fillTonerLevel(int tonerLevel){
        if(this.tonerLevel+ tonerLevel <0 ||this.tonerLevel + tonerLevel > 100 ){
            System.out.println("Toner Level Violate the permissible limit");
        }else{
            this.tonerLevel = this.tonerLevel + tonerLevel;
        }

    }

    public void printPages(int page){
        int totalPermissiblePage = this.tonerLevel * totalPageInOneToner();
        if(page - totalPermissiblePage > 0){
            System.out.println("Total Page Printed : "+ totalPermissiblePage);
            System.out.println("Page "+ (page-totalPermissiblePage) + " can not be printed because of exhaust of ink");
            tonerLevel = 0;
        }else{
           // tonerLevel =
            System.out.println("Page: "+ page + " has been printed");
        }
    }

    private int totalPageInOneToner(){
        return 4;
    }

}
