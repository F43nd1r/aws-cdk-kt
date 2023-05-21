package com.faendir.awscdkkt.services.appflow

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.appflow.CfnConnectorProfile

@Generated
public
    fun customAuthCredentialsProperty(initializer: CfnConnectorProfile.CustomAuthCredentialsProperty.Builder.() -> Unit
    = {}): CfnConnectorProfile.CustomAuthCredentialsProperty =
    CfnConnectorProfile.CustomAuthCredentialsProperty.builder().apply(initializer).build()
