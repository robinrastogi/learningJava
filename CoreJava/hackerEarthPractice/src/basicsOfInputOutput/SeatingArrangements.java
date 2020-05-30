package basicsOfInputOutput;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/**
 * @author Robin
 * The second sitting compartment in Indian railways looked something like:
 * src: images/secondSittingCompartment.jpeg
 * 
 * This program is to find the seat number facing the seat number provided as input and the seat type facing them. 
 * The seats are denoted as follows :
 * * Window Seat : WS
 * * Middle Seat : MS
 * * Aisle Seat : AS
 * You will be given a seat number, find out the seat number facing you and the seat type, i.e. WS, MS or AS.
 */
public class SeatingArrangements {
	
	public static void main(String args[] ) throws Exception {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());

		for(int i=0; i<n; i++) {
			int seatNo =  Integer.parseInt(br.readLine());

			if(seatNo <= 12){
				System.out.println((13-seatNo) + " " + getSeatType(seatNo));
			} else {
				System.out.println((seatNo + 13-(2*(seatNo % 12))) + " " + getSeatType((13-(seatNo % 12))));
			}
		}

	}

	private static String getSeatType (int seatNo) {
		String seatType = "";
		//System.out.println("seatNo received is: " + seatNo);
		if(seatNo == 1 || seatNo == 6 || 
				seatNo == 7 || seatNo == 12) {
			seatType = "WS";
		} else if(seatNo == 2 || seatNo == 5 || 
				seatNo == 8 || seatNo == 11) {
			seatType = "MS";
		} else if(seatNo == 3 || seatNo == 4 || 
				seatNo == 9 || seatNo == 10) {
			seatType = "AS";
		}

		return seatType;
	}
}


