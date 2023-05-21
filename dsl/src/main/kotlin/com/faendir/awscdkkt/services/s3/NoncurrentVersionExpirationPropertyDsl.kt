package com.faendir.awscdkkt.services.s3

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.s3.CfnBucket

@Generated
public
    fun noncurrentVersionExpirationProperty(initializer: CfnBucket.NoncurrentVersionExpirationProperty.Builder.() -> Unit
    = {}): CfnBucket.NoncurrentVersionExpirationProperty =
    CfnBucket.NoncurrentVersionExpirationProperty.builder().apply(initializer).build()
