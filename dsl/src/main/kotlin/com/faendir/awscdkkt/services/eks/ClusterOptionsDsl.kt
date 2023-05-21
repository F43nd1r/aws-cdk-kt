package com.faendir.awscdkkt.services.eks

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.eks.ClusterOptions

@Generated
public fun clusterOptions(initializer: ClusterOptions.Builder.() -> Unit = {}): ClusterOptions =
    ClusterOptions.builder().apply(initializer).build()
