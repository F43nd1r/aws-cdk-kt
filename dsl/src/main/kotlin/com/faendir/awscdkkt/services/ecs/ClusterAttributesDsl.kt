package com.faendir.awscdkkt.services.ecs

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.ecs.ClusterAttributes

@Generated
public fun clusterAttributes(initializer: ClusterAttributes.Builder.() -> Unit = {}):
    ClusterAttributes = ClusterAttributes.builder().apply(initializer).build()
