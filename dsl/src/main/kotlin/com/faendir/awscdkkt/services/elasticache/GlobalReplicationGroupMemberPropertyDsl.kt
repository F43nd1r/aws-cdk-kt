package com.faendir.awscdkkt.services.elasticache

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.elasticache.CfnGlobalReplicationGroup

@Generated
public
    fun globalReplicationGroupMemberProperty(initializer: CfnGlobalReplicationGroup.GlobalReplicationGroupMemberProperty.Builder.() -> Unit
    = {}): CfnGlobalReplicationGroup.GlobalReplicationGroupMemberProperty =
    CfnGlobalReplicationGroup.GlobalReplicationGroupMemberProperty.builder().apply(initializer).build()
