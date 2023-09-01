package com.faendir.awscdkkt.generated.services.s3

import com.faendir.awscdkkt.AwsCdkDsl
import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.s3.CfnBucket

@Generated
public fun buildReplicationRuleFilterProperty(initializer: @AwsCdkDsl
    CfnBucket.ReplicationRuleFilterProperty.Builder.() -> Unit = {}):
    CfnBucket.ReplicationRuleFilterProperty =
    CfnBucket.ReplicationRuleFilterProperty.Builder().apply(initializer).build()
