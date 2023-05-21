package com.faendir.awscdkkt.services.ecs

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.ecs.ClusterProps

@Generated
public fun clusterProps(initializer: ClusterProps.Builder.() -> Unit = {}): ClusterProps =
    ClusterProps.builder().apply(initializer).build()
