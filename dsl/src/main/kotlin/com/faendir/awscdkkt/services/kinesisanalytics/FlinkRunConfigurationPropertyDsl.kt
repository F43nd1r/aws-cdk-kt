package com.faendir.awscdkkt.services.kinesisanalytics

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.kinesisanalytics.CfnApplicationV2

@Generated
public
    fun flinkRunConfigurationProperty(initializer: CfnApplicationV2.FlinkRunConfigurationProperty.Builder.() -> Unit
    = {}): CfnApplicationV2.FlinkRunConfigurationProperty =
    CfnApplicationV2.FlinkRunConfigurationProperty.builder().apply(initializer).build()
