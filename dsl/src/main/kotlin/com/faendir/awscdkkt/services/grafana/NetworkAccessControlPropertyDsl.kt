@file:Generated(value = ["Generated 2023-05-19 based on CDK 2.79.1"])

package com.faendir.awscdkkt.services.grafana

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.grafana.CfnWorkspace

public
    fun networkAccessControlProperty(initializer: CfnWorkspace.NetworkAccessControlProperty.Builder.() -> Unit):
    CfnWorkspace.NetworkAccessControlProperty =
    CfnWorkspace.NetworkAccessControlProperty.builder().apply(initializer).build()
