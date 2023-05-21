package com.faendir.awscdkkt.services.s3

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.s3.CfnBucket

@Generated
public
    fun ownershipControlsProperty(initializer: CfnBucket.OwnershipControlsProperty.Builder.() -> Unit
    = {}): CfnBucket.OwnershipControlsProperty =
    CfnBucket.OwnershipControlsProperty.builder().apply(initializer).build()
