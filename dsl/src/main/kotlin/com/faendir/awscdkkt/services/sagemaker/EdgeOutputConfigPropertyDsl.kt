package com.faendir.awscdkkt.services.sagemaker

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.sagemaker.CfnDeviceFleet

@Generated
public
    fun edgeOutputConfigProperty(initializer: CfnDeviceFleet.EdgeOutputConfigProperty.Builder.() -> Unit
    = {}): CfnDeviceFleet.EdgeOutputConfigProperty =
    CfnDeviceFleet.EdgeOutputConfigProperty.builder().apply(initializer).build()
