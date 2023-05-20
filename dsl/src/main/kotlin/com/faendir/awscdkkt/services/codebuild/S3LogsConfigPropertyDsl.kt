@file:Generated(value = ["Generated based on CDK v2.79.1"])

package com.faendir.awscdkkt.services.codebuild

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.codebuild.CfnProject

public fun s3LogsConfigProperty(initializer: CfnProject.S3LogsConfigProperty.Builder.() -> Unit):
    CfnProject.S3LogsConfigProperty =
    CfnProject.S3LogsConfigProperty.builder().apply(initializer).build()
