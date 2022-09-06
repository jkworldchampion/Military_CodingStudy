def solution(h, k, boxes): # h 높이, k 넘어갈 수 있는 높이, boxes 박스들
    boxes.sort()  # 일단 박스 정렬
    count = 0  # 전체 횟수
    stair = 0  # 시작 높이  

    # 박스를 작은 것부터 하나씩 꺼내며 확인
    for i in range(len(boxes)+1):
        # 현재 계단에서 바로 h로 갈 수 잇는 상태
        if (h - stair) < k:
            break;
        # 계단을 더 놓아야함
        else :
            if (i == len(boxes)):
                count = -1
                break
            # 현재 박스 너무 높다면 -1로 끝남
            if (boxes[i] - stair) > k:
                count = -1
            else:
                # 이제 현재박스는 되니깐 다음 박스가 되나 살펴봐야한다.
                if i+1 <= len(boxes)-1:  # 마지막 박스가 아니라면
                    if (boxes[i+1] - stair) > k:
                        stair = boxes[i]  # 높이가 계단 값만큼 높아짐
                        count += 1
                        #print(stair)
                    else:
                        continue
                # 지금이 마지막 박스라면
                else:
                    stair = boxes[i]
                    count += 1
    return count

print(solution(20, 18, [1]))
print()
print(solution(12,3,[2,3,6,7,8,10,11]))
print(solution(10,1,[9,8,7,6,5,4,3,2,1]))  #여기서 잘못됨
