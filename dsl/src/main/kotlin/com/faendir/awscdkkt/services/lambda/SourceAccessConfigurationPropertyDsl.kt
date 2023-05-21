package com.faendir.awscdkkt.services.lambda

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.lambda.CfnEventSourceMapping

@Generated
public
    fun sourceAccessConfigurationProperty(initializer: CfnEventSourceMapping.SourceAccessConfigurationProperty.Builder.() -> Unit
    = {}): CfnEventSourceMapping.SourceAccessConfigurationProperty =
    CfnEventSourceMapping.SourceAccessConfigurationProperty.builder().apply(initializer).build()
