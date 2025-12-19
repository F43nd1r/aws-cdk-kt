package com.faendir.awscdkkt.generated.services.networkmanager

import com.faendir.awscdkkt.AwsCdkDsl
import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.networkmanager.CfnCoreNetworkPrefixListAssociation
import software.amazon.awscdk.services.networkmanager.CfnCoreNetworkPrefixListAssociationProps
import software.constructs.Construct

@Generated
public fun Construct.cfnCoreNetworkPrefixListAssociation(
  id: String,
  props: CfnCoreNetworkPrefixListAssociationProps,
  initializer: @AwsCdkDsl CfnCoreNetworkPrefixListAssociation.() -> Unit = {},
): CfnCoreNetworkPrefixListAssociation = CfnCoreNetworkPrefixListAssociation(this, id, props).apply(initializer)

@Generated
public fun Construct.buildCfnCoreNetworkPrefixListAssociation(id: String, initializer: @AwsCdkDsl CfnCoreNetworkPrefixListAssociation.Builder.() -> Unit = {}): CfnCoreNetworkPrefixListAssociation = CfnCoreNetworkPrefixListAssociation.Builder.create(this, id).apply(initializer).build()
