package com.faendir.awscdkkt.services.elasticsearch

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.elasticsearch.CfnDomain

@Generated
public
    fun zoneAwarenessConfigProperty(initializer: CfnDomain.ZoneAwarenessConfigProperty.Builder.() -> Unit
    = {}): CfnDomain.ZoneAwarenessConfigProperty =
    CfnDomain.ZoneAwarenessConfigProperty.builder().apply(initializer).build()
