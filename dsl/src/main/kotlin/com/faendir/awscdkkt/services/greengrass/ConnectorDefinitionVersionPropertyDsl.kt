package com.faendir.awscdkkt.services.greengrass

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.greengrass.CfnConnectorDefinition

@Generated
public
    fun connectorDefinitionVersionProperty(initializer: CfnConnectorDefinition.ConnectorDefinitionVersionProperty.Builder.() -> Unit
    = {}): CfnConnectorDefinition.ConnectorDefinitionVersionProperty =
    CfnConnectorDefinition.ConnectorDefinitionVersionProperty.builder().apply(initializer).build()
