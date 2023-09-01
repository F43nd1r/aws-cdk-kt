package com.faendir.awscdkkt.generated.services.elasticache

import com.faendir.awscdkkt.AwsCdkDsl
import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.elasticache.CfnReplicationGroup

@Generated
public fun buildNodeGroupConfigurationProperty(initializer: @AwsCdkDsl
    CfnReplicationGroup.NodeGroupConfigurationProperty.Builder.() -> Unit = {}):
    CfnReplicationGroup.NodeGroupConfigurationProperty =
    CfnReplicationGroup.NodeGroupConfigurationProperty.Builder().apply(initializer).build()
