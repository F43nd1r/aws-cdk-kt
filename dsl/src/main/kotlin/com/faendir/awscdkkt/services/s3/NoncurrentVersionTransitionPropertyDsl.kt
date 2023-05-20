@file:Generated(value = ["Generated based on CDK v2.80.0"])

package com.faendir.awscdkkt.services.s3

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.s3.CfnBucket

public
    fun noncurrentVersionTransitionProperty(initializer: CfnBucket.NoncurrentVersionTransitionProperty.Builder.() -> Unit):
    CfnBucket.NoncurrentVersionTransitionProperty =
    CfnBucket.NoncurrentVersionTransitionProperty.builder().apply(initializer).build()
