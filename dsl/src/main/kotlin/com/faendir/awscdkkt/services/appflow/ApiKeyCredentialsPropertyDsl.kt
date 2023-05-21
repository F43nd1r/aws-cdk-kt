package com.faendir.awscdkkt.services.appflow

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.appflow.CfnConnectorProfile

@Generated
public
    fun apiKeyCredentialsProperty(initializer: CfnConnectorProfile.ApiKeyCredentialsProperty.Builder.() -> Unit
    = {}): CfnConnectorProfile.ApiKeyCredentialsProperty =
    CfnConnectorProfile.ApiKeyCredentialsProperty.builder().apply(initializer).build()
