package org.egc;

import org.jgrapht.UndirectedGraph;
import org.jgrapht.graph.DefaultEdge;
import org.jgrapht.graph.SimpleGraph;
import org.junit.Before;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

/**
 * Unit test for simple App.
 */
public class AppTest
    extends TestCase
{
    /**
     * Create the test case
     *
     * @param testName name of the test case
     */
    public AppTest( String testName )
    {
        super( testName );
    }

    /**
     * @return the suite of tests being tested
     */
    public static Test suite(  )
    {
        return new TestSuite( AppTest.class );
    }

    /**
     * Rigourous Test :-)
     */
    public void testApp(  )
    {
        assertTrue( true );

        UndirectedGraph<String, DefaultEdge> g = new SimpleGraph<String, DefaultEdge>( DefaultEdge.class );

        System.out.println( g );
    }

    @Before
    public void before(  )
    {
        Gson gson = new GsonBuilder(  ).create(  );
        gson.toJson( "Hello", System.out );
        gson.toJson( 123, System.out );
    }
}
