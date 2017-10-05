package com.company;

import java.io.BufferedWriter;
import java.io.IOException;
import java.io.Reader;
import java.io.Writer;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Properties;

public class Main {

    //create properties value and create& write into xyz.properties text file
<<<<<<< HEAD
//    public static void main2 (String[] args) throws Exception
//    {
//        Properties props = new Properties();
//
//        props.put("displayName", "Jim");
//        props.put("stageName", "Jimmy");
//        props.put("realName", "James");
//        String name = props.getProperty("realName");
//
//        try (Writer writer = Files.newBufferedWriter(Paths.get("xyz.properties"))){
//            props.store(writer,"My Comment2");
//        }
//    }
//
//    public static void main(String[] args) throws IOException {
//        Properties prop = new Properties();
//
//        try(Reader reader = Files.newBufferedReader(Paths.get("myapp.properties"))){
//            prop.load(reader);
//        }
//
//        String val1 = prop.getProperty("val1");
//        String val2 = prop.getProperty("val2");
//        String val3 = prop.getProperty("val3");
//        String val4 = prop.getProperty("val4");
//
//        System.out.println(val1);
//        System.out.println(val2);
//        System.out.println(val3);
//        System.out.println(val4);
//
//    }


//    //Using default properties, pass default to a new properties instance prop, then increase the value by 1, prop gets a new value
//    //original value is 1
//    public static void main(String[] args) {
//        Properties defaults = new Properties();
//        defaults.setProperty("position", "1");
//        Properties prop = new Properties(defaults);
//        String nextPos = prop.getProperty("position");
//        System.out.println(nextPos);
//        //modified default and value changed to 2
//        int iPos = Integer.parseInt(nextPos);
//        prop.setProperty("position", Integer.toString(++iPos));
//        String iPos2 = prop.getProperty("position");
//        System.out.println(iPos2);
//    }
=======
//     public static void main (String[] args) throws Exception
//     {
//         Properties props = new Properties();

//         props.put("displayName", "Jim");
//         props.put("stageName", "Jimmy");
//         props.put("realName", "James");
//         String name = props.getProperty("realName");

//         try (Writer writer = Files.newBufferedWriter(Paths.get("xyz.properties"))){
//             props.store(writer,"My Comment2");
//         }
//     }

    public static void main(String[] args) throws IOException {
        Properties prop = new Properties();

        try(Reader reader = Files.newBufferedReader(Paths.get("myapp.properties"))){
            prop.load(reader);
        }

        String val1 = prop.getProperty("val1");
        String val2 = prop.getProperty("val2");
        String val3 = prop.getProperty("val3");
        String val4 = prop.getProperty("val4");

        System.out.println(val1);
        System.out.println(val2);
        System.out.println(val3);
        System.out.println(val4);
        
    }
>>>>>>> 810f5d2c9fc9f6c50c9d33e5e74c565f82201596

}
