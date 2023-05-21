package com.faendir.awscdkkt.services.s3

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.s3.NoncurrentVersionTransition

@Generated
public fun noncurrentVersionTransition(initializer: NoncurrentVersionTransition.Builder.() -> Unit =
    {}): NoncurrentVersionTransition =
    NoncurrentVersionTransition.builder().apply(initializer).build()
