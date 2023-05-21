package com.faendir.awscdkkt.services.s3

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.s3.CfnBucket

@Generated
public
    fun replicationConfigurationProperty(initializer: CfnBucket.ReplicationConfigurationProperty.Builder.() -> Unit
    = {}): CfnBucket.ReplicationConfigurationProperty =
    CfnBucket.ReplicationConfigurationProperty.builder().apply(initializer).build()
