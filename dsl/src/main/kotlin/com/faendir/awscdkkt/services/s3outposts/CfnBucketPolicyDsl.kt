@file:Generated(value = ["Generated 2023-05-19 based on CDK 2.79.1"])

package com.faendir.awscdkkt.services.s3outposts

import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.s3outposts.CfnBucketPolicy
import software.amazon.awscdk.services.s3outposts.CfnBucketPolicyProps
import software.constructs.Construct

public fun Construct.cfnBucketPolicy(
  id: String,
  props: CfnBucketPolicyProps,
  initializer: CfnBucketPolicy.() -> Unit = {},
): CfnBucketPolicy = CfnBucketPolicy(this, id, props).apply(initializer)
