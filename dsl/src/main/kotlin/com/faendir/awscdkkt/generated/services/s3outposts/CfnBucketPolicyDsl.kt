package com.faendir.awscdkkt.generated.services.s3outposts

import com.faendir.awscdkkt.AwsCdkDsl
import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.s3outposts.CfnBucketPolicy
import software.amazon.awscdk.services.s3outposts.CfnBucketPolicyProps
import software.constructs.Construct

@Generated
public fun Construct.cfnBucketPolicy(
  id: String,
  props: CfnBucketPolicyProps,
  initializer: @AwsCdkDsl CfnBucketPolicy.() -> Unit = {},
): CfnBucketPolicy = CfnBucketPolicy(this, id, props).apply(initializer)

@Generated
public fun Construct.buildCfnBucketPolicy(id: String, initializer: @AwsCdkDsl
    CfnBucketPolicy.Builder.() -> Unit = {}): CfnBucketPolicy = CfnBucketPolicy.Builder.create(this,
    id).apply(initializer).build()
