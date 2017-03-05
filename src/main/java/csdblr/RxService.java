package csdblr;

public class RxService {

	public String validate(RxData rxData) {
		// TODO Auto-generated method stub
		if(rxData.pName.equals(" "))
		{
			return "Unsuccessful";
			//return rxDao.Save(rxData);
		}
		else
		{
			return "Successful";
		}
		
	}

}
