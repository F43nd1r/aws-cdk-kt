@file:Generated(value = ["Generated based on CDK v2.80.0"])

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
