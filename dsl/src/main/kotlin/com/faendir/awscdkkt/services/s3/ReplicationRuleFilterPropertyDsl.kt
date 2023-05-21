package com.faendir.awscdkkt.services.s3

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.s3.CfnBucket

@Generated
public
    fun replicationRuleFilterProperty(initializer: CfnBucket.ReplicationRuleFilterProperty.Builder.() -> Unit
    = {}): CfnBucket.ReplicationRuleFilterProperty =
    CfnBucket.ReplicationRuleFilterProperty.builder().apply(initializer).build()
