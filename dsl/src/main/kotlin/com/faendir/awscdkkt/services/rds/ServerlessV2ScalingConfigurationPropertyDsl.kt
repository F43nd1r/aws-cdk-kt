@file:Generated(value = ["Generated 2023-05-20 based on CDK 2.79.1"])

package com.faendir.awscdkkt.services.rds

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.rds.CfnDBCluster

public
    fun serverlessV2ScalingConfigurationProperty(initializer: CfnDBCluster.ServerlessV2ScalingConfigurationProperty.Builder.() -> Unit):
    CfnDBCluster.ServerlessV2ScalingConfigurationProperty =
    CfnDBCluster.ServerlessV2ScalingConfigurationProperty.builder().apply(initializer).build()
