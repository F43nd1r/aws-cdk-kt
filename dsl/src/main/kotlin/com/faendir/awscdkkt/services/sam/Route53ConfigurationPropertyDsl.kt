@file:Generated(value = ["Generated based on CDK v2.80.0"])

package com.faendir.awscdkkt.services.sam

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.sam.CfnHttpApi

public
    fun route53ConfigurationProperty(initializer: CfnHttpApi.Route53ConfigurationProperty.Builder.() -> Unit):
    CfnHttpApi.Route53ConfigurationProperty =
    CfnHttpApi.Route53ConfigurationProperty.builder().apply(initializer).build()
