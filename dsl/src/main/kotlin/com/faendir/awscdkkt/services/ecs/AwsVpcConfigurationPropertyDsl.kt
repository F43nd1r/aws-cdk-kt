package com.faendir.awscdkkt.services.ecs

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.ecs.CfnTaskSet

@Generated
public
    fun awsVpcConfigurationProperty(initializer: CfnTaskSet.AwsVpcConfigurationProperty.Builder.() -> Unit
    = {}): CfnTaskSet.AwsVpcConfigurationProperty =
    CfnTaskSet.AwsVpcConfigurationProperty.builder().apply(initializer).build()
