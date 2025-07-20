package com.faendir.awscdkkt.generated.services.s3

import com.faendir.awscdkkt.AwsCdkDsl
import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.s3.BucketPolicy
import software.amazon.awscdk.services.s3.BucketPolicyProps
import software.constructs.Construct

@Generated
public fun Construct.bucketPolicy(
  id: String,
  props: BucketPolicyProps,
  initializer: @AwsCdkDsl BucketPolicy.() -> Unit = {},
): BucketPolicy = BucketPolicy(this, id, props).apply(initializer)

@Generated
public fun Construct.buildBucketPolicy(id: String, initializer: @AwsCdkDsl BucketPolicy.Builder.() -> Unit = {}): BucketPolicy = BucketPolicy.Builder.create(this, id).apply(initializer).build()
