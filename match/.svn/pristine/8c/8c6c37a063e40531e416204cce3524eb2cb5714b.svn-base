import time
import datetime
import re
def getTimestamp():
    return int(round(time.time()*1000))

def getNow():
    return datetime.datetime.now()


def get_text(html):
    ret = ''
    pattern = r'([^<>]+)<|>([^<>]+)<|>([^<>]+)'
    list = re.findall(pattern,html)
    if len(list) == 0:
        ret = html
    else:
        for part in list:
            for each in part:
                ret = ret + each
    return ret

