package com.faendir.awscdkkt.services.sam

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.sam.CfnHttpApi

@Generated
public
    fun httpApiDomainConfigurationProperty(initializer: CfnHttpApi.HttpApiDomainConfigurationProperty.Builder.() -> Unit
    = {}): CfnHttpApi.HttpApiDomainConfigurationProperty =
    CfnHttpApi.HttpApiDomainConfigurationProperty.builder().apply(initializer).build()
