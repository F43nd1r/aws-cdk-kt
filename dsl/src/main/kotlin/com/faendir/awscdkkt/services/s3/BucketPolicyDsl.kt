package com.faendir.awscdkkt.services.s3

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
  initializer: BucketPolicy.() -> Unit = {},
): BucketPolicy = BucketPolicy(this, id, props).apply(initializer)
