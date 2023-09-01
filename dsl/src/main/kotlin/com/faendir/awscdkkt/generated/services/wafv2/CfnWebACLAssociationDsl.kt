package com.faendir.awscdkkt.generated.services.wafv2

import com.faendir.awscdkkt.AwsCdkDsl
import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.wafv2.CfnWebACLAssociation
import software.amazon.awscdk.services.wafv2.CfnWebACLAssociationProps
import software.constructs.Construct

@Generated
public fun Construct.cfnWebACLAssociation(
  id: String,
  props: CfnWebACLAssociationProps,
  initializer: @AwsCdkDsl CfnWebACLAssociation.() -> Unit = {},
): CfnWebACLAssociation = CfnWebACLAssociation(this, id, props).apply(initializer)

@Generated
public fun Construct.buildCfnWebACLAssociation(id: String, initializer: @AwsCdkDsl
    CfnWebACLAssociation.Builder.() -> Unit = {}): CfnWebACLAssociation =
    CfnWebACLAssociation.Builder.create(this, id).apply(initializer).build()
