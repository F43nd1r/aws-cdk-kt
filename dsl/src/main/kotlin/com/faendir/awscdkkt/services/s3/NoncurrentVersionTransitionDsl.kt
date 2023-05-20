@file:Generated(value = ["Generated based on CDK v2.80.0"])

package com.faendir.awscdkkt.services.s3

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.s3.NoncurrentVersionTransition

public fun noncurrentVersionTransition(initializer: NoncurrentVersionTransition.Builder.() -> Unit):
    NoncurrentVersionTransition = NoncurrentVersionTransition.builder().apply(initializer).build()
