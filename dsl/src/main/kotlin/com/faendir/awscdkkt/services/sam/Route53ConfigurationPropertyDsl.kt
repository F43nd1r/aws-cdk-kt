@file:Generated(value = ["Generated 2023-05-20 based on CDK 2.79.1"])

package com.faendir.awscdkkt.services.sam

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.sam.CfnHttpApi

public
    fun route53ConfigurationProperty(initializer: CfnHttpApi.Route53ConfigurationProperty.Builder.() -> Unit):
    CfnHttpApi.Route53ConfigurationProperty =
    CfnHttpApi.Route53ConfigurationProperty.builder().apply(initializer).build()
