public class ForEach {
    public static void main(String[] args) {


        String [] names = {
                "eko", "kurniawan", "kanedi",
                "proggramer", "jaman" , "now"
        };

        for(var i=0 ; i<names.length; i++){
            System.out.println(names[i]);

        }
        System.out.println("foreach");
        for ( var name : names){
            System.out.println(name);
        }

    }
}
