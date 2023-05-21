package com.faendir.awscdkkt.services.kinesisanalytics

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.kinesisanalytics.CfnApplicationV2

@Generated
public
    fun sqlApplicationConfigurationProperty(initializer: CfnApplicationV2.SqlApplicationConfigurationProperty.Builder.() -> Unit
    = {}): CfnApplicationV2.SqlApplicationConfigurationProperty =
    CfnApplicationV2.SqlApplicationConfigurationProperty.builder().apply(initializer).build()
