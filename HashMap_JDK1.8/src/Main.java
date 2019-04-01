import java.util.Scanner;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutionException;
import java.util.function.Supplier;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine();
        dothings(str);
        scanner.close();
    }

    public static  void dothings(String in){
        CompletableFuture<?>[] cfs = new CompletableFuture<?>[3];
        CompletableFuture<String> ftask2 = CompletableFuture.supplyAsync(new Supplier<String>() {
            @Override
            public String get() {
                return "_B";
            }
        });

        CompletableFuture<String> ftask1 = CompletableFuture.supplyAsync(new Supplier<String>() {
            @Override
            public String get() {
                return "_A";
            }
        });

        CompletableFuture<String> ftask3 = CompletableFuture.supplyAsync(new Supplier<String>() {
            @Override
            public String get() {
                return "_C";
            }
        });

        cfs[0] = ftask1;
        cfs[1] = ftask2;
        cfs[2] = ftask3;

        CompletableFuture.allOf(cfs).join();

        try {
            System.out.println(in+cfs[0].get()+cfs[1].get()+cfs[2].get());
        } catch (InterruptedException e) {
            e.printStackTrace();
        } catch (ExecutionException e) {
            e.printStackTrace();
        }

    }

}