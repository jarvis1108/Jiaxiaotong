import requests
import json
import threading
from bs4 import BeautifulSoup
from util import *
from denglu import *
from DbUtil import *
import uuid
import time
import ctypes
import inspect

subjects = {
    '小学数学':14,
    '小学语文':21,
    '小学英语':23,
    '初中语文':20,
    '初中数学':10,
    '初中英语':24,
    '初中物理':12,
    '初中化学':15,
    '初中生物':7,
    '初中地理':5,
    '初中历史':18,
    '初中思品':6,
    '高中语文':19,
    '高中数学':4,
    '高中英语':22,
    '高中物理':11,
    '高中化学':16,
    '高中生物':13,
    '高中地理':9,
    '高中历史':17,
    '高中政治':8
}

types = {
    '小学数学':600122,
    '小学语文':600127,
    '小学英语':600132,
    '初中语文':600102,
    '初中数学':600012,
    '初中英语':600082,
    '初中物理':600027,
    '初中化学':600017,
    '初中生物':600022,
    '初中地理':600032,
    '初中历史':600037,
    '初中思品':600042,
    '高中语文':600111,
    '高中数学':600047,
    '高中英语':600093,
    '高中物理':600062,
    '高中化学':600052,
    '高中生物':600057,
    '高中地理':600067,
    '高中历史':600072,
    '高中政治':600077
}

url_model = 'http://www.tiku.cn/index/index/questions?cid=21&cno=2&typeid=600127&thrknowid={}'
def get_url():
    a = []
    text = requests.get('http://www.tiku.cn/index/index/questions?cid=21&cno=2&typeid=600127&thrknowid=707244')
    text.encoding = ('utf-8')
    hwy = text.text
    soup1 = BeautifulSoup(hwy,'html.parser')
    for url in soup1.select('.ul-dl .d-block'):
        text = url.select('a')[0].attrs['onclick']
        string = str(text)
        id = string.split(",")[0].split("(")[1]
        new_url = url_model.format(id)
        a.append(new_url)
    return a


def get_page(m):
    text = requests.get(m)
    text.encoding = ('utf-8')
    hwy = text.text
    soup1 = BeautifulSoup(hwy,'html.parser')
    for url in soup1.select('.pagination'):
        lis = url.select('li')
        j = lis[-2].text
        j = int(j)      
        return j
    return 0
    
def exam(url):
        res = requests.get(url)
        res.encoding = 'utf-8'
        html_sample = res.text
        soup = BeautifulSoup(html_sample,'html.parser')
        #print(soup)
        tk = open('ti.txt','a',encoding='utf-8')
        for questioncard in soup.select('.card-body'):
            question=questioncard.select('.card-text.mb-3')[0].text
            answers=questioncard.select('.col-lg-6')
            print(question)
            tk.write(question+'\n')
            for answer in answers:
                print(answer.text)
                tk.write(answer.text +'\n')

def get_knowledge():
    a = []
    text = requests.get('http://www.tiku.cn/index/index/questions?cid=21&cno=2&typeid=600127&thrknowid=707244')
    text.encoding = ('utf-8')
    hwy = text.text
    soup1 = BeautifulSoup(hwy,'html.parser')
    for g in soup1.select('.dd-curr'):
        g = g.text
        g = g.strip()
        a.append(g)
    print(a)

               
def spider():
    g = []
    c = get_url()
    a = 1
    for url in c:
        n = get_page(url)
        a = 1
        while a <= n:
            url1 = str(url) + "&page=" +str(a)
            login(url1,id)
            exam(url1)
            a += 1

