

sum = 0
for number in range(0,10):
    count =int(input("Enter number: "))
    if count%2 == 0:
        sum+=count
average = sum/10
print(f"sum = {sum}")

