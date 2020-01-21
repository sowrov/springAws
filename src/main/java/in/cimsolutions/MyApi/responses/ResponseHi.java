/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package in.cimsolutions.MyApi.responses;

import java.util.Calendar;
import java.util.Date;

/**
 *
 * @author M.Mozadded
 */
public class ResponseHi {
    String text = "Hi there!";
    Date date = Calendar.getInstance().getTime();

    public String getText() {
        return text;
    }

    public Date getDate() {
        return date;
    }
}
