@file:Generated(value = ["Generated 2023-05-20 based on CDK 2.79.1"])

package com.faendir.awscdkkt.services.lightsail

import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.lightsail.CfnBucket
import software.amazon.awscdk.services.lightsail.CfnBucketProps
import software.constructs.Construct

public fun Construct.cfnBucket(
  id: String,
  props: CfnBucketProps,
  initializer: CfnBucket.() -> Unit = {},
): CfnBucket = CfnBucket(this, id, props).apply(initializer)
