package com.faendir.awscdkkt.services.appflow

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.appflow.CfnConnector

@Generated
public
    fun connectorProvisioningConfigProperty(initializer: CfnConnector.ConnectorProvisioningConfigProperty.Builder.() -> Unit
    = {}): CfnConnector.ConnectorProvisioningConfigProperty =
    CfnConnector.ConnectorProvisioningConfigProperty.builder().apply(initializer).build()
