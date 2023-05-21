package com.faendir.awscdkkt.services.appflow

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.appflow.CfnConnectorProfile

@Generated
public
    fun connectorProfileConfigProperty(initializer: CfnConnectorProfile.ConnectorProfileConfigProperty.Builder.() -> Unit
    = {}): CfnConnectorProfile.ConnectorProfileConfigProperty =
    CfnConnectorProfile.ConnectorProfileConfigProperty.builder().apply(initializer).build()
