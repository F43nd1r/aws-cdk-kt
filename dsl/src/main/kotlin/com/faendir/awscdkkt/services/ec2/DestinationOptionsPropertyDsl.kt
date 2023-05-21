package com.faendir.awscdkkt.services.ec2

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.ec2.CfnFlowLog

@Generated
public
    fun destinationOptionsProperty(initializer: CfnFlowLog.DestinationOptionsProperty.Builder.() -> Unit
    = {}): CfnFlowLog.DestinationOptionsProperty =
    CfnFlowLog.DestinationOptionsProperty.builder().apply(initializer).build()
