package com.faendir.awscdkkt.services.appflow

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.appflow.CfnConnectorProfile

@Generated
public
    fun basicAuthCredentialsProperty(initializer: CfnConnectorProfile.BasicAuthCredentialsProperty.Builder.() -> Unit
    = {}): CfnConnectorProfile.BasicAuthCredentialsProperty =
    CfnConnectorProfile.BasicAuthCredentialsProperty.builder().apply(initializer).build()
