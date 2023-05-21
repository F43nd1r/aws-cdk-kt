package com.faendir.awscdkkt.services.ecs

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.ecs.CfnCluster

@Generated
public
    fun executeCommandConfigurationProperty(initializer: CfnCluster.ExecuteCommandConfigurationProperty.Builder.() -> Unit
    = {}): CfnCluster.ExecuteCommandConfigurationProperty =
    CfnCluster.ExecuteCommandConfigurationProperty.builder().apply(initializer).build()
