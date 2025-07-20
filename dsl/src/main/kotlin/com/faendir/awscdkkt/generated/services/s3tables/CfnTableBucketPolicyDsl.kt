package com.faendir.awscdkkt.generated.services.s3tables

import com.faendir.awscdkkt.AwsCdkDsl
import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.s3tables.CfnTableBucketPolicy
import software.amazon.awscdk.services.s3tables.CfnTableBucketPolicyProps
import software.constructs.Construct

@Generated
public fun Construct.cfnTableBucketPolicy(
  id: String,
  props: CfnTableBucketPolicyProps,
  initializer: @AwsCdkDsl CfnTableBucketPolicy.() -> Unit = {},
): CfnTableBucketPolicy = CfnTableBucketPolicy(this, id, props).apply(initializer)

@Generated
public fun Construct.buildCfnTableBucketPolicy(id: String, initializer: @AwsCdkDsl CfnTableBucketPolicy.Builder.() -> Unit = {}): CfnTableBucketPolicy = CfnTableBucketPolicy.Builder.create(this, id).apply(initializer).build()
