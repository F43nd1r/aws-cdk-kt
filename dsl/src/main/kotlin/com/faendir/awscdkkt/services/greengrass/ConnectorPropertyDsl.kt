package com.faendir.awscdkkt.services.greengrass

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.greengrass.CfnConnectorDefinitionVersion

@Generated
public
    fun connectorProperty(initializer: CfnConnectorDefinitionVersion.ConnectorProperty.Builder.() -> Unit
    = {}): CfnConnectorDefinitionVersion.ConnectorProperty =
    CfnConnectorDefinitionVersion.ConnectorProperty.builder().apply(initializer).build()
