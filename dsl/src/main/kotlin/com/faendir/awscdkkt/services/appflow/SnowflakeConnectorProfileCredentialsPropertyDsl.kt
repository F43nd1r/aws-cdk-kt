package com.faendir.awscdkkt.services.appflow

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.appflow.CfnConnectorProfile

@Generated
public
    fun snowflakeConnectorProfileCredentialsProperty(initializer: CfnConnectorProfile.SnowflakeConnectorProfileCredentialsProperty.Builder.() -> Unit
    = {}): CfnConnectorProfile.SnowflakeConnectorProfileCredentialsProperty =
    CfnConnectorProfile.SnowflakeConnectorProfileCredentialsProperty.builder().apply(initializer).build()
