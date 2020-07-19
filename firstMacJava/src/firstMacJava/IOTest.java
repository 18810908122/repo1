package firstMacJava;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FilenameFilter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.text.SimpleDateFormat;
import java.util.Date;


public class IOTest {

    @SuppressWarnings("resource")
    public static void main(String[] args) throws IOException {
//		File file = new File("/Users/blue/Desktop/test");
//		file.mkdir();
//		file = new File("/Users/blue/Desktop/test/ext.txt");
//		try {
//			file.createNewFile();
//		} catch (IOException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
//		file.delete();


//		Date date = new Date(file.lastModified());
//		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
//		String dString = sdf.format(date);
//		System.out.println(dString);

//		File file = new File("/Users/blue/Desktop");
//		
//		String[] strFiles = file.list(new FilenameFilter() {
//			@Override
//			public boolean accept(File dir, String name) {
//				System.out.println(dir+"----"+name);
//				return new File(dir, name).isFile() && name.endsWith(".pdf");
//			}
//		});
//		
//		for (String string : strFiles) {
//			System.out.println(string);
//		}
//		File file = new File("/Users/blue/Desktop");
//		getFileName(file);

//		File file = new File("test");
//		file.mkdir();

//		FileOutputStream fos = new FileOutputStream("hello.txt");
//		fos.write("hello world".getBytes());
//		fos.close();

//		// 读文件
//		FileInputStream fis = new FileInputStream("hello.txt");
//		//写文件
//		FileOutputStream fos = new FileOutputStream("newHello.txt");
//		int by = 0;
//		while ((by=fis.read()) != -1) {
//			fos.write(by);
//		}
//		fis.close();
//		fos.close();

//		FileInputStream fis = new FileInputStream("hello.txt");
//		byte[] by = new byte[5];
//		int len = 0;
//		// 读取到文件末尾时 返回长度len=-1，
//		while ((len = fis.read(by))!= -1) {
//			System.out.println(new String(by));
//		}

        // 写文件
        BufferedOutputStream bos = new BufferedOutputStream(
                new FileOutputStream("hello.txt", true));
        bos.write("abcde".getBytes());
        bos.close();

        // 读文件
//		BufferedInputStream bis = new BufferedInputStream(
//				new FileInputStream("hello.txt"));
//		byte[] by = new byte[1024];
//		int len = 0;
//		while ((len = bis.read(by)) != -1) {
//			System.out.print(new String(by, 0, len));
//		}
//		bis.close();

//		OutputStreamWriter osw = new OutputStreamWriter(
//				new FileOutputStream("hello.txt"));
//		osw.write('a');
//		osw.flush(); // 没有flush 数据无法写成功 
//		osw.close(); // 先刷新缓冲区，在关闭字符流

        InputStreamReader isr = new InputStreamReader(
                new FileInputStream("hello.txt"));
        char[] ch = new char[1024];
        int i = 0;
        while ((i = isr.read(ch)) != -1) {
            System.out.println(new String(ch));
        }
        isr.close();

    }

    private static void getFileName(File file) {
        File[] files = file.listFiles();
        for (File file2 : files) {
            if (file2.isFile()) {
                System.out.println(file2.getPath());
            } else {
                getFileName(file2);
            }
        }
    }

}
