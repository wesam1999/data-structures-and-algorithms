/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package hashtable;

import hashtable.structor.HashMap;

public class App {


    public static void main(String[] args) {

        System.out.println("hallo this is hash table ");
        HashMap<String ,String> hashMap=new HashMap<>();
        hashMap.put("ali","pass");
        hashMap.put("wesam","false");
        hashMap.put("kalid","false");
        hashMap.put("ali","pass");
        System.out.println(hashMap.get("wesam"));

    }
}
