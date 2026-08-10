package com.faendir.awscdkkt.generated.services.ec2

import com.faendir.awscdkkt.AwsCdkDsl
import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.ec2.CfnTransitGatewayPolicyTable
import software.amazon.awscdk.services.ec2.CfnTransitGatewayPolicyTableProps
import software.constructs.Construct

@Generated
public fun Construct.cfnTransitGatewayPolicyTable(
  id: String,
  props: CfnTransitGatewayPolicyTableProps,
  initializer: @AwsCdkDsl CfnTransitGatewayPolicyTable.() -> Unit = {},
): CfnTransitGatewayPolicyTable = CfnTransitGatewayPolicyTable(this, id, props).apply(initializer)

@Generated
public fun Construct.buildCfnTransitGatewayPolicyTable(id: String, initializer: @AwsCdkDsl CfnTransitGatewayPolicyTable.Builder.() -> Unit = {}): CfnTransitGatewayPolicyTable = CfnTransitGatewayPolicyTable.Builder.create(this, id).apply(initializer).build()
