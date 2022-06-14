package iterator.structure;


public class ConcreteAggregateA implements IAggregate{
    //logica de algun objeto que almacene objetos
    //private String[] nameList;
    //array de nombres
    //private List<String>name2;
    //private Map<String,String> name3;
    //private Stack<String> name4;
    //private Vector<String> name5;

    private int position;
    private String [] nameList;

    public ConcreteAggregateA(){
        nameList= new String[5];
    }

    public void add (String value){
        nameList[position]=value;
        position++;
    }

    @Override
    public ConcreteIteratorA createIterator() {
        return new ConcreteIteratorA(nameList);
    }
}