public class ArrayStack<E> implements Stack<E> {

    // Instance variables

    private E[] elems;  
    private int top;    
    @SuppressWarnings( "unchecked" )

    // Constructor

    public ArrayStack( int capacity ) {
        elems = (E[]) new Object[ capacity ];
        top = 0;
    }

    

    public boolean isEmpty() {

        // Same as:
        // if ( top == 0 ) {
        //     return true;
        // } else {
        //     return false;
        // }

        return ( top == 0 );
    }

    

    public E peek() {

        

        return elems[ top-1 ];
    }

    

    public E pop() {

        

        
        E saved = elems[ --top ];

        elems[ top ] = null; 

        return saved;
    }

    

    public void push( E element ) {



        elems[ top++ ] = element;
    }

    @SuppressWarnings( "unchecked" )

    public void clear() {

        while (!isEmpty()) {
          pop();
        }

        top = 0;
    }

}
