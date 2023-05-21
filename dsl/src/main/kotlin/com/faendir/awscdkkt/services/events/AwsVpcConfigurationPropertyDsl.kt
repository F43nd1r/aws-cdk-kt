package com.faendir.awscdkkt.services.events

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.events.CfnRule

@Generated
public
    fun awsVpcConfigurationProperty(initializer: CfnRule.AwsVpcConfigurationProperty.Builder.() -> Unit
    = {}): CfnRule.AwsVpcConfigurationProperty =
    CfnRule.AwsVpcConfigurationProperty.builder().apply(initializer).build()
