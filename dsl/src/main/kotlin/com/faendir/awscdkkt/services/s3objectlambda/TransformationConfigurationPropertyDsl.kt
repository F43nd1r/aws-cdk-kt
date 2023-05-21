package com.faendir.awscdkkt.services.s3objectlambda

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.s3objectlambda.CfnAccessPoint

@Generated
public
    fun transformationConfigurationProperty(initializer: CfnAccessPoint.TransformationConfigurationProperty.Builder.() -> Unit
    = {}): CfnAccessPoint.TransformationConfigurationProperty =
    CfnAccessPoint.TransformationConfigurationProperty.builder().apply(initializer).build()
