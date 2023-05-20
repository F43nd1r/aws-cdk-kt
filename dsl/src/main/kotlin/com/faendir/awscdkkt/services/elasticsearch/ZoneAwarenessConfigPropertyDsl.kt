@file:Generated(value = ["Generated 2023-05-20 based on CDK 2.79.1"])

package com.faendir.awscdkkt.services.elasticsearch

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.elasticsearch.CfnDomain

public
    fun zoneAwarenessConfigProperty(initializer: CfnDomain.ZoneAwarenessConfigProperty.Builder.() -> Unit):
    CfnDomain.ZoneAwarenessConfigProperty =
    CfnDomain.ZoneAwarenessConfigProperty.builder().apply(initializer).build()
