package com.faendir.awscdkkt.generated.services.sagemaker

import com.faendir.awscdkkt.AwsCdkDsl
import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.sagemaker.CfnModelBiasJobDefinition

@Generated
public fun buildS3OutputProperty(initializer: @AwsCdkDsl
    CfnModelBiasJobDefinition.S3OutputProperty.Builder.() -> Unit):
    CfnModelBiasJobDefinition.S3OutputProperty =
    CfnModelBiasJobDefinition.S3OutputProperty.Builder().apply(initializer).build()
