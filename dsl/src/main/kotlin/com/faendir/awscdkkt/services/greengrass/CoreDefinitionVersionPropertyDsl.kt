package com.faendir.awscdkkt.services.greengrass

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.greengrass.CfnCoreDefinition

@Generated
public
    fun coreDefinitionVersionProperty(initializer: CfnCoreDefinition.CoreDefinitionVersionProperty.Builder.() -> Unit
    = {}): CfnCoreDefinition.CoreDefinitionVersionProperty =
    CfnCoreDefinition.CoreDefinitionVersionProperty.builder().apply(initializer).build()
