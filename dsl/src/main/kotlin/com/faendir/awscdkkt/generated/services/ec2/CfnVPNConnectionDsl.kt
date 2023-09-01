package com.faendir.awscdkkt.generated.services.ec2

import com.faendir.awscdkkt.AwsCdkDsl
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
  initializer: @AwsCdkDsl CfnVPNConnection.() -> Unit = {},
): CfnVPNConnection = CfnVPNConnection(this, id, props).apply(initializer)

@Generated
public fun Construct.buildCfnVPNConnection(id: String, initializer: @AwsCdkDsl
    CfnVPNConnection.Builder.() -> Unit = {}): CfnVPNConnection =
    CfnVPNConnection.Builder.create(this, id).apply(initializer).build()
