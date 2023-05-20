@file:Generated(value = ["Generated based on CDK v2.80.0"])

package com.faendir.awscdkkt.services.s3

import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.s3.Bucket
import software.amazon.awscdk.services.s3.BucketProps
import software.constructs.Construct

public fun Construct.bucket(id: String, initializer: Bucket.() -> Unit = {}): Bucket = Bucket(this,
    id).apply(initializer)

public fun Construct.bucket(
  id: String,
  props: BucketProps,
  initializer: Bucket.() -> Unit = {},
): Bucket = Bucket(this, id, props).apply(initializer)
