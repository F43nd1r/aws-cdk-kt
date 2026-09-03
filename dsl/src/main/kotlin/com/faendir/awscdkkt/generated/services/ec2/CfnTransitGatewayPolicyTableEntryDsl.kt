package com.faendir.awscdkkt.generated.services.ec2

import com.faendir.awscdkkt.AwsCdkDsl
import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.ec2.CfnTransitGatewayPolicyTableEntry
import software.amazon.awscdk.services.ec2.CfnTransitGatewayPolicyTableEntryProps
import software.constructs.Construct

@Generated
public fun Construct.cfnTransitGatewayPolicyTableEntry(
  id: String,
  props: CfnTransitGatewayPolicyTableEntryProps,
  initializer: @AwsCdkDsl CfnTransitGatewayPolicyTableEntry.() -> Unit = {},
): CfnTransitGatewayPolicyTableEntry = CfnTransitGatewayPolicyTableEntry(this, id, props).apply(initializer)

@Generated
public fun Construct.buildCfnTransitGatewayPolicyTableEntry(id: String, initializer: @AwsCdkDsl CfnTransitGatewayPolicyTableEntry.Builder.() -> Unit = {}): CfnTransitGatewayPolicyTableEntry = CfnTransitGatewayPolicyTableEntry.Builder.create(this, id).apply(initializer).build()
