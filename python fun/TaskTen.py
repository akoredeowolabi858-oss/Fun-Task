average = 0
valid_counter = 0
sum = 0
for number in range(0,10):
    count =int(input("Enter number: "))
    if count > 0 and count < 100:
       valid_counter+=1
       sum+=count
average = sum/valid_counter
print(f"average = {average}")

