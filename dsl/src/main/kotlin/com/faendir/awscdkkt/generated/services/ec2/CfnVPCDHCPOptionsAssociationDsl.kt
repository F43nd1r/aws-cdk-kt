package com.faendir.awscdkkt.generated.services.ec2

import com.faendir.awscdkkt.AwsCdkDsl
import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.ec2.CfnVPCDHCPOptionsAssociation
import software.amazon.awscdk.services.ec2.CfnVPCDHCPOptionsAssociationProps
import software.constructs.Construct

@Generated
public fun Construct.cfnVPCDHCPOptionsAssociation(id: String,
    props: CfnVPCDHCPOptionsAssociationProps): CfnVPCDHCPOptionsAssociation =
    CfnVPCDHCPOptionsAssociation(this, id, props)

@Generated
public fun Construct.cfnVPCDHCPOptionsAssociation(
  id: String,
  props: CfnVPCDHCPOptionsAssociationProps,
  initializer: @AwsCdkDsl CfnVPCDHCPOptionsAssociation.() -> Unit,
): CfnVPCDHCPOptionsAssociation = CfnVPCDHCPOptionsAssociation(this, id, props).apply(initializer)

@Generated
public fun Construct.buildCfnVPCDHCPOptionsAssociation(id: String, initializer: @AwsCdkDsl
    CfnVPCDHCPOptionsAssociation.Builder.() -> Unit): CfnVPCDHCPOptionsAssociation =
    CfnVPCDHCPOptionsAssociation.Builder.create(this, id).apply(initializer).build()
