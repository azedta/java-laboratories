public class DynamicArrayStack<E> implements Stack<E> {

    // Instance variables

    private E[] elems;  
    private int top;    
    private static final int DEFAULT_INC = 25;   

    @SuppressWarnings( "unchecked" )

    // Constructor

    public DynamicArrayStack( int capacity ) {
		if (capacity < DEFAULT_INC) {capacity = DEFAULT_INC;}
        elems = (E[]) new Object[ capacity ];
        top = 0;
    }

    

    public int getCapacity() {
      return elems.length;
    }

    

    public boolean isEmpty() {

        

        return ( top == 0 );
    }

    

    public E peek() {

        

        return elems[ top-1 ];
    }

    @SuppressWarnings( "unchecked" )

    

    public E pop() {
       
        E saved = elems[ --top ];

        elems[ top ] = null;
       
    	if (elems.length - (top+1) == DEFAULT_INC) {
    		E[] temp = (E[]) new Object[ elems.length - DEFAULT_INC ];
    		for ( int i=0; i<top; i++ ) {
    			temp[ i ] = elems[i];
    		}
    		elems=temp;
    	}
        return saved;
    }

    @SuppressWarnings( "unchecked" )

   

    public void push( E element ) {
        
        elems[ top++ ] = element;

       
    	if (top == elems.length) {
    		E[] temp = (E[]) new Object[ top + DEFAULT_INC ];
    		for ( int i=0; i<top; i++ ) {
    			temp[ i ] = elems[i];
    		}
    		elems=temp;
    	}
    }

    @SuppressWarnings( "unchecked" )

    public void clear() {

    	elems = (E[]) new Object[DEFAULT_INC]; 

        top = 0;

    }

}
