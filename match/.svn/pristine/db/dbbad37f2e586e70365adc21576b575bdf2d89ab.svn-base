from util import getTimestamp
import requests
import json
import threading
from bs4 import BeautifulSoup


def login(session):
    headers = {
        'Accept' : 'application/json, text/javascript, */*; q=0.01',
        'Accept-Language': "gzip, deflate",
        'Accept-Encoding': "gzip, deflate, br",
        'Content-Length': '43',
        'Content-Type': "application/x-www-form-urlencoded; charset=UTF-8",
        'Cookie': 'PHPSESSID=b1lhgupsedvc0kgjevkcipprl2; Hm_lvt_02f32149c7ea90d0cd47ed89025e457c=1531117368,1531118967,1531220652; Hm_lpvt_02f32149c7ea90d0cd47ed89025e457c=1531220657',
        'Origin': 'http://www.tiku.cn',
        'X-Requested-With': 'XMLHttpRequest',
        'Connection': "keep-alive",
        'Referer': 'https://zujuan.21cnjy.com/',
        'User-Agent': "Mozilla/5.0 (Windows NT 6.3; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/67.0.3396.87 Safari/537.36"
    }
    data = {
        "user": '15035799851',
        "pass": '20962096',
        'checked': 'true'
    }

    response = session.post('http://www.tiku.cn/index.php/index/login/login', data=data, headers=headers).text
    print(response)

    
def parse_analysis(session,url,id):
    cookies_model = 'PHPSESSID=b1lhgupsedvc0kgjevkcipprl2; Hm_lvt_02f32149c7ea90d0cd47ed89025e457c=1531117368,1531118967,1531220652; token=a32f10b2cfb114a0656ded62e0f05b31; userId=14245; isLogin=1; Hm_lpvt_02f32149c7ea90d0cd47ed89025e457c={}'
    headers={
        'Accept': 'application/json, text/javascript, */*; q=0.01',
        'Accept-Language': "zh-CN,zh;q=0.9",
        'Accept-Encoding': "gzip, deflate",
        'Content-Length': '9',
        'Content-Type': "application/x-www-form-urlencoded; charset=UTF-8",
        'Cookie': cookies_model.format(getTimestamp()),
        'Host':'www.tiku.cn',
        'Origin': 'http://www.tiku.cn',
        'X-Requested-With': 'XMLHttpRequest',
        'Connection': "keep-alive",
        'Referer': url,
        'User-Agent': "Mozilla/5.0 (Windows NT 6.3; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/67.0.3396.87 Safari/537.36"
    }

    html_page = session.post('http://www.tiku.cn/api/question/anylysis/',data={'id':id},headers=headers).text
    json_value = json.loads(html_page)
    answer = json_value['data']['answer']
    answer_html = json_value['data']['answerHtml']
    analysis_html = json_value['data']['anylysisHtml']
    return {'answer':answer,'answer_html':answer_html,'analysis_html':analysis_html}




