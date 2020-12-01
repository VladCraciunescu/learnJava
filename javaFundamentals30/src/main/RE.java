package main;

public class RE implements AutoCloseable {

    public void close()throws Exception{
        throw new Exception("E");
    }
}
