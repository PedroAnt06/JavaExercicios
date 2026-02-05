package Pares;

public class CombinarPares {
    public static void main (String[] args){
        CombinarPares combinarPares = new CombinarPares();
        combinarPares.verificar();
    }

    int[] nums = {2, 3, 3, 3, 2, 4};

    public void verificar() {
        int i = 0;

        while (i < nums.length - 1) {
            int o = i + 1;

            while (o < nums.length) {
                if (nums[i] == nums[o]) {
                    System.out.println("Par encontrado: " + nums[i] + "," + nums[o]);
                }
                o++;
            }
            i++;
        }
    }
}

