package com.faendir.awscdkkt.generated.services.route53profiles

import com.faendir.awscdkkt.AwsCdkDsl
import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.route53profiles.CfnProfileAssociation
import software.amazon.awscdk.services.route53profiles.CfnProfileAssociationProps
import software.constructs.Construct

@Generated
public fun Construct.cfnProfileAssociation(
  id: String,
  props: CfnProfileAssociationProps,
  initializer: @AwsCdkDsl CfnProfileAssociation.() -> Unit = {},
): CfnProfileAssociation = CfnProfileAssociation(this, id, props).apply(initializer)

@Generated
public fun Construct.buildCfnProfileAssociation(id: String, initializer: @AwsCdkDsl CfnProfileAssociation.Builder.() -> Unit = {}): CfnProfileAssociation = CfnProfileAssociation.Builder.create(this, id).apply(initializer).build()
