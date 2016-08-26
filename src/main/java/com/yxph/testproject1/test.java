package com.yxph.testproject1;

import java.io.IOException;
import java.io.InputStream;

import org.drools.compiler.kproject.ReleaseIdImpl;
import org.drools.core.io.impl.UrlResource;
import org.junit.Test;
import org.kie.api.KieServices;
import org.kie.api.builder.KieModule;
import org.kie.api.builder.KieRepository;
import org.kie.api.runtime.KieContainer;
import org.kie.api.runtime.KieSession;

import com.yxph.dataObject1;

public class test {
	public  void  test() throws IOException {
	String url = "http://120.25.101.*/kie-drools-wb/maven2wb/com/yxph/testproject1/testproject1/1.0/testproject1-1.0.jar";
	ReleaseIdImpl releaseId = new ReleaseIdImpl("com.yxph.testproject1", "testproject1", "1.0");
	KieServices ks = KieServices.Factory.get();
	KieRepository kr = ks.getRepository();
	UrlResource urlResource = (UrlResource) ks.getResources().newUrlResource(url);
	urlResource.setUsername("");
	urlResource.setPassword("");
	urlResource.setBasicAuthentication("enabled");
	InputStream is = urlResource.getInputStream();
	System.out.println(is.available());
	KieModule kModule = kr.addKieModule(ks.getResources().newInputStreamResource(is));
	KieContainer kContainer = ks.newKieContainer(kModule.getReleaseId());
	KieSession kieSession = kContainer.newKieSession();

	dataObject1 obj = new dataObject1();
	obj.setName("张三");
	obj.setSex((byte) 1);

	kieSession.insert(obj);
	int i=kieSession.fireAllRules();
	System.out.print("共执行了"+i+"条规则");
	System.out.print("修改后的结果"+obj.getName());

	}

	public static void main(String[] args){
		try {
			new test().test();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
}
