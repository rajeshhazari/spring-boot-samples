package com.example.test.springjdbcsample1;

import com.example.test.springjdbcsample1.db.AppUserRepository;
import com.example.test.springjdbcsample1.db.AppUsers;
import com.example.test.springjdbcsample1.db.AppUsersAuth;
import com.example.test.springjdbcsample1.db.AuthoritiesMaster;
import org.assertj.core.api.Assert;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.data.jdbc.DataJdbcTest;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;
import java.util.Set;

@DataJdbcTest
class springjdbcsampletest1Tests {

	@Autowired
	AppUserRepository appUserRepository;

	@Test
	void repositoryTest() {
		//appUserRepository.deleteAll();
		/*AuthoritiesMaster authoritiesMaster = new AuthoritiesMaster();
		authoritiesMaster.setRoleId("role_basic");
		authoritiesMaster.setRoledesc("Basic Role Desc");
		*/
		//appUsersAuth.setRoleId(authoritiesMaster.getRoleId());
		AppUsersAuth appUsersAuth = new AppUsersAuth();
		appUsersAuth.setEmail("test1@mail.com");

		AppUsers appUsers = new AppUsers();
		appUsers.setUsername("test1");
		appUsers.setEmail("test1@mail.com");
		appUsers.setPassword("test123");

		appUsers = appUserRepository.save(appUsers);
		appUsersAuth.setUserid(appUsers.getUserid());
		
		appUsers = appUserRepository.save(appUsers);
		Assertions.assertThat(appUsers).isNotNull();
		Assertions.assertThat(appUsers.getAppUsersAuthList()).isNotNull();
		Set<AppUsersAuth> appUsersAuthList = appUsers.getAppUsersAuthList();
		for (final AppUsersAuth usersAuth : appUsersAuthList) {

			/*Assertions.assertThat(usersAuth.getAppAuthoritiesMasterList()).isNotNull();
			List<AuthoritiesMaster> authoritiesMasterList = usersAuth.getAppAuthoritiesMasterList();
			authoritiesMasterList.forEach(appUsersAuthMaster -> {
				Assertions.assertThat(appUsersAuthMaster).isNotNull();
				Assertions.assertThat(appUsersAuthMaster.getRoleId()).isEqualToIgnoringCase("role_basic");
			});*/
		}
		Assertions.assertThat(appUsers.getEmail()).isNotNull();
	}

}
