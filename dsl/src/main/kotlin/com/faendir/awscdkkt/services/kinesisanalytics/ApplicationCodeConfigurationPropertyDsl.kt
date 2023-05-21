package com.faendir.awscdkkt.services.kinesisanalytics

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.kinesisanalytics.CfnApplicationV2

@Generated
public
    fun applicationCodeConfigurationProperty(initializer: CfnApplicationV2.ApplicationCodeConfigurationProperty.Builder.() -> Unit
    = {}): CfnApplicationV2.ApplicationCodeConfigurationProperty =
    CfnApplicationV2.ApplicationCodeConfigurationProperty.builder().apply(initializer).build()
