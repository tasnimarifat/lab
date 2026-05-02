class BankAccount {
String holder;
double balance;
BankAccount(String holder, double balance) {
this.holder = holder;
this.balance = balance;}
void accountInfo() {
System.out.println(holder + "'s balance: " + balance); }
double calculateInterest() {
return balance * 0.03; } }
class SavingsAccount extends BankAccount {
SavingsAccount(String holder, double balance) {
super(holder, balance); }
@Override
double calculateInterest() {
return balance * 0.05; } }
class CurrentAccount extends BankAccount {
CurrentAccount(String holder, double balance) {
super(holder, balance); }
@Override
double calculateInterest() {
return 0; } }
public class Main {
public static void main(String[] args) {
BankAccount a1 = new SavingsAccount("Rohan", 10000);
BankAccount a2 = new CurrentAccount("Sami", 20000);
System.out.println(a1.holder + "'s interest: " +
a1.calculateInterest());
System.out.println(a2.holder + "'s interest: " +
a2.calculateInterest()); } }
