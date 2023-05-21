package com.faendir.awscdkkt.services.eks

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.eks.CfnCluster

@Generated
public
    fun loggingTypeConfigProperty(initializer: CfnCluster.LoggingTypeConfigProperty.Builder.() -> Unit
    = {}): CfnCluster.LoggingTypeConfigProperty =
    CfnCluster.LoggingTypeConfigProperty.builder().apply(initializer).build()
