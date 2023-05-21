package com.faendir.awscdkkt.services.memorydb

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.memorydb.CfnCluster

@Generated
public fun endpointProperty(initializer: CfnCluster.EndpointProperty.Builder.() -> Unit = {}):
    CfnCluster.EndpointProperty = CfnCluster.EndpointProperty.builder().apply(initializer).build()
