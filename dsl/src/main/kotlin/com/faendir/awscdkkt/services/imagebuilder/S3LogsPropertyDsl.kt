package com.faendir.awscdkkt.services.imagebuilder

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.imagebuilder.CfnInfrastructureConfiguration

@Generated
public
    fun s3LogsProperty(initializer: CfnInfrastructureConfiguration.S3LogsProperty.Builder.() -> Unit
    = {}): CfnInfrastructureConfiguration.S3LogsProperty =
    CfnInfrastructureConfiguration.S3LogsProperty.builder().apply(initializer).build()
