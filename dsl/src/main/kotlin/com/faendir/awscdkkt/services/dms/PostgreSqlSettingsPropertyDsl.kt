@file:Generated(value = ["Generated based on CDK v2.80.0"])

package com.faendir.awscdkkt.services.dms

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.dms.CfnEndpoint

public
    fun postgreSqlSettingsProperty(initializer: CfnEndpoint.PostgreSqlSettingsProperty.Builder.() -> Unit):
    CfnEndpoint.PostgreSqlSettingsProperty =
    CfnEndpoint.PostgreSqlSettingsProperty.builder().apply(initializer).build()
