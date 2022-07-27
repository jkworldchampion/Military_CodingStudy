def input_nums(array):
    while (True):
        if len(array) == 6:
            break
        x = int(input("번호 입력 : "))
        if (x in array):
            print("같은 번호가 있습니다!")
            continue
        array.append(x)
    return array

def print_nums(array):
    print("로또 번호 : ", end='')
    for i in array:
        print(i, end=' ')

array = []
array = input_nums(array)
print_nums(array)
