LEVEL2

1. 상반기 동안 각 아이스크림 성분 타입과 성분 타입에 대한 아이스크림의 총주문량을 총주문량이 작은 순서대로 조회하는 SQL 문을 작성해주세요.
이때 총주문량을 나타내는 컬럼명은 TOTAL_ORDER로 지정해주세요.
SELECT INGREDIENT_TYPE, SUM(TOTAL_ORDER) AS TOTAL_ORDER
FROM ICECREAM_INFO i
JOIN FIRST_HALF f
ON i.FLAVOR = f.FLAVOR
GROUP BY INGREDIENT_TYPE
ORDER BY TOTAL_ORDER ASC

2. APPOINTMENT 테이블에서 2022년 5월에 예약한 환자 수를 진료과코드 별로 조회하는 SQL문을 작성해주세요.
이때, 컬럼명은 '진료과 코드', '5월예약건수'로 지정해주시고 결과는 진료과별 예약한 환자 수를 기준으로 오름차순 정렬하고, 예약한 환자 수가 같다면 진료과 코드를 기준으로 오름차순 정렬해주세요.
SELECT
    MCDP_CD AS '진료과 코드',
    COUNT(*) AS '5월예약건수'
FROM APPOINTMENT
WHERE APNT_YMD >= '2022-05-01 00:00:00'
  AND APNT_YMD < '2022-06-01 00:00:00'
GROUP BY MCDP_CD
ORDER BY COUNT(*) ASC, MCDP_CD ASC;

3. CAR_RENTAL_COMPANY_CAR 테이블에서 '통풍시트', '열선시트', '가죽시트' 중 하나 이상의 옵션이 포함된 자동차가 자동차 종류 별로 몇 대인지
출력하는 SQL문을 작성해주세요. 이때 자동차 수에 대한 컬럼명은 CARS로 지정하고, 결과는 자동차 종류를 기준으로 오름차순 정렬해주세요.
// IN을 사용하게 되면 완전히 일치하는 값을 찾기 때문에, 여러개의 문자열이 들어가있으면 LIKE를 사용
SELECT CAR_TYPE, COUNT(*) AS CARS
FROM CAR_RENTAL_COMPANY_CAR
WHERE OPTIONS LIKE '%통풍시트%'
   OR OPTIONS LIKE '%열선시트%'
   OR OPTIONS LIKE '%가죽시트%'
GROUP BY CAR_TYPE
ORDER BY CAR_TYPE ASC;

4. 동물 보호소에 들어온 동물 중 고양이와 개가 각각 몇 마리인지 조회하는 SQL문을 작성해주세요. 이때 고양이를 개보다 먼저 조회해주세요.
SELECT ANIMAL_TYPE,COUNT(*) AS count
FROM ANIMAL_INS
WHERE ANIMAL_TYPE = 'Cat' OR ANIMAL_TYPE = 'Dog'
GROUP BY ANIMAL_TYPE
ORDER BY
    CASE
        WHEN ANIMAL_TYPE = 'Cat' THEN 1
        WHEN ANIMAL_TYPE = 'Dog' THEN 2
END;

5. 동물 보호소에 들어온 동물 이름 중 두 번 이상 쓰인 이름과 해당 이름이 쓰인 횟수를 조회하는 SQL문을 작성해주세요.
이때 결과는 이름이 없는 동물은 집계에서 제외하며, 결과는 이름 순으로 조회해주세요.
SELECT NAME, COUNT(NAME) AS COUNT
FROM ANIMAL_INS
WHERE NAME IS NOT NULL
GROUP BY NAME
HAVING COUNT(NAME) >=2
ORDER BY NAME

6.보호소에서는 몇 시에 입양이 가장 활발하게 일어나는지 알아보려 합니다.
// HOUR, MINUTES, SECONDS다 존재함
09:00부터 19:59까지, 각 시간대별로 입양이 몇 건이나 발생했는지 조회하는 SQL문을 작성해주세요. 이때 결과는 시간대 순으로 정렬해야 합니다.
SELECT
    HOUR(DATETIME) AS HOUR,
    COUNT(*) AS COUNT
FROM ANIMAL_OUTS
WHERE HOUR(DATETIME) >= 9
  AND HOUR(DATETIME) < 20
GROUP BY HOUR(DATETIME)
ORDER BY HOUR(DATETIME);

7. PRODUCT 테이블에서 만원 단위의 가격대 별로 상품 개수를 출력하는 SQL 문을 작성해주세요. 이때 컬럼명은 각각 컬럼명은 PRICE_GROUP, PRODUCTS로 지정해주시고 가격대 정보는
각 구간의 최소금액(10,000원 이상 ~ 20,000 미만인 구간인 경우 10,000)으로 표시해주세요. 결과는 가격대를 기준으로 오름차순 정렬해주세요.
// FLOOR : 소수점 떼고 버려버림, CEIL : 소수점 떼고 반올림
SELECT
    FLOOR(PRICE / 10000) * 10000 AS PRICE_GROUP,
    COUNT(*) AS PRODUCTS
