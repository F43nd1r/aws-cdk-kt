package com.faendir.awscdkkt.services.eks

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.eks.ClusterAttributes

@Generated
public fun clusterAttributes(initializer: ClusterAttributes.Builder.() -> Unit = {}):
    ClusterAttributes = ClusterAttributes.builder().apply(initializer).build()
