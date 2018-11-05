import java.io.*;
import java.util.*;
class Testv{
	public static void main(String ii[])throws IOException{
		
		File f = new File("name.txt");
		File fi = new File("marks.txt");
		File fio =new File("result11.txt");
		////////////////////////////////////////////FILE CHECK HAI KI NHI////////////////////////////////////////////// 
		if(! f.exists()){
			throw new FileNotFoundException("name.txt file NOT EXISTS");
		}
			FileReader f1= new FileReader(f);
			BufferedReader br1 = new BufferedReader(f1);
		if(! fi.exists()){
			throw new FileNotFoundException("marks.txt file NOT EXISTS") ;
		}
			FileReader f2= new FileReader(fi);
			 BufferedReader br2 = new BufferedReader(f2);
		if(! fio.exists()){
			throw new FileNotFoundException("result.txt file NOT EXISTS") ;
		}
		FileWriter f3= new FileWriter(fio);
		
		/////////////////////////////////////////////////////
		//\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\//
		try{
			
		HashMap<String,Integer> h1= new HashMap<>();
		int a[]=new int[6];
		String p; 
		String f0;
		int h=0;
      //br1 HOLDS string AND br2 HOLDS int
		String s=null;
		int c1=1,c2=1,i=0;
			      p=br1.readLine();
                  f0=br2.readLine();
               while(p!=null|| f0!=null){				  
				 while(p!=null){
					
					 c1++;           ////In this program name is always unique bcoz, i using hashmap :)  //
					  s=p;
					 p=br1.readLine();
					 break;
				 }    
					 while(f0!=null){
						 a[i]=Integer.parseInt(f0);
						// System.out.println("int "+a[i]);
						 if(i<=a.length-1){
					i++;
						 }
					 c2++;
					 f0=br2.readLine();
					 break;
					 }
					 
					 h1.put(s,a[i-1]);
			   }
			/////////////////////////////////////////MORE ELEMENTS IN FILE CHECK
			if(c1!=(c2))
			{
				
				throw new Exception("BOTH FILE CONTENT SIZE ARE NOT SAME");
			}
			/////////////////////////////////////////////	 
		
		
		for(int j=0;j<=a.length-1;j++){
			for(int k=j+1;k<=a.length-1;k++){
				if(a[j]<a[k]){
					h=a[j];
					a[j]=a[k];
					a[k]=h;
				}
			}
			
			
		}
		PrintWriter out = new PrintWriter("result11.txt");
				for(int g=0;g<=2;g++){	
		for(Map.Entry<String,Integer> e: h1.entrySet()){
			if(a[g]==e.getValue()){
				//System.out.println(e.getValue()+" "+e.getKey());
			f3.write(String.valueOf(e.getKey()));
            f3.write("	");		   
			}
		}      
				}
				}catch(Exception e){
			System.out.println(e);
		}
		finally{
	   //br1.flush();	
	     br1.close();
	   //br2.flush();
		 br2.close();
		 f1.close();
		 f2.close();
		 f3.close();
		}	
	}
}
		
		
	
