package com.faendir.awscdkkt.generated.services.apigateway

import com.faendir.awscdkkt.AwsCdkDsl
import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.apigateway.CfnRestApi

@Generated
public fun buildS3LocationProperty(initializer: @AwsCdkDsl
    CfnRestApi.S3LocationProperty.Builder.() -> Unit = {}): CfnRestApi.S3LocationProperty =
    CfnRestApi.S3LocationProperty.Builder().apply(initializer).build()
