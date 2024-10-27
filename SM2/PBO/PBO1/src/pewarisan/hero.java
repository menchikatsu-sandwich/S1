
package pewarisan;

public class hero{
        private String nama;
        private String waza;
        private int atk;
        private int hp;
        
//    set    
        public void setnama(String n){
            nama=n;
        }
        public void setwaza(String w){
            waza=w;
        }
        public void setatk(int a){
            atk=a;
        }
        public void sethp(int h){
            hp=h;
        }
        
//    get    
        public String getnama(){
            return nama;
        }
        public String getwaza(){
            return waza;
        }
        public int getatk(){
            return atk;
        }
        public int gethp(){
            return hp;
        }
        
    }
