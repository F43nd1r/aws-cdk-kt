@file:Generated(value = ["Generated 2023-05-19 based on CDK 2.79.1"])

package com.faendir.awscdkkt.services.customerprofiles

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.customerprofiles.CfnIntegration

public
    fun s3SourcePropertiesProperty(initializer: CfnIntegration.S3SourcePropertiesProperty.Builder.() -> Unit):
    CfnIntegration.S3SourcePropertiesProperty =
    CfnIntegration.S3SourcePropertiesProperty.builder().apply(initializer).build()
