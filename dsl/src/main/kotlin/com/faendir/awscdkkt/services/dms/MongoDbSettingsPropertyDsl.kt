package com.faendir.awscdkkt.services.dms

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.dms.CfnEndpoint

@Generated
public
    fun mongoDbSettingsProperty(initializer: CfnEndpoint.MongoDbSettingsProperty.Builder.() -> Unit
    = {}): CfnEndpoint.MongoDbSettingsProperty =
    CfnEndpoint.MongoDbSettingsProperty.builder().apply(initializer).build()
