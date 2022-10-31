import java.io.BufferedReader;  
    import java.io.FileReader;  
      
    public class Main  
    {  
        public static void main(String[] args) throws Exception {  
            String line;  
            int count = 0;  
            //file reader to read the file and buffer reader to read the file reader variable.
            FileReader file = new FileReader("data.txt");
            BufferedReader br = new BufferedReader(file);  
            System.out.println(" \n");
            while((line = br.readLine()) != null) {  
                String words[] = line.split("");  
                count = count + words.length;  

            }  
            System.out.println("Number of Character present in given file: " + count);  
            br.close();  
        }  
    }  
