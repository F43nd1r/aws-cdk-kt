package com.faendir.awscdkkt.generated.services.s3.deployment

import com.faendir.awscdkkt.AwsCdkDsl
import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.s3.deployment.BucketDeployment
import software.amazon.awscdk.services.s3.deployment.BucketDeploymentProps
import software.constructs.Construct

@Generated
public fun Construct.bucketDeployment(id: String, props: BucketDeploymentProps): BucketDeployment =
    BucketDeployment(this, id, props)

@Generated
public fun Construct.bucketDeployment(
  id: String,
  props: BucketDeploymentProps,
  initializer: @AwsCdkDsl BucketDeployment.() -> Unit,
): BucketDeployment = BucketDeployment(this, id, props).apply(initializer)

@Generated
public fun Construct.buildBucketDeployment(id: String, initializer: @AwsCdkDsl
    BucketDeployment.Builder.() -> Unit): BucketDeployment = BucketDeployment.Builder.create(this,
    id).apply(initializer).build()
