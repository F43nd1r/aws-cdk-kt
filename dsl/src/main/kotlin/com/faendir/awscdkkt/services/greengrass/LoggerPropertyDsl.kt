package com.faendir.awscdkkt.services.greengrass

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.greengrass.CfnLoggerDefinitionVersion

@Generated
public fun loggerProperty(initializer: CfnLoggerDefinitionVersion.LoggerProperty.Builder.() -> Unit
    = {}): CfnLoggerDefinitionVersion.LoggerProperty =
    CfnLoggerDefinitionVersion.LoggerProperty.builder().apply(initializer).build()
