package com.example.core;

import com.example.Application;
import com.example.config.TestConfig;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.support.SessionStatus;

@ContextConfiguration(classes = {Application.class, TestConfig.class})
public class ClientRepositoryTest {

}
