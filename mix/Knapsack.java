package mix;

class Knapsack {

    // A naive recursive solution of 0-1 knapsack problem

    private static int max(int a, int b){

        return (a>b) ? a : b;
    }

    private static int knapsack(int W, int wt[], int val[], int n){

        if (n == 0 || W == 0){
            return 0;
        }

        if (wt[n-1] > W){

            return knapsack(W,wt,val,n-1);
        }else {

            return max(val[n-1]+ knapsack(W-wt[n-1],wt,val,n-1), knapsack(W,wt,val,n-1));
        }
    }



    public static void main(String[] args){

        int val[] = {60,100,120};
        int wt[] = {10, 20, 30};
        int W = 50;
        int n = val.length;


        System.out.println(knapsack(W,wt,val,n));

    }
}
