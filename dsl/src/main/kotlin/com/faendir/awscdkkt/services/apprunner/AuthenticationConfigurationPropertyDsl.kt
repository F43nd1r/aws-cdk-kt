package com.faendir.awscdkkt.services.apprunner

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.apprunner.CfnService

@Generated
public
    fun authenticationConfigurationProperty(initializer: CfnService.AuthenticationConfigurationProperty.Builder.() -> Unit
    = {}): CfnService.AuthenticationConfigurationProperty =
    CfnService.AuthenticationConfigurationProperty.builder().apply(initializer).build()
