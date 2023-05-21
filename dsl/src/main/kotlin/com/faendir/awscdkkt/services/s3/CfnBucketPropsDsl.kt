package com.faendir.awscdkkt.services.s3

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.s3.CfnBucketProps

@Generated
public fun cfnBucketProps(initializer: CfnBucketProps.Builder.() -> Unit = {}): CfnBucketProps =
    CfnBucketProps.builder().apply(initializer).build()
