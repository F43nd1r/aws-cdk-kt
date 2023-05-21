package com.faendir.awscdkkt.services.appflow

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.appflow.CfnConnectorProfile

@Generated
public
    fun oAuthPropertiesProperty(initializer: CfnConnectorProfile.OAuthPropertiesProperty.Builder.() -> Unit
    = {}): CfnConnectorProfile.OAuthPropertiesProperty =
    CfnConnectorProfile.OAuthPropertiesProperty.builder().apply(initializer).build()
