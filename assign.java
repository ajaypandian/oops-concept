class assign
{
public static void main(String[] args)
{
assign raja = new assign();
int balance = raja.book_ticket();
System.out.println("After booking ticket" + balance);
}
int book_ticket()
{
int ticket_price =120;
int cash =200;
return cash-ticket_price;
}
}
