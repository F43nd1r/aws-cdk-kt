package com.faendir.awscdkkt.generated.services.codedeploy

import com.faendir.awscdkkt.AwsCdkDsl
import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.codedeploy.CfnDeploymentGroup

@Generated
public fun buildS3LocationProperty(initializer: @AwsCdkDsl
    CfnDeploymentGroup.S3LocationProperty.Builder.() -> Unit = {}):
    CfnDeploymentGroup.S3LocationProperty =
    CfnDeploymentGroup.S3LocationProperty.Builder().apply(initializer).build()
