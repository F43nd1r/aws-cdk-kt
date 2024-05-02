package com.faendir.awscdkkt.generated.services.route53profiles

import com.faendir.awscdkkt.AwsCdkDsl
import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.route53profiles.CfnProfileResourceAssociation
import software.amazon.awscdk.services.route53profiles.CfnProfileResourceAssociationProps
import software.constructs.Construct

@Generated
public fun Construct.cfnProfileResourceAssociation(
  id: String,
  props: CfnProfileResourceAssociationProps,
  initializer: @AwsCdkDsl CfnProfileResourceAssociation.() -> Unit = {},
): CfnProfileResourceAssociation = CfnProfileResourceAssociation(this, id, props).apply(initializer)

@Generated
public fun Construct.buildCfnProfileResourceAssociation(id: String, initializer: @AwsCdkDsl
    CfnProfileResourceAssociation.Builder.() -> Unit = {}): CfnProfileResourceAssociation =
    CfnProfileResourceAssociation.Builder.create(this, id).apply(initializer).build()
