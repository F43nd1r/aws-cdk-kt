@file:Generated(value = ["Generated based on CDK v2.79.1"])

package com.faendir.awscdkkt.services.eks

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.eks.ClusterOptions

public fun clusterOptions(initializer: ClusterOptions.Builder.() -> Unit): ClusterOptions =
    ClusterOptions.builder().apply(initializer).build()
