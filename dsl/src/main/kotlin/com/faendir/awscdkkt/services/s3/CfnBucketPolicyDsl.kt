@file:Generated(value = ["Generated based on CDK v2.79.1"])

package com.faendir.awscdkkt.services.s3

import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.s3.CfnBucketPolicy
import software.amazon.awscdk.services.s3.CfnBucketPolicyProps
import software.constructs.Construct

public fun Construct.cfnBucketPolicy(
  id: String,
  props: CfnBucketPolicyProps,
  initializer: CfnBucketPolicy.() -> Unit = {},
): CfnBucketPolicy = CfnBucketPolicy(this, id, props).apply(initializer)
