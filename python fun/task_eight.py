

sum = 0
for number in range(0,10):
    count =int(input("Enter number: "))
    while count < 0 or count > 100:
       print("enter a valid score")
       count =int(input("Enter number: "))
    sum+=count
    
        

print(f"sum = {sum}")


