package com.faendir.awscdkkt.services.eks

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.eks.ClusterProps

@Generated
public fun clusterProps(initializer: ClusterProps.Builder.() -> Unit = {}): ClusterProps =
    ClusterProps.builder().apply(initializer).build()
