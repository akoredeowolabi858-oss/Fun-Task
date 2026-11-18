evencounter = 0
average = 0
sum = 0
for number in range(0,10):
    count =int(input("Enter number: "))
    if count%2 == 0:
       evencounter+=1
       sum+=count
average = sum/evencounter
print(f"sum = {sum}")
print(f"average = {average}")

