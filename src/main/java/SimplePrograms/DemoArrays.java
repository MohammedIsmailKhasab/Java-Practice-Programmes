package SimplePrograms;

//store marks of students
//single dimensional array
public class DemoArrays {
    public static void main(String[] args) {
//        int [] marks =new int [5];
//        marks[0]=100;
//        marks[1]=90;
//        marks[2]=80;
//        marks[3]=70;
//        marks[4]=60;
//        System.out.println(marks[0]);

        int [][] flats;
        flats = new int[2][3];
        flats[0][0] = 101;
        flats[0][1] = 102;
        flats[0][2] = 103;
        flats[1][0] = 201;
        flats[1][1] = 202;
        flats[1][2] = 203;

        for(int i=0; i<flats.length; i++){
            for(int j=0; j<flats[i].length; j++){
                System.out.print(flats[i][j]);
                System.out.println(" ");
            }
            System.out.println(" ");
        }
    }
}