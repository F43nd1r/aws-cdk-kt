package com.faendir.awscdkkt.services.eks

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.eks.CfnCluster

@Generated
public fun loggingProperty(initializer: CfnCluster.LoggingProperty.Builder.() -> Unit = {}):
    CfnCluster.LoggingProperty = CfnCluster.LoggingProperty.builder().apply(initializer).build()
