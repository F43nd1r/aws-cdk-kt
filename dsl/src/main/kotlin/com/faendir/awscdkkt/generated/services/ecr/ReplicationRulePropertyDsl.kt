package com.faendir.awscdkkt.generated.services.ecr

import com.faendir.awscdkkt.AwsCdkDsl
import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.ecr.CfnReplicationConfiguration

@Generated
public fun buildReplicationRuleProperty(initializer: @AwsCdkDsl
    CfnReplicationConfiguration.ReplicationRuleProperty.Builder.() -> Unit = {}):
    CfnReplicationConfiguration.ReplicationRuleProperty =
    CfnReplicationConfiguration.ReplicationRuleProperty.Builder().apply(initializer).build()
