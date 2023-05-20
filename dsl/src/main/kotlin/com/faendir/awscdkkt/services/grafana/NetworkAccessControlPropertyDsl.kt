@file:Generated(value = ["Generated based on CDK v2.80.0"])

package com.faendir.awscdkkt.services.grafana

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.grafana.CfnWorkspace

public
    fun networkAccessControlProperty(initializer: CfnWorkspace.NetworkAccessControlProperty.Builder.() -> Unit):
    CfnWorkspace.NetworkAccessControlProperty =
    CfnWorkspace.NetworkAccessControlProperty.builder().apply(initializer).build()
