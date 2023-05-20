@file:Generated(value = ["Generated based on CDK v2.80.0"])

package com.faendir.awscdkkt.services.ecr

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.ecr.CfnReplicationConfiguration

public
    fun replicationRuleProperty(initializer: CfnReplicationConfiguration.ReplicationRuleProperty.Builder.() -> Unit):
    CfnReplicationConfiguration.ReplicationRuleProperty =
    CfnReplicationConfiguration.ReplicationRuleProperty.builder().apply(initializer).build()
