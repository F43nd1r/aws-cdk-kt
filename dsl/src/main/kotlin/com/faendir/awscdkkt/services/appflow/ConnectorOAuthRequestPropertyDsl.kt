package com.faendir.awscdkkt.services.appflow

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.appflow.CfnConnectorProfile

@Generated
public
    fun connectorOAuthRequestProperty(initializer: CfnConnectorProfile.ConnectorOAuthRequestProperty.Builder.() -> Unit
    = {}): CfnConnectorProfile.ConnectorOAuthRequestProperty =
    CfnConnectorProfile.ConnectorOAuthRequestProperty.builder().apply(initializer).build()
