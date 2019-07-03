package com.tts.DoneIt.ControllerTest;

import static org.junit.Assert.*;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.h2.util.Task;
import org.junit.Before;
    import org.junit.Test;
    import org.mockito.ArgumentCaptor;
    import org.mockito.Mock;
    import org.mockito.MockitoAnnotations;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.TestContext;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.web.WebAppConfiguration;
import org.springframework.test.web.servlet.MockMvc;
    import org.springframework.test.web.servlet.setup.MockMvcBuilders;
    import org.springframework.ui.Model;

import com.tts.DoneIt.contoller.TaskController;
import com.tts.DoneIt.model.Tasks;

import java.lang.reflect.Array;
import java.util.HashSet;
    import java.util.Set;

    import static org.junit.Assert.assertEquals;
    import static org.mockito.Mockito.*;
    import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
    import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;
    import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.view;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes=TestContext.class)
@WebAppConfiguration
@WebMvcTest(TaskController.class)
public class ControllerTest1 {

        @Autowired
        private MockMvc mockMvc;
        
        @Mock
        Tasks tasks;

        
        TaskController taskController;

        @Before
        public void setUp() throws Exception {
            MockitoAnnotations.initMocks(this);

            taskController = new TaskController();
        }

        @Test
        public void testMockMVC() throws Exception {
            MockMvc mockMvc = MockMvcBuilders.standaloneSetup(taskController).build();

            mockMvc.perform(get("/"))
                    .andExpect(status().isOk())
                    .andExpect(view().name("index"));
        }


        @Test
        public void test1MockMVC() throws Exception {
            
            mockMvc.perform(get("/"))
            .andExpect(status().isOk())
            .andExpect(view().name("index"));
            
        }


    }