package org.apereo.cas.support.openid;

import org.apereo.cas.support.openid.authentication.handler.support.OpenIdCredentialsAuthenticationHandlerTests;
import org.apereo.cas.support.openid.authentication.principal.OpenIdServiceFactoryTests;
import org.apereo.cas.support.openid.authentication.principal.OpenIdServiceTests;
import org.apereo.cas.support.openid.web.flow.OpenIdSingleSignOnActionTests;
import org.apereo.cas.support.openid.web.mvc.SmartOpenIdControllerTest;
import org.apereo.cas.support.openid.web.support.DefaultOpenIdUserNameExtractorTests;
import org.apereo.cas.support.openid.web.support.OpenIdPostUrlHandlerMappingTests;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;

/**
 * The {@link AllTestsSuite} is responsible for
 * running all openid test cases.
 *
 * @author Misagh Moayyed
 * @since 4.2.0
 */

@RunWith(Suite.class)
@Suite.SuiteClasses({OpenIdPostUrlHandlerMappingTests.class, DefaultOpenIdUserNameExtractorTests.class,
        SmartOpenIdControllerTest.class, OpenIdSingleSignOnActionTests.class,
        OpenIdCredentialsAuthenticationHandlerTests.class, OpenIdServiceFactoryTests.class,
        OpenIdServiceTests.class})
public class AllTestsSuite {
}
