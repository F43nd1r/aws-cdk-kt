package com.faendir.awscdkkt.generated.services.ec2

import com.faendir.awscdkkt.AwsCdkDsl
import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.ec2.CfnClientVpnTargetNetworkAssociation
import software.amazon.awscdk.services.ec2.CfnClientVpnTargetNetworkAssociationProps
import software.constructs.Construct

@Generated
public fun Construct.cfnClientVpnTargetNetworkAssociation(
  id: String,
  props: CfnClientVpnTargetNetworkAssociationProps,
  initializer: @AwsCdkDsl CfnClientVpnTargetNetworkAssociation.() -> Unit = {},
): CfnClientVpnTargetNetworkAssociation = CfnClientVpnTargetNetworkAssociation(this, id,
    props).apply(initializer)

@Generated
public fun Construct.buildCfnClientVpnTargetNetworkAssociation(id: String, initializer: @AwsCdkDsl
    CfnClientVpnTargetNetworkAssociation.Builder.() -> Unit = {}):
    CfnClientVpnTargetNetworkAssociation = CfnClientVpnTargetNetworkAssociation.Builder.create(this,
    id).apply(initializer).build()
