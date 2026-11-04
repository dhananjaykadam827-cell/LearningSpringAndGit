package One.classDemo.LearningException;

//class  CustomException extends Exception{
//     public BookUnavalibaleExce(String msg){
//         super(msg);
//     }
//}

class Liberary{
        int booksCount = 3;
        public  void BorrowBooks(int requestedBooks) throws Exception{
//                if(requestedBooks > booksCount)
//                    throw new BookUnavalibaleExce("not ava");
//            if(requestedBooks <0)
//                throw new BookUnavalibaleExce("not valid");

//            catch (ArithmeticException e){
//                System.out.println(e.getMessage());
//            }
        }
        }
public class learnException {
    public static void main(String[] args) {

        //try catch with finally
        Liberary lib  =new Liberary();
        try{
            lib.BorrowBooks(10);
        }catch (Exception e){
            System.out.println("less books");
            System.out.println(e.getMessage());
        }finally {
            System.out.println("thanks");
        }


    }
}
