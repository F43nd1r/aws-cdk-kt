package com.faendir.awscdkkt.generated.services.s3vectors

import com.faendir.awscdkkt.AwsCdkDsl
import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.s3vectors.CfnVectorBucket
import software.amazon.awscdk.services.s3vectors.CfnVectorBucketProps
import software.constructs.Construct

@Generated
public fun Construct.cfnVectorBucket(id: String, initializer: @AwsCdkDsl CfnVectorBucket.() -> Unit = {}): CfnVectorBucket = CfnVectorBucket(this, id).apply(initializer)

@Generated
public fun Construct.cfnVectorBucket(
  id: String,
  props: CfnVectorBucketProps,
  initializer: @AwsCdkDsl CfnVectorBucket.() -> Unit = {},
): CfnVectorBucket = CfnVectorBucket(this, id, props).apply(initializer)

@Generated
public fun Construct.buildCfnVectorBucket(id: String, initializer: @AwsCdkDsl CfnVectorBucket.Builder.() -> Unit = {}): CfnVectorBucket = CfnVectorBucket.Builder.create(this, id).apply(initializer).build()
