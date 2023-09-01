package com.faendir.awscdkkt.generated.services.waf.regional

import com.faendir.awscdkkt.AwsCdkDsl
import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.waf.regional.CfnWebACLAssociation
import software.amazon.awscdk.services.waf.regional.CfnWebACLAssociationProps
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
