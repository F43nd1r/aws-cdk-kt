@file:Generated(value = ["Generated 2023-05-20 based on CDK 2.79.1"])

package com.faendir.awscdkkt.services.lambda

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.lambda.CfnEventSourceMapping

public
    fun sourceAccessConfigurationProperty(initializer: CfnEventSourceMapping.SourceAccessConfigurationProperty.Builder.() -> Unit):
    CfnEventSourceMapping.SourceAccessConfigurationProperty =
    CfnEventSourceMapping.SourceAccessConfigurationProperty.builder().apply(initializer).build()
