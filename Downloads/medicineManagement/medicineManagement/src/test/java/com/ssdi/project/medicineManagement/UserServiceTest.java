//package com.ssdi.project.medicineManagement;
//
//import org.junit.Before;
//import org.junit.Test;
//import org.junit.runner.RunWith;
//import org.mockito.Mock;
//import org.mockito.Mockito;
//import org.springframework.boot.test.context.SpringBootTest;
//import org.springframework.test.context.junit4.SpringRunner;
//
//import com.ssdi.project.medicineManagement.model.User;
//import com.ssdi.project.medicineManagement.repository.UserRepository;
//import com.ssdi.project.medicineManagement.service.UserService;
//
//import java.util.ArrayList;
//import java.util.List;
//
//import lombok.Builder;
//import static org.junit.Assert.*;
//import static org.mockito.ArgumentMatchers.*;
//import static org.mockito.MockitoAnnotations.initMocks;
//
//@RunWith(SpringRunner.class)
//@SpringBootTest
//public class UserServiceTest {
//    @Mock
//    private UserRepository mockUserRepository;
//    
//    private UserService userServiceUnderTest;
//    private User user;
//    
//    @Before
//    public void setUp() {
//        initMocks(this);
//        userServiceUnderTest = new UserService(mockUserRepository);
//        List<User> users = new ArrayList<>();
//        //UserService.UserServiceBuilder userServiceBuilder = userServiceUnderTest.toBuilder();
//        user = User.builder()
//                .userId(1)
//                .firstName("Rajath")
//                .lastName("Anand")
//                .email_address("testRajath@test.com")
//                .build();
//        User user1 = User.builder()
//                .userId(2)
//                .firstName("Sandesha")
//                .lastName("Shetty")
//                .email_address("testSandesha@test.com")
//                .build();
//        User user2 = User.builder()
//                .userId(3)
//                .firstName("Pandu")
//                .lastName("Pataki")
//                .email_address("testPandu@test.com")
//                .build();
//        
//        users.add(user);
//        users.add(user1);
//        users.add(user2);
        
//        Mockito.when(mockUserRepository.save(any()))
//        .thenReturn(user);
//    }
//    
//    @Test
//    public void testSaveUser() {
//        final String email = "testRajath@test.com";
//        User result = userServiceUnderTest.saveUser(user);
//        assertEquals(email, result.getEmail());
//    }
//    
//}