@file:Generated(value = ["Generated 2023-05-19 based on CDK 2.79.1"])

package com.faendir.awscdkkt.services.ec2

import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.ec2.CfnVPCEndpointConnectionNotification
import software.amazon.awscdk.services.ec2.CfnVPCEndpointConnectionNotificationProps
import software.constructs.Construct

public fun Construct.cfnVPCEndpointConnectionNotification(
  id: String,
  props: CfnVPCEndpointConnectionNotificationProps,
  initializer: CfnVPCEndpointConnectionNotification.() -> Unit = {},
): CfnVPCEndpointConnectionNotification = CfnVPCEndpointConnectionNotification(this, id,
    props).apply(initializer)