def get_book():
    subject_url_model = 'http://www.tiku.cn/index/index/questions?cid={}&cno=1'
    version_url_model = 'http://www.tiku.cn/index/index/questions?cid={}&cno=1vid={}'
    unit_url_model = 'http://www.tiku.cn/index/index/questions?cid={}&cno=1&vid={}&bid={}&typeid=600132'
    #对科目列表的每个科目
    toSave = []
    for item in subjects.items():
        subject = item[0]
        cid = item[1]
        subject_url = subject_url_model.format(cid)
        subject_page = requests.get(subject_url).text
        subject_soup = BeautifulSoup(subject_page,'html.parser')
        version_list = subject_soup.select('.tk-tp-sub-list')[1].select('a')
        for version in version_list:
            version_name = version.text
            version_id = str(version.attrs['id'])
            version_id = version_id[7:]
            version_url = version_url_model.format(cid,version_id)
            version_page = requests.get(version_url).text
            version_soup = BeautifulSoup(version_page,'html.parser')
            grade_list = version_soup.select('.tk-tp-sub-list')[2].select('a')
            for grade in grade_list:
                grade_name = grade.text
                grade_id = str(grade.attrs['id'])[4:]
                unit_url = unit_url_model.format(cid,version_id,grade_id)
                unit_page = requests.get(unit_url).text
                unit_soup = BeautifulSoup(unit_page,'html.parser')
                li_list = unit_soup.select('.ul-ques-li')
                for li in li_list:
                    unit_tag = li.select('.tk-li-open')[0]
                    unit_name = unit_tag.text
                    unit_id = str(unit_tag.attrs['onclick']).split(",")[0][6:]
                    chapter_list = li.select('.dl-open')
                    for chapter in chapter_list:
                        chapter_name = chapter.text
                        chapter_id = str(chapter.attrs['onclick']).split(",")[0][6:]
                        knowledge_list = li.select('#twoknow'+chapter_id)[0].select('a')[1:]
                        for knowledge in knowledge_list:
                            knowledge_name = knowledge.text
                            knowledge_id = str(knowledge.attrs['onclick']).split(",")[0][6:]
                            toSave.append((cid,subject,version_id,version_name,grade_id,grade_name,unit_id,unit_name,chapter_id,chapter_name,knowledge_id,knowledge_name))
                            if len(toSave) == 500 :
                                save_knowledge(toSave)
                                toSave = []
    save_knowledge(toSave)
    toSave = []



def fun_timer():
    login(session)
    global timer
    timer = threading.Timer(500, fun_timer)
    timer.start()