FROM PRODUCT
GROUP BY FLOOR(PRICE / 10000)
ORDER BY PRICE_GROUP ASC;

8. HR_DEPARTMENT, HR_EMPLOYEES, HR_GRADE 테이블에서 2022년도 한해 평가 점수가 가장 높은 사원 정보를 조회하려 합니다.
2022년도 평가 점수가 가장 높은 사원들의 점수, 사번, 성명, 직책, 이메일을 조회하는 SQL문을 작성해주세요.
2022년도의 평가 점수는 상,하반기 점수의 합을 의미하고, 평가 점수를 나타내는 컬럼의 이름은 SCORE로 해주세요.
SELECT
    SUM(g.SCORE) AS SCORE,
    e.EMP_NO,
    e.EMP_NAME,
    e.POSITION,
    e.EMAIL
FROM HR_EMPLOYEES e
JOIN HR_GRADE g ON e.EMP_NO = g.EMP_NO
GROUP BY e.EMP_NO, e.EMP_NAME, e.POSITION, e.EMAIL
ORDER BY SCORE DESC
LIMIT 1;

9. SUBWAY_DISTANCE 테이블에서 노선별로 노선, 총 누계 거리, 평균 역 사이 거리를 노선별로 조회하는 SQL문을 작성해주세요.
총 누계거리는 테이블 내 존재하는 역들의 역 사이 거리의 총 합을 뜻합니다. 총 누계 거리와 평균 역 사이 거리의 컬럼명은 각각 TOTAL_DISTANCE,
AVERAGE_DISTANCE로 해주시고, 총 누계거리는 소수 둘째자리에서, 평균 역 사이 거리는 소수 셋째 자리에서 반올림 한 뒤 단위(km)를 함께 출력해주세요.
결과는 총 누계 거리를 기준으로 내림차순 정렬해주세요.
SELECT
    ROUTE,
    CONCAT(ROUND(SUM(D_BETWEEN_DIST), 1), 'km') AS TOTAL_DISTANCE,
    CONCAT(ROUND(AVG(D_BETWEEN_DIST), 2), 'km') AS AVERAGE_DISTANCE
FROM SUBWAY_DISTANCE
GROUP BY ROUTE
ORDER BY SUM(D_BETWEEN_DIST) DESC;

10. FISH_NAME_INFO에서 물고기의 종류 별 물고기의 이름과 잡은 수를 출력하는 SQL문을 작성해주세요.
물고기의 이름 컬럼명은 FISH_NAME, 잡은 수 컬럼명은 FISH_COUNT로 해주세요.
결과는 잡은 수 기준으로 내림차순 정렬해주세요.
SELECT COUNT(*) AS FISH_COUNT, n.FISH_NAME
FROM FISH_INFO i
JOIN FISH_NAME_INFO n ON i.FISH_TYPE = n.FISH_TYPE
GROUP BY n.FISH_NAME
ORDER BY COUNT(*) DESC

11. 월별 잡은 물고기의 수와 월을 출력하는 SQL문을 작성해주세요.
잡은 물고기 수 컬럼명은 FISH_COUNT, 월 컬럼명은 MONTH로 해주세요.
결과는 월을 기준으로 오름차순 정렬해주세요.
단, 월은 숫자형태 (1~12) 로 출력하며 9 이하의 숫자는 두 자리로 출력하지 않습니다. 잡은 물고기가 없는 월은 출력하지 않습니다.
SELECT COUNT(*) AS FISH_COUNT, MONTH(TIME) AS MONTH
FROM FISH_INFO
GROUP BY MONTH(TIME)
ORDER BY MONTH(TIME) ASC

----------------------------------------------------------------------------------------------------

LEVEL3
1.2022년 1월의 카테고리 별 도서 판매량을 합산하고, 카테고리(CATEGORY), 총 판매량(TOTAL_SALES) 리스트를 출력하는 SQL문을 작성해주세요.
결과는 카테고리명을 기준으로 오름차순 정렬해주세요.
SELECT b.CATEGORY, SUM(s.SALES) AS TOTAL_SALES
FROM BOOK b
         JOIN BOOK_SALES s ON b.BOOK_ID = s.BOOK_ID
WHERE DATE_FORMAT(SALES_DATE, '%Y-%m') = '2022-01'
GROUP BY b.CATEGORY
ORDER BY CATEGORY ASC

