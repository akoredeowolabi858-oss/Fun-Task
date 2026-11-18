even_counter = 0
average = 0
sum = 0
for number in range(0,10):
    count =int(input("Enter number: "))
    if count%2 == 0:
        even_counter+=1 
        sum+=count
average = sum/even_counter
print(f"average = {average}")

