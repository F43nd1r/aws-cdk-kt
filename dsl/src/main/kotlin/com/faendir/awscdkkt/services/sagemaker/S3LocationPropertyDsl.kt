package com.faendir.awscdkkt.services.sagemaker

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.sagemaker.CfnPipeline

@Generated
public fun s3LocationProperty(initializer: CfnPipeline.S3LocationProperty.Builder.() -> Unit = {}):
    CfnPipeline.S3LocationProperty =
    CfnPipeline.S3LocationProperty.builder().apply(initializer).build()
