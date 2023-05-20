@file:Generated(value = ["Generated based on CDK v2.80.0"])

package com.faendir.awscdkkt.services.elasticache

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.elasticache.CfnReplicationGroup

public
    fun nodeGroupConfigurationProperty(initializer: CfnReplicationGroup.NodeGroupConfigurationProperty.Builder.() -> Unit):
    CfnReplicationGroup.NodeGroupConfigurationProperty =
    CfnReplicationGroup.NodeGroupConfigurationProperty.builder().apply(initializer).build()
