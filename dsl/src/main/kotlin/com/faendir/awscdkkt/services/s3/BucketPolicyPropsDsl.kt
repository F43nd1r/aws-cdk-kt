package com.faendir.awscdkkt.services.s3

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.s3.BucketPolicyProps

@Generated
public fun bucketPolicyProps(initializer: BucketPolicyProps.Builder.() -> Unit = {}):
    BucketPolicyProps = BucketPolicyProps.builder().apply(initializer).build()
