package com.faendir.awscdkkt.services.kinesisanalytics

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.kinesisanalytics.CfnApplicationV2

@Generated
public
    fun flinkApplicationConfigurationProperty(initializer: CfnApplicationV2.FlinkApplicationConfigurationProperty.Builder.() -> Unit
    = {}): CfnApplicationV2.FlinkApplicationConfigurationProperty =
    CfnApplicationV2.FlinkApplicationConfigurationProperty.builder().apply(initializer).build()
