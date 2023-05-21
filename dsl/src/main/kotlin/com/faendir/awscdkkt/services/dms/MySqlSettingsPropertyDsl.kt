package com.faendir.awscdkkt.services.dms

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.dms.CfnEndpoint

@Generated
public fun mySqlSettingsProperty(initializer: CfnEndpoint.MySqlSettingsProperty.Builder.() -> Unit =
    {}): CfnEndpoint.MySqlSettingsProperty =
    CfnEndpoint.MySqlSettingsProperty.builder().apply(initializer).build()
