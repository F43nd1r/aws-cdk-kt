package com.faendir.awscdkkt.services.iot

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.iot.CfnDomainConfiguration

@Generated
public
    fun tlsConfigProperty(initializer: CfnDomainConfiguration.TlsConfigProperty.Builder.() -> Unit =
    {}): CfnDomainConfiguration.TlsConfigProperty =
    CfnDomainConfiguration.TlsConfigProperty.builder().apply(initializer).build()
