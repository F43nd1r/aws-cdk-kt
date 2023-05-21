package com.faendir.awscdkkt.services.customerprofiles

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.customerprofiles.CfnIntegration

@Generated
public
    fun s3SourcePropertiesProperty(initializer: CfnIntegration.S3SourcePropertiesProperty.Builder.() -> Unit
    = {}): CfnIntegration.S3SourcePropertiesProperty =
    CfnIntegration.S3SourcePropertiesProperty.builder().apply(initializer).build()
