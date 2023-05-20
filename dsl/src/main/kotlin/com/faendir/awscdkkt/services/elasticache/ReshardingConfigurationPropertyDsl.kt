@file:Generated(value = ["Generated based on CDK v2.80.0"])

package com.faendir.awscdkkt.services.elasticache

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.elasticache.CfnGlobalReplicationGroup

public
    fun reshardingConfigurationProperty(initializer: CfnGlobalReplicationGroup.ReshardingConfigurationProperty.Builder.() -> Unit):
    CfnGlobalReplicationGroup.ReshardingConfigurationProperty =
    CfnGlobalReplicationGroup.ReshardingConfigurationProperty.builder().apply(initializer).build()
