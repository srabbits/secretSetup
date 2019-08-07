package controller;

import model.Zombie;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;
import org.springframework.beans.factory.annotation.Autowired;
import service.ZombieService;

import static junit.framework.Assert.assertEquals;
import static org.mockito.ArgumentMatchers.anyObject;
import static org.mockito.Mockito.when;

@RunWith(MockitoJUnitRunner.class)
public class ZombieControllerTest {

    Zombie zombie1 = new Zombie();

    @InjectMocks
    ZombieController zombieController;

    @Mock
    ZombieService zombieService;

    @Before
    public void setUp(){
        zombie1 = new Zombie(1L, "Zee", 50, true, true,
                true, true,true,1, 0, anyObject(), anyObject(), anyObject());
    }
    @Test
    public void getId_ReturnNull(){
        when(zombieService.getZombie(1L)).thenReturn(null);
        assertEquals(null, zombieController.getZombie(1L));
    }

    @Test
    public void getId_ReturnId(){
        when(zombieService.getZombie(1l)).thenReturn(zombie1);

    }

}
