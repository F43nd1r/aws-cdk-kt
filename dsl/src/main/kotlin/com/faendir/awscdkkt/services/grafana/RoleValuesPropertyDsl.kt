package com.faendir.awscdkkt.services.grafana

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.grafana.CfnWorkspace

@Generated
public fun roleValuesProperty(initializer: CfnWorkspace.RoleValuesProperty.Builder.() -> Unit = {}):
    CfnWorkspace.RoleValuesProperty =
    CfnWorkspace.RoleValuesProperty.builder().apply(initializer).build()
