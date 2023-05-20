@file:Generated(value = ["Generated 2023-05-20 based on CDK 2.79.1"])

package com.faendir.awscdkkt.services.s3outposts

import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.s3outposts.CfnBucket
import software.amazon.awscdk.services.s3outposts.CfnBucketProps
import software.constructs.Construct

public fun Construct.cfnBucket(
  id: String,
  props: CfnBucketProps,
  initializer: CfnBucket.() -> Unit = {},
): CfnBucket = CfnBucket(this, id, props).apply(initializer)
