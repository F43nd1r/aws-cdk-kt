@file:Generated(value = ["Generated 2023-05-20 based on CDK 2.79.1"])

package com.faendir.awscdkkt.services.sagemaker

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.sagemaker.CfnPipeline

public fun s3LocationProperty(initializer: CfnPipeline.S3LocationProperty.Builder.() -> Unit):
    CfnPipeline.S3LocationProperty =
    CfnPipeline.S3LocationProperty.builder().apply(initializer).build()
