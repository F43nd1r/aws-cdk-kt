@file:Generated(value = ["Generated 2023-05-20 based on CDK 2.79.1"])

package com.faendir.awscdkkt.services.s3objectlambda

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.s3objectlambda.CfnAccessPoint

public
    fun objectLambdaConfigurationProperty(initializer: CfnAccessPoint.ObjectLambdaConfigurationProperty.Builder.() -> Unit):
    CfnAccessPoint.ObjectLambdaConfigurationProperty =
    CfnAccessPoint.ObjectLambdaConfigurationProperty.builder().apply(initializer).build()
