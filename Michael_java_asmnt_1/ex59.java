// ex 5.9 (a-d)
//A 
for (int i = 100; i >= 1; i--) {
    System.out.println(i);
}

//B
switch (value % 2) {
    case 0:
        System.out.println("Even integer");
        break;
    case 1:
        System.out.println("Odd integer");
        break;
}

//C
for (int i = 19; i >= 1; i -= 2) {
    System.out.println(i);
}


//D
int counter = 2;

do {
    System.out.println(counter);
    counter += 2;
} while (counter <= 100);

 