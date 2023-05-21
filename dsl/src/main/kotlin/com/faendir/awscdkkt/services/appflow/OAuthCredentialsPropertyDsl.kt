package com.faendir.awscdkkt.services.appflow

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.appflow.CfnConnectorProfile

@Generated
public
    fun oAuthCredentialsProperty(initializer: CfnConnectorProfile.OAuthCredentialsProperty.Builder.() -> Unit
    = {}): CfnConnectorProfile.OAuthCredentialsProperty =
    CfnConnectorProfile.OAuthCredentialsProperty.builder().apply(initializer).build()
