@file:Generated(value = ["Generated 2023-05-19 based on CDK 2.79.1"])

package com.faendir.awscdkkt.services.codedeploy

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.codedeploy.CfnDeploymentGroup

public
    fun s3LocationProperty(initializer: CfnDeploymentGroup.S3LocationProperty.Builder.() -> Unit):
    CfnDeploymentGroup.S3LocationProperty =
    CfnDeploymentGroup.S3LocationProperty.builder().apply(initializer).build()
