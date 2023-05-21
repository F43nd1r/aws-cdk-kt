package com.faendir.awscdkkt.services.appflow

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.appflow.CfnConnector

@Generated
public
    fun lambdaConnectorProvisioningConfigProperty(initializer: CfnConnector.LambdaConnectorProvisioningConfigProperty.Builder.() -> Unit
    = {}): CfnConnector.LambdaConnectorProvisioningConfigProperty =
    CfnConnector.LambdaConnectorProvisioningConfigProperty.builder().apply(initializer).build()
