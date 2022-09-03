
#include <stdio.h>
#include <stdlib.h>

struct node{
    int data;
    struct node* next;
}*head,*temp;

struct node *head = NULL;
struct node *temp = NULL;

void displayll(){
    
    if (head == NULL){
        printf("empty list\n");
        return;
    }
    else{
        temp = head;
        while(temp!= NULL){
            printf("->[%d]", temp->data);
            temp = temp->next;
        }
        printf("\n");
    }
}

void insert_at_beg(){
    struct node* new = (struct node*) malloc(sizeof(struct node));
    printf("Enter the data for the node.\n");
    scanf("%d",&new->data);
    
    if(head == NULL){
        head = new;
    }
    else{
        
        new->next = head;
        head = new;
    }
    
}


void insert_at_node(){
    struct node* new = (struct node*) malloc(sizeof(struct node));
    printf("Enter the data for the node.\n");
    scanf("%d",&new->data);
    displayll();
    printf("Enter node\n");
    int pos;
    scanf("%d", &pos);
    if(head == NULL){
        head = new;
    }
    else{
        temp = head;
        while(temp->data != pos){
            temp = temp->next;
            if(temp == NULL){
                return;
            }
        }
        new->next = temp->next;
        temp->next = new;
    }
}
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
