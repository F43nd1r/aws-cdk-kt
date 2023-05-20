@file:Generated(value = ["Generated based on CDK v2.79.1"])

package com.faendir.awscdkkt.services.s3

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.s3.CfnBucket

public
    fun replicationTimeValueProperty(initializer: CfnBucket.ReplicationTimeValueProperty.Builder.() -> Unit):
    CfnBucket.ReplicationTimeValueProperty =
    CfnBucket.ReplicationTimeValueProperty.builder().apply(initializer).build()
