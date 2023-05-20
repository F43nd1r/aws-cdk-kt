@file:Generated(value = ["Generated 2023-05-20 based on CDK 2.79.1"])

package com.faendir.awscdkkt.services.inspectorv2

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.inspectorv2.CfnFilter

public
    fun portRangeFilterProperty(initializer: CfnFilter.PortRangeFilterProperty.Builder.() -> Unit):
    CfnFilter.PortRangeFilterProperty =
    CfnFilter.PortRangeFilterProperty.builder().apply(initializer).build()
