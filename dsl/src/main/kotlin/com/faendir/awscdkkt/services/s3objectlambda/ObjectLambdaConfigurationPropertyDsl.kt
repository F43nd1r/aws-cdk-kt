package com.faendir.awscdkkt.services.s3objectlambda

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.s3objectlambda.CfnAccessPoint

@Generated
public
    fun objectLambdaConfigurationProperty(initializer: CfnAccessPoint.ObjectLambdaConfigurationProperty.Builder.() -> Unit
    = {}): CfnAccessPoint.ObjectLambdaConfigurationProperty =
    CfnAccessPoint.ObjectLambdaConfigurationProperty.builder().apply(initializer).build()
