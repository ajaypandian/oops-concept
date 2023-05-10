class Theatre
{

public static void main(String[] args)
{
Theatre screen1 = new Theatre();
screen1.display_movie();
int Balance = screen1.get_popcorn();
System.out.println ("Balance is" + Balance);

}

int get_popcorn()
{
int popcorn_price = 80;
int cash = 100;
return cash - popcorn_price;
}
void display_movie()
{
System.out.println("Display Latest Movie");
}

}

