    package com.financeprogram.data;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FilenameFilter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

import com.financeprogram.account.Account;
import java.util.logging.Level;
import java.util.logging.Logger;

public class LoadUnloadData {
    private String fileName = "data/data.txt";
    private File file = new File(fileName);
	
//выгрузка аккаунтов в файл
    public void unload(ArrayList<Account> accounts){
            try (ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream(fileName, false))) {
                out.writeObject(accounts);
            } catch (Exception ex) {
                    ex.printStackTrace();
            }
            
    }

    //загрузка аккаунтов из файла
    public ArrayList<Account> load(){
        if(file.length() != 0){
            try(ObjectInputStream in = new ObjectInputStream(new FileInputStream(fileName));) {
                    return (ArrayList<Account>) in.readObject();
            } catch (Exception ex) {
                    ex.printStackTrace();
            }
        }else{
            return new ArrayList<Account>();
        }
            return null;

    }
	


}
