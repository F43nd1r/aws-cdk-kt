@file:Generated(value = ["Generated based on CDK v2.80.0"])

package com.faendir.awscdkkt.services.greengrass

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.greengrass.CfnLoggerDefinitionVersion

public
    fun loggerProperty(initializer: CfnLoggerDefinitionVersion.LoggerProperty.Builder.() -> Unit):
    CfnLoggerDefinitionVersion.LoggerProperty =
    CfnLoggerDefinitionVersion.LoggerProperty.builder().apply(initializer).build()
