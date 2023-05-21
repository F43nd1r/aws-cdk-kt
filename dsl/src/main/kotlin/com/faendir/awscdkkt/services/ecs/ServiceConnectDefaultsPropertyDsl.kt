package com.faendir.awscdkkt.services.ecs

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.ecs.CfnCluster

@Generated
public
    fun serviceConnectDefaultsProperty(initializer: CfnCluster.ServiceConnectDefaultsProperty.Builder.() -> Unit
    = {}): CfnCluster.ServiceConnectDefaultsProperty =
    CfnCluster.ServiceConnectDefaultsProperty.builder().apply(initializer).build()
