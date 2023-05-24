package com.faendir.awscdkkt.generated.services.s3

import com.faendir.awscdkkt.AwsCdkDsl
import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.s3.BucketProps

@Generated
public fun buildBucketProps(initializer: @AwsCdkDsl BucketProps.Builder.() -> Unit): BucketProps =
    BucketProps.Builder().apply(initializer).build()
