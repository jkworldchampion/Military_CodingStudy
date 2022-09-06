def solution(h, k, boxes): # h 높이, k 넘어갈 수 있는 높이, boxes 박스들
    boxes.sort()  # 박스 정렬
    now_height = 0 # 현재의 높이
    count = 0
    # 바로 끝나는 위치인가 확인
    


# 갈 수 있는 가장 높은 박스의 index를 반환
def where_can_go(k, now, boxes):
    box = 0
    can = 0
    while(True):
        if boxes[box] - now <= k:
            can = box
            box += 1
        else:
            break
    return can


# print(solution(20, 18, [1]))
# print()
# print(solution(12,3,[2,3,6,7,8,10,11]))
# print(solution(10,1,[9,8,7,6,5,4,3,2,1]))  #여기서 잘못됨
