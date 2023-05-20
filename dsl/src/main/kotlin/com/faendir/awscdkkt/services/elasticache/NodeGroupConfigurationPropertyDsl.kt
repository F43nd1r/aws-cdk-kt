@file:Generated(value = ["Generated 2023-05-20 based on CDK 2.79.1"])

package com.faendir.awscdkkt.services.elasticache

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.elasticache.CfnReplicationGroup

public
    fun nodeGroupConfigurationProperty(initializer: CfnReplicationGroup.NodeGroupConfigurationProperty.Builder.() -> Unit):
    CfnReplicationGroup.NodeGroupConfigurationProperty =
    CfnReplicationGroup.NodeGroupConfigurationProperty.builder().apply(initializer).build()
