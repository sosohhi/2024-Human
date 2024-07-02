--DROP TABLE board;

CREATE TABLE board(
	seq				NUMBER 				PRIMARY KEY,		-- 게시판 번호
	title			varchar2(300)		NOT NULL,			-- 게시판 제목
	content			clob				NOT NULL,			-- 게시판 내용
	create_date		DATE				DEFAULT sysdate,	-- 게시판 등록일자(값이 없으면 현재 날짜로 등록이 됨)
	read_count		NUMBER									-- 게시판 조회수
);


-- comment 등록 sql
COMMENT ON COLUMN board.seq IS '게시판 번호';
COMMENT ON COLUMN board.TITLE IS '게시판 제목';
COMMENT ON COLUMN board.CONTENT IS '게시판 내용';
COMMENT ON COLUMN board.CREATE_DATE IS '게시판 등록일자';
COMMENT ON COLUMN board.READ_COUNT IS '게시판 조회수';

--DROP SEQUENCE seq_board_no;
-- sequence생성(자동순서생성)
CREATE SEQUENCE seq_board_no 
	   increment BY 1 
	   START WITH 1
;

-- 수정일자컬럼추가
ALTER TABLE board ADD update_date DATE

CREATE TABLE member(
	seq				NUMBER			PRIMARY KEY,
	name			VARCHAR2(300)	NOT NULL,
	create_date		DATE			DEFAULT sysdate
);

--board테이블에 글 작성한 회원번호 컬럼 추가
ALTER TABLE board ADD CONSTRAINT fk_board_member
FOREIGN KEY (member_seq) REFERENCES member(seq)