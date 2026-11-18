

sum = 0
for number in range(1,11):
    count =int(input("Enter number: "))
    if number%2 == 0:
        sum+=count
average = sum/10
print(f"sum = {sum}")

