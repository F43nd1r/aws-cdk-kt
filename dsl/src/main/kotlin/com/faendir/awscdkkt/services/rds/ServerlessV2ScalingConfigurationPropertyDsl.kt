package com.faendir.awscdkkt.services.rds

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.rds.CfnDBCluster

@Generated
public
    fun serverlessV2ScalingConfigurationProperty(initializer: CfnDBCluster.ServerlessV2ScalingConfigurationProperty.Builder.() -> Unit
    = {}): CfnDBCluster.ServerlessV2ScalingConfigurationProperty =
    CfnDBCluster.ServerlessV2ScalingConfigurationProperty.builder().apply(initializer).build()
