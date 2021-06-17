package com.zj.pc;

public class UrlDataHanding implements Runnable  
{  
    /**  
     * 下载对应页面并分析出页面对应的URL放在未访问队列中。  
     * @param url
     * 此类主要是从未访问队列中获取url,下载页面，分析url，保存已访问url等操作，实现Runnable接口  
     */
    public void dataHanding(String url)  
    {  
            HrefOfPage.getHrefOfContent(DownloadPage.getContentFormUrl(url));  
    }  
            
    public void run()  
    {  
        while(!UrlQueue.isEmpty())  
        {  
           dataHanding(UrlQueue.outElem());  
        }  
    }  
}