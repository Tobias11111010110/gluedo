package com.bbw.tkl.zkb;

import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.stereotype.Service;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.List;
@Service
public class PunchListService {


    private  List<PunchList> punchList;


    public List<PunchList> getReservationList() {return  punchList;}
}
