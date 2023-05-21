package com.faendir.awscdkkt.services.ec2

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.ec2.CfnTransitGatewayVpcAttachment

@Generated
public
    fun optionsProperty(initializer: CfnTransitGatewayVpcAttachment.OptionsProperty.Builder.() -> Unit
    = {}): CfnTransitGatewayVpcAttachment.OptionsProperty =
    CfnTransitGatewayVpcAttachment.OptionsProperty.builder().apply(initializer).build()
