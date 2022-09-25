import java.io.*;
class FileStream
{
public static void main(String args[]) throws IOException
{
if(args.length == 1) //copy text input from keyboard to file.
{
BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
FileOutputStream fout = new FileOutputStream(args[0]);
int c=' ' ;
System.out.println("enter text and press ctrl + c");
while(c != 'q' || c != 'Q')
{
c=br.read();
fout.write(c);
}
fout.close();
}
if(args.length == 2) //copy args[0] file to args[1].
{
FileInputStream fin=new FileInputStream(args[0]);
FileOutputStream fout = new FileOutputStream(args[1]);
int i;
do
{
i=fin.read();
if(i != -1) fout.write(i);
}
while(i != -1);
fout.close();
fin.close();
}
}
}
