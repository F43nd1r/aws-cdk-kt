@file:Generated(value = ["Generated 2023-05-20 based on CDK 2.79.1"])

package com.faendir.awscdkkt.services.s3

import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.s3.Bucket
import software.amazon.awscdk.services.s3.BucketProps
import software.constructs.Construct

public fun Construct.bucket(
  id: String,
  props: BucketProps,
  initializer: Bucket.() -> Unit = {},
): Bucket = Bucket(this, id, props).apply(initializer)

public fun Construct.bucket(id: String, initializer: Bucket.() -> Unit = {}): Bucket = Bucket(this,
    id).apply(initializer)
