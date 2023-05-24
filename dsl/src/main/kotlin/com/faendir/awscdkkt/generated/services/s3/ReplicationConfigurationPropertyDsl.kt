package com.faendir.awscdkkt.generated.services.s3

import com.faendir.awscdkkt.AwsCdkDsl
import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.s3.CfnBucket

@Generated
public fun buildReplicationConfigurationProperty(initializer: @AwsCdkDsl
    CfnBucket.ReplicationConfigurationProperty.Builder.() -> Unit):
    CfnBucket.ReplicationConfigurationProperty =
    CfnBucket.ReplicationConfigurationProperty.Builder().apply(initializer).build()
