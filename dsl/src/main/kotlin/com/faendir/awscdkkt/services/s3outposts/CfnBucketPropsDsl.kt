package com.faendir.awscdkkt.services.s3outposts

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.s3outposts.CfnBucketProps

@Generated
public fun cfnBucketProps(initializer: CfnBucketProps.Builder.() -> Unit = {}): CfnBucketProps =
    CfnBucketProps.builder().apply(initializer).build()
