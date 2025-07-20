package com.faendir.awscdkkt.generated.services.s3express

import com.faendir.awscdkkt.AwsCdkDsl
import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.s3express.CfnDirectoryBucket
import software.amazon.awscdk.services.s3express.CfnDirectoryBucketProps
import software.constructs.Construct

@Generated
public fun Construct.cfnDirectoryBucket(
  id: String,
  props: CfnDirectoryBucketProps,
  initializer: @AwsCdkDsl CfnDirectoryBucket.() -> Unit = {},
): CfnDirectoryBucket = CfnDirectoryBucket(this, id, props).apply(initializer)

@Generated
public fun Construct.buildCfnDirectoryBucket(id: String, initializer: @AwsCdkDsl CfnDirectoryBucket.Builder.() -> Unit = {}): CfnDirectoryBucket = CfnDirectoryBucket.Builder.create(this, id).apply(initializer).build()
