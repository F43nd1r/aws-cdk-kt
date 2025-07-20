package com.faendir.awscdkkt.generated.services.ec2

import com.faendir.awscdkkt.AwsCdkDsl
import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.ec2.CfnIPAMResourceDiscoveryAssociation
import software.amazon.awscdk.services.ec2.CfnIPAMResourceDiscoveryAssociationProps
import software.constructs.Construct

@Generated
public fun Construct.cfnIPAMResourceDiscoveryAssociation(
  id: String,
  props: CfnIPAMResourceDiscoveryAssociationProps,
  initializer: @AwsCdkDsl CfnIPAMResourceDiscoveryAssociation.() -> Unit = {},
): CfnIPAMResourceDiscoveryAssociation = CfnIPAMResourceDiscoveryAssociation(this, id, props).apply(initializer)

@Generated
public fun Construct.buildCfnIPAMResourceDiscoveryAssociation(id: String, initializer: @AwsCdkDsl CfnIPAMResourceDiscoveryAssociation.Builder.() -> Unit = {}): CfnIPAMResourceDiscoveryAssociation = CfnIPAMResourceDiscoveryAssociation.Builder.create(this, id).apply(initializer).build()
