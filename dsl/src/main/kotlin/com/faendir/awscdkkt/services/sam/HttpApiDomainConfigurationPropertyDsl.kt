@file:Generated(value = ["Generated based on CDK v2.80.0"])

package com.faendir.awscdkkt.services.sam

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.sam.CfnHttpApi

public
    fun httpApiDomainConfigurationProperty(initializer: CfnHttpApi.HttpApiDomainConfigurationProperty.Builder.() -> Unit):
    CfnHttpApi.HttpApiDomainConfigurationProperty =
    CfnHttpApi.HttpApiDomainConfigurationProperty.builder().apply(initializer).build()
