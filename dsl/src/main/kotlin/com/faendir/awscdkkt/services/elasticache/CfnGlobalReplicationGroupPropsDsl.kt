package com.faendir.awscdkkt.services.elasticache

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.elasticache.CfnGlobalReplicationGroupProps

@Generated
public
    fun cfnGlobalReplicationGroupProps(initializer: CfnGlobalReplicationGroupProps.Builder.() -> Unit
    = {}): CfnGlobalReplicationGroupProps =
    CfnGlobalReplicationGroupProps.builder().apply(initializer).build()
