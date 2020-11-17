public class classeA {
    private int A1;
    private float A2;

    public classeA(int A1, float A2){
        this.A1 = A1;
        this.A2 = A2;
    }

    public int getA1(){
        return this.A1;
    }

    public float getA2(){
        return this.A2;
    }

    public void setA1(int A1){
        this.A1 = A1;
    }

    public void setA2(int A2){
        this.A2 = A2;
    }

    public void MA1() {
        System.out.print("MA1");

    }

    public void MA2() {
        System.out.print("MA2");

    }

    public void MA3() {
        System.out.print("Alteração a classe A partir do clone");

    }

}