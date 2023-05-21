package com.faendir.awscdkkt.services.ecr

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.ecr.CfnReplicationConfiguration

@Generated
public
    fun replicationRuleProperty(initializer: CfnReplicationConfiguration.ReplicationRuleProperty.Builder.() -> Unit
    = {}): CfnReplicationConfiguration.ReplicationRuleProperty =
    CfnReplicationConfiguration.ReplicationRuleProperty.builder().apply(initializer).build()
