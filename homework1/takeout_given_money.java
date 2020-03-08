package cn.h1;
public class takeout_given_money {

    public boolean is_zero(int x){
        if(x==0){
            return true;
        }else{
            return false;
        }
    }

    public boolean is_equal(int x){
        if(x>93||x<0){
            return false;
        }
        if(x>=50){
            x-=50;
        }
        if(x>=20){
            x-=20;
        }
        if(x>=10){
            x-=10;
        }
        for(int i=0;i<2;i++){
            if(x>=5){
                x-=5;
            }
        }
        for(int i=0;i<3;i++){
            if(x>=1){
                x-=1;
            }
        }
        return is_zero(x);
    }

}
