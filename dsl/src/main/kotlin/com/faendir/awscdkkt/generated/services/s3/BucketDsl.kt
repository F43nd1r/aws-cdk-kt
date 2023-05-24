package com.faendir.awscdkkt.generated.services.s3

import com.faendir.awscdkkt.AwsCdkDsl
import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.s3.Bucket
import software.amazon.awscdk.services.s3.BucketProps
import software.constructs.Construct

@Generated
public fun Construct.bucket(id: String): Bucket = Bucket(this, id)

@Generated
public fun Construct.bucket(id: String, initializer: @AwsCdkDsl Bucket.() -> Unit): Bucket =
    Bucket(this, id).apply(initializer)

@Generated
public fun Construct.bucket(id: String, props: BucketProps): Bucket = Bucket(this, id, props)

@Generated
public fun Construct.bucket(
  id: String,
  props: BucketProps,
  initializer: @AwsCdkDsl Bucket.() -> Unit,
): Bucket = Bucket(this, id, props).apply(initializer)

@Generated
public fun Construct.buildBucket(id: String, initializer: @AwsCdkDsl Bucket.Builder.() -> Unit):
    Bucket = Bucket.Builder.create(this, id).apply(initializer).build()
