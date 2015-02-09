/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.financeprogram.user;

import java.io.Serializable;


public class User implements Serializable {
    private String firstName;//имя
    private String secondName;//фамилия
    private String password;//пароль
    private String login;//логин

    //получить логин
    public String getLogin() {
        return login;
    }
    //задать логин
    public void setLogin(String login) {
        this.login = login;
    }
    
    //контсруктор
    public User(String firstName, String secondName, String login, String password){
    	this.firstName = firstName;
    	this.secondName = secondName;
        this.login = login;
    	this.password = password;
    	
    }
    
        //получаем имя
	public String getFirstName() {
		return firstName;
	}
	//задаем имя
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	//получаем фамилию
	public String getSecondName() {
		return secondName;
	}
	//устанавливаем фамилию
	public void setSecondName(String secondName) {
		this.secondName = secondName;
	}
	//получаем пароль
	public String getPassword() {
		return password;
	}
	//устанавливаем пароль
	public void setPassword(String password) {
		this.password = password;
	}

    
}
