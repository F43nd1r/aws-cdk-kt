package com.faendir.awscdkkt.generated.services.s3vectors

import com.faendir.awscdkkt.AwsCdkDsl
import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.s3vectors.CfnVectorBucketPolicy
import software.amazon.awscdk.services.s3vectors.CfnVectorBucketPolicyProps
import software.constructs.Construct

@Generated
public fun Construct.cfnVectorBucketPolicy(
  id: String,
  props: CfnVectorBucketPolicyProps,
  initializer: @AwsCdkDsl CfnVectorBucketPolicy.() -> Unit = {},
): CfnVectorBucketPolicy = CfnVectorBucketPolicy(this, id, props).apply(initializer)

@Generated
public fun Construct.buildCfnVectorBucketPolicy(id: String, initializer: @AwsCdkDsl CfnVectorBucketPolicy.Builder.() -> Unit = {}): CfnVectorBucketPolicy = CfnVectorBucketPolicy.Builder.create(this, id).apply(initializer).build()
