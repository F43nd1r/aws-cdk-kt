package com.faendir.awscdkkt.services.appflow

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.appflow.CfnConnectorProfile

@Generated
public
    fun oAuth2CredentialsProperty(initializer: CfnConnectorProfile.OAuth2CredentialsProperty.Builder.() -> Unit
    = {}): CfnConnectorProfile.OAuth2CredentialsProperty =
    CfnConnectorProfile.OAuth2CredentialsProperty.builder().apply(initializer).build()
