package com.effective.entity;



public class AnonymousClass {

    class NumClock{
        int step;
        int n;
        public NumClock(int step){
            this.step = step;
        }
    }

    public static Football football = new Football() {
        @Override
        public void kick() {
            System.out.println("nested Anonymous Class");
        }
    };

    public static void main(String[] args) {
        Football footballObject = new Football() {
            @Override
            public void kick() {
                System.out.println("Anonymous Class");
            }
        };
        //lambda 替换内部类
        Football football = () -> System.out.println("lambda Anonymous Class");
        football.kick();

        footballObject.kick();

        AnonymousClass.football.kick();
    }
}



interface Football{
    void kick();

}

