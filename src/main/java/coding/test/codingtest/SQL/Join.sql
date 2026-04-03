LEVEL2

1. PRODUCT 테이블과 OFFLINE_SALE 테이블에서 상품코드 별 매출액(판매가 * 판매량) 합계를 출력하는 SQL문을 작성해주세요.
결과는 매출액을 기준으로 내림차순 정렬해주시고 매출액이 같다면 상품코드를 기준으로 오름차순 정렬해주세요.

SELECT p.PRODUCT_CODE, SUM((p.PRICE * o.sales_amount)) AS SALES
FROM PRODUCT p
JOIN OFFLINE_SALE o ON p.PRODUCT_ID = o.PRODUCT_ID
GROUP BY p.PRODUCT_CODE
ORDER BY SUM((p.PRICE * o.sales_amount)) DESC, p.PRODUCT_CODE ASC

2. '경제' 카테고리에 속하는 도서들의 도서 ID(BOOK_ID), 저자명(AUTHOR_NAME), 출판일(PUBLISHED_DATE) 리스트를 출력하는 SQL문을 작성해주세요.
결과는 출판일을 기준으로 오름차순 정렬해주세요.
SELECT b.BOOK_ID, a.AUTHOR_NAME, DATE_FORMAT(b.PUBLISHED_DATE, '%Y-%m-%d') AS PUBLISHED_DATE
FROM BOOK b
JOIN AUTHOR a ON b.AUTHOR_ID = a.AUTHOR_ID
WHERE CATEGORY = '경제'
ORDER BY b.PUBLISHED_DATE ASC

----------------------------------------------------------------------------------------------------
LEVEL3

1. 천재지변으로 인해 일부 데이터가 유실되었습니다. 입양을 간 기록은 있는데, 보호소에 들어온 기록이 없는 동물의 ID와 이름을 ID 순으로 조회하는 SQL문을 작성해주세요.
SELECT o.ANIMAL_ID, o.NAME
FROM ANIMAL_OUTS o
LEFT JOIN ANIMAL_INS i ON i.ANIMAL_ID = o.ANIMAL_ID
WHERE i.ANIMAL_ID IS NULL
ORDER BY ANIMAL_ID

2. 관리자의 실수로 일부 동물의 입양일이 잘못 입력되었습니다.
보호 시작일보다 입양일이 더 빠른 동물의 아이디와 이름을 조회하는 SQL문을 작성해주세요. 이때 결과는 보호 시작일이 빠른 순으로 조회해야합니다.
SELECT i.ANIMAL_ID, i.NAME
FROM ANIMAL_INS i
JOIN ANIMAL_OUTS o ON i.ANIMAL_ID = o.ANIMAL_ID
WHERE i.DATETIME > o.DATETIME
ORDER BY i.DATETIME

3. 아직 입양을 못 간 동물 중, 가장 오래 보호소에 있었던 동물 3마리의 이름과 보호 시작일을 조회하는 SQL문을 작성해주세요. 이때 결과는 보호 시작일 순으로 조회해야 합니다.
SELECT i.NAME, i.DATETIME
FROM ANIMAL_INS i
LEFT JOIN ANIMAL_OUTS o ON i.ANIMAL_ID = o.ANIMAL_ID
WHERE o.DATETIME IS NULL
ORDER BY i.DATETIME
LIMIT 3

---------------------------------------------------------------------------------------------------
LEVEL4

1. 7월 아이스크림 총 주문량과 상반기의 아이스크림 총 주문량을 더한 값이 큰 순서대로 상위 3개의 맛을 조회하는 SQL 문을 작성해주세요.
SELECT f.FLAVOR
FROM FIRST_HALF f
JOIN JULY j ON f.FLAVOR = j.FLAVOR
GROUP BY f.FLAVOR
ORDER BY SUM(f.TOTAL_ORDER) + SUM(j.TOTAL_ORDER) DESC
LIMIT 3;

2. CAR_RENTAL_COMPANY_CAR 테이블과 CAR_RENTAL_COMPANY_RENTAL_HISTORY 테이블과 CAR_RENTAL_COMPANY_DISCOUNT_PLAN 테이블에서
자동차 종류가 '세단' 또는 'SUV' 인 자동차 중 2022년 11월 1일부터 2022년 11월 30일까지 대여 가능하고 30일간의 대여 금액이 50만원 이상 200만원 미만인 자동차에 대해서
자동차 ID, 자동차 종류, 대여 금액(컬럼명: FEE) 리스트를 출력하는 SQL문을 작성해주세요.
결과는 대여 금액을 기준으로 내림차순 정렬하고, 대여 금액이 같은 경우 자동차 종류를 기준으로 오름차순 정렬, 자동차 종류까지 같은 경우 자동차 ID를 기준으로 내림차순 정렬해주세요.

SELECT
    c.CAR_ID,
    c.CAR_TYPE,
    FLOOR(c.DAILY_FEE * 30 * (1 - d.DISCOUNT_RATE / 100)) AS FEE
FROM CAR_RENTAL_COMPANY_CAR c
JOIN CAR_RENTAL_COMPANY_DISCOUNT_PLAN d
    ON c.CAR_TYPE = d.CAR_TYPE
WHERE c.CAR_TYPE IN ('세단', 'SUV')
AND d.DURATION_TYPE = '30일 이상'
AND c.CAR_ID NOT IN (
    SELECT CAR_ID
    FROM CAR_RENTAL_COMPANY_RENTAL_HISTORY
    WHERE START_DATE <= '2022-11-30'
    AND END_DATE >= '2022-11-01'
)
AND FLOOR(c.DAILY_FEE * 30 * (1 - d.DISCOUNT_RATE / 100)) >= 500000
AND FLOOR(c.DAILY_FEE * 30 * (1 - d.DISCOUNT_RATE / 100)) < 2000000
ORDER BY FEE DESC, c.CAR_TYPE ASC, c.CAR_ID DESC;

3.보호소에서 중성화 수술을 거친 동물 정보를 알아보려 합니다. 보호소에 들어올 당시에는 중성화1되지 않았지만,
보호소를 나갈 당시에는 중성화된 동물의 아이디와 생물 종, 이름을 조회하는 아이디 순으로 조회하는 SQL 문을 작성해주세요.


SELECT
    o.ANIMAL_ID,
    o.ANIMAL_TYPE,
    o.NAME
FROM ANIMAL_OUTS o
         JOIN ANIMAL_INS i ON o.ANIMAL_ID = i.ANIMAL_ID
WHERE i.SEX_UPON_INTAKE LIKE 'Intact%' -- 들어올 때는 중성화 X
  AND (
    o.SEX_UPON_OUTCOME LIKE 'Spayed%' OR
    o.SEX_UPON_OUTCOME LIKE 'Neutered%'
    )
ORDER BY o.ANIMAL_ID;
