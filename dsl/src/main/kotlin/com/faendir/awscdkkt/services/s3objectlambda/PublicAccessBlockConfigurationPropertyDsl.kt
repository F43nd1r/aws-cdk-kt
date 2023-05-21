package com.faendir.awscdkkt.services.s3objectlambda

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.s3objectlambda.CfnAccessPoint

@Generated
public
    fun publicAccessBlockConfigurationProperty(initializer: CfnAccessPoint.PublicAccessBlockConfigurationProperty.Builder.() -> Unit
    = {}): CfnAccessPoint.PublicAccessBlockConfigurationProperty =
    CfnAccessPoint.PublicAccessBlockConfigurationProperty.builder().apply(initializer).build()
