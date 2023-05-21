package com.faendir.awscdkkt.services.ec2

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.ec2.CfnTransitGatewayAttachmentProps

@Generated
public
    fun cfnTransitGatewayAttachmentProps(initializer: CfnTransitGatewayAttachmentProps.Builder.() -> Unit
    = {}): CfnTransitGatewayAttachmentProps =
    CfnTransitGatewayAttachmentProps.builder().apply(initializer).build()
