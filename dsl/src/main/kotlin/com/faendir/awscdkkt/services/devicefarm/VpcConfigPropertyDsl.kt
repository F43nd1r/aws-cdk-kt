package com.faendir.awscdkkt.services.devicefarm

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.devicefarm.CfnTestGridProject

@Generated
public fun vpcConfigProperty(initializer: CfnTestGridProject.VpcConfigProperty.Builder.() -> Unit =
    {}): CfnTestGridProject.VpcConfigProperty =
    CfnTestGridProject.VpcConfigProperty.builder().apply(initializer).build()
