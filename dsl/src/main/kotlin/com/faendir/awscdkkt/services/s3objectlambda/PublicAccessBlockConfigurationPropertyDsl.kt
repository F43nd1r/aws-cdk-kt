@file:Generated(value = ["Generated based on CDK v2.80.0"])

package com.faendir.awscdkkt.services.s3objectlambda

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.s3objectlambda.CfnAccessPoint

public
    fun publicAccessBlockConfigurationProperty(initializer: CfnAccessPoint.PublicAccessBlockConfigurationProperty.Builder.() -> Unit):
    CfnAccessPoint.PublicAccessBlockConfigurationProperty =
    CfnAccessPoint.PublicAccessBlockConfigurationProperty.builder().apply(initializer).build()
