package com.faendir.awscdkkt.services.appflow

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.appflow.CfnConnectorProfile

@Generated
public
    fun connectorProfileCredentialsProperty(initializer: CfnConnectorProfile.ConnectorProfileCredentialsProperty.Builder.() -> Unit
    = {}): CfnConnectorProfile.ConnectorProfileCredentialsProperty =
    CfnConnectorProfile.ConnectorProfileCredentialsProperty.builder().apply(initializer).build()
