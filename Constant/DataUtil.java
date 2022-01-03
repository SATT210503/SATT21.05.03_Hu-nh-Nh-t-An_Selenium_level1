package Constant;

import org.json.simple.JSONObject;
import org.json.simple.JSONArray;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;
import org.testng.annotations.DataProvider;

import java.io.FileReader;
import java.io.IOException;

public class DataUtil{

    @DataProvider
    public Object[] dataProvider()
    {
        JSONParser parser = new JSONParser();
        JSONObject jsonObject = null;

        //read json file
        Object obj = null;
        try
        {
            obj = parser.parse(new FileReader("Constant/testData.json"));
        }catch (IOException | ParseException e)
        {
            e.printStackTrace();
        }
        jsonObject = (JSONObject) obj;

        //Extract data
        assert jsonObject != null;
        JSONArray bookTicketForm = (JSONArray) jsonObject.get("Book ticket form");

        String[] dataArray = new String[bookTicketForm.size()];

        JSONObject bookTicketFormData;
        String DepartDate, DepartFrom, ArriveAt, SeatType, TicketAmount;

        for(int i =0 ; i<bookTicketForm.size(); i++)
        {
            bookTicketFormData = (JSONObject) bookTicketForm.get(i);
            DepartDate = (String) bookTicketFormData.get("Depart date");
            DepartFrom = (String) bookTicketFormData.get("Depart from");
            ArriveAt = (String) bookTicketFormData.get("Arrive at");
            SeatType = (String) bookTicketFormData.get("Seat Type");
            TicketAmount = (String) bookTicketFormData.get("Ticket Amount");

            dataArray[i] = DepartDate + ',' + DepartFrom + ',' + ArriveAt + ',' + SeatType + ',' + TicketAmount;
        }
        return dataArray;
    }
}
