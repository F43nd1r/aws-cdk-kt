@file:Generated(value = ["Generated based on CDK v2.80.0"])

package com.faendir.awscdkkt.services.s3.deployment

import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.s3.deployment.BucketDeployment
import software.amazon.awscdk.services.s3.deployment.BucketDeploymentProps
import software.constructs.Construct

public fun Construct.bucketDeployment(
  id: String,
  props: BucketDeploymentProps,
  initializer: BucketDeployment.() -> Unit = {},
): BucketDeployment = BucketDeployment(this, id, props).apply(initializer)
