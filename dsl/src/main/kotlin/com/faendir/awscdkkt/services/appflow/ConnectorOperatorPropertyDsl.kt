package com.faendir.awscdkkt.services.appflow

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.appflow.CfnFlow

@Generated
public
    fun connectorOperatorProperty(initializer: CfnFlow.ConnectorOperatorProperty.Builder.() -> Unit
    = {}): CfnFlow.ConnectorOperatorProperty =
    CfnFlow.ConnectorOperatorProperty.builder().apply(initializer).build()
