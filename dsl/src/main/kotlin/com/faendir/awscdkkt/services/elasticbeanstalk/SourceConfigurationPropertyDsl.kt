package com.faendir.awscdkkt.services.elasticbeanstalk

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.elasticbeanstalk.CfnConfigurationTemplate

@Generated
public
    fun sourceConfigurationProperty(initializer: CfnConfigurationTemplate.SourceConfigurationProperty.Builder.() -> Unit
    = {}): CfnConfigurationTemplate.SourceConfigurationProperty =
    CfnConfigurationTemplate.SourceConfigurationProperty.builder().apply(initializer).build()
