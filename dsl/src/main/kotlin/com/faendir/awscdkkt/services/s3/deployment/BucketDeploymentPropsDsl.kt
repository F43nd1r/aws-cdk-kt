package com.faendir.awscdkkt.services.s3.deployment

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.s3.deployment.BucketDeploymentProps

@Generated
public fun bucketDeploymentProps(initializer: BucketDeploymentProps.Builder.() -> Unit = {}):
    BucketDeploymentProps = BucketDeploymentProps.builder().apply(initializer).build()
