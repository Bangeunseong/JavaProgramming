package BasicAPI;
import java.io.IOException;
import java.lang.reflect.Constructor;
import java.text.DecimalFormat;
import java.text.MessageFormat;
import java.text.SimpleDateFormat;
import java.time.DayOfWeek;
import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.temporal.ChronoUnit;
import java.time.temporal.TemporalAdjusters;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Calendar;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Objects;
import java.util.Random;
import java.util.StringTokenizer;
import java.util.regex.Pattern;
public class Main {
    public static void main(String[] args) throws IOException, InterruptedException{
        //Using equals method to compare each other

        Member obj1 = new Member("blue", new int[] {1,2,3,4,5});
        Member obj2 = new Member("blue", new int[] {1,2,3,4,5});
        Member obj3 = new Member("red", new int[] {1,2,3,4,5});

        if(obj1.equals(obj2)){System.out.println("obj1 is same as obj2");}
        else {System.out.println("obj1 is not same as obj2");}

        if(obj2.equals(obj3)){System.out.println("obj2 is same as obj3");}
        else{System.out.println("obj2 is not same as obj3");}

        //Using HashCode
        HashMap<Integer, Member> hashMap = new HashMap<Integer, Member>();
        hashMap.put(obj1.hashCode(), obj1);

        Member Val = hashMap.get(new Member("blue", new int[] {1,2,3,4,5}).hashCode());
        System.out.println(Val.id);

        //Object string info -> toString()
        SmartPhone myPhone = new SmartPhone("Google", "Android");
        System.out.println(myPhone);

        //Cloning Object
        Member Cloned = obj1.getMember();
        System.out.println(Cloned.id);
        for(int score : Cloned.Scores) System.out.println(score);

        System.gc(); //Garbage Collector -> when memory is not enough

        //Object class

        //Object comparing -> compare(T a, T b, Comparator<T>c)
        Student s1 = new Student("Gary", 1);
        Student s2 = new Student("Harry", 1);
        Student s3 = new Student("Mary", 2);

        int result = Objects.compare(s1, s2, new StudentComparator());
        System.out.println(result);
        result = Objects.compare(s1, s3, new StudentComparator());
        System.out.println(result);

        //Object comparing equal -> equals(), deepEquals()
        Integer o1 = 1000;
        Integer o2 = 1000;

        System.out.println(Objects.equals(o1, o2));
        System.out.println(Objects.deepEquals(o1, o2));
        System.out.println(Objects.equals(null, o1));
        System.out.println(Objects.equals(o2, null));
        System.out.println(Objects.equals(null, null));

        Integer[] arr1 = {1,2};
        Integer[] arr2 = {1,2};

        System.out.println(Objects.equals(arr1, arr2));
        System.out.println(Objects.deepEquals(arr1, arr2));
        System.out.println(Arrays.deepEquals(arr1, arr2));

        //Hashcode Generate
        System.out.println(s1.hashCode());
        System.out.println(Objects.hashCode(s1));

        //Nullpointer Check
        String str1 = "HongGilDong";
        String str2 = null;
        System.out.println(Objects.requireNonNull(str1));

        try{String name = Objects.requireNonNull(str2);}
        catch(Exception e){System.out.println(e.getMessage());}

        try{String name = Objects.requireNonNull(str2, "No name!");}
        catch(Exception e){System.out.println(e.getMessage());}

        try{String name = Objects.requireNonNull(str2, ()->"No name you bitch!");}
        catch(Exception e){System.out.println(e.getMessage());}

        //Object String info -> toString()
        System.out.println(Objects.toString(str1));
        System.out.println(Objects.toString(str2));
        System.out.println(Objects.toString(str2,"No name!"));

        //System class
        //Program shutdown -> exit()

        /*System.setSecurityManager(new SecurityManager(){
            @Override
            public void checkExit(int status){
                if(status != 5) throw new SecurityException();
            }
        });

        for(int i = 0; i < 10; i++){
            System.out.println(i);
            try{System.exit(i);}
            catch(SecurityException e){}
        }*/

        //Garbage Collector -> gc()
        Employee emp;

        emp = new Employee(1);
        emp = null;
        emp = new Employee(2);
        emp = new Employee(3);

        System.out.println(emp.eno);
        System.gc();

        //Reading current time
        long time1 = System.currentTimeMillis();
        long time2 = System.nanoTime();

        int sum = 0;
        for(int i = 1; i <= 1000000; i++) sum += i;

        long time3 = System.nanoTime();

        System.out.println("Current time in Millisecond: " + time1);
        System.out.println("Sum of 1 to 1000000: " + sum);
        System.out.println("Took " + (time3 - time2) + " nano second");

        //System Property
        /*String osName = System.getProperty("os.name");
        String userName = System.getProperty("user.name");
        String userHome = System.getProperty("user.home");

        System.out.println("OS name: " + osName);
        System.out.println("USER name: " + userName);
        System.out.println("USER homedirectory: " + userHome);

        Properties props = System.getProperties();

        Set keys = props.keySet();
        for(Object objKey : keys){
            String key = (String)objKey;
            String value = System.getProperty(key);
            System.out.println("[ " + key + " ] " + value);
        }*/

        //Environment variable reading -> getenv()
        Member mem = new Member("Josh", new int[] {1,2,3,4,5,6});
        Class class1 = mem.getClass();
        System.out.println(class1.getName());
        System.out.println(class1.getSimpleName());
        System.out.println(class1.getPackage().getName());
        System.out.println();

        try{
            Class class2 = Class.forName("BasicAPI.Member");
            System.out.println(class2.getName());
            System.out.println(class2.getSimpleName());
            System.out.println(class2.getPackage().getName());
        }
        catch(ClassNotFoundException e){e.printStackTrace();}

        //Reflection -> getDeclaredConstructors(), getDeclaredFields(), getDeclaredMethods()
        Class class3;
        try {
            class3 = Class.forName("BasicAPI.Student");
            System.out.println("[Class name]");
            System.out.println(class3.getName());
            System.out.println();

            System.out.println("[Constructor info]");
            Constructor[] constructors = class3.getDeclaredConstructors();
            for(Constructor constructor : constructors){
                System.out.print(constructor.getName() + "(");
                Class[] parameters = constructor.getParameterTypes();
                printParameters(parameters);
                System.out.println(")");
            }
            System.out.println();


            System.out.println("[Field info]");
            Field[] fields = class3.getDeclaredFields();
            for(Field field : fields){
                System.out.println(field.getType().getSimpleName() + " " + field.getName());
            }
            System.out.println();


            System.out.println("[Method info]");
            Method[] methods = class3.getDeclaredMethods();
            for(Method method : methods){
                System.out.print(method.getName() + "(");
                Class[] parameters = method.getParameterTypes();
                printParameters(parameters);
                System.out.println(")");
            }
            System.out.println();
        } catch (ClassNotFoundException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    

        //Dynamic Class generation -> newInstance()
        try{
            Class class4 = Class.forName("BasicAPI.Student");
            Student std = (Student) class4.newInstance();
            System.out.println(std.hashCode());
        }
        catch(ClassNotFoundException e){e.printStackTrace();}
        catch(InstantiationException e){e.printStackTrace();}
        catch(IllegalAccessException e){e.printStackTrace();}
        
        try{
            Class class5 = Class.forName("BasicAPI.SendAction");
            Class class6 = Class.forName("BasicAPI.ReceiveAction");
            Action action1 = (Action)class5.newInstance();
            Action action2 = (Action)class6.newInstance();
            action1.execute();
            action2.execute();
        }
        catch(ClassNotFoundException e){e.printStackTrace();}
        catch(InstantiationException e){e.printStackTrace();}
        catch(IllegalAccessException e){e.printStackTrace();}

        //String class
        byte[] bytes = {72,101,108,108,111,32,74,97,118,97};

        String str3 = new String(bytes);
        System.out.println(str3);
        String str4 = new String(bytes, 6,4);
        System.out.println(str4);

        //Extracting Character -> charAt()
        String subject = "Java Programming";
        char charVal = subject.charAt(3);

        String ssn = "010624-1230123";
        char sex = ssn.charAt(7);
        switch(sex){
            case '1':
            case '3':
            System.out.println("Male");
            break;
            case '2':
            case '4':
            System.out.println("Female");
            break;
        }

        //String compare
        byte[] byt = new byte[100];

        System.out.print("Input: ");
        int readByteno = System.in.read(byt);
        String strRead = new String(byt,0,readByteno - 2);
        System.out.println(strRead);

        byte[] bytes_2 = strRead.getBytes();
        System.out.println("bytes_2 length: " + bytes_2.length);
        System.out.println("bytes_2 String: " + new String(bytes_2));

        //Searching Substring
        String subjectStr = "Java Programming";
        int index = subject.indexOf("Programming");
        if(subject.indexOf("Java") != -1) System.out.println("Related to java");
        else System.out.println("Not related to java");

        //replacing subString
        String oldStr = "자바 프로그래밍";
        String newStr = oldStr.replace("자바", "Java");
        System.out.println(newStr);

        //Cutting String -> subString()
        String ssn_1 = "880815-1234567";
        String firstnum = ssn_1.substring(0,6);
        String secondnum = ssn_1.substring(7);

        System.out.println(firstnum);
        System.out.println(secondnum);

        //Change tolowet toupper
        String str1String = "Java Programming";
        String str2String = "JAVA PROGRAMMING";
        System.out.println(str1String.equals(str2String));

        String lowerstr1 = str1String.toLowerCase();
        String lowerstr2 = str2String.toLowerCase();
        System.out.println(lowerstr1.equals(lowerstr2));

        System.out.println(str1String.equalsIgnoreCase(str2String));

        //front, end trimming blankspace
        oldStr = "   Java Programming    ";
        newStr = oldStr.trim();

        System.out.println(newStr);

        String tel1 = "   02", tel2 = "123   ", tel3 = "   1234     ";
        String tel = tel1.trim() + tel2.trim() + tel3.trim();
        System.out.println(tel);

        //String converting to value
        String strInt = String.valueOf(10);
        String strDouble = String.valueOf(10.5);
        String strBool = String.valueOf(true);

        System.out.println(strInt + " " + strDouble + " " + strBool);

        //StringTokenizer Class
        //Using split()
        String text = "HongGilDong&LeeSuHong,ParkYeonSu,KimJava-ChoeMyeongHo";
        String[] names = text.split("&|,|-");
        for(String name : names) System.out.println(name);

        //Using StringTokenizer Class
        String text2 = "HongGilDong/LeeSuHong/ParkYeonSu";
        StringTokenizer st = new StringTokenizer(text2,"/");
        int countToken = st.countTokens();
        for(int i = 0; i < countToken; i++) System.out.println(st.nextToken()); //->Using for Phrase

        st = new StringTokenizer(text2,"/");
        while(st.hasMoreTokens()){  //-> Using While Phrase
            String Token = st.nextToken();
            System.out.println(Token);
        }

        //StringBuffer, StringBuilder Class -> StringBuffer for multithread environment, StringBuilder for singlethread environment
        StringBuilder sb = new StringBuilder();

        sb.append("Java ");
        sb.append("Program study"); //Appending String end of sb
        System.out.println(sb.toString());

        sb.insert(4, "2");  //Insert String behind offset
        System.out.println(sb.toString());

        sb.setCharAt(4, '6'); //replace character in index 4
        System.out.println(sb.toString());

        sb.replace(6, 13, "Book");
        System.out.println(sb.toString());

        sb.delete(4, 5);
        System.out.println(sb.toString());

        int length = sb.length();
        System.out.println("Total char count: " + length);

        String resultStr = sb.toString();
        System.out.println(resultStr);

        //Regular Expression, Pattern Class
        String regExp = "(02|010)-\\d{3,4}-\\d{4}";
        String data = "010-123-1234";

        boolean resultBool = Pattern.matches(regExp, data);
        if(resultBool){System.out.println("Matches with pattern");}
        else {System.out.println("Doesn't match with pattern");}

        regExp = "\\w+@\\w+\\.\\w+(\\.\\w+)?";
        data = "angel@naver.com";
        resultBool = Pattern.matches(regExp, data);
        if(resultBool){System.out.println("Matches with pattern");}
        else {System.out.println("Doesn't match with pattern");}

        //Arrays Class -> static class
        char[] array1 = {'J','A','V','A'};

        char[] array2 = Arrays.copyOf(array1, array1.length);
        System.out.println(array2.toString());

        char[] array3 = Arrays.copyOfRange(array1, 1, 3);
        System.out.println(array3.toString());

        //Array compare -> original compares with clone by cloning array
        int[][] original = {{1,2},{3,4}};

        //Shallow cloning
        System.out.println("After swallow clone compares with original");
        int[][] cloned1 = Arrays.copyOf(original, original.length);

        System.out.println("Array memory compare: " + original.equals(cloned1));
        System.out.println("First array memory compare: " + Arrays.equals(original, cloned1));
        System.out.println("Nested array memory compare: " + Arrays.deepEquals(original, cloned1));

        //Deep cloning
        System.out.println("After deep clone compares with original");
        int[][] cloned2 = Arrays.copyOf(original, original.length);
        for(int i = 0; i < original.length; i++) cloned2[i] = Arrays.copyOf(original[i], original[i].length);

        System.out.println("Array memory compare: " + original.equals(cloned2));
        System.out.println("First array memory compare: " + Arrays.equals(original, cloned2));
        System.out.println("Nested array memory compare: " + Arrays.deepEquals(original, cloned2));

        //Array sorting
        Member m1 = new Member("HongGilDong", new int[] {1,2,3});
        Member m2 = new Member("ParkDongSu", new int[] {2,3,4});
        Member m3 = new Member("KimMinSu", new int[] {4,5,6});
        Member[] membersArray = {m1,m2,m3};
        Arrays.sort(membersArray);
        for(Member member : membersArray) System.out.println("Member: " + member.id);

        //Array Searching
        int index_M = Arrays.binarySearch(membersArray, m2);
        System.out.println("Searched index: " + index_M);

        //Wrapper class

        //Boxing
        Byte obj_A = new Byte("10"); Byte obj_AI = new Byte((byte)10);
        Character obj_B = new Character('가');
        Short obj_C = new Short("100"); Short obj_CI = new Short((short)100);
        Integer obj_D = new Integer("1000"); Integer obj_DI = new Integer(1000);
        Long obj_E = new Long("10000"); Long obj_EI = new Long(10000);
        Float obj_F = new Float("2.5F"); Float obj_FI = new Float(2.5F);
        Double obj_G = new Double("3.5"); Double obj_GI = new Double(3.5);
        Boolean obj_H = new Boolean("true"); Boolean obj_HI = new Boolean(true);

        //Unboxing
        int obj_I1 = obj_D.intValue(); int obj_I2 = obj_DI.intValue();
        byte obj_I3 = obj_A.byteValue(); byte obj_I4 = obj_AI.byteValue();
        char obj_I5 = obj_B.charValue();
        short obj_I6 = obj_C.shortValue(); short objI7 = obj_CI.shortValue();

        //List<T>
        List<Integer> list = new ArrayList<Integer>();
        list.add(200);

        //parse + basictype
        int val1 = Integer.parseInt("10");
        double val2 = Double.parseDouble("3.14");
        boolean val3 = Boolean.parseBoolean("true");

        System.out.println("Val1: " + val1);
        System.out.println("Val2: " + val2);
        System.out.println("Val3: " + val3);

        //Value compare
        Integer obj1Integer = 300;
        Integer obj2Integer = 300;
        System.out.println("Result of ==: " + (obj1Integer == obj2Integer));
        System.out.println("Result of == after unboxing: " + (obj1Integer.intValue() == obj2Integer.intValue()));
        System.out.println("Result of equals(): " + (obj1Integer.equals(obj2Integer)));

        //Math, Random class
        //Math.abs -> gets positive value
        int val_Integer = Math.abs(-5);
        double val_double = Math.abs(-3.14);
        System.out.println(val_Integer);
        System.out.println(val_double);

        //Math ceil, floor -> gets ceiling val, gets floor val
        double ceil_val1 = Math.ceil(5.3);
        double ceil_val2 = Math.ceil(-5.3);
        System.out.println(ceil_val1);
        System.out.println(ceil_val2);

        double floor_val1 = Math.floor(5.3);
        double floor_val2 = Math.floor(-5.3);
        System.out.println(floor_val1);
        System.out.println(floor_val2);

        //Math max, min
        int max_val1 = Math.max(5,9);
        double max_val2 = Math.max(5.3,2.9);

        int min_val1 = Math.min(5,9);
        double min_val2 = Math.min(5.3,2.5);

        //Math random
        double random_val1 = Math.random(); //0.0 ~ 1.0

        //Math rint -> gets closest double or float value
        double rint_val1 = Math.rint(5.36);
        double rint_val2 = Math.rint(5.7);
        System.out.println(rint_val1);
        System.out.println(rint_val2);

        //Math round -> gets round value
        long round_val1 = Math.round(5.36);
        long round_val2 = Math.round(5.7);
        System.out.println(round_val1);
        System.out.println(round_val2);

        //getting wanted value
        double double_val = 12.3456;
        double tmp1 = double_val*100;
        long tmp2 = Math.round(tmp1);
        double double_result = tmp2 / 100.0;
        System.out.println(double_result);

        //Math random class
        int[] randomnumber = new int[6];
        Random random = new Random(3);
        System.out.println("Chosen number: ");
        for(int i = 0; i < 6; i++) randomnumber[i] = random.nextInt(45) + 1;
        for(int num : randomnumber) System.out.print(num + " ");
        System.out.println();

        int[] winningnumber = new int[6];
        random = new Random(5);
        System.out.println("Winning number: ");
        for(int i = 0; i < 6; i++) winningnumber[i] = random.nextInt(45) + 1;
        for(int num : winningnumber) System.out.print(num + " ");
        System.out.println();

        //Date, Calender class

        //Date class
        //Using basic date format
        Date now = new Date();
        String strnow1 = now.toString();
        System.out.println(strnow1);
        //By using format
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy년 MM월 dd일 hh시 mm분 ss초");
        String strnow2 = sdf.format(now);
        System.out.println(strnow2);

        //Calender class
        Calendar now2 = Calendar.getInstance();
        int year = now2.get(Calendar.YEAR);
        int month = now2.get(Calendar.MONTH) + 1;
        int day = now2.get(Calendar.DAY_OF_MONTH);

        int week = now2.get(Calendar.DAY_OF_WEEK);
        String strweek = null;
        switch(week){
            case Calendar.MONDAY:
            strweek = "Monday";
            break;
            case Calendar.TUESDAY:
            strweek = "Tuesday";
            break;
            case Calendar.WEDNESDAY:
            strweek = "Wednesday";
            break;
            case Calendar.THURSDAY:
            strweek = "Thursday";
            break;
            case Calendar.FRIDAY:
            strweek = "Friday";
            break;
            case Calendar.SATURDAY:
            strweek = "Saturday";
            break;
            case Calendar.SUNDAY:
            strweek = "Sunday";
            break;
        }

        int ampm = now2.get(Calendar.AM_PM);
        String strAmPm = null;
        if(ampm == Calendar.AM) strAmPm = "Morning";
        else strAmPm = "Afternoon";

        int hour = now2.get(Calendar.HOUR);
        int minute = now2.get(Calendar.MINUTE);
        int second = now2.get(Calendar.SECOND);

        System.out.println(year + "Y " + month + "M " + day + "D " + strweek + " " + strAmPm + " " + hour + "." + minute + "." + second);

        //Format class
        //1. Decimal Format
        double num = 1234567.89; DecimalFormat df = null;

        df = new DecimalFormat("0.0");
        System.out.println(df.format(num));
        df = new DecimalFormat("0000000.00000");
        System.out.println(df.format(num));
        df = new DecimalFormat("#");
        System.out.println(df.format(num));
        df = new DecimalFormat("#.#");
        System.out.println(df.format(num));
        df = new DecimalFormat("############.#####");
        System.out.println(df.format(num));
        df = new DecimalFormat("#.0");
        System.out.println(df.format(num));
        df = new DecimalFormat("+#.0");
        System.out.println(df.format(num));
        df = new DecimalFormat("-#.0");
        System.out.println(df.format(num));
        df = new DecimalFormat("#,###.0");
        System.out.println(df.format(num));
        df = new DecimalFormat("0.0E0");
        System.out.println(df.format(num));
        df = new DecimalFormat("+#,### ; -#,###");
        System.out.println(df.format(num));
        df = new DecimalFormat("#.#%");
        System.out.println(df.format(num));
        df = new DecimalFormat("\u00A4#,###"); //print won + *,***,***,...
        System.out.println(df.format(num));

        //2. SimpleDateFormat
        SimpleDateFormat sdf_S = new SimpleDateFormat("yyyy년 MM월 dd일");
        System.out.println(sdf_S.format(now));
        sdf_S = new SimpleDateFormat("yyyy-MM-dd");
        System.out.println(sdf_S.format(now));
        sdf_S = new SimpleDateFormat("yyyy.MM.dd a HH:mm:ss");
        System.out.println(sdf_S.format(now));
        sdf_S = new SimpleDateFormat("오늘은 E요일");
        System.out.println(sdf_S.format(now));
        sdf_S = new SimpleDateFormat("올해의 D번째 날");
        System.out.println(sdf_S.format(now));
        sdf_S = new SimpleDateFormat("이달의 d번째 날");
        System.out.println(sdf_S.format(now));

        //3. Message Format
        String id = "java";
        String name = "ShinYongGeon";
        String tel_str = "010-123-4567";

        String text_str = "ID: {0} \nName: {1} \nTel: {2}";
        String result_Str = MessageFormat.format(text_str, id, name, tel_str);
        System.out.println(result_Str);
        System.out.println();

        String sql = "insert into member values({0}, {1}, {2})";
        Object[] arguments = {id,name,tel_str};
        result_Str = MessageFormat.format(sql, arguments);
        System.out.println(result_Str);
        System.out.println();

        //Java time package
        //LocalDate -> Saves Local Date
        LocalDate currDate = LocalDate.now();
        LocalDate targetDate = LocalDate.of(2024, 1, 27);

        //LocalTime -> Saves Local Time
        LocalTime currTime = LocalTime.now();
        LocalTime targetTime = LocalTime.of(8, 13, 11, 9);

        //LocalDateTime -> Saves Local Date and Time
        LocalDateTime currDateTime = LocalDateTime.now();
        LocalDateTime targetDateTime = LocalDateTime.of(2024, 8, 13, 8, 0, 0, 0);

        //ZonedDateTime -> Saves Date and Time of zone(Like Asia or America)
        ZonedDateTime utcDateTime = ZonedDateTime.now(ZoneId.of("UTC"));
        ZonedDateTime londonDateTime = ZonedDateTime.now(ZoneId.of("Europe/London"));
        ZonedDateTime seoulDateTime = ZonedDateTime.now(ZoneId.of("Asia/Seoul"));

        //Instant -> gets hierarchy between two time dimension
        Instant instant1 = Instant.now();
        Thread.sleep(10);
        Instant instant2 = Instant.now();
        if(instant1.isBefore(instant2)){System.out.println("instant1 is faster!");}
        else if(instant1.isAfter(instant2)){System.out.println("instant1 is slower!");}
        else{System.out.println("Same time!");}
        System.out.println("Difference: " + instant1.until(instant2, ChronoUnit.NANOS));

        //Example
        System.out.println("Current Date: " + currDate);
        System.out.println("Target Date: " + targetDate);
        System.out.println("Current Time: " + currTime);
        System.out.println("Target Time: " + targetTime);
        System.out.println("Current Date and Time: " + currDateTime);
        System.out.println("Target Date and Time: " + targetDateTime);
        System.out.println("UTC: " + utcDateTime);
        System.out.println("London Date and Time: " + londonDateTime);
        System.out.println("Seoul Date and Time: " + seoulDateTime);

        //Getting Date and Time info
        LocalDateTime nowDateTime = LocalDateTime.now();
        System.out.println(nowDateTime);

        String strDateTime = nowDateTime.getYear() + "년 ";
        strDateTime += nowDateTime.getMonthValue() + "월 ";
        strDateTime += nowDateTime.getDayOfMonth() + "일 ";
        strDateTime += nowDateTime.getDayOfWeek() + " ";
        strDateTime += nowDateTime.getHour() + "시 ";
        strDateTime += nowDateTime.getMinute() + "분 ";
        strDateTime += nowDateTime.getSecond() + "초 ";
        strDateTime += nowDateTime.getNano() + "나노초";
        System.out.println(strDateTime);

        LocalDate nowDate = nowDateTime.toLocalDate();
        if(nowDate.isLeapYear()){System.out.println("This year is leapyear");}
        else {System.out.println("This year is not leapyear");}

        //Modifying Date and Time
        //plus minus
        LocalDateTime targetDateTime_L = nowDateTime.plusYears(1).minusMonths(2).plusDays(3).plusHours(4).minusMinutes(5).plusSeconds(6);
        System.out.println("After Calculation: " + targetDateTime_L);

        //modifying
        LocalDateTime targetDateTime_M = nowDateTime.withYear(2024).withMonth(10).withDayOfMonth(23).withHour(10).withMinute(20).withSecond(35);
        System.out.println("Change directly: " + targetDateTime_M);

        //modifying year
        targetDateTime_M = nowDateTime.with(TemporalAdjusters.firstDayOfYear());
        System.out.println("First day of this year: " + targetDateTime_M);
        targetDateTime_M = nowDateTime.with(TemporalAdjusters.lastDayOfYear());
        System.out.println("Last day of this year: " + targetDateTime_M);
        targetDateTime_M = nowDateTime.with(TemporalAdjusters.firstDayOfNextYear());
        System.out.println("First day of next year: " + targetDateTime_M);

        //modifying month
        targetDateTime_M = nowDateTime.with(TemporalAdjusters.firstDayOfMonth());
        System.out.println("First day of this month: " + targetDateTime_M);
        targetDateTime_M = nowDateTime.with(TemporalAdjusters.lastDayOfMonth());
        System.out.println("Last day of this month: " + targetDateTime_M);
        targetDateTime_M = nowDateTime.with(TemporalAdjusters.firstDayOfNextMonth());
        System.out.println("First day of next month: " + targetDateTime_M);

        //modifying day
        targetDateTime_M = nowDateTime.with(TemporalAdjusters.firstInMonth(DayOfWeek.MONDAY));
        System.out.println("First monday this month: " + targetDateTime_M);
        
    }

    private static void printParameters(Class[] parameters) {
        for(Class parameter : parameters){
            System.out.print(parameter.getName());
            System.out.print(" ");
        }
    }
}
