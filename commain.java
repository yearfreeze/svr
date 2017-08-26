package tmain;
import java.io.IOException; 
import service.svm_predict; 
import service.svm_train;
public class commain {
	public static void main(String[] args) throws IOException { 
	 System.out.println("SVR begin");
	 String []arg={"train\\sun_y_train.txt","train\\sun_y_model.txt"};
	 String []prg={"train\\sun_y_test.txt","train\\sun_y_model.txt","train\\sun_y_out.txt"};
	 
	 svm_train t=new svm_train();
	 svm_predict p=new svm_predict();
	 t.main(arg);
	 p.main(prg);
	 System.out.println("SVR end");
	}
}
