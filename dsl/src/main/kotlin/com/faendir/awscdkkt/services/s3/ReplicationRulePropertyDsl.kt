package com.faendir.awscdkkt.services.s3

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.s3.CfnBucket

@Generated
public fun replicationRuleProperty(initializer: CfnBucket.ReplicationRuleProperty.Builder.() -> Unit
    = {}): CfnBucket.ReplicationRuleProperty =
    CfnBucket.ReplicationRuleProperty.builder().apply(initializer).build()
