package com.faendir.awscdkkt.services.kinesisanalytics

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.kinesisanalytics.CfnApplicationV2

@Generated
public
    fun applicationConfigurationProperty(initializer: CfnApplicationV2.ApplicationConfigurationProperty.Builder.() -> Unit
    = {}): CfnApplicationV2.ApplicationConfigurationProperty =
    CfnApplicationV2.ApplicationConfigurationProperty.builder().apply(initializer).build()
