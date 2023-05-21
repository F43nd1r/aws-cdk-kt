package com.faendir.awscdkkt.services.elasticache

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.elasticache.CfnReplicationGroup

@Generated
public
    fun nodeGroupConfigurationProperty(initializer: CfnReplicationGroup.NodeGroupConfigurationProperty.Builder.() -> Unit
    = {}): CfnReplicationGroup.NodeGroupConfigurationProperty =
    CfnReplicationGroup.NodeGroupConfigurationProperty.builder().apply(initializer).build()
