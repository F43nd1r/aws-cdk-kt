package com.faendir.awscdkkt.services.greengrass

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.greengrass.CfnLoggerDefinition

@Generated
public
    fun loggerDefinitionVersionProperty(initializer: CfnLoggerDefinition.LoggerDefinitionVersionProperty.Builder.() -> Unit
    = {}): CfnLoggerDefinition.LoggerDefinitionVersionProperty =
    CfnLoggerDefinition.LoggerDefinitionVersionProperty.builder().apply(initializer).build()