2. USED_GOODS_BOARD와 USED_GOODS_USER 테이블에서 완료된 중고 거래의 총금액이 70만 원 이상인 사람의 회원 ID,
닉네임, 총거래금액을 조회하는 SQL문을 작성해주세요. 결과는 총거래금액을 기준으로 오름차순 정렬해주세요.
SELECT u.USER_ID, u.NICKNAME, SUM(b.PRICE) AS TOTAL_SALES
FROM USED_GOODS_USER u
JOIN USED_GOODS_BOARD b ON b.WRITER_ID = u.USER_ID
WHERE b.STATUS = 'DONE'
GROUP BY b.WRITER_ID
HAVING SUM(b.PRICE) >= 700000
ORDER BY TOTAL_SALES

3.REST_INFO 테이블에서 음식종류별로 즐겨찾기수가 가장 많은 식당의 음식 종류, ID, 식당 이름, 즐겨찾기수를 조회하는 SQL문을 작성해주세요. 이때 결과는 음식 종류를 기준으로 내림차순 정렬해주세요.
SELECT FOOD_TYPE, REST_ID, REST_NAME, FAVORITES
FROM REST_INFO r
WHERE FAVORITES = (
    SELECT MAX(FAVORITES)
    FROM REST_INFO
    WHERE FOOD_TYPE = r.FOOD_TYPE
)
ORDER BY FOOD_TYPE DESC;

4. HR_DEPARTMENT와 HR_EMPLOYEES 테이블을 이용해 부서별 평균 연봉을 조회하려 합니다. 부서별로 부서 ID, 영문 부서명, 평균 연봉을 조회하는 SQL문을 작성해주세요.
평균연봉은 소수점 첫째 자리에서 반올림하고 컬럼명은 AVG_SAL로 해주세요.
결과는 부서별 평균 연봉을 기준으로 내림차순 정렬해주세요.
SELECT h.DEPT_ID, h.DEPT_NAME_EN, ROUND(AVG(e.SAL), 0) AS avg_sal
FROM HR_DEPARTMENT h
JOIN HR_EMPLOYEES e ON h.DEPT_ID = e.DEPT_ID
GROUP BY DEPT_ID
ORDER BY AVG_SAL DESC

5.CAR_RENTAL_COMPANY_RENTAL_HISTORY 테이블에서 2022년 10월 16일에 대여 중인 자동차인 경우 '대여중' 이라고 표시하고,
대여 중이지 않은 자동차인 경우 '대여 가능'을 표시하는 컬럼(컬럼명: AVAILABILITY)을 추가하여 자동차 ID와 AVAILABILITY 리스트를 출력하는 SQL문을 작성해주세요.
이때 반납 날짜가 2022년 10월 16일인 경우에도 '대여중'으로 표시해주시고 결과는 자동차 ID를 기준으로 내림차순 정렬해주세요.
// MAX()를 사용하지 않으면 GROUP BY 로 묶은 CAR_ID의 DATE행 중 랜덤값이 부여되어, 정확한 정렬이 불가하다.
// 따라서 MAX를 활용하여, 문자열 정렬 순서 상 대여중이 대여가능보다 뒤에 오기에, 대여중으로 수렴한다.
SELECT
    CAR_ID,
    MAX(CASE
            WHEN '2022-10-16' BETWEEN START_DATE AND END_DATE THEN '대여중'
            ELSE '대여 가능'
        END) AS AVAILABILITY
FROM CAR_RENTAL_COMPANY_RENTAL_HISTORY
GROUP BY CAR_ID
ORDER BY CAR_ID DESC;

6. FISH_INFO에서 평균 길이가 33cm 이상인 물고기들을 종류별로 분류하여 잡은 수, 최대 길이, 물고기의 종류를 출력하는 SQL문을 작성해주세요.
결과는 물고기 종류에 대해 오름차순으로 정렬해주시고, 10cm이하의 물고기들은 10cm로 취급하여 평균 길이를 구해주세요.
컬럼명은 물고기의 종류 'FISH_TYPE', 잡은 수 'FISH_COUNT', 최대 길이 'MAX_LENGTH'로 해주세요.
SELECT
    COUNT(*) AS FISH_COUNT,
    MAX(IFNULL(LENGTH, 10)) AS MAX_LENGTH,
    FISH_TYPE
FROM FISH_INFO
GROUP BY FISH_TYPE
HAVING AVG(IFNULL(LENGTH, 10)) >= 33
ORDER BY FISH_TYPE ASC;

7.CAR_RENTAL_COMPANY_RENTAL_HISTORY 테이블에서 대여 시작일을 기준으로 2022년 8월부터 2022년 10월까지 총 대여 횟수가 5회 이상인 자동차들에 대해서
해당 기간 동안의 월별 자동차 ID 별 총 대여 횟수(컬럼명: RECORDS) 리스트를 출력하는 SQL문을 작성해주세요.
결과는 월을 기준으로 오름차순 정렬하고, 월이 같다면 자동차 ID를 기준으로 내림차순 정렬해주세요. 특정 월의 총 대여 횟수가 0인 경우에는 결과에서 제외해주세요.
SELECT
    MONTH(START_DATE) AS MONTH,
    CAR_ID,
    COUNT(*) AS RECORDS
