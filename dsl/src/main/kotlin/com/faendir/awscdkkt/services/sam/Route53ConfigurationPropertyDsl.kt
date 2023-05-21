package com.faendir.awscdkkt.services.sam

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.sam.CfnHttpApi

@Generated
public
    fun route53ConfigurationProperty(initializer: CfnHttpApi.Route53ConfigurationProperty.Builder.() -> Unit
    = {}): CfnHttpApi.Route53ConfigurationProperty =
    CfnHttpApi.Route53ConfigurationProperty.builder().apply(initializer).build()
