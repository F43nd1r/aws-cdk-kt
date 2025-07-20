package com.faendir.awscdkkt.generated.services.networkfirewall

import com.faendir.awscdkkt.AwsCdkDsl
import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.networkfirewall.CfnVpcEndpointAssociation
import software.amazon.awscdk.services.networkfirewall.CfnVpcEndpointAssociationProps
import software.constructs.Construct

@Generated
public fun Construct.cfnVpcEndpointAssociation(
  id: String,
  props: CfnVpcEndpointAssociationProps,
  initializer: @AwsCdkDsl CfnVpcEndpointAssociation.() -> Unit = {},
): CfnVpcEndpointAssociation = CfnVpcEndpointAssociation(this, id, props).apply(initializer)

@Generated
public fun Construct.buildCfnVpcEndpointAssociation(id: String, initializer: @AwsCdkDsl CfnVpcEndpointAssociation.Builder.() -> Unit = {}): CfnVpcEndpointAssociation = CfnVpcEndpointAssociation.Builder.create(this, id).apply(initializer).build()
