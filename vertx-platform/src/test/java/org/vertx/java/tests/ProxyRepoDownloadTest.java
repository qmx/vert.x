package org.vertx.java.tests;/*
 * Copyright 2013 Red Hat, Inc.
 *
 * Red Hat licenses this file to you under the Apache License, version 2.0
 * (the "License"); you may not use this file except in compliance with the
 * License.  You may obtain a copy of the License at:
 *
 *    http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS, WITHOUT
 * WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.  See the
 * License for the specific language governing permissions and limitations
 * under the License.
 *
 * @author <a href="http://tfox.org">Tim Fox</a>
 */

import org.junit.Test;
import org.vertx.java.testframework.TestBase;
import vertx.tests.RepoDownloadTestClient;

public class ProxyRepoDownloadTest extends TestBase {

  @Override
  protected void setUp() throws Exception {
//    System.setProperty("http.proxyHost", "127.0.0.1");
//    System.setProperty("http.proxyPort", "9193");
    super.setUp();
//    startApp(RepoDownloadTestClient.class.getName());
  }

  @Test
  public void testMavenDownloadWithProxy() throws Exception {
    //startTest(getMethodName());
  }
}