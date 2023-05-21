package com.faendir.awscdkkt.services.msk

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.msk.CfnCluster

@Generated
public fun loggingInfoProperty(initializer: CfnCluster.LoggingInfoProperty.Builder.() -> Unit = {}):
    CfnCluster.LoggingInfoProperty =
    CfnCluster.LoggingInfoProperty.builder().apply(initializer).build()