FROM CAR_RENTAL_COMPANY_RENTAL_HISTORY
WHERE CAR_ID IN (
    SELECT CAR_ID
    FROM CAR_RENTAL_COMPANY_RENTAL_HISTORY
    WHERE START_DATE >= '2022-08-01' AND START_DATE < '2022-11-01'
    GROUP BY CAR_ID
    HAVING COUNT(*) >= 5
)
AND START_DATE >= '2022-08-01' AND START_DATE < '2022-11-01'
GROUP BY MONTH, CAR_ID
ORDER BY MONTH ASC, CAR_ID DESC;

8. 이 서비스에서는 공간을 둘 이상 등록한 사람을 "헤비 유저"라고 부릅니다. 헤비 유저가 등록한 공간의 정보를 아이디 순으로 조회하는 SQL문을 작성해주세요.
SELECT ID, NAME, HOST_ID
FROM PLACES
WHERE HOST_ID IN (
    SELECT HOST_ID
    FROM PLACES
    GROUP BY HOST_ID
    HAVING COUNT(*) >= 2
)
ORDER BY ID;

9. FOOD_PRODUCT 테이블에서 식품분류별로 가격이 제일 비싼 식품의 분류, 가격, 이름을 조회하는 SQL문을 작성해주세요.
이때 식품분류가 '과자', '국', '김치', '식용유'인 경우만 출력시켜 주시고 결과는 식품 가격을 기준으로 내림차순 정렬해주세요.
SELECT
    CATEGORY,
    PRICE AS MAX_PRICE,
    PRODUCT_NAME
FROM FOOD_PRODUCT f1
WHERE CATEGORY IN ('과자', '국', '식용유', '김치')
AND PRICE = (
    SELECT MAX(PRICE)
    FROM FOOD_PRODUCT f2
    WHERE f1.CATEGORY = f2.CATEGORY
)
ORDER BY PRICE DESC

10.2022년 1월의 도서 판매 데이터를 기준으로 저자 별, 카테고리 별 매출액(TOTAL_SALES = 판매량 * 판매가) 을 구하여,
저자 ID(AUTHOR_ID), 저자명(AUTHOR_NAME), 카테고리(CATEGORY), 매출액(SALES) 리스트를 출력하는 SQL문을 작성해주세요.
결과는 저자 ID를 오름차순으로, 저자 ID가 같다면 카테고리를 내림차순 정렬해주세요.
SELECT
    a.AUTHOR_ID,
    a.AUTHOR_NAME,
    b.CATEGORY,
    SUM(s.SALES * b.PRICE) AS TOTAL_SALES
FROM BOOK_SALES s
JOIN BOOK b
    ON s.BOOK_ID = b.BOOK_ID
JOIN AUTHOR a
    ON b.AUTHOR_ID = a.AUTHOR_ID
WHERE YEAR(s.SALES_DATE) = 2022
  AND MONTH(s.SALES_DATE) = 1
GROUP BY a.AUTHOR_ID, a.AUTHOR_NAME, b.CATEGORY
ORDER BY a.AUTHOR_ID ASC, b.CATEGORY DESC;

11. USER_INFO 테이블과 ONLINE_SALE 테이블에서 년, 월, 성별 별로 상품을 구매한 회원수를 집계하는 SQL문을 작성해주세요.
결과는 년, 월, 성별을 기준으로 오름차순 정렬해주세요. 이때, 성별 정보가 없는 경우 결과에서 제외해주세요.
SELECT
    YEAR(s.SALES_DATE) AS YEAR,
    MONTH(s.SALES_DATE) AS MONTH,
    u.GENDER,
    COUNT(DISTINCT u.USER_ID) AS USERS
FROM USER_INFO u
JOIN ONLINE_SALE s
    ON u.USER_ID = s.USER_ID
WHERE u.GENDER IS NOT NULL
GROUP BY
    YEAR(s.SALES_DATE),
    MONTH(s.SALES_DATE),
    u.GENDER
ORDER BY
    YEAR,
    MONTH,
    u.GENDER;

12.데이터 분석 팀에서는 우유(Milk)와 요거트(Yogurt)를 동시에 구입한 장바구니가 있는지 알아보려 합니다.
우유와 요거트를 동시에 구입한 장바구니의 아이디를 조회하는 SQL 문을 작성해주세요. 이때 결과는 장바구니의 아이디 순으로 나와야 합니다.
SELECT CART_ID
FROM CART_PRODUCTS
WHERE NAME IN ('Milk', 'Yogurt')
GROUP BY CART_ID
HAVING COUNT(DISTINCT NAME) = 2
ORDER BY CART_ID;