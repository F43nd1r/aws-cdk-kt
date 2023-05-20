@file:Generated(value = ["Generated based on CDK v2.79.1"])

package com.faendir.awscdkkt.services.apigateway

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.apigateway.CfnRestApi

public fun s3LocationProperty(initializer: CfnRestApi.S3LocationProperty.Builder.() -> Unit):
    CfnRestApi.S3LocationProperty =
    CfnRestApi.S3LocationProperty.builder().apply(initializer).build()
