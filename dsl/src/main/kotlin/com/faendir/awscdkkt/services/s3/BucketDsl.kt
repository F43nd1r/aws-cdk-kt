package com.faendir.awscdkkt.services.s3

import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.s3.Bucket
import software.amazon.awscdk.services.s3.BucketProps
import software.constructs.Construct

@Generated
public fun Construct.bucket(id: String, initializer: Bucket.() -> Unit = {}): Bucket = Bucket(this,
    id).apply(initializer)

@Generated
public fun Construct.bucket(
  id: String,
  props: BucketProps,
  initializer: Bucket.() -> Unit = {},
): Bucket = Bucket(this, id, props).apply(initializer)
