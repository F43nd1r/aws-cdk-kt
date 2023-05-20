@file:Generated(value = ["Generated based on CDK v2.79.1"])

package com.faendir.awscdkkt.services.s3

import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.s3.CfnBucket
import software.amazon.awscdk.services.s3.CfnBucketProps
import software.constructs.Construct

public fun Construct.cfnBucket(
  id: String,
  props: CfnBucketProps,
  initializer: CfnBucket.() -> Unit = {},
): CfnBucket = CfnBucket(this, id, props).apply(initializer)

public fun Construct.cfnBucket(id: String, initializer: CfnBucket.() -> Unit = {}): CfnBucket =
    CfnBucket(this, id).apply(initializer)
