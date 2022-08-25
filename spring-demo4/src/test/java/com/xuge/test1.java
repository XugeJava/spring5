package com.xuge;

import com.xuge.service.BookService2;
import com.xuge.service.SubBookService;

/**
 * author: yjx
 * Date :2022/8/1816:00
 **/
public class test1 {
  public static void main(String[] args) {
    BookService2 bookServic2=new SubBookService();
    bookServic2.buy();

  }
}
