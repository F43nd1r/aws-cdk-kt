package com.faendir.awscdkkt.generated.services.route53globalresolver

import com.faendir.awscdkkt.AwsCdkDsl
import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.route53globalresolver.CfnHostedZoneAssociation
import software.amazon.awscdk.services.route53globalresolver.CfnHostedZoneAssociationProps
import software.constructs.Construct

@Generated
public fun Construct.cfnHostedZoneAssociation(
  id: String,
  props: CfnHostedZoneAssociationProps,
  initializer: @AwsCdkDsl CfnHostedZoneAssociation.() -> Unit = {},
): CfnHostedZoneAssociation = CfnHostedZoneAssociation(this, id, props).apply(initializer)

@Generated
public fun Construct.buildCfnHostedZoneAssociation(id: String, initializer: @AwsCdkDsl CfnHostedZoneAssociation.Builder.() -> Unit = {}): CfnHostedZoneAssociation = CfnHostedZoneAssociation.Builder.create(this, id).apply(initializer).build()
