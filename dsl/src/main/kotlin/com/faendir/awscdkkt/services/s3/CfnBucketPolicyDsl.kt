@file:Generated(value = ["Generated 2023-05-19 based on CDK 2.79.1"])

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
