package com.faendir.awscdkkt.services.opensearchservice

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.opensearchservice.CfnDomain

@Generated
public
    fun zoneAwarenessConfigProperty(initializer: CfnDomain.ZoneAwarenessConfigProperty.Builder.() -> Unit
    = {}): CfnDomain.ZoneAwarenessConfigProperty =
    CfnDomain.ZoneAwarenessConfigProperty.builder().apply(initializer).build()
