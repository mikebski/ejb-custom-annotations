/*
 * Copyright (c) 2016. Mike Baranski - all rights reserved.
 */

package net.mikeski.ejb_annotations;

import javax.enterprise.inject.spi.Bean;
import javax.enterprise.inject.spi.BeanManager;
import javax.enterprise.util.AnnotationLiteral;
import javax.inject.Inject;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.Set;

@WebServlet("/")
public class DemoServlet extends HttpServlet {
  @Inject
  BeanManager beanManager;

  @Override
  protected void doGet(HttpServletRequest request, HttpServletResponse response)
      throws ServletException, IOException {
    Set<Bean<?>> beans = beanManager
        .getBeans(Object.class, new AnnotationLiteral<AfterComplete>() {
        });

    for (Bean<?> bean : beans) {
      response.getWriter().print(bean.getBeanClass());
      IAfterComplete iac = (IAfterComplete) beanManager.getReference(bean, IAfterComplete.class, beanManager.createCreationalContext(bean));
      iac.afterComplete("After complete called on " + iac);
    }
  }

  @Override
  protected void doPost(HttpServletRequest request, HttpServletResponse response)
      throws ServletException, IOException {
    response.getWriter().print("my POST");
  }
}
