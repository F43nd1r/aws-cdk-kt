package com.faendir.awscdkkt.services.appflow

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.appflow.CfnConnectorProfile

@Generated
public
    fun oAuth2PropertiesProperty(initializer: CfnConnectorProfile.OAuth2PropertiesProperty.Builder.() -> Unit
    = {}): CfnConnectorProfile.OAuth2PropertiesProperty =
    CfnConnectorProfile.OAuth2PropertiesProperty.builder().apply(initializer).build()
