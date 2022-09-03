int main(){
    
    
    int inp = 0;
    
    
    printf("1. display link list\n");
    printf("2. add node at a beg in link list\n");
    printf("3. add node after a node.\n");
    printf("Enter the no do operation\n");
    scanf("%d", &inp);
    switch(inp){
        
        case 1:
            displayll();
            main();
            break;
            
        case 2:
            insert_at_beg();
            main();
            break;
            
        case 3:
            insert_at_node();
            main();
            break;
            
        default:
            printf("wrong number\n");
            main();
    }
    
    
    return 0;
}
