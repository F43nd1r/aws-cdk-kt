package com.faendir.awscdkkt.generated.services.sagemaker

import com.faendir.awscdkkt.AwsCdkDsl
import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.sagemaker.CfnPipeline

@Generated
public fun buildS3LocationProperty(initializer: @AwsCdkDsl
    CfnPipeline.S3LocationProperty.Builder.() -> Unit = {}): CfnPipeline.S3LocationProperty =
    CfnPipeline.S3LocationProperty.Builder().apply(initializer).build()
