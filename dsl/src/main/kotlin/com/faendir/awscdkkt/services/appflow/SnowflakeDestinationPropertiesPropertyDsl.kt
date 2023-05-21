package com.faendir.awscdkkt.services.appflow

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.appflow.CfnFlow

@Generated
public
    fun snowflakeDestinationPropertiesProperty(initializer: CfnFlow.SnowflakeDestinationPropertiesProperty.Builder.() -> Unit
    = {}): CfnFlow.SnowflakeDestinationPropertiesProperty =
    CfnFlow.SnowflakeDestinationPropertiesProperty.builder().apply(initializer).build()
