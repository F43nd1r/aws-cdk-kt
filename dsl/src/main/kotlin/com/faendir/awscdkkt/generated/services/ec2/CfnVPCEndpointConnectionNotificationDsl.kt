package com.faendir.awscdkkt.generated.services.ec2

import com.faendir.awscdkkt.AwsCdkDsl
import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.ec2.CfnVPCEndpointConnectionNotification
import software.amazon.awscdk.services.ec2.CfnVPCEndpointConnectionNotificationProps
import software.constructs.Construct

@Generated
public fun Construct.cfnVPCEndpointConnectionNotification(
  id: String,
  props: CfnVPCEndpointConnectionNotificationProps,
  initializer: @AwsCdkDsl CfnVPCEndpointConnectionNotification.() -> Unit = {},
): CfnVPCEndpointConnectionNotification = CfnVPCEndpointConnectionNotification(this, id,
    props).apply(initializer)

@Generated
public fun Construct.buildCfnVPCEndpointConnectionNotification(id: String, initializer: @AwsCdkDsl
    CfnVPCEndpointConnectionNotification.Builder.() -> Unit = {}):
    CfnVPCEndpointConnectionNotification = CfnVPCEndpointConnectionNotification.Builder.create(this,
    id).apply(initializer).build()
