@file:Generated(value = ["Generated based on CDK v2.80.0"])

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
