package com.faendir.awscdkkt.services.lightsail

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.lightsail.CfnBucketProps

@Generated
public fun cfnBucketProps(initializer: CfnBucketProps.Builder.() -> Unit = {}): CfnBucketProps =
    CfnBucketProps.builder().apply(initializer).build()
