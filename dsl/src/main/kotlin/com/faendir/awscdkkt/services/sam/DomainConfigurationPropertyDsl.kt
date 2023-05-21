package com.faendir.awscdkkt.services.sam

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.sam.CfnApi

@Generated
public
    fun domainConfigurationProperty(initializer: CfnApi.DomainConfigurationProperty.Builder.() -> Unit
    = {}): CfnApi.DomainConfigurationProperty =
    CfnApi.DomainConfigurationProperty.builder().apply(initializer).build()
