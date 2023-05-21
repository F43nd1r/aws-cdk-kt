package com.faendir.awscdkkt.services.iot

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.iot.CfnDomainConfiguration

@Generated
public
    fun authorizerConfigProperty(initializer: CfnDomainConfiguration.AuthorizerConfigProperty.Builder.() -> Unit
    = {}): CfnDomainConfiguration.AuthorizerConfigProperty =
    CfnDomainConfiguration.AuthorizerConfigProperty.builder().apply(initializer).build()
