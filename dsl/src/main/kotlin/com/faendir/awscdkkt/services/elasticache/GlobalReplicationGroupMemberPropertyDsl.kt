@file:Generated(value = ["Generated 2023-05-19 based on CDK 2.79.1"])

package com.faendir.awscdkkt.services.elasticache

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.elasticache.CfnGlobalReplicationGroup

public
    fun globalReplicationGroupMemberProperty(initializer: CfnGlobalReplicationGroup.GlobalReplicationGroupMemberProperty.Builder.() -> Unit):
    CfnGlobalReplicationGroup.GlobalReplicationGroupMemberProperty =
    CfnGlobalReplicationGroup.GlobalReplicationGroupMemberProperty.builder().apply(initializer).build()
