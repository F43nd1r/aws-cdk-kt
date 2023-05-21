package com.faendir.awscdkkt.services.grafana

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.grafana.CfnWorkspace

@Generated
public
    fun networkAccessControlProperty(initializer: CfnWorkspace.NetworkAccessControlProperty.Builder.() -> Unit
    = {}): CfnWorkspace.NetworkAccessControlProperty =
    CfnWorkspace.NetworkAccessControlProperty.builder().apply(initializer).build()
