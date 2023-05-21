package com.faendir.awscdkkt.services.ecs

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.ecs.CfnCluster

@Generated
public
    fun executeCommandLogConfigurationProperty(initializer: CfnCluster.ExecuteCommandLogConfigurationProperty.Builder.() -> Unit
    = {}): CfnCluster.ExecuteCommandLogConfigurationProperty =
    CfnCluster.ExecuteCommandLogConfigurationProperty.builder().apply(initializer).build()
