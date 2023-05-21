package com.faendir.awscdkkt.services.rds

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.rds.CfnDBCluster

@Generated
public
    fun scalingConfigurationProperty(initializer: CfnDBCluster.ScalingConfigurationProperty.Builder.() -> Unit
    = {}): CfnDBCluster.ScalingConfigurationProperty =
    CfnDBCluster.ScalingConfigurationProperty.builder().apply(initializer).build()