def get_question(input_id,start,end):
    url_model = 'http://www.tiku.cn/index/index/questions?cid={}&cno=1&vid={}&bid={}&typeid={}&thrknowid={}'
    count = 1
    global session
    session = requests.session()
    session.adapters.DEFAULT_RETRIES = 50
    fun_timer()
    to_save = []
    for i in range(108)[start:end]:
        url_list = get_knowledge_page(i)
        for url in url_list:
            if url[14] == 1:
                continue
            page_num = url[13]
            if page_num == -1:
                page_num = 0
            subject_id = url[1]
            subject_name = url[2]
            version_id = url[3]
            version_name = url[4]
            grade_id = url[5]
            grade_name = url[6]
            unit_id = url[7]
            unit_name = url[8]
            chapter_id = url[9]
            chapter_name = url[10]
            knowledge_id = url[11]
            knowledge_name = url[12]
            type_id = types[subject_name]

            new_url = url_model.format(subject_id,version_id,grade_id,type_id,knowledge_id)

            max_page = get_page(new_url)
            if max_page == 0:
                update_knowledge_is_finish([(subject_id, version_id, grade_id, unit_id, chapter_id, knowledge_id)])
                continue
            if max_page > 200:
                max_page = 200
            now_page = page_num
            if now_page > max_page:
                continue
            for page in range(max_page)[now_page:]:
                print('知识点ID：{},页码:{}\n'.format(knowledge_id, page+1))
                last_url = new_url + '&page=' + str(page+1)
                new_page = requests.get(last_url).text



                new_soup = BeautifulSoup(new_page,'html.parser')
                question_cards = new_soup.select('.card')
                for card in question_cards:
                    question = ''
                    question_parts = card.select('.card-text')[0].contents
                    for part in question_parts:
                        question = question + str(part)
                    choices = card.select('.col-lg-6')
                    choiceA = ''
                    choiceB = ''
                    choiceC = ''
                    choiceD = ''
                    for answer_num in range(4):
                        if answer_num < len(choices):
                            if answer_num == 0:
                                choiceA_parts = choices[answer_num].contents
                                for choiceA_part in choiceA_parts:
                                    choiceA = choiceA + str(choiceA_part)
                            if answer_num == 1:
                                choiceB_parts = choices[answer_num].contents
                                for choiceB_part in choiceB_parts:
                                    choiceB = choiceB + str(choiceB_part)
                            if answer_num == 2:
                                choiceC_parts = choices[answer_num].contents
                                for choiceC_part in choiceC_parts:
                                    choiceC = choiceC + str(choiceC_part)
                            if answer_num == 3:
                                choiceD_parts = choices[answer_num].contents
                                for choiceD_part in choiceD_parts:
                                    choiceD = choiceD + str(choiceD_part)
                    # print("第{}题".format(count))
                    # print(question + '\n')
                    # print(choiceA+'\n')
                    # print(choiceB+'\n')
                    # print(choiceC+ '\n')
                    # print(choiceD+'\n')
                    try:
                        difficulty = card.select('.align-self-center')[0].text.split(":")[1].replace(' ','')
                        question_id = str(card.select('.q-analysis')[0].attrs['id'])[3:]
                    except Exception as e:
                        print('第{}题出错:'.format(count))
                        print(e)
                        count = count + 1
                        continue

                    answer_dict = parse_analysis(session,new_url,question_id)
                    answer = None
                    analysis = None
                    if '' == answer_dict['analysis_html']:
                        analysis = ''
                    if '' != answer_dict['answer']:
                        answer = answer_dict['answer']
                    elif answer_dict['answer_html'] != '':
                        answer = answer_dict['answer_html']
                    phase = subject_name[0:2]
                    subject = subject_name[2:]
                    grade = ''
                    booklet = ''
                    if grade_name != '基础知识':
                        if str(grade_name).find('必修') !=-1 or str(grade_name).find('选修')!=-1:
                            grade = grade_name
                        index = str(grade_name).find('年级')
                        if index != -1:
                            grade = grade_name[0:index+2]
                            booklet = grade_name[index+2:]
                    text_title = get_text(question)
                    to_save.append((input_id,question_id,question,text_title,choiceA,choiceB,choiceC,choiceD,answer,analysis,phase,subject,grade,booklet,unit_name,chapter_name,knowledge_name,difficulty,version_name,'0',str(getNow())))
                    print(count)
                    count = count + 1

                save_question(to_save)
                to_save = []
                page_num = page_num + 1
                if page_num == max_page:
                    update_knowledge_is_finish([(subject_id,version_id,grade_id,unit_id,chapter_id,knowledge_id)])
                update_knowledge_page_num([(page_num, subject_id,version_id,grade_id,unit_id,chapter_id,knowledge_id)])


def stop_thread(thread):
    _async_raise(thread.ident, SystemExit)



def _async_raise(tid, exctype):
    """raises the exception, performs cleanup if needed"""
    tid = ctypes.c_long(tid)
    if not inspect.isclass(exctype):
        exctype = type(exctype)
    res = ctypes.pythonapi.PyThreadState_SetAsyncExc(tid, ctypes.py_object(exctype))
    if res == 0:
        raise ValueError("invalid thread id")
    elif res != 1:
        # """if it returns a number greater than one, you're in trouble,
        # and you should call it again with exc=NULL to revert the effect"""
        ctypes.pythonapi.PyThreadState_SetAsyncExc(tid, None)
        raise SystemError("PyThreadState_SetAsyncExc failed")


def task():
    start = input('请输入开始页数\n')
    start = int(start)
    end = input('请输入结束页数\n')
    end = int(end)
    input_uuid = str(uuid.uuid1())
    params = [(input_uuid, '题库中国单选题导入', '导入题库中国单选题', 'MY', str(getNow()), '无', '1')]
    execute_save(params)
    global is_finished
    child = None
    tid = None
    while not is_finished:
        try:
            child = threading.Thread(target=get_question(input_uuid,start,end))
            is_finished = True

            print('执行完毕')

        except Exception as e:
            continue


is_finished = False

task()

