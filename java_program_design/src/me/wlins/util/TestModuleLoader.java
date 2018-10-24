package me.wlins.util;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Hashtable;
import java.util. List;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;

import me.wlins.entity.TestModule;
import org.w3c.dom.Document;
import org.w3c.dom.NamedNodeMap;
import org.w3c.dom.NodeList;
import org.w3c.dom.Node;

/**
 * @ClassName TestModuleLoader
 * @Description Define the loader of the testmodule
 * @Author strawberrylin
 * @Date 18-10-24 下午9:12
 * @Version 1.0
 **/
public class TestModuleLoader {
    private static DocumentBuilderFactory dbFactory = null;
    private static DocumentBuilder db = null;
    private static Document document = null;
    private static Hashtable<String, TestModule> testModules = null;

    static {
        try{
            dbFactory = DocumentBuilderFactory.newInstance();
            db = dbFactory.newDocumentBuilder();
        }catch (ParserConfigurationException e){
            e.printStackTrace();
            System.out.println("db = dbFactory.newDocumentBuilder(); throw exception");
        }
    }

    public static Hashtable<String, TestModule> load(String fileName) throws Exception{
        // analyse the config file as a xml file
        document = db.parse(fileName);
        // get test-module elements and store in teh nodelist.
        NodeList moduleList = document.getElementsByTagName("test-module");
        testModules = new Hashtable<>();

        for(int i=0;i < moduleList.getLength();i ++){
            // search the nodelist and get all the infomation to create the instance of TestModule.
            Node node = moduleList.item(i);
            // get all the property of item(i), such as id.
            NamedNodeMap namedNodeMap = node.getAttributes();
            String id = namedNodeMap.getNamedItem("id").getTextContent();
            // get the all the child node of item(i).
            NodeList cNodeList = node.getChildNodes();
            // get the value of every child node and store in contents.
            ArrayList<String> contents = new ArrayList<>();

            //　the nodeList is storeg as a tree, 0 is root, and every node has a leaf node which is null.
            for(int j = 1;j < cNodeList.getLength();j += 2){
                Node cNode = cNodeList.item(j);
                String value = cNode.getFirstChild().getTextContent();
                contents.add(value);
            }

            // create a TestModule instence.
            String unitName = contents.get(0);
            String testClass = contents.get(1);
            TestModule testModule = new TestModule(Integer.parseInt(id), unitName, testClass);

            testModules.put(testModule.getUnitName(), testModule);
        }
        return testModules;
    }

}
