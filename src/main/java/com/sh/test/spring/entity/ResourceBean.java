package com.sh.test.spring.entity;

import java.io.File;
import java.io.FileOutputStream;

/**
 * Created by huangwei on 2017/8/16.
 */
public class ResourceBean {

    private FileOutputStream fileOutputStream;

    private File file;

    public void init(){
        System.out.println("ResourceBean:=======初始化");
        System.out.println("ResourceBean:=======加载资源，执行初始化准备");
        try {
            this.fileOutputStream = new FileOutputStream(file);
        }catch (Exception e){
            e.printStackTrace();
        }
    }

    public void destroy(){
        System.out.println("ResourceBean:=======销毁");
        System.out.println("ResourceBean:=======释放资源，执行清理工作");
        try {
            fileOutputStream.close();
        }catch (Exception e){
            e.printStackTrace();
        }

    }

    public FileOutputStream getFileOutputStream() {
        return fileOutputStream;
    }

    public void setFileOutputStream(FileOutputStream fileOutputStream) {
        this.fileOutputStream = fileOutputStream;
    }

    public File getFile() {
        return file;
    }

    public void setFile(File file) {
        this.file = file;
    }
}
