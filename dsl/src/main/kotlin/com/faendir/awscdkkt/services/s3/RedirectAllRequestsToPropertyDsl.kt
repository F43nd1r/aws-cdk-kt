package com.faendir.awscdkkt.services.s3

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.s3.CfnBucket

@Generated
public
    fun redirectAllRequestsToProperty(initializer: CfnBucket.RedirectAllRequestsToProperty.Builder.() -> Unit
    = {}): CfnBucket.RedirectAllRequestsToProperty =
    CfnBucket.RedirectAllRequestsToProperty.builder().apply(initializer).build()
