package com.faendir.awscdkkt.services.dms

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.dms.CfnEndpoint

@Generated
public
    fun dynamoDbSettingsProperty(initializer: CfnEndpoint.DynamoDbSettingsProperty.Builder.() -> Unit
    = {}): CfnEndpoint.DynamoDbSettingsProperty =
    CfnEndpoint.DynamoDbSettingsProperty.builder().apply(initializer).build()
