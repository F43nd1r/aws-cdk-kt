package com.faendir.awscdkkt.generated.services.lightsail

import com.faendir.awscdkkt.AwsCdkDsl
import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.lightsail.CfnBucket
import software.amazon.awscdk.services.lightsail.CfnBucketProps
import software.constructs.Construct

@Generated
public fun Construct.cfnBucket(id: String, props: CfnBucketProps): CfnBucket = CfnBucket(this, id,
    props)

@Generated
public fun Construct.cfnBucket(
  id: String,
  props: CfnBucketProps,
  initializer: @AwsCdkDsl CfnBucket.() -> Unit,
): CfnBucket = CfnBucket(this, id, props).apply(initializer)

@Generated
public fun Construct.buildCfnBucket(id: String, initializer: @AwsCdkDsl
    CfnBucket.Builder.() -> Unit): CfnBucket = CfnBucket.Builder.create(this,
    id).apply(initializer).build()
