package com.faendir.awscdkkt.services.ec2

import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.ec2.CfnVPNConnection
import software.amazon.awscdk.services.ec2.CfnVPNConnectionProps
import software.constructs.Construct

@Generated
public fun Construct.cfnVPNConnection(
  id: String,
  props: CfnVPNConnectionProps,
  initializer: CfnVPNConnection.() -> Unit = {},
): CfnVPNConnection = CfnVPNConnection(this, id, props).apply(initializer)
