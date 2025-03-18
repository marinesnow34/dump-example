# 문제
고라파덕은 멍때리며 코딩하는 것으로 유명하다.
어느 날, 고라파덕이 운영하는 서버에서 OOM(Out Of Memory) 오류가 발생했다.
다행히 Heap Dump 파일(dump.hprof)을 확보할 수 있었고, 이를 통해 문제를 분석할 수 있는 상황이다.

📌 분석할 내용
1. 어떤 메서드에서 문제가 발생했는가?
2. 어떤 상황(변수 값)에서 문제가 발생했는가?

소스 코드와 Heap Dump를 분석하여 고라파덕을 도와주자!!

# 툴 추천
[mat](https://eclipse.dev/mat/download/)
[VisualVM](https://visualvm.github.io/download.html)
