# 스프링 시큐리티 세션 로그인 방식 (API 서버)


### 필터 역할
1. **SecurityContextPersistenceFilter** → 쿠키 확인  
2. **UsernamePasswordAuthenticationFilter** → 로그인 시 아이디와 비밀번호 확인하여 인증 처리 (AuthenticationManager와 UserDetails 객체 사용하여 인증 처리)  
3. **ExceptionTranslationFilter** → 인증되지 않은 요청 or 권한 부족한 요청 시 응답  
4. **FilterSecurityInterceptor** → 인증된 사용자가 접근하려는 리소스에 대해 권한 부족일 시 응답  
5. **LogoutFilter** → 로그아웃 시 세션 무효화 

### 클라이언트
- 로그인 시 세션 ID를 지닌 쿠키가 발급됨.  
- 쿠키로 인해 인증 상태 유지 가능.  
- 쿠키는 로그아웃 시 삭제.
