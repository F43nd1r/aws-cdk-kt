package com.faendir.awscdkkt.generated.services.s3.deployment

import com.faendir.awscdkkt.AwsCdkDsl
import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.s3.deployment.BucketDeploymentProps

@Generated
public fun buildBucketDeploymentProps(initializer: @AwsCdkDsl
    BucketDeploymentProps.Builder.() -> Unit): BucketDeploymentProps =
    BucketDeploymentProps.Builder().apply(initializer).build()
