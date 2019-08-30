/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author 0605023970
 */
abstract interface InterfaceBankAccount {
    public final String BANK= "JavaBank";
    
    public void deposit(int amt);
    public void withdraw(int amt);
    public int getBalance();
    public String getBankName();
} // End interface InterfaceBankAccount
