import pymysql
import datetime

conn = None
question_conn = None

def connect():
    global conn
    if conn == None:
        conn = pymysql.connect(host='139.199.15.124',user='strongestscholar',password='strongestscholar')
        pymysql.charset = 'UTF-8'
        conn.select_db('QuestionBankCrawlerDvlp')
    return conn

def question_connect():
    global question_conn
    if question_conn == None:
        question_conn = pymysql.connect(host='139.199.15.124',user='strongestscholar',password='strongestscholar')
        pymysql.charset = 'UTF-8'
        question_conn.select_db('QuestionBankCrawlerDvlp')
    return question_conn

def save_knowledge(knowledges):
    conn = connect()
    cursor = conn.cursor()
    try:
        cursor.executemany('INSERT INTO knowledge VALUES(NULL,%s,%s,%s,%s,%s,%s,%s,%s,%s,%s,%s,%s)',knowledges)
        conn.commit()
    except Exception as e:
        conn.rollback()
        print(e)

def execute_save(params):
    q_connect = question_connect()
    cursor = q_connect.cursor()
    try:
        cursor.executemany('INSERT INTO tb_main VALUES(%s,%s,%s,%s,%s,%s,%s)',params)
        q_connect.commit()
    except Exception as e:
        q_connect.rollback()
        print(e)

def save_question(questions):
    q_connect = question_connect()
    cursor = q_connect.cursor()
    try:
        cursor.executemany('INSERT INTO tb_question VALUES(%s,%s,%s,%s,%s,%s,%s,%s,%s,%s,%s,%s,%s,%s,%s,%s,%s,%s,%s,%s,%s)', questions)
        q_connect.commit()
    except Exception as e:
        q_connect.rollback()
        print(e)


def update_knowledge_page_num(params):
    conn = connect()
    cursor = conn.cursor()
    try:
        cursor.executemany('UPDATE tb_knowledge SET page_num=%s WHERE subject_id=%s AND version_id=%s AND grade_id=%s AND unit_id=%s AND chapter_id=%s AND knowledge_id=%s', params)
        conn.commit()
    except Exception as e:
        conn.rollback()
        print(e)
    pass


def update_knowledge_is_finish(params):
    cursor = conn.cursor()
    try:
        cursor.executemany('UPDATE tb_knowledge SET is_finish =1 WHERE subject_id=%s AND version_id=%s AND grade_id=%s AND unit_id=%s AND chapter_id=%s AND knowledge_id=%s', params)
        conn.commit()
    except Exception as e:
        conn.rollback()
        print(e)
    pass


def get_knowledge_page(page):
    conn = connect()
    cursor = conn.cursor()
    num = page * 500
    try:
        cursor.execute("SELECT * FROM tb_knowledge LIMIT %s,500", num)
        return cursor.fetchall()
    except Exception as e:
        print(e)

def update_chapter(chapters):
    conn = connect()
    cursor = conn.cursor()
    try:
        cursor.executemany('UPDATE chapter SET xd=%s,chid=%s WHERE id=%s ', chapters)
        conn.commit()
    except Exception as e:
        conn.rollback()
        print(e)


def getChapter(page):
    conn = connect()
    cursor = conn.cursor()
    num = page*500
    try:
        cursor.execute("SELECT * FROM chapter LIMIT %s,500",num)
        return cursor.fetchall()
    except Exception as e:
        print(e)




def save_question(questions):
    q_connect = question_connect()
    cursor = q_connect.cursor()
    try:
        cursor.executemany('INSERT INTO tb_question VALUES(%s,%s,%s,%s,%s,%s,%s,%s,%s,%s,%s,%s,%s,%s,%s,%s,%s,%s,%s,%s,%s)', questions)
        q_connect.commit()
    except Exception as e:
        q_connect.rollback()
        print(e)