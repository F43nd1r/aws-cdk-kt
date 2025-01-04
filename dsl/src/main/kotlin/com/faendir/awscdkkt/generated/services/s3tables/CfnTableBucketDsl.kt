package com.faendir.awscdkkt.generated.services.s3tables

import com.faendir.awscdkkt.AwsCdkDsl
import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.s3tables.CfnTableBucket
import software.amazon.awscdk.services.s3tables.CfnTableBucketProps
import software.constructs.Construct

@Generated
public fun Construct.cfnTableBucket(
  id: String,
  props: CfnTableBucketProps,
  initializer: @AwsCdkDsl CfnTableBucket.() -> Unit = {},
): CfnTableBucket = CfnTableBucket(this, id, props).apply(initializer)

@Generated
public fun Construct.buildCfnTableBucket(id: String, initializer: @AwsCdkDsl
    CfnTableBucket.Builder.() -> Unit = {}): CfnTableBucket = CfnTableBucket.Builder.create(this,
    id).apply(initializer).build()
