@file:Generated(value = ["Generated 2023-05-19 based on CDK 2.79.1"])

package com.faendir.awscdkkt.services.sam

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.sam.CfnHttpApi

public
    fun httpApiDomainConfigurationProperty(initializer: CfnHttpApi.HttpApiDomainConfigurationProperty.Builder.() -> Unit):
    CfnHttpApi.HttpApiDomainConfigurationProperty =
    CfnHttpApi.HttpApiDomainConfigurationProperty.builder().apply(initializer).build()
